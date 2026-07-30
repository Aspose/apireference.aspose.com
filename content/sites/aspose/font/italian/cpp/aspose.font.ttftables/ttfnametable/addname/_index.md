---
title: "Metodo Aspose::Font::TtfTables::TtfNameTable::AddName"
linktitle: "AddName"
second_title: "Aspose.Font per C++"
description: "Metodo Aspose::Font::TtfTables::TtfNameTable::AddName. Aggiunge una voce nella tabella. La categoria dei dati stringa da aggiungere è specificata dal parametro name in C++."
type: docs
weight: 300
url: /it/cpp/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable::AddName method


Aggiunge una voce alla tabella. La categoria dei dati stringa da aggiungere è specificata dal parametro *name*.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddName(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, int32_t platformSpecificId, int32_t languageId, System::String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Identificatore del nome, categoria di stringa logica, specificata dall'enumerazione [NameId](../nameid/) |
| platformId | TtfNameTable::PlatformId | Identificatore della piattaforma |
| platformSpecificId | int32_t | Identificatore di codifica specifico della piattaforma. Si prega di utilizzare un valore da una di queste enumerazioni - [UnicodePlatformSpecificId](../unicodeplatformspecificid/), [MacPlatformSpecificId](../macplatformspecificid/), [MSPlatformSpecificId](../msplatformspecificid/). L'enumerazione da utilizzare è definita dal contesto (parametro *platformId*). |
| languageId | int32_t | Identificatore della lingua. Si prega di utilizzare un valore dalle enumerazioni [MSLanguageId](../mslanguageid/) o [MacLanguageId](../maclanguageid/) a seconda del contesto, definito dal parametro *platformId*. |
| nome | System::String | Dati stringa effettivi |

## Vedi anche

* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
