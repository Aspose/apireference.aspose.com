---
title: "طريقة System::Xml::XmlNodeReader::ReadElementContentAsBinHex"
linktitle: "ReadElementContentAsBinHex"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlNodeReader::ReadElementContentAsBinHex. تقرأ العنصر وتفكّ تشفير محتوى BinHex في C++."
type: docs
weight: 3500
url: /ar/cpp/system.xml/xmlnodereader/readelementcontentasbinhex/
---
## XmlNodeReader::ReadElementContentAsBinHex method


يقرأ العنصر ويفكّك محتوى BinHex.

```cpp
int32_t System::Xml::XmlNodeReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
