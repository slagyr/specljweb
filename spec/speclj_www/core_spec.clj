(ns speclj_www.core-spec
  (:use
    [speclj.core]
    [joodo.spec-helpers.controller]
    [speclj_www.core]))

(def get-route-and-page-name [
  ["/" "index"]
  ["/install" "install"]
  ["/tutorial" "tutorial/index"]
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
  ["/docs/describe" "docs/describe"]
  ["/docs/it" "docs/it"]
  ["/docs/should" "docs/should"]
  ["/docs/should-not" "docs/should_not"]
  ["/docs/should-e" "docs/should_e"]
  ["/docs/should-not-e" "docs/should_not_e"]
  ["/docs/should-fail" "docs/should_fail"]
  ["/docs/should-throw" "docs/should_throw"]
  ["/docs/should-not-throw" "docs/should_not_throw"]
  ["/docs/before" "docs/before"]
  ["/docs/before-all" "docs/before_all"]
  ["/docs/after" "docs/after"]
  ["/docs/after-all" "docs/after_all"]
  ["/docs/with" "docs/with"]
  ["/docs/around" "docs/around"]
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