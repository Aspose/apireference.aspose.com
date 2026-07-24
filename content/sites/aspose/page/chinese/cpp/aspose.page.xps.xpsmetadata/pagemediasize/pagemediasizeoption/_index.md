---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaSize::PageMediaSizeOption 类"
linktitle: "PageMediaSizeOption"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaSize::PageMediaSizeOption 类。描述 C++ 中 PageMediaSize 功能选项。"
type: docs
weight: 400
url: /zh/cpp/aspose.page.xps.xpsmetadata/pagemediasize/pagemediasizeoption/
---
## PageMediaSizeOption class


描述 [PageMediaSize](../) 功能选项。

```cpp
class PageMediaSizeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaSize::IPageMediaSizeItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaSize::IPageMediaSizeOptionItem\>\>\&) | 向选项添加项。 |
| [Clone](./clone/)() | 克隆此选项实例。克隆构造函数的快捷方式。 |
| [PageMediaSizeOption](./pagemediasizeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaSize::IPageMediaSizeOptionItem\>\>\&) | 创建一个新实例。 |
| [PageMediaSizeOption](./pagemediasizeoption/)(System::SharedPtr\<PageMediaSize::PageMediaSizeOption\>) | 克隆此选项实例。 |
| [SetMediaSizeHeight](./setmediasizeheight/)(int32_t) | 添加 **MediaSizeWidth** 计分属性值。 |
| [SetMediaSizeWidth](./setmediasizewidth/)(int32_t) | 添加 **MediaSizeWidth** 计分属性值。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [BusinessCard](./businesscard/) | 名片。 |
| static [CreditCard](./creditcard/) | 信用卡。 |
| static [CustomMediaSize](./custommediasize/) | 指定自定义媒体尺寸。必须针对 **DeviceMediaSize** 进行验证。 |
| static [ISOA0](./isoa0/) | ISOA0。 |
| static [ISOA1](./isoa1/) | ISOA1。 |
| static [ISOA10](./isoa10/) | ISOA10。 |
| static [ISOA2](./isoa2/) | ISOA2. |
| static [ISOA3](./isoa3/) | ISOA3. |
| static [ISOA3Extra](./isoa3extra/) | ISOA3 额外. |
| static [ISOA3Rotated](./isoa3rotated/) | ISOA3 旋转. |
| static [ISOA4](./isoa4/) | ISOA4. |
| static [ISOA4Extra](./isoa4extra/) | ISOA4 额外. |
| static [ISOA4Rotated](./isoa4rotated/) | ISOA4 旋转. |
| static [ISOA5](./isoa5/) | ISOA5. |
| static [ISOA5Extra](./isoa5extra/) | ISOA5 额外. |
| static [ISOA5Rotated](./isoa5rotated/) | ISOA5 旋转. |
| static [ISOA6](./isoa6/) | ISOA6. |
| static [ISOA6Rotated](./isoa6rotated/) | ISOA6 旋转. |
| static [ISOA7](./isoa7/) | ISOA7. |
| static [ISOA8](./isoa8/) | ISOA8. |
| static [ISOA9](./isoa9/) | ISOA9. |
| static [ISOB0](./isob0/) | ISOB0. |
| static [ISOB1](./isob1/) | ISOB1. |
| static [ISOB10](./isob10/) | ISOB10. |
| static [ISOB2](./isob2/) | ISOB2. |
| static [ISOB3](./isob3/) | ISOB3. |
| static [ISOB4](./isob4/) | ISOB4. |
| static [ISOB4Envelope](./isob4envelope/) | ISOB4 信封. |
| static [ISOB5Envelope](./isob5envelope/) | ISOB5 信封. |
| static [ISOB5Extra](./isob5extra/) | ISOB5 额外. |
| static [ISOB7](./isob7/) | ISOB7. |
| static [ISOB8](./isob8/) | ISOB8. |
| static [ISOB9](./isob9/) | ISOB9. |
| static [ISOC0](./isoc0/) | ISOC0. |
| static [ISOC1](./isoc1/) | ISOC1. |
| static [ISOC10](./isoc10/) | ISOC10. |
| static [ISOC2](./isoc2/) | ISOC2. |
| static [ISOC3](./isoc3/) | ISOC3. |
| static [ISOC3Envelope](./isoc3envelope/) | ISOC3 信封. |
| static [ISOC4](./isoc4/) | ISOC4. |
| static [ISOC4Envelope](./isoc4envelope/) | ISOC4 信封. |
| static [ISOC5](./isoc5/) | ISOC5. |
| static [ISOC5Envelope](./isoc5envelope/) | ISOC5 信封. |
| static [ISOC6](./isoc6/) | ISOC6. |
| static [ISOC6C5Envelope](./isoc6c5envelope/) | ISOC6C5 信封. |
| static [ISOC6Envelope](./isoc6envelope/) | ISOC6 信封. |
| static [ISOC7](./isoc7/) | ISOC7. |
| static [ISOC8](./isoc8/) | ISOC8. |
| static [ISOC9](./isoc9/) | ISOC9. |
| static [ISODLEnvelope](./isodlenvelope/) | ISODL 信封. |
| static [ISODLEnvelopeRotated](./isodlenveloperotated/) | ISODL 信封 旋转. |
| static [ISOSRA3](./isosra3/) | ISOSRA3. |
| static [Japan2LPhoto](./japan2lphoto/) | 日本 2L 照片. |
| static [JapanChou3Envelope](./japanchou3envelope/) | 日本 Chou3 信封. |
| static [JapanChou3EnvelopeRotated](./japanchou3enveloperotated/) | 日本 Chou3 信封 旋转. |
| static [JapanChou4Envelope](./japanchou4envelope/) | 日本 Chou4 信封. |
| static [JapanChou4EnvelopeRotated](./japanchou4enveloperotated/) | 日本 Chou4 信封 已旋转。 |
| static [JapanDoubleHagakiPostcard](./japandoublehagakipostcard/) | 日本 双 Hagaki 明信片。 |
| static [JapanDoubleHagakiPostcardRotated](./japandoublehagakipostcardrotated/) | 日本 双 Hagaki 明信片 已旋转。 |
| static [JapanHagakiPostcard](./japanhagakipostcard/) | 日本 Hagaki 明信片。 |
| static [JapanHagakiPostcardRotated](./japanhagakipostcardrotated/) | 日本 Hagaki 明信片 已旋转。 |
| static [JapanKaku2Envelope](./japankaku2envelope/) | 日本 Kaku2 信封。 |
| static [JapanKaku2EnvelopeRotated](./japankaku2enveloperotated/) | 日本 Kaku2 信封 已旋转。 |
| static [JapanKaku3Envelope](./japankaku3envelope/) | 日本 Kaku3 信封。 |
| static [JapanKaku3EnvelopeRotated](./japankaku3enveloperotated/) | 日本 Kaku3 信封 已旋转。 |
| static [JapanLPhoto](./japanlphoto/) | 日本 L 照片。 |
| static [JapanQuadrupleHagakiPostcard](./japanquadruplehagakipostcard/) | 日本 四倍 Hagaki 明信片。 |
| static [JapanYou1Envelope](./japanyou1envelope/) | 日本 You1 信封。 |
| static [JapanYou2Envelope](./japanyou2envelope/) | 日本 You2 信封。 |
| static [JapanYou3Envelope](./japanyou3envelope/) | 日本 You3 信封。 |
| static [JapanYou4Envelope](./japanyou4envelope/) | 日本 You4 信封。 |
| static [JapanYou4EnvelopeRotated](./japanyou4enveloperotated/) | 日本 You4 信封 已旋转。 |
| static [JapanYou6Envelope](./japanyou6envelope/) | 日本 You6 信封。 |
| static [JapanYou6EnvelopeRotated](./japanyou6enveloperotated/) | 日本 You6 信封 已旋转。 |
| static [JISB0](./jisb0/) | JISB0。 |
| static [JISB1](./jisb1/) | JISB1。 |
| static [JISB10](./jisb10/) | JISB10。 |
| static [JISB2](./jisb2/) | JISB2。 |
| static [JISB3](./jisb3/) | JISB3。 |
| static [JISB4](./jisb4/) | JISB4。 |
| static [JISB4Rotated](./jisb4rotated/) | JISB4 已旋转。 |
| static [JISB5](./jisb5/) | JISB5. |
| static [JISB5Rotated](./jisb5rotated/) | JISB5 旋转. |
| static [JISB6](./jisb6/) | JISB6. |
| static [JISB6Rotated](./jisb6rotated/) | JISB6 旋转. |
| static [JISB7](./jisb7/) | JISB7. |
| static [JISB8](./jisb8/) | JISB8. |
| static [JISB9](./jisb9/) | JISB9. |
| static [NorthAmerica10x11](./northamerica10x11/) | 北美 10x11. |
| static [NorthAmerica10x12](./northamerica10x12/) | 北美 10x12. |
| static [NorthAmerica10x14](./northamerica10x14/) | 北美 10x14. |
| static [NorthAmerica11x17](./northamerica11x17/) | 北美 11x17. |
| static [NorthAmerica14x17](./northamerica14x17/) | 北美 14x17. |
| static [NorthAmerica4x6](./northamerica4x6/) | 北美 4x6. |
| static [NorthAmerica4x8](./northamerica4x8/) | 北美 4x8. |
| static [NorthAmerica5x7](./northamerica5x7/) | 北美 5x7. |
| static [NorthAmerica8x10](./northamerica8x10/) | 北美 8x10. |
| static [NorthAmerica9x11](./northamerica9x11/) | 北美 9x11. |
| static [NorthAmericaArchitectureASheet](./northamericaarchitectureasheet/) | 北美 建筑 A 纸张. |
| static [NorthAmericaArchitectureBSheet](./northamericaarchitecturebsheet/) | 北美 建筑 B 纸张. |
| static [NorthAmericaArchitectureCSheet](./northamericaarchitecturecsheet/) | 北美 建筑 C 纸张. |
| static [NorthAmericaArchitectureDSheet](./northamericaarchitecturedsheet/) | 北美 建筑 D 纸张. |
| static [NorthAmericaArchitectureESheet](./northamericaarchitectureesheet/) | 北美 建筑 E 纸张. |
| static [NorthAmericaCSheet](./northamericacsheet/) | 北美 C 纸张. |
| static [NorthAmericaDSheet](./northamericadsheet/) | 北美 D 纸张. |
| static [NorthAmericaESheet](./northamericaesheet/) | 北美 E 纸张. |
| static [NorthAmericaExecutive](./northamericaexecutive/) | 北美 执行纸。 |
| static [NorthAmericaGermanLegalFanfold](./northamericagermanlegalfanfold/) | 北美 德国 法律折叠纸。 |
| static [NorthAmericaGermanStandardFanfold](./northamericagermanstandardfanfold/) | 北美 德国 标准折叠纸。 |
| static [NorthAmericaLegal](./northamericalegal/) | 北美 法律纸。 |
| static [NorthAmericaLegalExtra](./northamericalegalextra/) | 北美 法律加大纸。 |
| static [NorthAmericaLetter](./northamericaletter/) | 北美 信纸。 |
| static [NorthAmericaLetterExtra](./northamericaletterextra/) | 北美 加大信纸。 |
| static [NorthAmericaLetterPlus](./northamericaletterplus/) | 北美 信纸加。 |
| static [NorthAmericaLetterRotated](./northamericaletterrotated/) | 北美 旋转信纸。 |
| static [NorthAmericaMonarchEnvelope](./northamericamonarchenvelope/) | 北美 君主信封。 |
| static [NorthAmericaNote](./northamericanote/) | 北美 便笺。 |
| static [NorthAmericaNumber10Envelope](./northamericanumber10envelope/) | 北美 10号信封。 |
| static [NorthAmericaNumber10EnvelopeRotated](./northamericanumber10enveloperotated/) | 北美 10号信封旋转。 |
| static [NorthAmericaNumber11Envelope](./northamericanumber11envelope/) | 北美 11号信封。 |
| static [NorthAmericaNumber12Envelope](./northamericanumber12envelope/) | 北美 12号信封。 |
| static [NorthAmericaNumber14Envelope](./northamericanumber14envelope/) | 北美 14号信封。 |
| static [NorthAmericaNumber9Envelope](./northamericanumber9envelope/) | 北美 9号信封。 |
| static [NorthAmericaPersonalEnvelope](./northamericapersonalenvelope/) | 北美 个人信封。 |
| static [NorthAmericaQuarto](./northamericaquarto/) | 北美 四开纸。 |
| static [NorthAmericaStatement](./northamericastatement/) | 北美 报表纸。 |
| static [NorthAmericaSuperA](./northamericasupera/) | 北美 超A纸。 |
| static [NorthAmericaSuperB](./northamericasuperb/) | 北美 超B纸。 |
| static [NorthAmericaTabloid](./northamericatabloid/) | 北美 小报纸。 |
| static [NorthAmericaTabloidExtra](./northamericatabloidextra/) | 北美 加大小报纸。 |
| static [OtherMetricA3Plus](./othermetrica3plus/) | 其他 公制 A3 加大。 |
| static [OtherMetricA4Plus](./othermetrica4plus/) | 其他度量 A4 Plus. |
| static [OtherMetricFolio](./othermetricfolio/) | 其他度量 Folio. |
| static [OtherMetricInviteEnvelope](./othermetricinviteenvelope/) | 其他度量 Invite 信封. |
| static [OtherMetricItalianEnvelope](./othermetricitalianenvelope/) | 其他度量 Italian 信封. |
| static [PRC10Envelope](./prc10envelope/) | PRC10 信封. |
| static [PRC10EnvelopeRotated](./prc10enveloperotated/) | PRC10 信封 已旋转. |
| static [PRC16K](./prc16k/) | PRC16K. |
| static [PRC16KRotated](./prc16krotated/) | PRC16K 已旋转. |
| static [PRC1Envelope](./prc1envelope/) | PRC1 信封. |
| static [PRC1EnvelopeRotated](./prc1enveloperotated/) | PRC1 信封 已旋转. |
| static [PRC2Envelope](./prc2envelope/) | PRC2 信封. |
| static [PRC2EnvelopeRotated](./prc2enveloperotated/) | PRC2 信封 已旋转. |
| static [PRC32K](./prc32k/) | PRC32K. |
| static [PRC32KBig](./prc32kbig/) | PRC32K 大. |
| static [PRC32KRotated](./prc32krotated/) | PRC32K 已旋转. |
| static [PRC3Envelope](./prc3envelope/) | PRC3 信封. |
| static [PRC3EnvelopeRotated](./prc3enveloperotated/) | PRC3 信封 已旋转. |
| static [PRC4Envelope](./prc4envelope/) | PRC4 信封. |
| static [PRC4EnvelopeRotated](./prc4enveloperotated/) | PRC4 信封 已旋转. |
| static [PRC5Envelope](./prc5envelope/) | PRC 信封. |
| static [PRC5EnvelopeRotated](./prc5enveloperotated/) | PRC5 信封 已旋转. |
| static [PRC6Envelope](./prc6envelope/) | PRC6 信封. |
| static [PRC6EnvelopeRotated](./prc6enveloperotated/) | PRC6 信封 已旋转. |
| static [PRC7Envelope](./prc7envelope/) | PRC7 信封. |
| static [PRC7EnvelopeRotated](./prc7enveloperotated/) | PRC7 信封 已旋转. |
| static [PRC8Envelope](./prc8envelope/) | PRC8 信封。 |
| static [PRC8EnvelopeRotated](./prc8enveloperotated/) | PRC8 信封已旋转。 |
| static [PRC9Envelope](./prc9envelope/) | PRC9 信封。 |
| static [PRC9EnvelopeRotated](./prc9enveloperotated/) | PRC9 信封已旋转。 |
| static [PSCustomMediaSize](./pscustommediasize/) | 指定自定义媒体尺寸（PostScript 特定）。必须针对 **DeviceMediaSize** 进行验证。 |
| static [Roll06Inch](./roll06inch/) | 06 英寸卷筒。 |
| static [Roll08Inch](./roll08inch/) | 08 英寸卷筒。 |
| static [Roll12Inch](./roll12inch/) | 12 英寸卷筒。 |
| static [Roll15Inch](./roll15inch/) | 15 英寸卷筒。 |
| static [Roll18Inch](./roll18inch/) | 18 英寸卷筒。 |
| static [Roll22Inch](./roll22inch/) | 22 英寸卷筒。 |
| static [Roll24Inch](./roll24inch/) | 24 英寸卷筒。 |
| static [Roll30Inch](./roll30inch/) | 30 英寸卷筒。 |
| static [Roll36Inch](./roll36inch/) | 36 英寸卷筒。 |
| static [Roll54Inch](./roll54inch/) | 54 英寸卷筒。 |
## 另见

* Class [Option](../../option/)
* Class [IPageMediaSizeItem](../ipagemediasizeitem/)
* Class [PageMediaSize](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
