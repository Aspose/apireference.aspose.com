---
title: "System::Xml::XmlDocument::CreateAttribute methode"
linktitle: "CreateAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDocument::CreateAttribute methode. Maakt een XmlAttribute met de opgegeven naam aan in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


Maakt een [XmlAttribute](../../xmlattribute/) met de opgegeven naam aan.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | const String\& | De gekwalificeerde naam van het attribuut. Als de naam een dubbele punt bevat, geeft de [XmlNode::get_Prefix](../../xmlnode/get_prefix/) waarde het deel van de naam weer dat vóór de eerste dubbele punt staat en geeft de [XmlDocument::get_LocalName](../get_localname/) waarde het deel van de naam weer dat na de eerste dubbele punt volgt. De [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) blijft leeg tenzij het voorvoegsel een herkend ingebouwd voorvoegsel is, zoals **xmlns**. In dit geval heeft get_NamespaceURI de waarde [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Het nieuwe [XmlAttribute](../../xmlattribute/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


Maakt een [XmlAttribute](../../xmlattribute/) aan met de opgegeven [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) en [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| prefix | const String\& | Het voorvoegsel van het attribuut (indien aanwezig). [String::Empty](../../../system/string/empty/) en **nullptr** zijn gelijkwaardig. |
| localName | const String\& | De lokale naam van het attribuut. |
| namespaceURI | const String\& | De namespace-URI van het attribuut (indien aanwezig). [String::Empty](../../../system/string/empty/) en **nullptr** zijn gelijkwaardig. Als **prefix** **xmlns** is, moet deze parameter [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) zijn, anders wordt er een uitzondering gegooid. |

### ReturnValue

Het nieuwe [XmlAttribute](../../xmlattribute/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


Maakt een [XmlAttribute](../../xmlattribute/) aan met de opgegeven gekwalificeerde naam en [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| qualifiedName | const String\& | De gekwalificeerde naam van het attribuut. Als de naam een dubbele punt bevat, zal de [XmlNode::get_Prefix](../../xmlnode/get_prefix/) waarde het deel van de naam vóór de dubbele punt weergeven en zal de [XmlDocument::get_LocalName](../get_localname/) waarde het deel van de naam na de dubbele punt weergeven. |
| namespaceURI | const String\& | De namespaceURI van het attribuut. Als de gekwalificeerde naam een voorvoegsel **xmlns** bevat, moet deze parameter [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/) zijn. |

### ReturnValue

Het nieuwe [XmlAttribute](../../xmlattribute/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
