---
title: "System::Xml::XmlValidatingReader::ReadContentAsBase64 method"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlValidatingReader::ReadContentAsBase64 method. يقرأ المحتوى ويُرجع بايتات ثنائية مُفكّكة من Base64 في C++."
type: docs
weight: 4100
url: /ar/cpp/system.xml/xmlvalidatingreader/readcontentasbase64/
---
## XmlValidatingReader::ReadContentAsBase64 method


يقرأ المحتوى ويعيد بايتات ثنائية مفككة من Base64.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
