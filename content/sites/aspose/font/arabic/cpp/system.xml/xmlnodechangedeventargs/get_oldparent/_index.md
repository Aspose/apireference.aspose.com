---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent method"
linktitle: "get_OldParent"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent method. يعيد قيمة XmlNode::get_ParentNode قبل بدء العملية في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


يعيد قيمة [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) قبل بدء العملية.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

قيمة **ParentNode** قبل بدء العملية. تُعيد هذه الطريقة **nullptr** إذا لم يكن للعقدة أب. بالنسبة لعقد السمات، تُعيد هذه الطريقة قيمة [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
