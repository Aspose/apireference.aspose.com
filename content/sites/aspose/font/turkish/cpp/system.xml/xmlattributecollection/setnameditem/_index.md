---
title: "System::Xml::XmlAttributeCollection::SetNamedItem yöntemi"
linktitle: "SetNamedItem"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem yöntemi. C++'ta XmlNode::get_Name sonucunu kullanarak bir XmlNode ekler."
type: docs
weight: 1000
url: /tr/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


Bir [XmlNode](../../xmlnode/) ekler, [XmlNode::get_Name](../../xmlnode/get_name/) sonucunu kullanarak.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| düğüm | SharedPtr\<XmlNode\> | Bu koleksiyonda saklanacak bir öznitelik düğümü. Düğüm daha sonra düğümün adıyla erişilebilir olacaktır. Aynı ada sahip bir düğüm zaten koleksiyonda varsa, yeni olanla değiştirilir; aksi takdirde düğüm koleksiyonun sonuna eklenir. |

### ReturnValue

Eğer **node** aynı ada sahip mevcut bir düğümü değiştirirse, eski düğüm döndürülür; aksi takdirde eklenen düğüm döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
