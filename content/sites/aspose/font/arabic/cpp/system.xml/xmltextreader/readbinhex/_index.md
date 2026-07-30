---
title: "System::Xml::XmlTextReader::ReadBinHex طريقة"
linktitle: "ReadBinHex"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlTextReader::ReadBinHex طريقة. يفك تشفير BinHex ويعيد البايتات الثنائية المفكوكة في C++."
type: docs
weight: 4500
url: /ar/cpp/system.xml/xmltextreader/readbinhex/
---
## XmlTextReader::ReadBinHex method


يفك تشفير **BinHex** ويُرجع البايتات الثنائية المفكوكة.

```cpp
int32_t System::Xml::XmlTextReader::ReadBinHex(const ArrayPtr<uint8_t> &array, int32_t offset, int32_t len)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مصفوفة | const ArrayPtr\<uint8_t\>\& | مصفوفة البايت التي تعمل كالمخزن المؤقت الذي تُكتب إليه البايتات الثنائية المفكوكة. |
| إزاحة | int32_t | الفهرس الصفري القاعدة في المصفوفة الذي يحدد مكان بدء الطريقة في الكتابة إلى المخزن المؤقت. |
| len | int32_t | عدد البايتات التي يجب كتابتها إلى المخزن المؤقت. |

### ReturnValue

عدد البايتات المكتوبة إلى المخزن المؤقت الخاص بك.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
