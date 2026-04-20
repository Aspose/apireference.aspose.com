---
title: "طريقة System::Xml::XmlTextReader::ReadBase64"
linktitle: "ReadBase64"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlTextReader::ReadBase64. تفكّ شفرة Base64 وتُرجِع البايتات الثنائية المفكوكة في C++."
type: docs
weight: 4400
url: /ar/cpp/system.xml/xmltextreader/readbase64/
---
## XmlTextReader::ReadBase64 method


يفك تشفير Base64 ويُرجع البايتات الثنائية المفكوكة.

```cpp
int32_t System::Xml::XmlTextReader::ReadBase64(const ArrayPtr<uint8_t> &array, int32_t offset, int32_t len)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مصفوفة | const ArrayPtr\<uint8_t\>\& | المصفوفة من الأحرف التي تعمل كمخزن مؤقت تُكتب فيها محتويات النص. |
| إزاحة | int32_t | الفهرس الصفري القاعدة في المصفوفة الذي يحدد مكان بدء الطريقة في الكتابة إلى المخزن المؤقت. |
| len | int32_t | عدد البايتات التي يجب كتابتها إلى المخزن المؤقت. |

### ReturnValue

عدد البايتات المكتوبة إلى المخزن المؤقت.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
