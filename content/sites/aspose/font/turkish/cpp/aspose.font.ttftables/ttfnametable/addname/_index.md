---
title: "Aspose::Font::TtfTables::TtfNameTable::AddName metodu"
linktitle: "AddName"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddName metodu. Tabloya bir giriş ekler. Eklenecek dize veri kategorisi, C++'daki name parametresi ile belirtilir."
type: docs
weight: 300
url: /tr/cpp/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable::AddName method


Tabloya bir giriş ekler. Eklenecek dize veri kategorisi *name* parametresiyle belirtilir.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddName(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, int32_t platformSpecificId, int32_t languageId, System::String name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Ad tanımlayıcısı, mantıksal dize kategorisi, [NameId](../nameid/) enum'ı tarafından belirtilir |
| platformId | TtfNameTable::PlatformId | Platform tanımlayıcısı |
| platformSpecificId | int32_t | Platforma özgü kodlama tanımlayıcısı. Lütfen, aşağıdaki gibi bir enum değerini kullanın - [UnicodePlatformSpecificId](../unicodeplatformspecificid/), [MacPlatformSpecificId](../macplatformspecificid/), [MSPlatformSpecificId](../msplatformspecificid/). Hangi enumun kullanılacağı, bağlam (*platformId* parametresi) tarafından belirlenir. |
| languageId | int32_t | Dil tanımlayıcısı. Lütfen, bağlama bağlı olarak [MSLanguageId](../mslanguageid/) veya [MacLanguageId](../maclanguageid/) enum değerlerini kullanın, *platformId* parametresi tarafından tanımlanır. |
| ad | System::String | Gerçek dize verisi |

## Ayrıca Bakınız

* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
