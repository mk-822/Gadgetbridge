/*  Copyright (C) 2015-2023 Andreas Böhler, Andreas Shimokawa, Carsten
    Pfeiffer, Cre3per, Daniel Dakhno, Daniele Gobbetti, Gordon Williams,
    Jean-François Greffier, João Paulo Barraca, José Rebelo, Kranz, ladbsoft,
    Manuel Ruß, maxirnilian, Pavel, Pavel Elagin, protomors, Quallenauge,
    Sami Alaoui, Sebastian Kranz, Sophanimus, tiparega, Vadim Kaushan,
    Johannes Krude

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
package nodomain.freeyourgadget.gadgetbridge.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import nodomain.freeyourgadget.gadgetbridge.R;
import nodomain.freeyourgadget.gadgetbridge.devices.DeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.UnknownDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.asteroidos.AsteroidOSDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.banglejs.BangleJSCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.binary_sensor.coordinator.BinarySensorCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.casio.gb6900.CasioGB6900DeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.casio.gbx100.CasioGBX100DeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.casio.gwb5600.CasioGMWB5000DeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.casio.gwb5600.CasioGWB5600DeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.domyos.DomyosT540Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.fitpro.FitProDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.flipper.zero.FlipperZeroCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.galaxy_buds.GalaxyBuds2DeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.galaxy_buds.GalaxyBuds2ProDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.galaxy_buds.GalaxyBudsDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.galaxy_buds.GalaxyBudsLiveDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.galaxy_buds.GalaxyBudsProDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.hplus.EXRIZUK8Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.hplus.HPlusCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.hplus.MakibesF68Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.hplus.Q8Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.hplus.SG2Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitband5.AmazfitBand5Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitband7.AmazfitBand7Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitbip.AmazfitBipCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitbip.AmazfitBipLiteCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitbip3pro.AmazfitBip3ProCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitbip5.AmazfitBip5Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitbips.AmazfitBipSCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitbips.AmazfitBipSLiteCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitbipu.AmazfitBipUCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitbipupro.AmazfitBipUProCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitcheetahpro.AmazfitCheetahProCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitcheetahround.AmazfitCheetahRoundCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitcheetahsquare.AmazfitCheetahSquareCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitcor.AmazfitCorCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitcor2.AmazfitCor2Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitfalcon.AmazfitFalconCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgtr.AmazfitGTRCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgtr.AmazfitGTRLiteCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgtr2.AmazfitGTR2Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgtr2.AmazfitGTR2eCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgtr3.AmazfitGTR3Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgtr3pro.AmazfitGTR3ProCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgtr4.AmazfitGTR4Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgtrmini.AmazfitGTRMiniCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgts.AmazfitGTSCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgts2.AmazfitGTS2Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgts2.AmazfitGTS2MiniCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgts2.AmazfitGTS2eCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgts3.AmazfitGTS3Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgts4.AmazfitGTS4Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitgts4mini.AmazfitGTS4MiniCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitneo.AmazfitNeoCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitpop.AmazfitPopCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitpoppro.AmazfitPopProCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfittrex.AmazfitTRexCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfittrex2.AmazfitTRex2Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfittrexpro.AmazfitTRexProCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfittrexultra.AmazfitTRexUltraCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitvergel.AmazfitVergeLCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.amazfitx.AmazfitXCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.miband2.MiBand2Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.miband2.MiBand2HRXCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.miband3.MiBand3Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.miband4.MiBand4Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.miband5.MiBand5Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.miband6.MiBand6Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.miband7.MiBand7Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.huami.zeppe.ZeppECoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.id115.ID115Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.itag.ITagCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.jyou.BFH16DeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.jyou.TeclastH30.TeclastH30Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.jyou.y5.Y5Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.lefun.BohemicSmartBraceletDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.lefun.LefunDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.lenovo.watchxplus.WatchXPlusDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.liveview.LiveviewCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.makibeshr3.MakibesHR3Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.miband.MiBandCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.mijia_lywsd02.MijiaLywsd02Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.miscale2.MiScale2DeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.no1f1.No1F1Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.nothing.Ear1Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.nut.NutCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.pebble.PebbleCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.pinetime.PineTimeJFCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.qc35.QC35Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.qhybrid.QHybridCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.roidmi.Roidmi1Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.roidmi.Roidmi3Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.smaq2oss.SMAQ2OSSCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.soflow.SoFlowCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.coordinators.SonyLinkBudsSCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.coordinators.SonyWF1000XM3Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.coordinators.SonyWF1000XM4Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.coordinators.SonyWFSP800NCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.coordinators.SonyWH1000XM2Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.coordinators.SonyWH1000XM3Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.coordinators.SonyWH1000XM4Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.headphones.coordinators.SonyWH1000XM5Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.sony.wena3.SonyWena3Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.sonyswr12.SonySWR12DeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.supercars.SuperCarsCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.test.TestDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.tlw64.TLW64Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.um25.Coordinator.UM25Coordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.vesc.VescCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.vibratissimo.VibratissimoCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.vivomovehr.VivomoveHrCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.waspos.WaspOSCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.watch9.Watch9DeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.withingssteelhr.WithingsSteelHRDeviceCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.xwatch.XWatchCoordinator;
import nodomain.freeyourgadget.gadgetbridge.devices.zetime.ZeTimeCoordinator;

/**
 * For every supported device, a device type constant must exist.
 *
 * Note: they key of every constant is stored in the DB, so it is fixed forever,
 * and may not be changed.
 */
