---
title: "System::Xml::XmlNodeReader::ReadContentAsBinHex method"
linktitle: "ReadContentAsBinHex"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlNodeReader::ReadContentAsBinHex method. يقرأ المحتوى ويُرجع البايتات الثنائية المُفككة من BinHex في C++."
type: docs
weight: 3300
url: /ar/cpp/system.xml/xmlnodereader/readcontentasbinhex/
---
## XmlNodeReader::ReadContentAsBinHex method


يقرأ المحتوى ويعيد بايتات ثنائية مُفكّكة من BinHex.

```cpp
int32_t System::Xml::XmlNodeReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
