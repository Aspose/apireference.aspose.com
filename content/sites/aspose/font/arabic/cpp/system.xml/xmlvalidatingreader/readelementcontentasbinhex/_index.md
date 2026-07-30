---
title: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex طريقة"
linktitle: "ReadElementContentAsBinHex"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex طريقة. يقرأ العنصر ويفك تشفير محتوى BinHex في C++."
type: docs
weight: 4400
url: /ar/cpp/system.xml/xmlvalidatingreader/readelementcontentasbinhex/
---
## XmlValidatingReader::ReadElementContentAsBinHex method


يقرأ العنصر ويفكّ تشفير محتوى BinHex.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
