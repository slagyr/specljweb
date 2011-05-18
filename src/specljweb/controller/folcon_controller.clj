(ns specljweb.controller.folcon-controller
  (:use
    [compojure.core]
    [ring.util.response :only (redirect)]
    [gaeshi.middleware.request :only (*request*)]
    [gaeshi.views :only (render-template)]))

(defn- add-session-value []
  (let [key (:key (:params *request*))
        value (:value (:params *request*))]
    (assoc
      (redirect "/folcon")
      :session {key value})))

(defn- delete-session-value []
  (let [key (:key (:params *request*))]
    (assoc
      (redirect "/folcon")
      :session {key nil})))

(defroutes folcon-controller
  (GET "/folcon" [] (render-template "show_session" :session (:session *request*)))
  (POST "/folcon/add" [] (add-session-value))
  (ANY "/folcon/delete" [] (delete-session-value))
  )

