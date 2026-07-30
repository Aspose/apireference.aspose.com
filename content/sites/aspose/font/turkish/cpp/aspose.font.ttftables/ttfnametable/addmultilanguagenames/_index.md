---
title: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames yöntemi"
linktitle: "AddMultiLanguageNames"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames yöntemi. Verilen mlNames nesnesinden tüm çok dilli dizeleri çıkarır ve verilen platformId, platformSpecificId ve nameId parametreleri kullanılarak çıkarılan her dize için ilgili NameRecord yapısını oluşturur. languageID alanının değeri mlNames nesnesinden alınır. Yeni oluşturulan kayıt tabloya eklenir. platformID, platformSpecificID, nameID ve, langugeId alanlarıyla aynı olan bir kayıt bulunursa, yeni oluşturulan kayıt eklenmez ve yalnızca dize verisi mevcut kayıt için güncellenir. C++'ta."
type: docs
weight: 200
url: /tr/cpp/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable::AddMultiLanguageNames method


Geçilen *mlNames* nesnesinden tüm çok dilli dizeleri çıkarır ve verilen *platformId*, *platformSpecificId* ve *nameId* parametreleri kullanılarak çıkarılan her dize için ilgili [NameRecord](../namerecord/) yapısını oluşturur. languageID alanının değeri *mlNames* nesnesinden alınır. Yeni oluşturulan kayıt tabloya eklenir. platformID, platformSpecificID, nameID ve, langugeId alanlarıyla aynı olan bir kayıt bulunursa, yeni oluşturulan kayıt eklenmez ve yalnızca dize verisi mevcut kayıt için güncellenir.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames(System::SharedPtr<MultiLanguageString> mlNames, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| mlNames | System::SharedPtr\<MultiLanguageString\> | Çok dilli dize |
| platformId | TtfNameTable::PlatformId | Platform tanımlayıcısı |
| platformSpecificId | uint16_t | Platforma özgü kodlama tanımlayıcısı |
| nameId | TtfNameTable::NameId | Ad tanımlayıcısı, mantıksal dize kategorisi, [NameId](../nameid/) enum'ı tarafından belirtilir |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
