---
title: "System::Xml::XmlValidatingReader::get_Name طريقة"
linktitle: "get_Name"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlValidatingReader::get_Name طريقة. تُرجِع الاسم المؤهل للعقدة الحالية في C++."
type: docs
weight: 1700
url: /ar/cpp/system.xml/xmlvalidatingreader/get_name/
---
## XmlValidatingReader::get_Name method


يعيد الاسم المؤهل للعقدة الحالية.

```cpp
String System::Xml::XmlValidatingReader::get_Name() override
```


### ReturnValue

الاسم المؤهل للعقدة الحالية. على سبيل المثال، **Name** هو **bk:book** للعنصر **<bk:book>**.
## ملاحظات



الاسم المرجع يعتمد على XmlValidatingReader::NodeType للعقدة. الأنواع التالية من العقد تُرجع القيم المذكورة. جميع الأنواع الأخرى من العقد تُرجع سلسلة فارغة. |||
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
