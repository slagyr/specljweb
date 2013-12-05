(defproject speclj_www "1.0.0"
  :description "Speclj's Documentation Website"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [joodo "2.0.0"]
                 [speclj "2.8.0"]]
  :min-lein-version "2.0.0"
  :plugins [[speclj "2.8.0"]
            [lein-ring "0.8.8"]]
  :test-paths ["spec"]
  :ring {:handler speclj_www.core/app}
  )
