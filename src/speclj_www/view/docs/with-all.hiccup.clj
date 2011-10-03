[:h3 "with-all"]

[:div {:id "comp_box"}
  [:p "Declares a reference-able symbol that will be lazily evaluated once per context of the containing describe scope. The body may contain any forms, the last of which will be the value of the dereferenced symbol."]

  [:code "(with-all meaning 42)<br />
  (it \"knows the meaining life\" (should= @meaning (the-meaning-of :life)))"]]