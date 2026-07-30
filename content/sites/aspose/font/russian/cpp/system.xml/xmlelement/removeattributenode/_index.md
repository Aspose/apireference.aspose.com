---
title: "System::Xml::XmlElement::RemoveAttributeNode method"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlElement::RemoveAttributeNode method. Удаляет указанный XmlAttribute в C++."
type: docs
weight: 2100
url: /ru/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


Удаляет указанный [XmlAttribute](../../xmlattribute/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | Узел [XmlAttribute](../../xmlattribute/), который нужно удалить. Если удалённый атрибут имеет значение по умолчанию, оно сразу заменяется. |

### ReturnValue

Удалённый [XmlAttribute](../../xmlattribute/) или **nullptr**, если **oldAttr** не является узлом‑атрибутом [XmlElement](../).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


Удаляет [XmlAttribute](../../xmlattribute/), указанный локальным именем и URI пространства имён. (Если удалённый атрибут имеет значение по умолчанию, оно сразу заменяется).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| localName | String | Локальное имя атрибута. |
| namespaceURI | String | URI пространства имён атрибута. |

### ReturnValue

Удалённый [XmlAttribute](../../xmlattribute/) или **nullptr**, если у [XmlElement](../) нет соответствующего узла атрибута.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
