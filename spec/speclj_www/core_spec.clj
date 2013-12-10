(ns speclj_www.core-spec
  (:use [speclj.core]
        [joodo.spec-helpers.controller]
        [speclj_www.core]))

(def get-route-and-page-name
  [["/" "index"]
   ["/install" "install"]
   ["/tutorial" "tutorial/step1"]
   ["/tutorial/step1" "tutorial/step1"]
   ["/tutorial/step2" "tutorial/step2"]
   ["/tutorial/step3" "tutorial/step3"]
   ["/tutorial/step4" "tutorial/step4"]
   ["/tutorial/step5" "tutorial/step5"]
   ["/tutorial/step6" "tutorial/step6"]
   ["/tutorial/step7" "tutorial/step7"]
   ["/specljs" "specljs/notes"]
   ["/community" "community"]
   ["/license" "license"]
   ["/docs/" "docs/index"]
   ["/plugins" "plugins/index"]
   ["/plugins/speclj-growl" "plugins/speclj-growl"]
   ])


(context "speclj_www"
  (with-mock-rendering)
  (with-routes app-handler)

  (for [[route template] get-route-and-page-name]
    (it (format "renders the %s template when routing to %s" template route)
      (let [result (do-get route)]
        (should= 200 (:status result))
        (should= template @rendered-template)))))

(run-specs)
