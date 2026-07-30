---
title: "طريقة System::Xml::XmlReader::get_Value"
linktitle: "get_Value"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::get_Value. عند تجاوزها في فئة مشتقة، تحصل على قيمة النص للعقدة الحالية في C++."
type: docs
weight: 2400
url: /ar/cpp/system.xml/xmlreader/get_value/
---
## XmlReader::get_Value method


عند تجاوزها في فئة مشتقة، تحصل على القيمة النصية للعقدة الحالية.

```cpp
virtual String System::Xml::XmlReader::get_Value()=0
```


### ReturnValue

القيمة المُرجعة تعتمد على قيمة [XmlReader::get_NodeType](../get_nodetype/) للعقدة.
## ملاحظات



الجدول التالي يسرد أنواع العقد التي لها قيمة للعودة. جميع أنواع العقد الأخرى تُعيد [String::Empty](../../../system/string/empty/). |||
|-|-|
| نوع العقدة | القيمة |
| Attribute | قيمة السمة. |
| CDATA | محتوى قسم CDATA. |
| تعليق | محتوى التعليق. |
| نوع المستند | المجموعة الداخلية. |
| تعليمات المعالجة | المحتوى الكامل، باستثناء الهدف. |
| مسافة بيضاء هامة | المسافة البيضاء بين العلامات في نموذج محتوى مختلط. |
| Text | محتوى عقدة النص. |
| مسافة بيضاء | المسافة البيضاء بين العلامات. |
| XmlDeclaration | محتوى الإعلان. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
