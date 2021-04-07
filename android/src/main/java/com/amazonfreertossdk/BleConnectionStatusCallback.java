/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonfreertossdk;

/**
 * This is a callback to notify the app of BLE connection state change.
 */
public abstract class BleConnectionStatusCallback {
    /**
     * This callback is triggered when BLE connection between SDK and device has changed. The app
     * @param connectionStatus The BLE connection state.
     */
    public void onBleConnectionStatusChanged(AmazonFreeRTOSConstants.BleConnectionState connectionStatus) {}
}
