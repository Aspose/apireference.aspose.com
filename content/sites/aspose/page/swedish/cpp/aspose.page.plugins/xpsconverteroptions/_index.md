---
title: "Aspose::Page::Plugins::XpsConverterOptions klass"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::Plugins::XpsConverterOptions klass. Representerar alternativ för XpsConverter‑plugin i C++."
type: docs
weight: 2000
url: /sv/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


Representerar alternativ för [XpsConverter](../xpsconverter/) plugin.

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Lägger till en ny datakälla i [XpsConverter](../xpsconverter/) plugin‑datainsamlingen. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Lägger till en ny datakälla i [XpsConverterOptions](./) plugin‑datainsamlingen. |
| [get_DataCollection](./get_datacollection/)() override | Returnerar [XpsConverterOptions](./) plugin‑datainsamling. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Kvalitetskategorin anger komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre det angivna talet är, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta. |
| virtual [get_OperationName](./get_operationname/)() | Returnerar operationsnamn. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Hämtar samling av tillagda mål för att spara resultat av operationen. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Kvalitetskategorin anger komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre det angivna talet är, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta. |
## Se även

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
