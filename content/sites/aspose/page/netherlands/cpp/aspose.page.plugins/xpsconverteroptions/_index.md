---
title: "Aspose::Page::Plugins::XpsConverterOptions klasse"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::Plugins::XpsConverterOptions klasse. Vertegenwoordigt opties voor de XpsConverter plug‑in in C++."
type: docs
weight: 2000
url: /nl/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


Vertegenwoordigt opties voor de [XpsConverter](../xpsconverter/) plug‑in.

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de [XpsConverter](../xpsconverter/) plug‑in. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de [XpsConverterOptions](./) plug‑in. |
| [get_DataCollection](./get_datacollection/)() override | Retourneert de gegevensverzameling van de [XpsConverterOptions](./) plug‑in. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | De Quality‑categorie specificeert het compressieniveau voor een afbeelding. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste. |
| virtual [get_OperationName](./get_operationname/)() | Retourneert de naam van de bewerking. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Haalt de verzameling van toegevoegde doelen op voor het opslaan van operationele resultaten. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | De Quality‑categorie specificeert het compressieniveau voor een afbeelding. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste. |
## Zie ook

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
