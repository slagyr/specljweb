[:h3 "should-not-contain"]

[:div {:id "comp_box"}

[:p "Checks for non-containmentship of precise strings"]

  [:code "(should-not-contain \"foo\" \"foobar\") ;fail<br>
          (should-not-contain \"foo\" \"bar\") ;pass<br>
          (should-not-contain \"foo\" \"Foo\") ;pass"]

  [:p "Checks for non-containmentship of regular expressions"]

  [:code "(should-not-contain #\"hello.*\" \"hello, world\") ;fail<br>
          (should-not-contain #\"hello.*\" \"hola!\") ;pass<br>
          (should-not-contain #\"tea\" \"I'm a little teapot\") ;fail<br>
          (should-not-contain #\"coffee\" \"little teapot\") ;pass"]

  [:p "Checks for non-containmentship of collection items"]

  [:code "(should-not-contain \"tea\" [\"little\" \"tea\" \"pot\"]) ;fail<br>
          (should-not-contain \"tea\" (list \"tea\" \"pot\")) ;fail<br>
          (should-not-contain \"tea\" (set [\"tea\" \"pot\"])) ;fail<br>
          (should-not-contain 1 [1 2 3]) ;fail<br>
          (should-not-contain \"coffee\" [\"tea\" \"pot\"]) ;pass<br>
          (should-not-contain \"coffee\" (list \"tea\" \"pot\")) ;pass<br>
          (should-not-contain \"coffee\" (set [\"tea\" \"pot\"])) ;pass"]

  [:p "Checks for non-containmentship of keys"]

  [:code "(should-not-contain \"foo\" {\"foo\" :bar}) ;fail<br>
          (should-not-contain :bar {\"foo\" :bar}) ;pass<br>
          (should-not-contain 1 {\"foo\" :bar 1 2}) ;fail<br>
          (should-not-contain 2 {\"foo\" :bar 1 2}) ;pass"]]
