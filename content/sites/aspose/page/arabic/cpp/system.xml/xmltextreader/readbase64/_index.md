---
title: "System::Xml::XmlTextReader::ReadBase64 طريقة"
linktitle: "ReadBase64"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlTextReader::ReadBase64 طريقة. يفك شفرة Base64 ويعيد البايتات الثنائية المفكوكة في C++."
type: docs
weight: 4400
url: /ar/cpp/system.xml/xmltextreader/readbase64/
---
## XmlTextReader::ReadBase64 method


يفكّ تشفير Base64 ويرجع البايتات الثنائية المفكوكة.

```cpp
int32_t System::Xml::XmlTextReader::ReadBase64(const ArrayPtr<uint8_t> &array, int32_t offset, int32_t len)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| مصفوفة | const ArrayPtr\<uint8_t\>\& | المصفوفة من الأحرف التي تعمل كمخزن مؤقت تُكتب فيها محتويات النص. |
| الإزاحة | int32_t | الفهرس الصفري القائم على الصفر في المصفوفة الذي يحدد المكان الذي يمكن للطريقة البدء بالكتابة فيه إلى المخزن. |
| len | int32_t | عدد البايتات التي سيتم كتابتها إلى المخزن. |

### ReturnValue

عدد البايتات المكتوبة إلى المخزن المؤقت.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
