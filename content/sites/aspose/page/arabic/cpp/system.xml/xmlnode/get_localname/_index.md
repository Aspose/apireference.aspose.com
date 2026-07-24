---
title: "System::Xml::XmlNode::get_LocalName طريقة"
linktitle: "get_LocalName"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlNode::get_LocalName طريقة. يرجع الاسم المحلي للعقدة، عندما يتم تجاوزها في فئة مشتقة في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


يعيد الاسم المحلي للعقدة، عندما يتم تجاوزه في فئة مشتقة.

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

اسم العقدة بعد إزالة البادئة. على سبيل المثال، **LocalName** هو **book** للعنصر **<bk:book>**.
## ملاحظات



الاسم المُعاد يعتمد على [XmlNode::get_NodeType](../get_nodetype/) للعقدة: |||
|-|-|
| Type | الاسم |
| Attribute | الاسم المحلي للسمة. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | اسم نوع المستند. |
| Element | الاسم المحلي للعنصر. |
| Entity | اسم الكيان. |
| EntityReference | اسم الكيان المشار إليه. |
| Notation | اسم الترميز. |
| ProcessingInstruction | هدف تعليمات المعالجة. |
| Text | #text |
| مسافة بيضاء | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
