---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem yöntemi"
linktitle: "SetNamedItem"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem yöntemi. C++'ta bir XmlNode'u, XmlNode::get_Name değerini kullanarak ekler."
type: docs
weight: 1000
url: /tr/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


Belirtilen [XmlNode](../../xmlnode/) öğesini, onun [XmlNode::get_Name](../../xmlnode/get_name/) değerini kullanarak ekler.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Bir [XmlNode](../../xmlnode/) öğesini [XmlNamedNodeMap](../) içinde saklamak için. Aynı ada sahip bir düğüm zaten haritada mevcutsa, yeni olanla değiştirilir. |

### ReturnValue

Eğer **node** aynı ada sahip mevcut bir düğümü değiştirirse, eski düğüm döndürülür; aksi takdirde **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
