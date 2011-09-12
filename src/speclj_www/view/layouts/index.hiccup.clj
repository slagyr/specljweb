(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "speclj_www"]
  (include-css "/stylesheets/speclj_www.css")
  (include-js "/javascript/speclj_www.js")]
 [:body
  [:div {:id "header"}
   [:div {:id "head-container"}
    [:a {:href "/"}
     [:img {:id "logo" :src "/images/speclj.png"}]]
    [:span {:id "tagline"} "This is the index layout"]
    [:br]   [:br]   [:br]
    [:ul {:id "menu"}
     [:li [:a {:href "/install"} "Installation"]]
     [:li [:a {:href "/tutorial"} "Tutorial"]]
     [:li [:a {:href "/docs"} "Documentation"]]
     [:li [:a {:href "/community"} "Community"]]
     [:li [:a {:href "https://github.com/slagyr/speclj/issues" :target "_blank"} "Feature Requests"]]]
    [:hr]]]
  [:div {:id "body"}
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