---
title: "System::Xml::XmlNode::get_ParentNode طريقة"
linktitle: "get_ParentNode"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNode::get_ParentNode طريقة. يعيد الأب لهذه العقدة (للعقد التي يمكن أن يكون لها أب) في C++."
type: docs
weight: 2100
url: /ar/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


يعيد العنصر الأب لهذه العقدة (للعقد التي يمكن أن يكون لها أب).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

الـ [XmlNode](../) الذي هو أب العقدة الحالية.
## ملاحظات



إذا تم إنشاء عقدة للتو ولم تُضاف بعد إلى الشجرة، أو إذا تمت إزالتها من الشجرة، فإن الأب هو **nullptr**. بالنسبة لجميع العقد الأخرى، تعتمد القيمة المرجعة على [XmlNode::get_NodeType](../get_nodetype/) الخاص بالعقدة. الجدول التالي يصف القيم المرجعة المحتملة لـ **get_NodeType** طريقة. |||
|-|-|
| نوع العقدة | قيمة الإرجاع للـ ParentNode |
| Attribute, Document, DocumentFragment, Entity, Notation | يعيد nullptr؛ هذه العقد لا تمتلك أبًا. |
| CDATA | يعيد العنصر أو مرجع الكيان الذي يحتوي على قسم CDATA. |
| تعليق | يعيد العنصر أو مرجع الكيان أو نوع المستند أو المستند الذي يحتوي على التعليق. |
| نوع المستند | يعيد عقدة المستند. |
| Element | يعيد عقدة الأب للعنصر. إذا كان العنصر هو العقدة الجذرية في الشجرة، فإن الأب هو عقدة المستند. |
| مرجع كيان | يعيد العنصر أو السمة أو مرجع الكيان الذي يحتوي على مرجع الكيان. |
| تعليمات المعالجة | يعيد المستند أو العنصر أو نوع المستند أو مرجع الكيان الذي يحتوي على تعليمات المعالجة. |
| Text | يعيد العنصر الأب أو السمة أو مرجع الكيان الذي يحتوي على عقدة النص. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
