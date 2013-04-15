(ns speclj_www.core-spec
  (:use
    [speclj.core]
    [joodo.spec-helpers.controller]
    [speclj_www.core]))

(def get-route-and-page-name [
  ["/" "index"]
  ["/install" "install"]
  ["/tutorial" "tutorial/step1"]
  ["/tutorial/step1" "tutorial/step1"]
  ["/tutorial/step2" "tutorial/step2"]
  ["/tutorial/step3" "tutorial/step3"]
  ["/tutorial/step4" "tutorial/step4"]
  ["/tutorial/step5" "tutorial/step5"]
  ["/tutorial/step6" "tutorial/step6"]
  ["/tutorial/step7" "tutorial/step7"]
  ["/community" "community"]
  ["/license" "license"]
  ["/docs" "docs/index"]
  ["/docs/after" "docs/after"]
  ["/docs/after-all" "docs/after_all"]
  ["/docs/around" "docs/around"]
  ["/docs/before" "docs/before"]
  ["/docs/before-all" "docs/before_all"]
  ["/docs/context" "docs/context"]
  ["/docs/describe" "docs/describe"]
  ["/docs/it" "docs/it"]
  ["/docs/run-specs" "docs/run-specs"]
  ["/docs/should" "docs/should"]
  ["/docs/should-be-nil" "docs/should-be-nil"]
  ["/docs/should-be-same" "docs/should-be-same"]
  ["/docs/should-contain" "docs/should-contain"]
  ["/docs/should-e" "docs/should_e"]
  ["/docs/should-e-e" "docs/should-e-e"]
  ["/docs/should-fail" "docs/should_fail"]
  ["/docs/should-not" "docs/should_not"]
  ["/docs/should-not-be-nil" "docs/should-not-be-nil"]
  ["/docs/should-not-be-same" "docs/should-not-be-same"]
  ["/docs/should-not-contain" "docs/should-not-contain"]
  ["/docs/should-not-e" "docs/should_not_e"]
  ["/docs/should-not-e-e" "docs/should-not-e-e"]
  ["/docs/should-not-throw" "docs/should_not_throw"]
  ["/docs/should-throw" "docs/should_throw"]
  ["/docs/tags" "docs/tags"]
  ["/docs/with" "docs/with"]
  ["/docs/with-all" "docs/with-all"]
  ["/docs/with-all-bang" "docs/with-all-bang"]
  ["/docs/with-bang" "docs/with-bang"]
  ["/docs/xit" "docs/xit"]
  ["/plugins" "plugins/index"]
  ["/plugins/speclj-growl" "plugins/speclj-growl"]
])

(defn test-all-routes [route assertions]
  (let [result (do-get (get (get-route-and-page-name route) 0))]
    (do
	  (assertions result route)
	  (println "  *" (get (get-route-and-page-name route) 0))))
  (if (not= route (dec (count get-route-and-page-name)))
    (test-all-routes (inc route) assertions)))



(describe "speclj_www"
  (with-mock-rendering)
  (with-routes app-handler)

  (it "handles the routes listed above"
    (test-all-routes 0, 
      (fn [result route]
        (should= 200 (:status result))
        (should= (get (get-route-and-page-name route) 1) @rendered-template)))))

(run-specs)
