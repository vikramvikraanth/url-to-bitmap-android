#url to bitmap android

    BitmapConvertor.UrltoBitmap(CompositeDisposable(),object : BitmapConvertor.BitmapCallBack{
             override fun onSuccess(bitmap: Bitmap?) {
 
             }
 
             override fun onProgress(Status: String?) {
                 when(Status){
                     "start"->{
                         
                     }
                     "end"->{
                         
                     }
                 }
             }
 
             override fun onFailure(throwable: Throwable?) {
 
             }
 
         },"Here your image url")

//rx java
implementation 'io.reactivex.rxjava2:rxjava:2.2.16'

implementation 'io.reactivex.rxjava2:rxandroid:2.1.1'


Since version  will move from JCenter to MavenCentral

// build.gradle (project)
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Gradle

   implementation 'com.github.vikramvikraanth:url-to-bitmap-android:0.0.3'
   

