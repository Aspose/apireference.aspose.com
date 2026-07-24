---
title: "Aspose::Page::Plugins::PsConverterOptions klass"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::Plugins::PsConverterOptions klass. Representerar alternativ för PsConverter-plugin i C++."
type: docs
weight: 1200
url: /sv/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


Representerar alternativ för [PsConverter](../psconverter/)-plugin.

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Lägger till en ny datakälla i [PsConverter](../psconverter/)-pluginens datainsamling. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Lägger till en ny datakälla i [PsConverterOptions](./)-pluginens datainsamling. |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Anger ytterligare mappar där konverteraren ska hitta teckensnitt för inmatningsdokumentet. Standardmappen är standardteckensnittsmappen där OS hittar teckensnitt för interna behov. |
| [get_DataCollection](./get_datacollection/)() override | Returnerar [PsConverterOptions](./)-pluginens datainsamling. |
| virtual [get_Debug](./get_debug/)() | Anger om felsökningsinformation ska skrivas ut till standardutdataflödet eller inte. |
| virtual [get_Exceptions](./get_exceptions/)() | Returnerar en lista över undertryckta konverteringsfel om [SuppressErrors](../) är sant. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Kvalitetskategorin anger komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre det angivna talet är, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta. |
| virtual [get_OperationName](./get_operationname/)() | Returnerar operationsnamn. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Hämtar samling av tillagda mål för att spara resultat av operationen. |
| [get_SupressErrors](./get_supresserrors/)() const | Anger om fel ska undertryckas eller inte. Om sant läggs undertryckta fel till i [Exceptions](../)-listan. Om falskt avslutas programmet vid det första felet. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Anger ytterligare mappar där konverteraren ska hitta teckensnitt för inmatningsdokumentet. Standardmappen är standardteckensnittsmappen där OS hittar teckensnitt för interna behov. |
| virtual [set_Debug](./set_debug/)(bool) | Anger om felsökningsinformation ska skrivas ut till standardutdataflödet eller inte. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | Returnerar en lista över undertryckta konverteringsfel om [SuppressErrors](../) är sant. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Kvalitetskategorin anger komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre det angivna talet är, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Anger om fel ska undertryckas eller inte. Om sant läggs undertryckta fel till i [Exceptions](../)-listan. Om falskt avslutas programmet vid det första felet. |
## Se även

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
