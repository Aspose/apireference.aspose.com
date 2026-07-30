---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent metodu"
linktitle: "get_OldParent"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent metodu. C++'da işlemin başlamasından önce XmlNode::get_ParentNode değerini döndürür."
type: docs
weight: 600
url: /tr/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


İşlem başlamadan önce [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) değerini döndürür.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

İşlem başlamadan önce **ParentNode** değeridir. Bu metod, düğümün bir ebeveyni yoksa **nullptr** döndürür. Öznitelik düğümleri için, bu metod [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) değerini döndürür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
