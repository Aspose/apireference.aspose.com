---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method. Удаляет узел с совпадающими значениями XmlNode::get_LocalName и XmlNode::get_NamespaceURI в C++."
type: docs
weight: 900
url: /ru/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


Удаляет узел с совпадающими значениями [XmlNode::get_LocalName](../../xmlnode/get_localname/) и [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| localName | String | Локальное имя узла для удаления. |
| namespaceURI | String | URI пространства имён узла для удаления. |

### ReturnValue

Удалённый [XmlNode](../../xmlnode/) или **nullptr**, если соответствующий узел не найден.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


Удаляет узел из [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Полное имя узла для удаления. Имя сравнивается со значением [XmlNode::get_Name](../../xmlnode/get_name/) соответствующего узла. |

### ReturnValue

Удалённый [XmlNode](../../xmlnode/) из этого [XmlNamedNodeMap](../) или **nullptr**, если соответствующий узел не найден.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
