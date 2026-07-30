---
title: "طريقة System::Xml::XmlTextReader::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Font لـ C++"
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



الاسم المُرجع يعتمد على قيمة [XmlTextReader::get_NodeType](../get_nodetype/) للعقدة. أنواع العقد التالية تُرجع القيم المذكورة. جميع أنواع العقد الأخرى تُرجع سلسلة فارغة. |||
|-|-|
| نوع العقدة | الاسم |
| Attribute | اسم السمة. |
| نوع المستند | اسم نوع المستند. |
| Element | اسم الوسم. |
| مرجع كيان | اسم الكيان المشار إليه. |
| تعليمات المعالجة | هدف تعليمات المعالجة. |
| XmlDeclaration | السلسلة الحرفية xml. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
