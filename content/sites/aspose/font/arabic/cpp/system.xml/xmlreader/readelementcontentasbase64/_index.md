---
title: "طريقة System::Xml::XmlReader::ReadElementContentAsBase64"
linktitle: "ReadElementContentAsBase64"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::ReadElementContentAsBase64. تقرأ العنصر وتفك تشفير محتوى Base64 في C++."
type: docs
weight: 5300
url: /ar/cpp/system.xml/xmlreader/readelementcontentasbase64/
---
## XmlReader::ReadElementContentAsBase64 method


يقرأ العنصر ويفكّ شفرة محتوى **Base64**.

```cpp
virtual int32_t System::Xml::XmlReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | المخزن المؤقت الذي يُنسخ إليه النص الناتج. لا يمكن أن تكون هذه القيمة **nullptr**. |
| الفهرس | int32_t | الإزاحة داخل المخزن المؤقت حيث يبدأ نسخ النتيجة. |
| count | int32_t | الحد الأقصى لعدد البايتات التي سيتم نسخها إلى المخزن المؤقت. يتم إرجاع عدد البايتات الفعلي الذي تم نسخه من هذه الطريقة. |

### ReturnValue

عدد البايتات المكتوبة إلى المخزن المؤقت.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
