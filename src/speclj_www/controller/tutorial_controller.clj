(ns speclj_www.controller.tutorial-controller
  (:use
	[compojure.core :only (routes GET)]
    [joodo.views :only (render-template render-html)]
))

(def tutorial-controller
  (->
    (routes
      (GET "/tutorial" [] (render-template "tutorial/step1"))
      (GET "/tutorial/" [] (render-template "tutorial/step1"))
      (GET "/tutorial/step1" [] (render-template "tutorial/step1"))
      (GET "/tutorial/step2" [] (render-template "tutorial/step2"))
      (GET "/tutorial/step3" [] (render-template "tutorial/step3"))
      (GET "/tutorial/step4" [] (render-template "tutorial/step4"))
      (GET "/tutorial/step5" [] (render-template "tutorial/step5"))
      (GET "/tutorial/step6" [] (render-template "tutorial/step6"))
      (GET "/tutorial/step7" [] (render-template "tutorial/step7"))
)))