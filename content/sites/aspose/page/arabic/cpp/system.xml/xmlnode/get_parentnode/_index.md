---
title: "System::Xml::XmlNode::get_ParentNode طريقة"
linktitle: "get_ParentNode"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlNode::get_ParentNode طريقة. تُرجع الأب لهذه العقدة (للعقد التي يمكن أن يكون لها أب) في C++."
type: docs
weight: 2100
url: /ar/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


يعيد الأب لهذه العقدة (للعقد التي يمكن أن يكون لها أب).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

العنصر [XmlNode](../) الذي هو أب العنصر الحالي.
## ملاحظات



إذا تم إنشاء عقدة للتو ولم تُضاف بعد إلى الشجرة، أو إذا تم إزالتها من الشجرة، يكون الأب هو **nullptr**. بالنسبة لجميع العقد الأخرى، تعتمد القيمة المرجعة على [XmlNode::get_NodeType](../get_nodetype/) للعقدة. الجدول التالي يصف القيم المرجعة المحتملة لطريقة **get_NodeType**. |||
|-|-|
| NodeType | قيمة الإرجاع لـ ParentNode |
| Attribute, Document, DocumentFragment, Entity, Notation | يرجع **nullptr**؛ هذه العقد لا تمتلك أبًا. |
| CDATA | يرجع العنصر أو مرجع الكيان الذي يحتوي على قسم CDATA. |
| Comment | يرجع العنصر أو مرجع الكيان أو نوع المستند أو المستند الذي يحتوي على التعليق. |
| DocumentType | يرجع عقدة المستند. |
| Element | يرجع عقدة الأب للعنصر. إذا كان العنصر هو عقدة الجذر في الشجرة، فإن الأب هو عقدة المستند. |
| EntityReference | يرجع العنصر أو السمة أو مرجع الكيان الذي يحتوي على مرجع الكيان. |
| ProcessingInstruction | يرجع المستند أو العنصر أو نوع المستند أو مرجع الكيان الذي يحتوي على تعليمات المعالجة. |
| Text | يرجع العنصر الأب أو السمة أو مرجع الكيان الذي يحتوي على عقدة النص. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
