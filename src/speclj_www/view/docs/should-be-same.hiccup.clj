[:h3 "should-be-same"]

[:div {:id "comp_box"}

  [:p "Tests identity"]

  [:code "(should-be-same \"foo\" \"foo\") ; pass<br>
          (should-be-same 1 1) ; pass<br>
          (should-be-same [] ()) ; fail<br>
          (should-be-same 1 1.0) ; fail<br>"]]
