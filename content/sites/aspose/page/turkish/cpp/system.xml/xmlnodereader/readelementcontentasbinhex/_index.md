---
title: "System::Xml::XmlNodeReader::ReadElementContentAsBinHex yöntemi"
linktitle: "ReadElementContentAsBinHex"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNodeReader::ReadElementContentAsBinHex yöntemi. C++'da öğeyi okur ve BinHex içeriğini çözer."
type: docs
weight: 3500
url: /tr/cpp/system.xml/xmlnodereader/readelementcontentasbinhex/
---
## XmlNodeReader::ReadElementContentAsBinHex method


Elemanı okur ve BinHex içeriğini çözer.

```cpp
int32_t System::Xml::XmlNodeReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | ArrayPtr\<uint8_t\> | Sonuç metninin kopyalanacağı tampon. Bu değer **nullptr** olamaz. |
| indeks | int32_t | Sonucun kopyalanmaya başlanacağı tampon içindeki ofset. |
| count | int32_t | Tampona kopyalanacak azami bayt sayısı. Gerçek kopyalanan bayt sayısı bu yöntemden döndürülür. |

### ReturnValue

Tampona yazılan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
