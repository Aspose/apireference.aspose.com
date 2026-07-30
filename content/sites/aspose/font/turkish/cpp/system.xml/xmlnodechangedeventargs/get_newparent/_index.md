---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent metodu"
linktitle: "get_NewParent"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent metodu. İşlem tamamlandıktan sonra XmlNode::get_ParentNode değerini döndürür C++'da."
type: docs
weight: 300
url: /tr/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


İşlem tamamlandıktan sonra [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) değerini döndürür.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

İşlem tamamlandıktan sonra **ParentNode** değeridir. Bu metod, düğüm kaldırılıyorsa **nullptr** döndürür. Öznitelik düğümleri için, bu metod [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) değerini döndürür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
