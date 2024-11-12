def build(String imagename, String imageversion){
  sh 'docker built -t ${imagename}:${imageversion} .'
}
