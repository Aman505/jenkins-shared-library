def call(String imagename, String imageversion){
  sh "docker build -t ${imagename}:${imageversion} ."
}
