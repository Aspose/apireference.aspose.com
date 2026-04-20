---
title: "طريقة System::Xml::XmlTextReader::get_Value"
linktitle: "get_Value"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlTextReader::get_Value. تُرجع القيمة النصية للعقدة الحالية في C++."
type: docs
weight: 2900
url: /ar/cpp/system.xml/xmltextreader/get_value/
---
## XmlTextReader::get_Value method


يعيد القيمة النصية للعقدة الحالية.

```cpp
String System::Xml::XmlTextReader::get_Value() override
```


### ReturnValue

القيمة المُرجعة تعتمد على قيمة [XmlTextReader::get_NodeType](../get_nodetype/) للعقدة.
## ملاحظات



الجدول التالي يسرد أنواع العقد التي لها قيمة للعودة. جميع أنواع العقد الأخرى تُعيد [String::Empty](../../../system/string/empty/). |||
|-|-|
| نوع العقدة | القيمة |
| Attribute | قيمة السمة. |
| CDATA | محتوى قسم CDATA. |
| تعليق | محتوى التعليق. |
| نوع المستند | المجموعة الداخلية. |
| تعليمات المعالجة | المحتوى الكامل، باستثناء الهدف. |
| مسافة بيضاء هامة | المسافة البيضاء داخل نطاق xml:space='preserve'. |
| Text | محتوى عقدة النص. |
| مسافة بيضاء | المسافة البيضاء بين العلامات. |
| XmlDeclaration | محتوى الإعلان. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
