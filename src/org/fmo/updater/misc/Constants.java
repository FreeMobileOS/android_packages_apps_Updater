/*
 * Copyright (C) 2017 The LineageOS Project
 * Copyright (C) 2017 The FMO Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fmo.updater.misc;

public final class Constants {

    private Constants() {
    }

    public static final String AB_PAYLOAD_BIN_PATH = "payload.bin";
    public static final String AB_PAYLOAD_PROPERTIES_PATH = "payload_properties.txt";

    public static final String PREF_LAST_UPDATE_CHECK = "last_update_check";
    public static final String PREF_AUTO_UPDATES_CHECK = "auto_updates_check";
    public static final String PREF_AUTO_DELETE_UPDATES = "auto_delete_updates";
    public static final String PREF_MOBILE_DATA_WARNING = "pref_mobile_data_warning";
    public static final String PREF_NEEDS_REBOOT = "needs_reboot";

    public static final String UNCRYPT_FILE_EXT = ".uncrypt";

    public static final String PROP_BUILD_DATE = "ro.build.date.utc";
    public static final String PROP_BUILD_VERSION = "ro.build.version.release";
    public static final String PROP_BUILD_VERSION_INCREMENTAL = "ro.build.version.incremental";
    public static final String PROP_DEVICE = "ro.product.device";
    public static final String PROP_NEXT_DEVICE = "ro.updater.next_device";
    public static final String PROP_RELEASE_TYPE = "ro.build.type";
    public static final String PROP_UPDATER_URI = "fmo.updater.uri";
}
