---
title: "System::Xml::XmlElement::GetElementsByTagName Methode"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page für C++"
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
| localName | String | Der zu matchende lokale Name. Das Sternchen (*) ist ein spezieller Wert, der alle Tags matcht. |
| namespaceURI | String | Der Namespace-URI zum Abgleichen. |

### ReturnValue

Eine [XmlNodeList](../../xmlnodelist/) die eine Liste aller passenden Knoten enthält. Die Liste ist leer, wenn es keine passenden Knoten gibt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Gibt eine [XmlNodeList](../../xmlnodelist/) zurück, die eine Liste aller Nachfahren-Elemente enthält, die dem angegebenen [XmlElement::get_Name](../get_name/) entsprechen.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Das zu matchende Namens-Tag. Dies ist ein qualifizierter Name. Er wird mit dem **get_Name**-Wert des passenden Knotens abgeglichen. Das Sternchen (*) ist ein spezieller Wert, der alle Tags matcht. |

### ReturnValue

Eine [XmlNodeList](../../xmlnodelist/) die eine Liste aller passenden Knoten enthält. Die Liste ist leer, wenn es keine passenden Knoten gibt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
