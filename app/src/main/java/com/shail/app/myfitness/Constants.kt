package com.shail.app.myfitness

/**
 * Static object that defines the different deep-links
 */
object DeepLink {
    const val STATS = "/stats"
    const val START = "/start"
    const val STOP = "/stop"

    /**
     * Parameter types for the deep-links
     */
    object Params {
        const val ACTIVITY_TYPE = "exerciseType"
    }

    object Actions {
        const val ACTION_TOKEN_EXTRA = "actions.fulfillment.extra.ACTION_TOKEN"
    }
}