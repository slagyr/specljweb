[:ul
 (for [component speclj-components]
   [:li [:a {:href (str "/docs/" component)} component]])]