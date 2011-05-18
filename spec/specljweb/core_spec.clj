(ns specljweb.core-spec
  (:use
    [speclj.core]
    [gaeshi.spec-helpers.controller]
    [specljweb.core]))

(describe "specljweb"

  (with-mock-rendering)
  (with-routes app-handler)

  (it "handles home page"
    (let [result (do-get "/")]
      (should= 200 (:status result))
      (should= "index" @rendered-template)))
  )

(run-specs)
