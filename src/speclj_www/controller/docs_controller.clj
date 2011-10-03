(ns speclj_www.controller.docs-controller
  (:use
	[compojure.core :only (routes GET)]
    [joodo.views :only (render-template render-html)]
))

(def docs-controller
  (->
    (routes
      (GET "/docs" [] (render-template "docs/index"))
      (GET "/docs/" [] (render-template "docs/index"))
      (GET "/docs/describe" [] (render-template "docs/describe"))
      (GET "/docs/it" [] (render-template "docs/it"))
      (GET "/docs/context" [] (render-template "docs/context"))
      (GET "/docs/should" [] (render-template "docs/should"))
      (GET "/docs/should-not" [] (render-template "docs/should_not"))
      (GET "/docs/should-e" [] (render-template "docs/should_e"))
      (GET "/docs/should-not-e" [] (render-template "docs/should_not_e"))
      (GET "/docs/should-fail" [] (render-template "docs/should_fail"))
      (GET "/docs/should-throw" [] (render-template "docs/should_throw"))
      (GET "/docs/should-not-throw" [] (render-template "docs/should_not_throw"))
      (GET "/docs/before" [] (render-template "docs/before"))
      (GET "/docs/before-all" [] (render-template "docs/before_all"))
      (GET "/docs/after" [] (render-template "docs/after"))
      (GET "/docs/after-all" [] (render-template "docs/after_all"))
      (GET "/docs/with" [] (render-template "docs/with"))
      (GET "/docs/with-all" [] (render-template "docs/with-all"))
      (GET "/docs/around" [] (render-template "docs/around"))
      (GET "/docs/tags" [] (render-template "docs/tags"))
)))