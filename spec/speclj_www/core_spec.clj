(ns speclj_www.core-spec
  (:use [speclj.core]
        [joodo.spec-helpers.controller]
        [speclj_www.core]))

(def get-route-and-page-name
  [["/" "index"]
   ["/install" "install"]
   ["/speclj_tutorial" "speclj_tutorial/step1"]
   ["/speclj_tutorial/step1" "speclj_tutorial/step1"]
   ["/speclj_tutorial/step2" "speclj_tutorial/step2"]
   ["/speclj_tutorial/step3" "speclj_tutorial/step3"]
   ["/speclj_tutorial/step4" "speclj_tutorial/step4"]
   ["/speclj_tutorial/step5" "speclj_tutorial/step5"]
   ["/speclj_tutorial/step6" "speclj_tutorial/step6"]
   ["/speclj_tutorial/step7" "speclj_tutorial/step7"]
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
