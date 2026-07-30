---
title: "System::Xml::XmlNodeReader::ReadElementContentAsBase64 yöntemi"
linktitle: "ReadElementContentAsBase64"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeReader::ReadElementContentAsBase64 yöntemi. Öğeyi okur ve Base64 içeriğini C++'ta çözer."
type: docs
weight: 3400
url: /tr/cpp/system.xml/xmlnodereader/readelementcontentasbase64/
---
## XmlNodeReader::ReadElementContentAsBase64 method


Öğeyi okur ve Base64 içeriğini çözer.

```cpp
int32_t System::Xml::XmlNodeReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
