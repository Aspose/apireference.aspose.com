---
title: "System::Xml::XmlDocument::CreateElement-Methode"
linktitle: "CreateElement"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDocument::CreateElement-Methode. Erstellt ein Element mit dem angegebenen Namen in C++."
type: docs
weight: 800
url: /de/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


Erstellt ein Element mit dem angegebenen Namen.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | const String\& | Der qualifizierte Name des Elements. Wenn der Name einen Doppelpunkt enthält, spiegelt der Wert von [XmlNode::get_Prefix](../../xmlnode/get_prefix/) den Teil des Namens vor dem Doppelpunkt wider und der Wert von [XmlDocument::get_LocalName](../get_localname/) den Teil des Namens nach dem Doppelpunkt. Der qualifizierte Name darf kein Präfix **xmlns** enthalten. |

### ReturnValue

Das neue [XmlElement](../../xmlelement/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


Erstellt ein Element mit dem angegebenen [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) und [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| prefix | const String\& | Das Präfix des neuen Elements (falls vorhanden). [String::Empty](../../../system/string/empty/) und **nullptr** sind äquivalent. |
| localName | const String\& | Der lokale Name des neuen Elements. |
| namespaceURI | const String\& | Der Namespace-URI des neuen Elements (falls vorhanden). [String::Empty](../../../system/string/empty/) und **nullptr** sind äquivalent. |

### ReturnValue

Das neue [XmlElement](../../xmlelement/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


Erstellt ein [XmlElement](../../xmlelement/) mit dem qualifizierten Namen und [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| qualifiedName | const String\& | Der qualifizierte Name des Elements. Wenn der Name einen Doppelpunkt enthält, dann wird der Wert von [XmlNode::get_Prefix](../../xmlnode/get_prefix/) den Teil des Namens vor dem Doppelpunkt widerspiegeln und der Wert von [XmlDocument::get_LocalName](../get_localname/) den Teil des Namens nach dem Doppelpunkt. Der qualifizierte Name darf kein Präfix **xmlns** enthalten. |
| namespaceURI | const String\& | Die Namespace-URI des Elements. |

### ReturnValue

Das neue [XmlElement](../../xmlelement/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
