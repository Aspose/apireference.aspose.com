---
title: "طريقة System::Xml::XmlNode::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNode::get_Name. تُرجع الاسم المؤهل للعقدة عندما يتم تجاوزها في فئة مشتقة في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


يعيد الاسم المؤهل للعقدة عند تجاوزها في فئة مشتقة.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

الاسم المؤهل للعقدة.
## ملاحظات



الاسم المُرجع يعتمد على [XmlNode::get_NodeType](../get_nodetype/) للعقدة: |||
|-|-|
| نوع | الاسم |
| Attribute | الاسم المؤهل للسمة. |
| CDATA | #cdata-section |
| تعليق | #comment |
| مستند | #document |
| جزء المستند | #document-fragment |
| نوع المستند | اسم نوع المستند. |
| Element | الاسم المؤهل للعنصر. |
| كيان | اسم الكيان. |
| مرجع كيان | اسم الكيان المشار إليه. |
| ترميز | اسم التدوين. |
| تعليمات المعالجة | هدف تعليمات المعالجة. |
| Text | #text |
| مسافة بيضاء | #whitespace |
| مسافة بيضاء هامة | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
