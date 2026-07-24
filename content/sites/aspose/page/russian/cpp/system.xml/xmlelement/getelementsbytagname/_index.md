---
title: "System::Xml::XmlElement::GetElementsByTagName метод"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlElement::GetElementsByTagName метод. Возвращает XmlNodeList, содержащий список всех дочерних элементов, которые соответствуют указанным значениям XmlElement::get_LocalName и XmlElement::get_NamespaceURI в C++."
type: docs
weight: 1500
url: /ru/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


Возвращает [XmlNodeList](../../xmlnodelist/), содержащий список всех дочерних элементов, которые соответствуют указанным значениям [XmlElement::get_LocalName](../get_localname/) и [XmlElement::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| localName | String | Локальное имя для сопоставления. Символ звёздочки (*) — специальное значение, которое соответствует всем тегам. |
| namespaceURI | String | URI пространства имён для сопоставления. |

### ReturnValue

Объект [XmlNodeList](../../xmlnodelist/) содержащий список всех совпадающих узлов. Список пуст, если совпадающих узлов нет.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Возвращает [XmlNodeList](../../xmlnodelist/) содержащий список всех дочерних элементов, которые соответствуют указанному [XmlElement::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Тег имени для сопоставления. Это квалифицированное имя. Оно сравнивается со значением **get_Name** совпадающего узла. Звёздочка (*) — специальное значение, которое соответствует всем тегам. |

### ReturnValue

Объект [XmlNodeList](../../xmlnodelist/) содержащий список всех совпадающих узлов. Список пуст, если совпадающих узлов нет.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
