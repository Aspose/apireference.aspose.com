---
title: "System::Xml::XmlNodeReader::ReadElementContentAsBase64 طريقة"
linktitle: "ReadElementContentAsBase64"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlNodeReader::ReadElementContentAsBase64 طريقة. يقرأ العنصر ويفك تشفير محتوى Base64 في C++."
type: docs
weight: 3400
url: /ar/cpp/system.xml/xmlnodereader/readelementcontentasbase64/
---
## XmlNodeReader::ReadElementContentAsBase64 method


يقرأ العنصر ويفكّك محتوى Base64.

```cpp
int32_t System::Xml::XmlNodeReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | ArrayPtr\<uint8_t\> | المخزن المؤقت الذي يُنسخ إليه النص الناتج. لا يمكن أن تكون هذه القيمة **nullptr**. |
| الفهرس | int32_t | الإزاحة داخل المخزن المؤقت حيث يبدأ نسخ النتيجة. |
| count | int32_t | الحد الأقصى لعدد البايتات التي تُنسخ إلى المخزن المؤقت. عدد البايتات الفعلي المنسوخ يُرجع من هذه الطريقة. |

### ReturnValue

عدد البايتات المكتوبة إلى المخزن المؤقت.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
