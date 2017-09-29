/**
 * Instafilter
 *
 * Created by iomusashi on 9/25/17.
 * Copyright (c) 2017 iomusashi. All rights reserved.
 */

package co.blackfintech.instafilter.filters

import android.content.Context
import co.blackfintech.instafilter.R
import jp.co.cyberagent.android.gpuimage.GPUImageColorMatrixFilter

////////////////////////////////////////////////////////////////////////////////////////////////////
class Original(context: Context) : AbstractFilter(R.drawable.rgb, Original::class.java.simpleName) {

  override fun initialize() {

    filter = GPUImageColorMatrixFilter()
  }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
