---
title: "System::Xml::XmlDocument::CreateAttribute Methode"
linktitle: "CreateAttribute"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDocument::CreateAttribute Methode. Erstellt ein XmlAttribute mit dem angegebenen Namen in C++."
type: docs
weight: 300
url: /de/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


Erstellt ein [XmlAttribute](../../xmlattribute/) mit dem angegebenen Namen.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | const String\& | Der qualifizierte Name des Attributs. Wenn der Name einen Doppelpunkt enthält, spiegelt der Wert von [XmlNode::get_Prefix](../../xmlnode/get_prefix/) den Teil des Namens wider, der dem ersten Doppelpunkt vorausgeht, und der Wert von [XmlDocument::get_LocalName](../get_localname/) den Teil des Namens wider, der dem ersten Doppelpunkt folgt. Der Wert von [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) bleibt leer, es sei denn, das Präfix ist ein anerkanntes eingebautes Präfix wie **xmlns**. In diesem Fall hat get_NamespaceURI den Wert [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Das neue [XmlAttribute](../../xmlattribute/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


Erstellt ein [XmlAttribute](../../xmlattribute/) mit dem angegebenen [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) und [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| prefix | const String\& | Das Präfix des Attributs (falls vorhanden). [String::Empty](../../../system/string/empty/) und **nullptr** sind gleichwertig. |
| localName | const String\& | Der lokale Name des Attributs. |
| namespaceURI | const String\& | Der Namespace-URI des Attributs (falls vorhanden). [String::Empty](../../../system/string/empty/) und **nullptr** sind gleichwertig. Wenn **prefix** **xmlns** ist, muss dieser Parameter [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) sein, andernfalls wird eine Ausnahme ausgelöst. |

### ReturnValue

Das neue [XmlAttribute](../../xmlattribute/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


Erstellt ein [XmlAttribute](../../xmlattribute/) mit dem angegebenen qualifizierten Namen und [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| qualifiedName | const String\& | Der qualifizierte Name des Attributs. Wenn der Name einen Doppelpunkt enthält, spiegelt der Wert von [XmlNode::get_Prefix](../../xmlnode/get_prefix/) den Teil des Namens wider, der dem Doppelpunkt vorausgeht, und der Wert von [XmlDocument::get_LocalName](../get_localname/) den Teil des Namens, der nach dem Doppelpunkt kommt. |
| namespaceURI | const String\& | Der namespaceURI des Attributs. Wenn der qualifizierte Name ein Präfix **xmlns** enthält, muss dieser Parameter [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/) sein. |

### ReturnValue

Das neue [XmlAttribute](../../xmlattribute/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