public enum DeviceType {
    UNKNOWN(-1, UnknownDeviceCoordinator.class),
    PEBBLE(1, PebbleCoordinator.class),
    MIBAND(10, MiBandCoordinator.class),
    MIBAND2(11, MiBand2Coordinator.class),
    MIBAND2_HRX(1001, MiBand2HRXCoordinator.class),
    AMAZFITBIP(12, AmazfitBipCoordinator.class),
    AMAZFITCOR(13, AmazfitCorCoordinator.class),
    MIBAND3(14, MiBand3Coordinator.class),
    AMAZFITCOR2(15, AmazfitCor2Coordinator.class),
    MIBAND4(16, MiBand4Coordinator.class),
    AMAZFITBIP_LITE(17, AmazfitBipLiteCoordinator.class),
    AMAZFITGTR(18, AmazfitGTRCoordinator.class),
    AMAZFITGTS(19, AmazfitGTSCoordinator.class),
    AMAZFITBIPS(20, AmazfitBipSCoordinator.class),
    AMAZFITGTR_LITE(21, AmazfitGTRLiteCoordinator.class),
    AMAZFITTREX(22, AmazfitTRexCoordinator.class),
    MIBAND5(23, MiBand5Coordinator.class),
    AMAZFITBAND5(24, AmazfitBand5Coordinator.class),
    AMAZFITBIPS_LITE(25, AmazfitBipSLiteCoordinator.class),
    AMAZFITGTR2(26, AmazfitGTR2Coordinator.class),
    AMAZFITGTS2(27, AmazfitGTS2Coordinator.class),
    AMAZFITBIPU(28, AmazfitBipUCoordinator.class),
    AMAZFITVERGEL(29, AmazfitVergeLCoordinator.class),
    AMAZFITBIPUPRO(30, AmazfitBipUProCoordinator.class),
    AMAZFITNEO(31, AmazfitNeoCoordinator.class),
    AMAZFITGTS2_MINI(32, AmazfitGTS2MiniCoordinator.class),
    ZEPP_E(33, ZeppECoordinator.class),
    AMAZFITGTR2E(34, AmazfitGTR2eCoordinator.class),
    AMAZFITGTS2E(35, AmazfitGTS2eCoordinator.class),
    AMAZFITX(36, AmazfitXCoordinator.class),
    MIBAND6(37, MiBand6Coordinator.class),
    AMAZFITTREXPRO(38, AmazfitTRexProCoordinator.class),
    AMAZFITPOP(39, AmazfitPopCoordinator.class),
    AMAZFITPOPPRO(10040, AmazfitPopProCoordinator.class),
    MIBAND7(10041, MiBand7Coordinator.class),
    AMAZFITGTS3(10042, AmazfitGTS3Coordinator.class),
    AMAZFITGTR3(10043, AmazfitGTR3Coordinator.class),
    AMAZFITGTR4(10044, AmazfitGTR4Coordinator.class),
    AMAZFITBAND7(10045, AmazfitBand7Coordinator.class),
    AMAZFITGTS4(10046, AmazfitGTS4Coordinator.class),
    AMAZFITGTS4MINI(10047, AmazfitGTS4MiniCoordinator.class),
    AMAZFITTREX2(10048, AmazfitTRex2Coordinator.class),
    AMAZFITGTR3PRO(10049, AmazfitGTR3ProCoordinator.class),
    AMAZFITBIP3PRO(10051, AmazfitBip3ProCoordinator.class),
    AMAZFITCHEETAHPRO(10050, AmazfitCheetahProCoordinator.class),
    AMAZFITCHEETAHSQUARE(10052, AmazfitCheetahSquareCoordinator.class),
    AMAZFITCHEETAHROUND(10053, AmazfitCheetahRoundCoordinator.class),
    AMAZFITBIP5(10054, AmazfitBip5Coordinator.class),
    AMAZFITTREXULTRA(10055, AmazfitTRexUltraCoordinator.class),
    AMAZFITGTRMINI(10056, AmazfitGTRMiniCoordinator.class),
    AMAZFITFALCON(10057, AmazfitFalconCoordinator.class),
    HPLUS(40, HPlusCoordinator.class),
    MAKIBESF68(41, MakibesF68Coordinator.class),
    EXRIZUK8(42, EXRIZUK8Coordinator.class),
    Q8(43, Q8Coordinator.class),
    SG2(44, SG2Coordinator.class),
    NO1F1(50, No1F1Coordinator.class),
    TECLASTH30(60, TeclastH30Coordinator.class),
    Y5(61, Y5Coordinator.class),
    XWATCH(70, XWatchCoordinator.class),
    ZETIME(80, ZeTimeCoordinator.class),
    ID115(90, ID115Coordinator.class),
    WATCH9(100, Watch9DeviceCoordinator.class),
    WATCHXPLUS(102, WatchXPlusDeviceCoordinator.class),
    ROIDMI(110, Roidmi1Coordinator.class),
    ROIDMI3(112, Roidmi3Coordinator.class),
    CASIOGB6900(120, CasioGB6900DeviceCoordinator.class),
    CASIOGBX100(121, CasioGBX100DeviceCoordinator.class),
    CASIOGWB5600(122, CasioGWB5600DeviceCoordinator.class),
    CASIOGMWB5000(123, CasioGMWB5000DeviceCoordinator.class),
    MISCALE2(131, MiScale2DeviceCoordinator.class),
    BFH16(140, BFH16DeviceCoordinator.class),
    MAKIBESHR3(150, MakibesHR3Coordinator.class),
    BANGLEJS(160, BangleJSCoordinator.class),
    FOSSILQHYBRID(170, QHybridCoordinator.class),
    TLW64(180, TLW64Coordinator.class),
    PINETIME_JF(190, PineTimeJFCoordinator.class),
    MIJIA_LYWSD02(200, MijiaLywsd02Coordinator.class),
    LEFUN(210, LefunDeviceCoordinator.class),
    BOHEMIC_SMART_BRACELET(211, BohemicSmartBraceletDeviceCoordinator.class),
    SMAQ2OSS(220, SMAQ2OSSCoordinator.class),
    FITPRO(230, FitProDeviceCoordinator.class),
    ITAG(250, ITagCoordinator.class),
    NUTMINI(251, NutCoordinator.class),
    VIVOMOVE_HR(260, VivomoveHrCoordinator.class),
    VIBRATISSIMO(300, VibratissimoCoordinator.class),
    SONY_SWR12(310, SonySWR12DeviceCoordinator.class),
    LIVEVIEW(320, LiveviewCoordinator.class),
    WASPOS(330, WaspOSCoordinator.class),
    UM25(350, UM25Coordinator.class),
    DOMYOS_T540(400, DomyosT540Coordinator.class),
    NOTHING_EAR1(410, Ear1Coordinator.class),
    GALAXY_BUDS_PRO(418, GalaxyBudsProDeviceCoordinator.class),
    GALAXY_BUDS_LIVE(419, GalaxyBudsLiveDeviceCoordinator.class),
    GALAXY_BUDS(420, GalaxyBudsDeviceCoordinator.class),
    GALAXY_BUDS2(421, GalaxyBuds2DeviceCoordinator.class),
    GALAXY_BUDS2_PRO(422, GalaxyBuds2ProDeviceCoordinator.class),
    SONY_WH_1000XM3(430, SonyWH1000XM3Coordinator.class),
    SONY_WF_SP800N(431, SonyWFSP800NCoordinator.class),
    SONY_WH_1000XM4(432, SonyWH1000XM4Coordinator.class),
    SONY_WF_1000XM3(433, SonyWF1000XM3Coordinator.class),
    SONY_WH_1000XM2(434, SonyWH1000XM2Coordinator.class),
    SONY_WF_1000XM4(435, SonyWF1000XM4Coordinator.class),
    SONY_LINKBUDS_S(436, SonyLinkBudsSCoordinator.class),
    SONY_WH_1000XM5(437, SonyWH1000XM5Coordinator.class),
    BOSE_QC35(440, QC35Coordinator.class),
    VESC_NRF(500, VescCoordinator.class),
    VESC_HM10(501, VescCoordinator.class),
    BINARY_SENSOR(510, BinarySensorCoordinator.class),
    FLIPPER_ZERO(520, FlipperZeroCoordinator.class),
    SUPER_CARS(530, SuperCarsCoordinator.class),
    ASTEROIDOS(540, AsteroidOSDeviceCoordinator.class),
    SOFLOW_SO6(550, SoFlowCoordinator.class),
    WITHINGS_STEEL_HR(560, WithingsSteelHRDeviceCoordinator.class),
    SONY_WENA_3(570, SonyWena3Coordinator.class),
    TEST(1000, TestDeviceCoordinator.class);

    private final int key;

    private DeviceCoordinator coordinator;

    private Class<? extends DeviceCoordinator> coordinatorClass;

    DeviceType(int key, Class<? extends DeviceCoordinator> coordinatorClass) {
        this.key = key;
        this.coordinatorClass = coordinatorClass;
    }

    public int getKey() {
        return key;
    }

    public boolean isSupported() {
        return this != UNKNOWN;
    }

    public static DeviceType fromKey(int key) {
        for (DeviceType type : values()) {
            if (type.key == key) {
                return type;
            }
        }
        return DeviceType.UNKNOWN;
    }

    public DeviceCoordinator getDeviceCoordinator() {
        if(coordinator == null){
            try {
                coordinator = coordinatorClass.newInstance();
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }
        return coordinator;
    }
}
