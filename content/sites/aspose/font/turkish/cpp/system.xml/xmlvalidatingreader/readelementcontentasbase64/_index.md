---
title: "System::Xml::XmlValidatingReader::ReadElementContentAsBase64 method"
linktitle: "ReadElementContentAsBase64"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlValidatingReader::ReadElementContentAsBase64 method. Öğeyi okur ve C++'ta Base64 içeriğini çözer."
type: docs
weight: 4300
url: /tr/cpp/system.xml/xmlvalidatingreader/readelementcontentasbase64/
---
## XmlValidatingReader::ReadElementContentAsBase64 method


Öğeyi okur ve Base64 içeriğini çözer.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | Sonuç metninin kopyalanacağı tampon. Bu değer **nullptr** olamaz. |
| indeks | int32_t | Sonucun kopyalanmaya başlanacağı tampon içindeki ofset. |
| count | int32_t | Arabelleğe kopyalanacak maksimum bayt sayısı. Kopyalanan gerçek bayt sayısı bu yöntemden döndürülür. |

### ReturnValue

Arabelleğe yazılan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
