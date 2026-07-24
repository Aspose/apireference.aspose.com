---
title: "طريقة System::Xml::XmlReader::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlReader::get_Name. عند تجاوزها في فئة مشتقة، تحصل على الاسم المؤهل للعنصر الحالي في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


عند تجاوزها في فئة مشتقة، تُعيد الاسم المؤهل للعقدة الحالية.

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

الاسم المؤهل للعقدة الحالية. على سبيل المثال، **Name** هو **bk:book** للعنصر **<bk:book>**.
## ملاحظات



الاسم المُرجع يعتمد على قيمة [XmlReader::get_NodeType](../get_nodetype/) للعنصر. الأنواع التالية من العناصر تُعيد القيم المذكورة. جميع الأنواع الأخرى تُعيد سلسلة فارغة. |||
|-|-|
| نوع العنصر | الاسم |
| Attribute | اسم السمة. |
| DocumentType | اسم نوع المستند. |
| Element | اسم الوسم. |
| EntityReference | اسم الكيان المشار إليه. |
| ProcessingInstruction | هدف تعليمات المعالجة. |
| XmlDeclaration | السلسلة الحرفية xml. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
