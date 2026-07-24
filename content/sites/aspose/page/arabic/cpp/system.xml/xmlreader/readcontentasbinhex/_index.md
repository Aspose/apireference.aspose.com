---
title: "طريقة System::Xml::XmlReader::ReadContentAsBinHex method"
linktitle: "ReadContentAsBinHex"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlReader::ReadContentAsBinHex method. تقرأ المحتوى وتُرجع بايتات الثنائي المفككة من BinHex في C++."
type: docs
weight: 4100
url: /ar/cpp/system.xml/xmlreader/readcontentasbinhex/
---
## XmlReader::ReadContentAsBinHex method


يقرأ المحتوى ويرجع البايتات الثنائية المفكوكة من **BinHex**.

```cpp
virtual int32_t System::Xml::XmlReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
