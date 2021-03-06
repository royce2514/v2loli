package com.v2ray.loli

/**
 *
 * App Config Const
 */
object AppConfig {
    const val ANG_PACKAGE = "com.v2ray.loli"
    const val ANG_CONFIG = "loli_config"
    const val PREF_CURR_CONFIG = "pref_v2ray_config"
    const val PREF_CURR_CONFIG_GUID = "pref_v2ray_config_guid"
    const val PREF_CURR_CONFIG_NAME = "pref_v2ray_config_name"
    const val VMESS_PROTOCOL: String = "vmess://"
    const val SS_PROTOCOL: String = "ss://"
    const val BROADCAST_ACTION_SERVICE = "com.v2ray.loli.action.service"
    const val BROADCAST_ACTION_ACTIVITY = "com.v2ray.loli.action.activity"
    const val BROADCAST_ACTION_WIDGET_CLICK = "com.v2ray.loli.action.widget.click"

    const val TASKER_EXTRA_BUNDLE = "com.twofortyfouram.locale.intent.extra.BUNDLE"
    const val TASKER_EXTRA_STRING_BLURB = "com.twofortyfouram.locale.intent.extra.BLURB"
    const val TASKER_EXTRA_BUNDLE_SWITCH = "tasker_extra_bundle_switch"
    const val TASKER_EXTRA_BUNDLE_GUID = "tasker_extra_bundle_guid"

    const val PREF_V2RAY_ROUTING_AGENT = "pref_v2ray_routing_agent"
    const val PREF_V2RAY_ROUTING_DIRECT = "pref_v2ray_routing_direct"
    const val PREF_V2RAY_ROUTING_BLOCKED = "pref_v2ray_routing_blocked"
    const val TAG_AGENT = "proxyout"
    const val TAG_DIRECT = "directout"
    const val TAG_BLOCKED = "blockout"

    const val MSG_REGISTER_CLIENT = 1
    const val MSG_STATE_RUNNING = 11
    const val MSG_STATE_NOT_RUNNING = 12
    const val MSG_UNREGISTER_CLIENT = 2
    const val MSG_STATE_START = 3
    const val MSG_STATE_START_SUCCESS = 31
    const val MSG_STATE_START_FAILURE = 32
    const val MSG_STATE_STOP = 4
    const val MSG_STATE_STOP_SUCCESS = 41
    const val MSG_STATE_RESTART = 5
    const val MSG_STATE_RESTART_SOFT = 6

    const val TG_GROUP_NAME = "V2rayIsNotGreat"
    object EConfigType {
        val Vmess = 1
        val Custom = 2
        val Shadowsocks = 3
    }

}