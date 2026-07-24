---
title: "طريقة System::Xml::XmlValidatingReader::get_Value"
linktitle: "get_Value"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlValidatingReader::get_Value. تُرجع القيمة النصية للعقدة الحالية في C++."
type: docs
weight: 2900
url: /ar/cpp/system.xml/xmlvalidatingreader/get_value/
---
## XmlValidatingReader::get_Value method


يعيد القيمة النصية للعقدة الحالية.

```cpp
String System::Xml::XmlValidatingReader::get_Value() override
```


### ReturnValue

القيمة المُرجعة تعتمد على XmlValidatingReader::NodeType للعقدة.
## ملاحظات



الجدول التالي يسرد أنواع العقد التي لها قيمة للعودة. جميع أنواع العقد الأخرى تُعيد [String::Empty](../../../system/string/empty/). |||
|-|-|
| نوع العقدة | القيمة |
| Attribute | قيمة السمة. |
| CDATA | محتوى قسم CDATA. |
| Comment | محتوى التعليق. |
| DocumentType | المجموعة الداخلية. |
| ProcessingInstruction | المحتوى الكامل، باستثناء الهدف. |
| SignificantWhitespace | المسافة البيضاء بين العلامات في نموذج محتوى مختلط. |
| Text | محتوى عقدة النص. |
| مسافة بيضاء | المسافة البيضاء بين العلامات. |
| XmlDeclaration | محتوى الإعلان. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
