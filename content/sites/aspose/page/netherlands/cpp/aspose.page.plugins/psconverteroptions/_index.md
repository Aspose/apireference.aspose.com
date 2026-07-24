---
title: "Aspose::Page::Plugins::PsConverterOptions class"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::Plugins::PsConverterOptions class. Stelt opties voor de PsConverter-plug-in voor in C++."
type: docs
weight: 1200
url: /nl/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


Stelt opties voor de [PsConverter](../psconverter/) plug-in voor.

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de [PsConverter](../psconverter/) plug-in. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de [PsConverterOptions](./) plug-in. |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Specificeert extra mappen waar de converter lettertypen voor het invoerdocument moet vinden. Standaardmap is de standaardlettertype-map waar het OS lettertypen voor interne behoeften vindt. |
| [get_DataCollection](./get_datacollection/)() override | Retourneert de gegevensverzameling van de [PsConverterOptions](./) plug-in. |
| virtual [get_Debug](./get_debug/)() | Specificeert of debug-informatie al dan niet naar de standaarduitvoerstream moet worden afgedrukt. |
| virtual [get_Exceptions](./get_exceptions/)() | Retourneert een lijst van onderdrukte conversiefouten als [SuppressErrors](../) waar is. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | De Quality‑categorie specificeert het compressieniveau voor een afbeelding. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste. |
| virtual [get_OperationName](./get_operationname/)() | Retourneert de naam van de bewerking. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Haalt de verzameling van toegevoegde doelen op voor het opslaan van operationele resultaten. |
| [get_SupressErrors](./get_supresserrors/)() const | Specificeert of fouten al dan niet moeten worden onderdrukt. Indien waar worden onderdrukte fouten toegevoegd aan de [Exceptions](../)-lijst. Indien onwaar zal de eerste fout het programma beëindigen. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Specificeert extra mappen waar de converter lettertypen voor het invoerdocument moet vinden. Standaardmap is de standaardlettertype-map waar het OS lettertypen voor interne behoeften vindt. |
| virtual [set_Debug](./set_debug/)(bool) | Specificeert of debug-informatie al dan niet naar de standaarduitvoerstream moet worden afgedrukt. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | Retourneert een lijst van onderdrukte conversiefouten als [SuppressErrors](../) waar is. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | De Quality‑categorie specificeert het compressieniveau voor een afbeelding. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Specificeert of fouten al dan niet moeten worden onderdrukt. Indien waar worden onderdrukte fouten toegevoegd aan de [Exceptions](../)-lijst. Indien onwaar zal de eerste fout het programma beëindigen. |
## Zie ook

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
