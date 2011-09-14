(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "utf-8"}]
  [:title "Clojure Testing Framework | Speclj"]
  (include-css "/stylesheets/reset.css")
  (include-css "/stylesheets/speclj_main.css")
  (include-css "/stylesheets/clojure_code_highlight.css")
  [:link {:rel "stylesheet" :type "text/css" :href "http://fonts.googleapis.com/css?family=Rosario:400,400italic"}]
  "<!--[if IE]>"
   "<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>"
  "<![endif]-->"]
 [:body
  [:div {:role "main"}
   [:div {:id "top"}
    [:div {:class "left"}
     [:a {:href "/"} [:img {:class "speclj" :src "/images/speclj.png"}]]]
    [:div {:class "right"}
     [:p "a <abbr>TDD</abbr>/<abbr>BDD</abbr> framework for Clojure"]
     [:h4 "pronounced \"speckle\" [spec-uhl]."]]]
   [:div {:id "bottom"}
    [:nav
     [:ul
      [:li [:a {:href "/install"} "Installation"]]
      [:li [:a {:href "/tutorial"} "Tutorial"]]
      [:li [:a {:href "/docs"} "Documentation"]]
      (if (= "docs" (subs (*request* :uri) 1 5))
        [:li [:ul (render-partial "partials/doc_sidebar")]])
      [:li [:a {:href "/community"} "Community"]]
      [:li [:a {:href "https://github.com/slagyr/speclj/issues" :target "_blank"} "Feature Requests"]]]]

    [:div {:id "body"}
     (eval (:template-body joodo.views/*view-context*))]]]

  [:div {:id "footer"}
   [:div {:id "foot-container"}
    [:span {:id "foot-links"}
     [:a {:href "/license"} "License Info"]
     " | "
     [:a {:href "https://github.com/slagyr/speclj/" :target "_blank"} "Git Repository"]]
    [:br]
    [:span "Copyright &copy; 2011 Micah Martin All Rights Reserved"]]]
]]