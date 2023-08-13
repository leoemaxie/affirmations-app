package com.leo.affirmations.model

import androidx.annotation.StringRes
import androidx.annotation.DrawableRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int
) 