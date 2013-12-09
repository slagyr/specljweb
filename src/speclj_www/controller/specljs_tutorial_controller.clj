(ns speclj_www.controller.specljs-tutorial-controller
  (:use
	[compojure.core :only (routes GET)]
    [joodo.views :only (render-template render-html)]
))

(def specljs-tutorial-controller
  (->
    (routes
      (GET "/specljs_tutorial" [] (render-template "specljs_tutorial/step1"))
      (GET "/specljs_tutorial/" [] (render-template "specljs_tutorial/step1"))
      (GET "/specljs_tutorial/step1" [] (render-template "specljs_tutorial/step1"))
      (GET "/specljs_tutorial/step2" [] (render-template "specljs_tutorial/step2"))
      (GET "/specljs_tutorial/step3" [] (render-template "specljs_tutorial/step3"))
      (GET "/specljs_tutorial/step4" [] (render-template "specljs_tutorial/step4"))
      (GET "/specljs_tutorial/step5" [] (render-template "specljs_tutorial/step5"))
      (GET "/specljs_tutorial/step6" [] (render-template "specljs_tutorial/step6"))
      (GET "/specljs_tutorial/step7" [] (render-template "specljs_tutorial/step7"))
)))