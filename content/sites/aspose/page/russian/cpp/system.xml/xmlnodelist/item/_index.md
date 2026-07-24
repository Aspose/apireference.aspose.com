---
title: "System::Xml::XmlNodeList::Item метод"
linktitle: "Item"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlNodeList::Item метод. Получает узел по заданному индексу в C++."
type: docs
weight: 400
url: /ru/cpp/system.xml/xmlnodelist/item/
---
## XmlNodeList::Item method


Получает узел по заданному индексу.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNodeList::Item(int32_t index)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int32_t | Нулевой (начинающий с нуля) индекс в списке узлов. |

### ReturnValue

Элемент [XmlNode](../../xmlnode/) с указанным индексом в коллекции. Если **index** больше или равен количеству узлов в списке, возвращается **nullptr**.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeList](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
