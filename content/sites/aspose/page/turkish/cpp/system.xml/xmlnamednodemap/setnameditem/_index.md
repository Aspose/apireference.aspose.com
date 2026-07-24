---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem yöntemi"
linktitle: "SetNamedItem"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem yöntemi. C++'ta bir XmlNode'u, XmlNode::get_Name değerini kullanarak ekler."
type: docs
weight: 1000
url: /tr/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


[XmlNode](../../xmlnode/) öğesini, [XmlNode::get_Name](../../xmlnode/get_name/) değerini kullanarak ekler.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | [XmlNamedNodeMap](../) içinde saklanacak bir [XmlNode](../../xmlnode/). Aynı isimde bir düğüm zaten haritada mevcutsa, yeni olanla değiştirilir. |

### ReturnValue

Eğer **node** aynı isimde mevcut bir düğümü değiştirirse, eski düğüm döndürülür; aksi takdirde **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
