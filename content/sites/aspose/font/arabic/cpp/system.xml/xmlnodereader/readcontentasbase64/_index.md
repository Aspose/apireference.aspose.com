---
title: "System::Xml::XmlNodeReader::ReadContentAsBase64 طريقة"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNodeReader::ReadContentAsBase64 طريقة. يقرأ المحتوى ويعيد البايتات الثنائية المفكوكة من Base64 في C++."
type: docs
weight: 3200
url: /ar/cpp/system.xml/xmlnodereader/readcontentasbase64/
---
## XmlNodeReader::ReadContentAsBase64 method


يقرأ المحتوى ويعيد بايتات ثنائية مفككة من Base64.

```cpp
int32_t System::Xml::XmlNodeReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
