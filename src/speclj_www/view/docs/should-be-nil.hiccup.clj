[:h3 "should-be-nil"]

[:div {:id "comp_box"}

  [:p "should-be-nil checks for equality with nil"]
  [:code "(should-be-nil nil) ;pass<br>
          (should-be-nil true) ;fail<br>
          (should-be-nil false) ;fail"]]
