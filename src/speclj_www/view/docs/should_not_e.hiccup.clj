[:h3 "should-not="]

[:div {:id "comp_box"}
  [:p "Asserts that two forms evaluate to inequal values, with the unexpexcted value as the first parameter."]

  [:code "(should-not= 1 1) ; fails<br />
    (should-not= 1 2) ; passes</pre>"]]