(defproject speclj_www "1.0.0"
  :description "Speclj's Documentation Website"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [joodo "1.1.2"]
                 [speclj "2.5.0"]]
  :min-lein-version "2.0.0"
  :plugins [[speclj "2.5.0"]
            [joodo/lein-joodo "1.1.2"]]
  :test-paths ["spec"]
  :joodo-core-namespace speclj_www.core)
