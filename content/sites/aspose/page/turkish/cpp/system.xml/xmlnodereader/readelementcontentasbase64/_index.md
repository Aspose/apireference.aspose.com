---
title: "System::Xml::XmlNodeReader::ReadElementContentAsBase64 metodu"
linktitle: "ReadElementContentAsBase64"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNodeReader::ReadElementContentAsBase64 metodu. Elemanı okur ve C++'ta Base64 içeriğini çözer."
type: docs
weight: 3400
url: /tr/cpp/system.xml/xmlnodereader/readelementcontentasbase64/
---
## XmlNodeReader::ReadElementContentAsBase64 method


Elemanı okur ve Base64 içeriğini çözer.

```cpp
int32_t System::Xml::XmlNodeReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
