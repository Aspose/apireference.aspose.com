---
title: "System::Xml::XmlDocument::CreateElement метод"
linktitle: "CreateElement"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlDocument::CreateElement метод. Создаёт элемент с указанным именем в C++."
type: docs
weight: 800
url: /ru/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


Создаёт элемент с указанным именем.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | const String\& | Полное имя элемента. Если имя содержит двоеточие, значение [XmlNode::get_Prefix](../../xmlnode/get_prefix/) отражает часть имени до двоеточия, а значение [XmlDocument::get_LocalName](../get_localname/) — часть имени после двоеточия. Полное имя не может включать префикс **xmlns**. |

### ReturnValue

Новый [XmlElement](../../xmlelement/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


Создает элемент с указанными [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) и [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| prefix | const String\& | Префикс нового элемента (если есть). [String::Empty](../../../system/string/empty/) и **nullptr** эквивалентны. |
| localName | const String\& | Локальное имя нового элемента. |
| namespaceURI | const String\& | URI пространства имен нового элемента (если есть). [String::Empty](../../../system/string/empty/) и **nullptr** эквивалентны. |

### ReturnValue

Новый [XmlElement](../../xmlelement/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


Создает [XmlElement](../../xmlelement/) с квалифицированным именем и [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| qualifiedName | const String\& | Квалифицированное имя элемента. Если имя содержит двоеточие, то значение [XmlNode::get_Prefix](../../xmlnode/get_prefix/) будет отражать часть имени до двоеточия, а значение [XmlDocument::get_LocalName](../get_localname/) — часть имени после двоеточия. Квалифицированное имя не может включать префикс **xmlns**. |
| namespaceURI | const String\& | URI пространства имён элемента. |

### ReturnValue

Новый [XmlElement](../../xmlelement/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
