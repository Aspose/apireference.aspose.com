---
title: "System::Xml::XmlTextReader::ReadContentAsBase64 method"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlTextReader::ReadContentAsBase64 method. İçeriği okur ve C++'da Base64 çözümlenmiş ikili baytları döndürür."
type: docs
weight: 4700
url: /tr/cpp/system.xml/xmltextreader/readcontentasbase64/
---
## XmlTextReader::ReadContentAsBase64 method


İçeriği okur ve **Base64** çözülen ikili baytları döndürür.

```cpp
int32_t System::Xml::XmlTextReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
