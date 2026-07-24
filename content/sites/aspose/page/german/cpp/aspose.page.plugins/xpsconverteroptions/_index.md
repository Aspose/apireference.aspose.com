---
title: "Aspose::Page::Plugins::XpsConverterOptions Klasse"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::Plugins::XpsConverterOptions Klasse. Stellt Optionen für das XpsConverter‑Plugin in C++ dar."
type: docs
weight: 2000
url: /de/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


Stellt Optionen für das [XpsConverter](../xpsconverter/)-Plugin dar.

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Fügt der Datenkollektion des [XpsConverter](../xpsconverter/)-Plugins eine neue Datenquelle hinzu. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Fügt der Datenkollektion des [XpsConverterOptions](./)-Plugins eine neue Datenquelle hinzu. |
| [get_DataCollection](./get_datacollection/)() override | Gibt die Datenkollektion des [XpsConverterOptions](./)-Plugins zurück. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Die Kategorie „Qualität“ gibt das Kompressionsniveau für ein Bild an. Verfügbare Werte liegen zwischen 0 und 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt. |
| virtual [get_OperationName](./get_operationname/)() | Gibt den Namen der Operation zurück. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Ruft die Sammlung der hinzugefügten Ziele für das Speichern von Operationsergebnissen ab. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Die Kategorie „Qualität“ gibt das Kompressionsniveau für ein Bild an. Verfügbare Werte liegen zwischen 0 und 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt. |
## Siehe auch

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
