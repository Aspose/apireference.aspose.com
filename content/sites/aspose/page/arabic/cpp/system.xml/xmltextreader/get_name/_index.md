---
title: "طريقة System::Xml::XmlTextReader::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlTextReader::get_Name. تُرجع الاسم المؤهل للعقدة الحالية في C++."
type: docs
weight: 1900
url: /ar/cpp/system.xml/xmltextreader/get_name/
---
## XmlTextReader::get_Name method


يعيد الاسم المؤهل للعقدة الحالية.

```cpp
String System::Xml::XmlTextReader::get_Name() override
```


### ReturnValue

الاسم المؤهل للعقدة الحالية. على سبيل المثال، **Name** هو **bk:book** للعنصر **<bk:book>**.
## ملاحظات



الاسم المُرجع يعتمد على قيمة [XmlTextReader::get_NodeType](../get_nodetype/) للعقدة. الأنواع التالية من العقد تُعيد القيم المذكورة. جميع الأنواع الأخرى من العقد تُعيد سلسلة فارغة. |||
|-|-|
| نوع العقدة | الاسم |
| Attribute | اسم السمة. |
| DocumentType | اسم نوع المستند. |
| Element | اسم الوسم. |
| EntityReference | اسم الكيان المشار إليه. |
| ProcessingInstruction | هدف تعليمات المعالجة. |
| XmlDeclaration | السلسلة الحرفية xml. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
