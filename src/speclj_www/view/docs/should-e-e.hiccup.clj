[:h3 "should=="]

[:div {:id "comp_box"}

  [:p "Loose equality check"]

  [:code "(should== 1 1) ;pass<br>
          (should== 1 1.0) ;pass<br>
          (should== (int 1) (long 1)) ;pass<br>
          (should== 1 2) ;fail<br>
          (should== 1 2.0) ;fail<br>
          (should== [1 2 3] [1 2 3])) ;pass<br>
          (should== [1 2 3] [1 3 2]) ;pass<br>
          (should== [1 2 3] [1 2 3 4]) ;fail<br>
          (should== [1 2 3] [1 2]) ;fail<br>
          (should== [1 2 3] [1 2 4]) ;fail<br>
          (should== [1 5] [1 1 1 5]) ;fail<br>
          (should== [1 1 1 5] [1 5]) ;fail"]]
