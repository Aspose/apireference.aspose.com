---
title: "System::Xml::XmlTextReader::ReadChars yöntemi"
linktitle: "ReadChars"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlTextReader::ReadChars yöntemi. Bir öğenin metin içeriğini karakter tamponuna okur. Bu yöntem, C++'ta ardışık olarak çağrılarak gömülü metnin büyük akışlarını okumak için tasarlanmıştır."
type: docs
weight: 4600
url: /tr/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


Bir öğenin metin içeriğini karakter tamponuna okur. Bu yöntem, gömülü metnin büyük akışlarını ardışık olarak çağırarak okumak için tasarlanmıştır.

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<char16_t\>\& | Metin içeriğinin yazıldığı tampon görevi gören karakter dizisi. |
| indeks | int32_t | Yöntemin metin içeriğini yazmaya başlayabileceği **buffer** içindeki konum. |
| count | int32_t | **buffer** içine yazılacak karakter sayısı. |

### ReturnValue

Okunan karakter sayısı. Okuyucu bir öğe üzerinde konumlandırılmamışsa veya mevcut bağlamda döndürülecek daha fazla metin içeriği yoksa bu değer 0 olabilir.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
