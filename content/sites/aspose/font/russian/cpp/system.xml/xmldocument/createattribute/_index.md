---
title: "Метод System::Xml::XmlDocument::CreateAttribute"
linktitle: "CreateAttribute"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlDocument::CreateAttribute. Создает объект XmlAttribute с указанным именем в C++."
type: docs
weight: 300
url: /ru/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


Создает [XmlAttribute](../../xmlattribute/) с указанным именем.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | const String\& | Полное имя атрибута. Если имя содержит двоеточие, значение [XmlNode::get_Prefix](../../xmlnode/get_prefix/) отражает часть имени, предшествующую первому двоеточию, а значение [XmlDocument::get_LocalName](../get_localname/) отражает часть имени, следующую за первым двоеточием. Значение [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) остаётся пустым, если только префикс не является распознанным встроенным префиксом, таким как **xmlns**. В этом случае get_NamespaceURI имеет значение [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Новый [XmlAttribute](../../xmlattribute/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


Создает [XmlAttribute](../../xmlattribute/) с указанными [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) и [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| prefix | const String\& | Префикс атрибута (если есть). [String::Empty](../../../system/string/empty/) и **nullptr** эквивалентны. |
| localName | const String\& | Локальное имя атрибута. |
| namespaceURI | const String\& | URI пространства имен атрибута (если есть). [String::Empty](../../../system/string/empty/) и **nullptr** эквивалентны. Если **prefix** равен **xmlns**, то этот параметр должен быть [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;), иначе будет выброшено исключение. |

### ReturnValue

Новый [XmlAttribute](../../xmlattribute/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


Создает [XmlAttribute](../../xmlattribute/) с указанным полным именем и [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| qualifiedName | const String\& | Полное имя атрибута. Если имя содержит двоеточие, значение [XmlNode::get_Prefix](../../xmlnode/get_prefix/) будет отражать часть имени до двоеточия, а значение [XmlDocument::get_LocalName](../get_localname/) будет отражать часть имени после двоеточия. |
| namespaceURI | const String\& | URI пространства имен атрибута. Если полное имя включает префикс **xmlns**, то этот параметр должен быть [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Новый [XmlAttribute](../../xmlattribute/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
