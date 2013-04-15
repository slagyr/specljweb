[:h3 "should-not=="]

[:div {:id "comp_box"}

  [:p "Loose inequality check"]

  [:code "(should-not== 1 1) ;fail<br>
          (should-not== 1 1.0) ;fail<br>
          (should-not== (int 1) (long 1)) ;fail<br>
          (should-not== 1 2) ;pass<br>
          (should-not== 1 2.0) ;pass<br>
          (should-not== [1 2 3] [1 2 3]) ;fail<br>
          (should-not== [1 2 3] [1 3 2]) ;fail<br>
          (should-not== [1 2 3] [1 2 3 4]) ;pass<br>
          (should-not== [1 2 3] [1 2]) ;pass<br>
          (should-not== [1 2 3] [1 2 4]) ;pass<br>
          (should-not== [1 5] [1 1 1 5]) ;pass<br>
          (should-not== [1 1 1 5] [1 5]) ;pass"]]
