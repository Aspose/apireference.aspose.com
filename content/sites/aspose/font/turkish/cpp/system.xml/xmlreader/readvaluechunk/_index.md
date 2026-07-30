---
title: "System::Xml::XmlReader::ReadValueChunk yöntemi"
linktitle: "ReadValueChunk"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::ReadValueChunk yöntemi. C++ içinde bir XML belgesine gömülü büyük metin akışlarını okur."
type: docs
weight: 7400
url: /tr/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


Bir XML belgesine gömülü büyük metin akışlarını okur.

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | ArrayPtr\<char16_t\> | Metin içeriğinin yazıldığı tampon görevi gören karakter dizisi. Bu değer **nullptr** olamaz. |
| index | int32_t | [XmlReader](../) öğesinin sonuçları kopyalamaya başlayabileceği tampon içindeki ofset. |
| count | int32_t | Tampona kopyalanacak azami karakter sayısı. Gerçek kopyalanan karakter sayısı bu yöntemden döndürülür. |

### ReturnValue

Tampona okunan karakter sayısı. Daha fazla metin içeriği kalmadığında sıfır değeri döndürülür.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
