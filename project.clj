(defproject weasel-src-paths "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2665"]
                 [weasel "0.5.0"]]
  :plugins [[lein-cljsbuild "1.0.3"]
            [jarohen/simple-brepl "0.2.1"]]
  :source-paths ["src"]
  :cljsbuild {:builds {:dev
                       {:source-paths ["src"
                                       "foo-src"]}}})
