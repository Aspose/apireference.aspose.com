---
title: "Aspose::Font::TtfTables::TtfNameTable::UpdateName metodu"
linktitle: "UpdateName"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfNameTable::UpdateName metodu. Belirtilen platforma (platformId ve platformSpecificId birleşimi), kategoriye (nameId) ve dile (languageId) ilişkin kayıtlardaki adı günceller C++'da."
type: docs
weight: 1000
url: /tr/cpp/aspose.font.ttftables/ttfnametable/updatename/
---
## TtfNameTable::UpdateName method


Belirtilen platforma (platformId ve platformSpecificId kombinasyonu), kategoriye (nameId) ve dile (languageId) ilişkin kayıt(larda) adı günceller.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateName(TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId, uint16_t languageId, System::String newName)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| platformId | TtfNameTable::PlatformId | Platform tanımlayıcısı |
| platformSpecificId | uint16_t | Platforma özgü kodlama tanımlayıcısı |
| nameId | TtfNameTable::NameId | Ad tanımlayıcısı, mantıksal dize kategorisi, [NameId](../nameid/) enum'ı tarafından belirtilir |
| languageId | uint16_t | Dil tanımlayıcısı |
| newName | System::String | Yeni ad veya yeni dize verisi |

## Ayrıca Bakınız

* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
