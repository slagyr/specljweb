[:h3 "before"]

[:div {:id "comp_box"}
  [:p "Declares a function that is invoked before each characteristic in the containing describe scope is evaluated. The body may consist of any forms, presumably ones that perform side effects."]

  [:code "(before (println \"A spec is about to be evaluated\"))"]]