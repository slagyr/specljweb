[:h3 "should-not-be-same"]

[:div {:id "comp_box"}

  [:p "Tests identity"]

  [:code "(should-not-be-same \"foo\" \"foo\") ;fail<br>
          (should-not-be-same 1 1) ;fail<br>
          (should-not-be-same [] ()) ;pass<br>
          (should-not-be-same 1 1.0) ;pass"]]
