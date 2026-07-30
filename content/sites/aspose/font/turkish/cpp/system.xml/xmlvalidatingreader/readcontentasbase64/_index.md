---
title: "System::Xml::XmlValidatingReader::ReadContentAsBase64 method"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlValidatingReader::ReadContentAsBase64 method. İçeriği okur ve C++'ta Base64 çözümlenmiş ikili baytları döndürür."
type: docs
weight: 4100
url: /tr/cpp/system.xml/xmlvalidatingreader/readcontentasbase64/
---
## XmlValidatingReader::ReadContentAsBase64 method


İçeriği okur ve Base64 çözümlenmiş ikili baytları döndürür.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
