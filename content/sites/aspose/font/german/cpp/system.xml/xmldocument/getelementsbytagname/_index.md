---
title: "System::Xml::XmlDocument::GetElementsByTagName Methode"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDocument::GetElementsByTagName Methode. Gibt eine XmlNodeList zurück, die eine Liste aller Nachfahren‑Elemente enthält, die den angegebenen XmlDocument::get_LocalName und XmlNode::get_NamespaceURI in C++ entsprechen."
type: docs
weight: 3200
url: /de/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


Gibt eine [XmlNodeList](../../xmlnodelist/) zurück, die eine Liste aller Nachfahren‑Elemente enthält, die den angegebenen [XmlDocument::get_LocalName](../get_localname/) und [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) entsprechen.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der zu matchende LocalName. Der Sonderwert **\"*\"** stimmt mit allen Tags überein. |
| namespaceURI | String | NamespaceURI zum Abgleichen. |

### ReturnValue

Eine [XmlNodeList](../../xmlnodelist/) mit einer Liste aller passenden Knoten. Wenn keine Knoten dem angegebenen **localName** und **namespaceURI** entsprechen, ist die zurückgegebene Sammlung leer.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


Gibt eine [XmlNodeList](../../xmlnodelist/) zurück, die eine Liste aller Nachfahren‑Elemente enthält, die den angegebenen Namen entsprechen.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der qualifizierte Name zum Abgleichen. Er wird mit dem **get_Name**-Wert des passenden Knotens verglichen. Der Sonderwert **\"*\"** stimmt mit allen Tags überein. |

### ReturnValue

Eine [XmlNodeList](../../xmlnodelist/) mit einer Liste aller passenden Knoten. Wenn keine Knoten **name** entsprechen, ist die zurückgegebene Sammlung leer.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
