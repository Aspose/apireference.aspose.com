---
title: "طريقة System::Xml::XmlTextReader::ReadBinHex"
linktitle: "ReadBinHex"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlTextReader::ReadBinHex method. يقوم بفك تشفير BinHex ويعيد البايتات الثنائية المفكوكة في C++."
type: docs
weight: 4500
url: /ar/cpp/system.xml/xmltextreader/readbinhex/
---
## XmlTextReader::ReadBinHex method


يفكّ تشفير **BinHex** ويرجع البايتات الثنائية المفكوكة.

```cpp
int32_t System::Xml::XmlTextReader::ReadBinHex(const ArrayPtr<uint8_t> &array, int32_t offset, int32_t len)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| مصفوفة | const ArrayPtr\<uint8_t\>\& | مصفوفة البايت التي تعمل كالمخزن الذي تُكتب فيه البايتات الثنائية المفكوكة. |
| الإزاحة | int32_t | الفهرس الصفري القائم على الصفر في المصفوفة الذي يحدد المكان الذي يمكن للطريقة البدء بالكتابة فيه إلى المخزن. |
| len | int32_t | عدد البايتات التي سيتم كتابتها إلى المخزن. |

### ReturnValue

عدد البايتات المكتوبة إلى المخزن الخاص بك.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
