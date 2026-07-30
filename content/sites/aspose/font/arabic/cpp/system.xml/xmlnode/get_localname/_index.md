---
title: "System::Xml::XmlNode::get_LocalName method"
linktitle: "get_LocalName"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNode::get_LocalName method. يُرجِع الاسم المحلي للعقدة، عندما يتم تجاوزها في فئة مشتقة في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


يعيد الاسم المحلي للعقدة عند تجاوزها في فئة مشتقة.

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

اسم العقدة بعد إزالة البادئة. على سبيل المثال، **LocalName** هو **book** للعنصر **<bk:book>**.
## ملاحظات



الاسم المُرجع يعتمد على [XmlNode::get_NodeType](../get_nodetype/) للعقدة: |||
|-|-|
| نوع | الاسم |
| Attribute | الاسم المحلي للخاصية. |
| CDATA | #cdata-section |
| تعليق | #comment |
| مستند | #document |
| جزء المستند | #document-fragment |
| نوع المستند | اسم نوع المستند. |
| Element | الاسم المحلي للعنصر. |
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
