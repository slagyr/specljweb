(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "Speclj"]
  (include-css "/stylesheets/speclj_www.css")
  (include-js "/javascript/speclj_www.js")]
 [:body
  [:div {:id "header"}
   [:div {:id "head-container"}
    [:a {:href "/"}
     [:img {:id "logo" :src "/images/speclj.png"}]]
    [:span {:id "tagline"} "It's pronounced &quot;speckle&quot; [spec-uhl].<br />It's a TDD/BDD framework for Clojure, based on RSpec."]
    [:br]   [:br]   [:br]
    [:ul {:id "menu"}
     [:li [:a {:href "/install"} "Installation"]]
     [:li [:a {:href "/tutorial"} "Tutorial"]]
     [:li [:a {:href "/docs"} "Documentation"]]
     [:li [:a {:href "/community"} "Community"]]
     [:li [:a {:href "https://github.com/slagyr/speclj/issues" :target "_blank"} "Feature Requests"]]]
    [:hr]]]
  [:div {:id "body"}
  (if (= "docs" (subs (*request* :uri) 1 5))
    (render-partial "partials/doc_sidebar"))
   (eval (:template-body joodo.views/*view-context*))
  ]
  [:div {:id "footer"}
   [:div {:id "foot-container"}
    [:span {:id "foot-links"}
     [:a {:href "/license"} "License Info"]
     " | "
     [:a {:href "https://github.com/slagyr/speclj/" :target "_blank"} "Git Repository"]]
    [:br]
    [:span "Copyright &copy; 2011 Micah Martin All Rights Reserved"]]]
]]