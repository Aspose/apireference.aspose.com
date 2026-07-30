---
title: "System::Xml::XmlNodeReader::ReadContentAsBase64 metodu"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeReader::ReadContentAsBase64 metodu. İçeriği okur ve C++'ta Base64 çözülen ikili baytları döndürür."
type: docs
weight: 3200
url: /tr/cpp/system.xml/xmlnodereader/readcontentasbase64/
---
## XmlNodeReader::ReadContentAsBase64 method


İçeriği okur ve Base64 çözümlenmiş ikili baytları döndürür.

```cpp
int32_t System::Xml::XmlNodeReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
