[:h3 "after"]

[:div {:id "comp_box"}
  [:p "Declares a function that is invoked after each characteristic in the containing describe scope is evaluated. The body may consist of any forms, presumably ones that perform side effects."]

  [:code "(after (println \"A spec has just been evaluated\"))"]]