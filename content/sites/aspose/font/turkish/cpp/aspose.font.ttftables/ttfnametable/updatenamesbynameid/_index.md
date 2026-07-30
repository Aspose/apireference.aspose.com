---
title: "Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId method"
linktitle: "UpdateNamesByNameId"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId yöntemi. Parametre nameId ile belirtilen mantıksal dize kategorisiyle ilişkili tüm kayıtları seçer ve bu kayıtlardaki name alanını (dize verisi) günceller. Platform (platformID, Platform-specific encoding ID) ve dil (Language ID) ile ilgili alanlar bu yöntem tarafından etkilenmez. Yalnızca name dize verisi yeni bir adla değiştirilir. Bu yöntemi dikkatli kullanın, çünkü nameId ile ilişkili tüm platformlar ve diller için orijinal adları değiştirecektir. Orijinal adların farklı değerleri olduğu durumlarda çakışmalara yol açabilir, çünkü değiştirme işlemi bu değerlerin tümünü tek bir yeni değerle değiştirir. Ve bu yeni değer bazı platformlar ve dillerle mantıksal tutarsızlık gösterebilir. Bu yöntem, orijinal adın tüm platformlar ve diller için tek bir temsiline sahip olduğu durumlarda faydalıdır; örneğin, name dize verisi C++'ta İngilizce ise."
type: docs
weight: 1100
url: /tr/cpp/aspose.font.ttftables/ttfnametable/updatenamesbynameid/
---
## TtfNameTable::UpdateNamesByNameId method


Parametre nameId ile belirtilen mantıksal dize kategorisiyle ilişkili tüm kayıtları seçer ve bu kayıtlardaki name alanını (dize verisi) günceller. Platform (platformID, Platform‑spesifik kodlama ID) ve dil (Language ID) ile ilgili alanlar bu yöntem tarafından etkilenmez. Yalnızca name dize verisi yeni bir adla değiştirilir. Bu yöntemi dikkatli kullanın, çünkü nameId ile ilişkili tüm platform ve diller için orijinal adları değiştirecektir. Orijinal adlar farklı değerler içeriyorsa, değiştirme işlemi bu değerlerin tümünü tek bir yeni değerle değiştirerek çakışmalara yol açabilir. Ve bu yeni değer bazı platform ve dillerle mantıksal tutarsızlık gösterebilir. Bu yöntem, orijinal adın tüm platform ve diller için tek bir temsiline sahip olduğu durumlarda faydalıdır; örneğin, ad dize verisi İngilizce dilindeyse.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId(TtfNameTable::NameId nameId, System::String newName)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Ad tanımlayıcısı, mantıksal dize kategorisi, [NameId](../nameid/) enum'ı tarafından belirtilir |
| newName | System::String | Yeni ad veya yeni dize verisi |

## Ayrıca Bakınız

* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
