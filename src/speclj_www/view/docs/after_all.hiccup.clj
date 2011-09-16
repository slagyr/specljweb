[:h3 "after-all"]

[:div {:id "comp_box"}
  [:p "Declares a function that is invoked once after all the characteristics in the containing describe scope have been evaluated. The body may consist of any forms, presumably ones that perform side effects."]

  [:code "(after-all (println \"That's all folks.\"))"]]