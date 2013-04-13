[:h3 "should-contain"]

[:div {:id "comp_box"}


  [:p "Checks for containmentship of precise strings"]

  [:code "(should-contain \"foo\" \"foobar\") ;pass<br>
          (should-contain \"foo\" \"bar\") ;fail<br>
          (should-contain \"foo\" \"Foo\") ;fail"]

  [:p "Checks for containmentship of regular expressions"]

  [:code "(should-contain #\"hello.*\" \"hello, world\") ;pass<br>
          (should-contain #\"hello.*\" \"hola!\") ;fail<br>
          (should-contain #\"tea\" \"I'm a little teapot\") ;pass<br>
          (should-contain #\"coffee\" \"I'm a little teapot\") ;fail"]

  [:p "Checks for containmentship of collection items"]

  [:code "(should-contain \"tea\" [\"little\" \"tea\" \"pot\"]) ;pass<br>
          (should-contain \"tea\" (list \"little\" \"tea\" \"pot\")) ;pass<br>
          (should-contain \"tea\" (set [\"tea\" \"pot\"])) ;pass<br>
          (should-contain 1 [1 2 3]) ;pass<br>
          (should-contain \"coffee\" [\"little\" \"tea\" \"pot\"]) ;fail<br>
          (should-contain \"coffee\" (list \"tea\" \"pot\")) ;fail<br>
          (should-contain \"coffee\" (set [\"tea\" \"pot\"])) ;fail"]

  [:p "Checks for containmentship of keys"]

  [:code "(should-contain \"foo\" {\"foo\" :bar}) ;pass<br>
          (should-contain :bar {\"foo\" :bar}) ;fail<br>
          (should-contain 1 {\"foo\" :bar 1 2}) ;pass<br>
          (should-contain 2 {\"foo\" :bar 1 2}) ;fail"]]
