---
title: "System::Xml::XmlReader::ReadContentAsBase64 yöntemi"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::ReadContentAsBase64 yöntemi. İçeriği okur ve C++'ta Base64 çözülen ikili baytları döndürür."
type: docs
weight: 4000
url: /tr/cpp/system.xml/xmlreader/readcontentasbase64/
---
## XmlReader::ReadContentAsBase64 method


İçeriği okur ve Base64 çözümlenmiş ikili baytları döndürür.

```cpp
virtual int32_t System::Xml::XmlReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
