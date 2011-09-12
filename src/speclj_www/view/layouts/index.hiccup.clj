(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "utf-8"}]
  [:title "Clojure Testing Framework | Speclj"]
  (include-css "/stylesheets/reset.css")
  (include-css "/stylesheets/speclj.css")
  [:link {:rel "stylesheet" :type "text/css" :href "http://fonts.googleapis.com/css?family=Rosario:400,400italic"}]
  "<!--[if IE]>"
   "<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>"
  "<![endif]-->"]
 [:body
  [:div {:role "main"}
   [:div {:id "top"}
    [:div {:class "left"}
     [:img {:class "speclj" :src "images/speclj.png"}]]
    [:div {:class "right"}
     [:p "a <abbr>TDD</abbr>/<abbr>BDD</abbr> framework for Clojure"]
     [:h4 "pronounced \"speckle\" [spec-uhl]."]]]
   [:div {:id "bottom"}
    [:nav
     [:ul
      [:li [:a {:href "/install"} "Installation"]]
      [:li [:a {:href "/tutorial"} "Tutorial"]]
      [:li [:a {:href "/docs"} "Documentation"]]
      [:li [:a {:href "/community"} "Community"]]
      [:li [:a {:href "https://github.com/slagyr/speclj/issues" :target "_blank"} "Feature Requests"]]]]

    (eval (:template-body joodo.views/*view-context*))]]]]