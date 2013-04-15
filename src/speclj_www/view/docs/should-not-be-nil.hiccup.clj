[:h3 "should-not-be-nil"]

[:div {:id "comp_box"}

  [:p "Checks for inequality using nil."]

  [:code "(should-not-be-nil nil) ; fail<br>
          (should-not-be-nil true) ; pass<br>
          (should-not-be-nil false) ; pass<br>"]]
