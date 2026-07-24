---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaSize::PageMediaSizeOption класс"
linktitle: "PageMediaSizeOption"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaSize::PageMediaSizeOption класс. Описывает параметры функции PageMediaSize в C++."
type: docs
weight: 400
url: /ru/cpp/aspose.page.xps.xpsmetadata/pagemediasize/pagemediasizeoption/
---
## PageMediaSizeOption class


Описывает параметры функции [PageMediaSize](../).

```cpp
class PageMediaSizeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaSize::IPageMediaSizeItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaSize::IPageMediaSizeOptionItem\>\>\&) | Добавляет элементы в опции. |
| [Clone](./clone/)() | Клонирует этот экземпляр опции. Ярлык к конструктору клонирования. |
| [PageMediaSizeOption](./pagemediasizeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaSize::IPageMediaSizeOptionItem\>\>\&) | Создаёт новый экземпляр. |
| [PageMediaSizeOption](./pagemediasizeoption/)(System::SharedPtr\<PageMediaSize::PageMediaSizeOption\>) | Клонирует этот экземпляр опции. |
| [SetMediaSizeHeight](./setmediasizeheight/)(int32_t) | Добавляет значение оценённого свойства **MediaSizeWidth**. |
| [SetMediaSizeWidth](./setmediasizewidth/)(int32_t) | Добавляет значение оценённого свойства **MediaSizeWidth**. |
## Поля

| Поле | Описание |
| --- | --- |
| static [BusinessCard](./businesscard/) | Визитная карточка. |
| static [CreditCard](./creditcard/) | Кредитная карта. |
| static [CustomMediaSize](./custommediasize/) | Указывает пользовательский размер носителя. Должен быть проверен относительно **DeviceMediaSize**. |
| static [ISOA0](./isoa0/) | ISOA0. |
| static [ISOA1](./isoa1/) | ISOA1. |
| static [ISOA10](./isoa10/) | ISOA10. |
| static [ISOA2](./isoa2/) | ISOA2. |
| static [ISOA3](./isoa3/) | ISOA3. |
| static [ISOA3Extra](./isoa3extra/) | ISOA3 дополнительный. |
| static [ISOA3Rotated](./isoa3rotated/) | ISOA3 повернутый. |
| static [ISOA4](./isoa4/) | ISOA4. |
| static [ISOA4Extra](./isoa4extra/) | ISOA4 дополнительный. |
| static [ISOA4Rotated](./isoa4rotated/) | ISOA4 повернутый. |
| static [ISOA5](./isoa5/) | ISOA5. |
| static [ISOA5Extra](./isoa5extra/) | ISOA5 дополнительный. |
| static [ISOA5Rotated](./isoa5rotated/) | ISOA5 повернутый. |
| static [ISOA6](./isoa6/) | ISOA6. |
| static [ISOA6Rotated](./isoa6rotated/) | ISOA6 повернутый. |
| static [ISOA7](./isoa7/) | ISOA7. |
| static [ISOA8](./isoa8/) | ISOA8. |
| static [ISOA9](./isoa9/) | ISOA9. |
| static [ISOB0](./isob0/) | ISOB0. |
| static [ISOB1](./isob1/) | ISOB1. |
| static [ISOB10](./isob10/) | ISOB10. |
| static [ISOB2](./isob2/) | ISOB2. |
| static [ISOB3](./isob3/) | ISOB3. |
| static [ISOB4](./isob4/) | ISOB4. |
| static [ISOB4Envelope](./isob4envelope/) | ISOB4 конверт. |
| static [ISOB5Envelope](./isob5envelope/) | ISOB5 конверт. |
| static [ISOB5Extra](./isob5extra/) | ISOB5 дополнительный. |
| static [ISOB7](./isob7/) | ISOB7. |
| static [ISOB8](./isob8/) | ISOB8. |
| static [ISOB9](./isob9/) | ISOB9. |
| static [ISOC0](./isoc0/) | ISOC0. |
| static [ISOC1](./isoc1/) | ISOC1. |
| static [ISOC10](./isoc10/) | ISOC10. |
| static [ISOC2](./isoc2/) | ISOC2. |
| static [ISOC3](./isoc3/) | ISOC3. |
| static [ISOC3Envelope](./isoc3envelope/) | ISOC3 конверт. |
| static [ISOC4](./isoc4/) | ISOC4. |
| static [ISOC4Envelope](./isoc4envelope/) | ISOC4 конверт. |
| static [ISOC5](./isoc5/) | ISOC5. |
| static [ISOC5Envelope](./isoc5envelope/) | ISOC5 конверт. |
| static [ISOC6](./isoc6/) | ISOC6. |
| static [ISOC6C5Envelope](./isoc6c5envelope/) | ISOC6C5 конверт. |
| static [ISOC6Envelope](./isoc6envelope/) | ISOC6 конверт. |
| static [ISOC7](./isoc7/) | ISOC7. |
| static [ISOC8](./isoc8/) | ISOC8. |
| static [ISOC9](./isoc9/) | ISOC9. |
| static [ISODLEnvelope](./isodlenvelope/) | ISODL конверт. |
| static [ISODLEnvelopeRotated](./isodlenveloperotated/) | ISODL конверт повернутый. |
| static [ISOSRA3](./isosra3/) | ISOSRA3. |
| static [Japan2LPhoto](./japan2lphoto/) | Япония 2L фото. |
| static [JapanChou3Envelope](./japanchou3envelope/) | Япония Chou3 конверт. |
| static [JapanChou3EnvelopeRotated](./japanchou3enveloperotated/) | Япония Chou3 конверт повернутый. |
| static [JapanChou4Envelope](./japanchou4envelope/) | Япония Chou4 конверт. |
| static [JapanChou4EnvelopeRotated](./japanchou4enveloperotated/) | Япония Chou4 конверт повернут. |
| static [JapanDoubleHagakiPostcard](./japandoublehagakipostcard/) | Япония двойная открытка Hagaki. |
| static [JapanDoubleHagakiPostcardRotated](./japandoublehagakipostcardrotated/) | Япония двойная открытка Hagaki повернута. |
| static [JapanHagakiPostcard](./japanhagakipostcard/) | Япония открытка Hagaki. |
| static [JapanHagakiPostcardRotated](./japanhagakipostcardrotated/) | Япония открытка Hagaki повернута. |
| static [JapanKaku2Envelope](./japankaku2envelope/) | Япония Kaku2 конверт. |
| static [JapanKaku2EnvelopeRotated](./japankaku2enveloperotated/) | Япония Kaku2 конверт повернут. |
| static [JapanKaku3Envelope](./japankaku3envelope/) | Япония Kaku3 конверт. |
| static [JapanKaku3EnvelopeRotated](./japankaku3enveloperotated/) | Япония Kaku3 конверт повернут. |
| static [JapanLPhoto](./japanlphoto/) | Япония L фото. |
| static [JapanQuadrupleHagakiPostcard](./japanquadruplehagakipostcard/) | Япония четырёхкратная открытка Hagaki. |
| static [JapanYou1Envelope](./japanyou1envelope/) | Япония You1 конверт. |
| static [JapanYou2Envelope](./japanyou2envelope/) | Япония You2 конверт. |
| static [JapanYou3Envelope](./japanyou3envelope/) | Япония You3 конверт. |
| static [JapanYou4Envelope](./japanyou4envelope/) | Япония You4 конверт. |
| static [JapanYou4EnvelopeRotated](./japanyou4enveloperotated/) | Япония You4 конверт повернут. |
| static [JapanYou6Envelope](./japanyou6envelope/) | Япония You6 конверт. |
| static [JapanYou6EnvelopeRotated](./japanyou6enveloperotated/) | Япония You6 конверт повернут. |
| static [JISB0](./jisb0/) | JISB0. |
| static [JISB1](./jisb1/) | JISB1. |
| static [JISB10](./jisb10/) | JISB10. |
| static [JISB2](./jisb2/) | JISB2. |
| static [JISB3](./jisb3/) | JISB3. |
| static [JISB4](./jisb4/) | JISB4. |
| static [JISB4Rotated](./jisb4rotated/) | JISB4 повернут. |
| static [JISB5](./jisb5/) | JISB5. |
| static [JISB5Rotated](./jisb5rotated/) | JISB5 повёрнутый. |
| static [JISB6](./jisb6/) | JISB6. |
| static [JISB6Rotated](./jisb6rotated/) | JISB6 повёрнутый. |
| static [JISB7](./jisb7/) | JISB7. |
| static [JISB8](./jisb8/) | JISB8. |
| static [JISB9](./jisb9/) | JISB9. |
| static [NorthAmerica10x11](./northamerica10x11/) | Северная Америка 10x11. |
| static [NorthAmerica10x12](./northamerica10x12/) | Северная Америка 10x12. |
| static [NorthAmerica10x14](./northamerica10x14/) | Северная Америка 10x14. |
| static [NorthAmerica11x17](./northamerica11x17/) | Северная Америка 11x17. |
| static [NorthAmerica14x17](./northamerica14x17/) | Северная Америка 14x17. |
| static [NorthAmerica4x6](./northamerica4x6/) | Северная Америка 4x6. |
| static [NorthAmerica4x8](./northamerica4x8/) | Северная Америка 4x8. |
| static [NorthAmerica5x7](./northamerica5x7/) | Северная Америка 5x7. |
| static [NorthAmerica8x10](./northamerica8x10/) | Северная Америка 8x10. |
| static [NorthAmerica9x11](./northamerica9x11/) | Северная Америка 9x11. |
| static [NorthAmericaArchitectureASheet](./northamericaarchitectureasheet/) | Северная Америка Архитектура A лист. |
| static [NorthAmericaArchitectureBSheet](./northamericaarchitecturebsheet/) | Северная Америка Архитектура B лист. |
| static [NorthAmericaArchitectureCSheet](./northamericaarchitecturecsheet/) | Северная Америка Архитектура C лист. |
| static [NorthAmericaArchitectureDSheet](./northamericaarchitecturedsheet/) | Северная Америка Архитектура D лист. |
| static [NorthAmericaArchitectureESheet](./northamericaarchitectureesheet/) | Северная Америка Архитектура E лист. |
| static [NorthAmericaCSheet](./northamericacsheet/) | Северная Америка C лист. |
| static [NorthAmericaDSheet](./northamericadsheet/) | Северная Америка D лист. |
| static [NorthAmericaESheet](./northamericaesheet/) | Северная Америка E лист. |
| static [NorthAmericaExecutive](./northamericaexecutive/) | Северная Америка Executive. |
| static [NorthAmericaGermanLegalFanfold](./northamericagermanlegalfanfold/) | Северная Америка German Legal Fanfold. |
| static [NorthAmericaGermanStandardFanfold](./northamericagermanstandardfanfold/) | Северная Америка German Standard Fanfold. |
| static [NorthAmericaLegal](./northamericalegal/) | Северная Америка Legal. |
| static [NorthAmericaLegalExtra](./northamericalegalextra/) | Северная Америка Legal extra. |
| static [NorthAmericaLetter](./northamericaletter/) | Северная Америка Letter. |
| static [NorthAmericaLetterExtra](./northamericaletterextra/) | Северная Америка Letter extra. |
| static [NorthAmericaLetterPlus](./northamericaletterplus/) | Северная Америка Letter Plus. |
| static [NorthAmericaLetterRotated](./northamericaletterrotated/) | Северная Америка Letter rotated. |
| static [NorthAmericaMonarchEnvelope](./northamericamonarchenvelope/) | Северная Америка Monarch envelope. |
| static [NorthAmericaNote](./northamericanote/) | Северная Америка Note. |
| static [NorthAmericaNumber10Envelope](./northamericanumber10envelope/) | Северная Америка Number 10 envelope. |
| static [NorthAmericaNumber10EnvelopeRotated](./northamericanumber10enveloperotated/) | Северная Америка Number 10 envelope rotated. |
| static [NorthAmericaNumber11Envelope](./northamericanumber11envelope/) | Северная Америка Number 11 envelope. |
| static [NorthAmericaNumber12Envelope](./northamericanumber12envelope/) | Северная Америка Number 12 envelope. |
| static [NorthAmericaNumber14Envelope](./northamericanumber14envelope/) | Северная Америка Number 14 envelope. |
| static [NorthAmericaNumber9Envelope](./northamericanumber9envelope/) | Северная Америка Number 9 envelope. |
| static [NorthAmericaPersonalEnvelope](./northamericapersonalenvelope/) | Северная Америка Personal envelope. |
| static [NorthAmericaQuarto](./northamericaquarto/) | Северная Америка Quarto. |
| static [NorthAmericaStatement](./northamericastatement/) | Северная Америка Statement. |
| static [NorthAmericaSuperA](./northamericasupera/) | Северная Америка Super A. |
| static [NorthAmericaSuperB](./northamericasuperb/) | Северная Америка Super B. |
| static [NorthAmericaTabloid](./northamericatabloid/) | Северная Америка Tabloid. |
| static [NorthAmericaTabloidExtra](./northamericatabloidextra/) | Северная Америка Tabloid extra. |
| static [OtherMetricA3Plus](./othermetrica3plus/) | Другие метрические A3 Plus. |
| static [OtherMetricA4Plus](./othermetrica4plus/) | Другой метрический A4 Plus. |
| static [OtherMetricFolio](./othermetricfolio/) | Другой метрический Folio. |
| static [OtherMetricInviteEnvelope](./othermetricinviteenvelope/) | Другой метрический конверт Invite. |
| static [OtherMetricItalianEnvelope](./othermetricitalianenvelope/) | Другой метрический итальянский конверт. |
| static [PRC10Envelope](./prc10envelope/) | конверт PRC10. |
| static [PRC10EnvelopeRotated](./prc10enveloperotated/) | конверт PRC10 повернутый. |
| static [PRC16K](./prc16k/) | PRC16K. |
| static [PRC16KRotated](./prc16krotated/) | PRC16K повернутый. |
| static [PRC1Envelope](./prc1envelope/) | конверт PRC1. |
| static [PRC1EnvelopeRotated](./prc1enveloperotated/) | конверт PRC1 повернутый. |
| static [PRC2Envelope](./prc2envelope/) | конверт PRC2. |
| static [PRC2EnvelopeRotated](./prc2enveloperotated/) | конверт PRC2 повернутый. |
| static [PRC32K](./prc32k/) | PRC32K. |
| static [PRC32KBig](./prc32kbig/) | PRC32K большой. |
| static [PRC32KRotated](./prc32krotated/) | PRC32K повернутый. |
| static [PRC3Envelope](./prc3envelope/) | конверт PRC3. |
| static [PRC3EnvelopeRotated](./prc3enveloperotated/) | конверт PRC3 повернутый. |
| static [PRC4Envelope](./prc4envelope/) | конверт PRC4. |
| static [PRC4EnvelopeRotated](./prc4enveloperotated/) | конверт PRC4 повернутый. |
| static [PRC5Envelope](./prc5envelope/) | конверт PRC. |
| static [PRC5EnvelopeRotated](./prc5enveloperotated/) | конверт PRC5 повернутый. |
| static [PRC6Envelope](./prc6envelope/) | конверт PRC6. |
| static [PRC6EnvelopeRotated](./prc6enveloperotated/) | конверт PRC6 повернутый. |
| static [PRC7Envelope](./prc7envelope/) | конверт PRC7. |
| static [PRC7EnvelopeRotated](./prc7enveloperotated/) | конверт PRC7 повернутый. |
| static [PRC8Envelope](./prc8envelope/) | Конверт PRC8. |
| static [PRC8EnvelopeRotated](./prc8enveloperotated/) | Конверт PRC8 повернутый. |
| static [PRC9Envelope](./prc9envelope/) | Конверт PRC9. |
| static [PRC9EnvelopeRotated](./prc9enveloperotated/) | Конверт PRC9 повернутый. |
| static [PSCustomMediaSize](./pscustommediasize/) | Указывает пользовательский размер носителя (специфично для PostScript). Должен быть проверен относительно **DeviceMediaSize**. |
| static [Roll06Inch](./roll06inch/) | Рулон 06 дюйм. |
| static [Roll08Inch](./roll08inch/) | Рулон 08 дюйм. |
| static [Roll12Inch](./roll12inch/) | Рулон 12 дюйм. |
| static [Roll15Inch](./roll15inch/) | Рулон 15 дюйм. |
| static [Roll18Inch](./roll18inch/) | Рулон 18 дюйм. |
| static [Roll22Inch](./roll22inch/) | Рулон 22 дюйм. |
| static [Roll24Inch](./roll24inch/) | Рулон 24 дюйм. |
| static [Roll30Inch](./roll30inch/) | Рулон 30 дюйм. |
| static [Roll36Inch](./roll36inch/) | Рулон 36 дюйм. |
| static [Roll54Inch](./roll54inch/) | Рулон 54 дюйм. |
## См. также

* Class [Option](../../option/)
* Class [IPageMediaSizeItem](../ipagemediasizeitem/)
* Class [PageMediaSize](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
