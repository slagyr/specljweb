[:h3 "before-all"]

[:div {:id "comp_box"}
  [:p "Declares a function that is invoked once before any characteristic in the containing describe scope is evaluated. The body may consist of any forms, presumably ones that perform side effects."]

  [:code "(before-all (println \"May the spec'ing begin!\"))"]]