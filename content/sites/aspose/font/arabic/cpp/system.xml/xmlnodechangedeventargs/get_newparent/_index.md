---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent method"
linktitle: "get_NewParent"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent method. يعيد قيمة XmlNode::get_ParentNode بعد إكمال العملية في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


يعيد قيمة [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) بعد إكمال العملية.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

قيمة **ParentNode** بعد إكمال العملية. تُعيد هذه الطريقة **nullptr** إذا كان العقدة تُزال. بالنسبة لعقد السمات، تُعيد هذه الطريقة قيمة [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
