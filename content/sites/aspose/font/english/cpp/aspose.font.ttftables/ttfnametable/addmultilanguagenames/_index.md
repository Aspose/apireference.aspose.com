---
title: Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames method
linktitle: AddMultiLanguageNames
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames method. Extracts all multilingual strings from passed mlNames  object and creates correspondent NameRecord structure for every string extracted using passed parameters platformId , platformSpecificId  and nameId . Value for field languageID is extracted from mlNames  object. New just created record is added into table. If record which coincides with just created by fields platformID, platformSpecificID, nameID and, langugeId will be found, then new created record will not be added and only string data will be updated for existing record in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable::AddMultiLanguageNames method


Extracts all multilingual strings from passed *mlNames*  object and creates correspondent [NameRecord](../namerecord/) structure for every string extracted using passed parameters *platformId* , *platformSpecificId*  and *nameId* . Value for field languageID is extracted from *mlNames*  object. New just created record is added into table. If record which coincides with just created by fields platformID, platformSpecificID, nameID and, langugeId will be found, then new created record will not be added and only string data will be updated for existing record.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames(System::SharedPtr<MultiLanguageString> mlNames, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId)
```


| Parameter | Type | Description |
| --- | --- | --- |
| mlNames | System::SharedPtr\<MultiLanguageString\> | Multilingual string |
| platformId | TtfNameTable::PlatformId | Platform identifier |
| platformSpecificId | uint16_t | Platform-specific encoding identifier |
| nameId | TtfNameTable::NameId | Name identifier, logical string category, specified by [NameId](../nameid/) enumeration |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
