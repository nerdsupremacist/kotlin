/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.util

import com.intellij.openapi.progress.ProgressManager

object IDECanceled : Canceled {
    init {
        Canceled.use(this)
    }

    override fun check() {
        ProgressManager.checkCanceled()
    }
}