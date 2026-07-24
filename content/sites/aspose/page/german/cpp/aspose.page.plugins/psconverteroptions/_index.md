---
title: "Aspose::Page::Plugins::PsConverterOptions Klasse"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::Plugins::PsConverterOptions Klasse. Stellt Optionen für das PsConverter‑Plugin in C++ dar."
type: docs
weight: 1200
url: /de/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


Stellt Optionen für das [PsConverter](../psconverter/) Plugin dar.

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Fügt der Datenkollektion des [PsConverter](../psconverter/) Plugins eine neue Datenquelle hinzu. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Fügt der Datenkollektion des [PsConverterOptions](./) Plugins eine neue Datenquelle hinzu. |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Gibt zusätzliche Ordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. Der Standardordner ist der übliche Schriftartenordner, in dem das Betriebssystem Schriftarten für interne Zwecke findet. |
| [get_DataCollection](./get_datacollection/)() override | Gibt die Datenkollektion des [PsConverterOptions](./) Plugins zurück. |
| virtual [get_Debug](./get_debug/)() | Gibt an, ob Debug‑Informationen in den Standardausgabestream geschrieben werden sollen oder nicht. |
| virtual [get_Exceptions](./get_exceptions/)() | Gibt eine Liste unterdrückter Konvertierungsfehler zurück, wenn [SuppressErrors](../) true ist. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Die Kategorie „Qualität“ gibt das Kompressionsniveau für ein Bild an. Verfügbare Werte liegen zwischen 0 und 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt. |
| virtual [get_OperationName](./get_operationname/)() | Gibt den Namen der Operation zurück. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Ruft die Sammlung der hinzugefügten Ziele für das Speichern von Operationsergebnissen ab. |
| [get_SupressErrors](./get_supresserrors/)() const | Gibt an, ob Fehler unterdrückt werden sollen oder nicht. Wenn true, werden unterdrückte Fehler zur [Exceptions](../) Liste hinzugefügt. Wenn false, beendet der erste Fehler das Programm. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Gibt zusätzliche Ordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. Der Standardordner ist der übliche Schriftartenordner, in dem das Betriebssystem Schriftarten für interne Zwecke findet. |
| virtual [set_Debug](./set_debug/)(bool) | Gibt an, ob Debug‑Informationen in den Standardausgabestream geschrieben werden sollen oder nicht. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | Gibt eine Liste unterdrückter Konvertierungsfehler zurück, wenn [SuppressErrors](../) true ist. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Die Kategorie „Qualität“ gibt das Kompressionsniveau für ein Bild an. Verfügbare Werte liegen zwischen 0 und 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Gibt an, ob Fehler unterdrückt werden sollen oder nicht. Wenn true, werden unterdrückte Fehler zur [Exceptions](../) Liste hinzugefügt. Wenn false, beendet der erste Fehler das Programm. |
## Siehe auch

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
