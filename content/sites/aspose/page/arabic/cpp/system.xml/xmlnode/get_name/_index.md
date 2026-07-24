---
title: "System::Xml::XmlNode::get_Name method"
linktitle: "get_Name"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlNode::get_Name. تُعيد الاسم المؤهل للعقدة، عند تجاوزها في فئة مُشتقة في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


يعيد الاسم المؤهل للعقدة، عندما يتم تجاوزه في فئة مشتقة.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

الاسم المؤهل للعقدة.
## ملاحظات



الاسم المُعاد يعتمد على [XmlNode::get_NodeType](../get_nodetype/) للعقدة: |||
|-|-|
| Type | الاسم |
| Attribute | الاسم المؤهل للخاصية. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | اسم نوع المستند. |
| Element | الاسم المؤهل للعنصر. |
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
