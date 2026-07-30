---
title: "System::Xml::XmlAttributeCollection::SetNamedItem метод"
linktitle: "SetNamedItem"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem метод. Добавляет XmlNode, используя результат его XmlNode::get_Name, в C++."
type: docs
weight: 1000
url: /ru/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


Добавляет [XmlNode](../../xmlnode/) используя результат его [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Узел‑атрибут для хранения в этой коллекции. Позже узел будет доступен по имени узла. Если в коллекции уже присутствует узел с таким именем, он будет заменён новым; в противном случае узел будет добавлен в конец коллекции. |

### ReturnValue

Если **node** заменяет существующий узел с тем же именем, возвращается старый узел; в противном случае возвращается добавленный узел.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
