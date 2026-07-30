---
title: "System::Xml::XmlValidatingReader::ReadContentAsBinHex yöntemi"
linktitle: "ReadContentAsBinHex"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlValidatingReader::ReadContentAsBinHex yöntemi. İçeriği okur ve BinHex çözümlenmiş ikili baytları C++'ta döndürür."
type: docs
weight: 4200
url: /tr/cpp/system.xml/xmlvalidatingreader/readcontentasbinhex/
---
## XmlValidatingReader::ReadContentAsBinHex method


İçeriği okur ve BinHex çözümlenmiş ikili baytları döndürür.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
