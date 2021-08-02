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

