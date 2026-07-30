---
title: "Aspose::Font::TtfTables::TtfNameTable::AddName Methode"
linktitle: "AddName"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddName Methode. Fügt einen Eintrag in die Tabelle ein. Die Kategorie der Zeichenkettendaten, die hinzugefügt werden soll, wird durch den Parameter name in C++ angegeben."
type: docs
weight: 300
url: /de/cpp/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable::AddName method


Fügt einen Eintrag in die Tabelle ein. Die Kategorie der Zeichenkettendaten, die hinzugefügt werden soll, wird durch den Parameter *name* angegeben.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddName(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, int32_t platformSpecificId, int32_t languageId, System::String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Namensidentifikator, logische Zeichenkettenkategorie, angegeben durch die [NameId](../nameid/)‑Aufzählung |
| platformId | TtfNameTable::PlatformId | Plattform-Identifikator |
| platformSpecificId | int32_t | Plattformspezifischer Kodierungsidentifikator. Bitte verwenden Sie einen Wert aus einer der folgenden Aufzählungen – [UnicodePlatformSpecificId](../unicodeplatformspecificid/), [MacPlatformSpecificId](../macplatformspecificid/), [MSPlatformSpecificId](../msplatformspecificid/). Welche Aufzählung zu verwenden ist, wird durch den Kontext (*platformId* Parameter) bestimmt. |
| languageId | int32_t | Sprachidentifikator. Bitte verwenden Sie einen Wert aus den Aufzählungen [MSLanguageId](../mslanguageid/) oder [MacLanguageId](../maclanguageid/), die vom Kontext abhängen, definiert durch den *platformId* Parameter. |
| Name | System::String | Tatsächliche Zeichenkettendaten |

## Siehe auch

* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
