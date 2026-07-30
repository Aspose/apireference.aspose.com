---
title: "System::Xml::XmlElement::GetElementsByTagName Methode"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlElement::GetElementsByTagName Methode. Gibt eine XmlNodeList zurück, die eine Liste aller Nachfahren-Elemente enthält, die den angegebenen XmlElement::get_LocalName- und XmlElement::get_NamespaceURI-Werten in C++ entsprechen."
type: docs
weight: 1500
url: /de/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


Gibt eine [XmlNodeList](../../xmlnodelist/) zurück, die eine Liste aller Nachfahren-Elemente enthält, die den angegebenen [XmlElement::get_LocalName](../get_localname/) und [XmlElement::get_NamespaceURI](../get_namespaceuri/) Werten entsprechen.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name, nach dem gesucht wird. Das Sternchen (*) ist ein spezieller Wert, der alle Tags abgleicht. |
| namespaceURI | String | Der Namespace-URI, nach dem gesucht wird. |

### ReturnValue

Eine [XmlNodeList](../../xmlnodelist/) mit einer Liste aller passenden Knoten. Die Liste ist leer, wenn keine passenden Knoten vorhanden sind.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Gibt eine [XmlNodeList](../../xmlnodelist/) zurück, die eine Liste aller Nachfahren-Elemente enthält, die den angegebenen [XmlElement::get_Name](../get_name/) entsprechen.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Das Namens-Tag, nach dem gesucht wird. Dies ist ein qualifizierter Name. Er wird mit dem **get_Name**-Wert des passenden Knotens abgeglichen. Das Sternchen (*) ist ein spezieller Wert, der alle Tags abgleicht. |

### ReturnValue

Eine [XmlNodeList](../../xmlnodelist/) mit einer Liste aller passenden Knoten. Die Liste ist leer, wenn keine passenden Knoten vorhanden sind.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
