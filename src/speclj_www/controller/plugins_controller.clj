(ns speclj_www.controller.plugins-controller
  (:use
	[compojure.core :only (routes GET)]
    [joodo.views :only (render-template render-html)]
))

(def plugins-controller
  (->
    (routes
      (GET "/plugins" [] (render-template "plugins/index"))
      (GET "/plugins/speclj-growl" [] (render-template "plugins/speclj-growl"))
)))