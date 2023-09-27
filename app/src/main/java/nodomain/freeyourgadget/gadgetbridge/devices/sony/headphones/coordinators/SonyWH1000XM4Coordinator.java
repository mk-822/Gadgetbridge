/*  Copyright (C) 2021 José Rebelo

    This file is part of Gadgetbridge.

    Gadgetbridge is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Gadgetbridge is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>. */
package nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.coordinators;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.List;

import nodomain.freeyourgadget.gadgetbridge.R;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.SonyHeadphonesCapabilities;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.SonyHeadphonesCoordinator;
import nodomain.freeyourgadget.gadgetbridge.impl.GBDeviceCandidate;
import nodomain.freeyourgadget.gadgetbridge.model.DeviceType;
import nodomain.freeyourgadget.gadgetbridge.service.devices.sony.headphones.SonyHeadphonesSupport;

public class SonyWH1000XM4Coordinator extends SonyHeadphonesCoordinator {
    @NonNull
    @Override
    public DeviceType getSupportedType(final GBDeviceCandidate candidate) {
        if (candidate.getName().contains("WH-1000XM4")) {
            return DeviceType.SONY_WH_1000XM4;
        }

        return DeviceType.UNKNOWN;
    }

    @Override
    public int getDeviceNameResource() {
        return R.string.devicetype_sony_wh_1000xm4;
    }

    @Override
    public List<SonyHeadphonesCapabilities> getCapabilities() {
        return Arrays.asList(
                // TODO: Function of [CUSTOM] button
                // TODO R.xml.devicesettings_connect_two_devices,
                SonyHeadphonesCapabilities.BatterySingle,
                SonyHeadphonesCapabilities.AmbientSoundControl,
                SonyHeadphonesCapabilities.WindNoiseReduction,
                SonyHeadphonesCapabilities.SpeakToChatEnabled,
                SonyHeadphonesCapabilities.SpeakToChatConfig,
                SonyHeadphonesCapabilities.AncOptimizer,
                SonyHeadphonesCapabilities.EqualizerWithCustomBands,
                SonyHeadphonesCapabilities.AudioUpsampling,
                SonyHeadphonesCapabilities.TouchSensorSingle,
                SonyHeadphonesCapabilities.PauseWhenTakenOff,
                SonyHeadphonesCapabilities.AutomaticPowerOffWhenTakenOff,
                SonyHeadphonesCapabilities.VoiceNotifications
        );
    }
}
