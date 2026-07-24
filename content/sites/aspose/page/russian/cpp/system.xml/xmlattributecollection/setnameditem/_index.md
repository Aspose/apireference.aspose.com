---
title: "System::Xml::XmlAttributeCollection::SetNamedItem метод"
linktitle: "SetNamedItem"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem метод. Добавляет XmlNode, используя его XmlNode::get_Name результат в C++."
type: docs
weight: 1000
url: /ru/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


Добавляет [XmlNode](../../xmlnode/) используя его результат [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| узел | SharedPtr\<XmlNode\> | Узел‑атрибут для хранения в этой коллекции. Позже узел будет доступен по имени узла. Если узел с таким именем уже присутствует в коллекции, он заменяется новым; в противном случае узел добавляется в конец коллекции. |

### ReturnValue

Если **node** заменяет существующий узел с тем же именем, возвращается старый узел; в противном случае возвращается добавленный узел.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
