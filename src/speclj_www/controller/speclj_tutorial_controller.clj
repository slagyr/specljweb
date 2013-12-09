(ns speclj_www.controller.speclj-tutorial-controller
  (:use
	[compojure.core :only (routes GET)]
    [joodo.views :only (render-template render-html)]
))

(def speclj-tutorial-controller
  (->
    (routes
      (GET "/speclj_tutorial" [] (render-template "speclj_tutorial/step1"))
      (GET "/speclj_tutorial/" [] (render-template "speclj_tutorial/step1"))
      (GET "/speclj_tutorial/step1" [] (render-template "speclj_tutorial/step1"))
      (GET "/speclj_tutorial/step2" [] (render-template "speclj_tutorial/step2"))
      (GET "/speclj_tutorial/step3" [] (render-template "speclj_tutorial/step3"))
      (GET "/speclj_tutorial/step4" [] (render-template "speclj_tutorial/step4"))
      (GET "/speclj_tutorial/step5" [] (render-template "speclj_tutorial/step5"))
      (GET "/speclj_tutorial/step6" [] (render-template "speclj_tutorial/step6"))
      (GET "/speclj_tutorial/step7" [] (render-template "speclj_tutorial/step7"))
)))