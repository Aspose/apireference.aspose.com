---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent yöntemi"
linktitle: "get_OldParent"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent yöntemi. C++'de işlemin başlamasından önce XmlNode::get_ParentNode değerini döndürür."
type: docs
weight: 600
url: /tr/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


İşlemin başlamasından önce [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) değerini döndürür.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

İşlemin başlamasından önce **ParentNode** değeridir. Düğümün bir ebeveyni yoksa bu yöntem **nullptr** döndürür. Öznitelik düğümleri için bu yöntem [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) değerini döndürür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
