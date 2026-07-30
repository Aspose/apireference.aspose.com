---
title: "طريقة System::Xml::XmlNodeReader::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNodeReader::get_Name. تُرجع الاسم المؤهل للعقدة الحالية في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmlnodereader/get_name/
---
## XmlNodeReader::get_Name method


يعيد الاسم المؤهل للعقدة الحالية.

```cpp
String System::Xml::XmlNodeReader::get_Name() override
```


### ReturnValue

الاسم المؤهل للعقدة الحالية. على سبيل المثال، **Name** هو **bk:book** للعنصر **<bk:book>**.
## ملاحظات



الاسم المُرجع يعتمد على قيمة [XmlNodeReader::get_NodeType](../get_nodetype/) للعقدة. الأنواع التالية من العقد تُعيد القيم المذكورة. جميع الأنواع الأخرى من العقد تُعيد سلسلة فارغة. |||
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
