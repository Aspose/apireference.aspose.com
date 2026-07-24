---
title: "System::Xml::XmlDocument::CreateElement methode"
linktitle: "CreateElement"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDocument::CreateElement methode. Maakt een element met de opgegeven naam in C++."
type: docs
weight: 800
url: /nl/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


Maakt een element met de opgegeven naam.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | const String\& | De gekwalificeerde naam van het element. Als de naam een dubbelepunt bevat, geeft de waarde van [XmlNode::get_Prefix](../../xmlnode/get_prefix/) het deel van de naam vóór de dubbelepunt weer en geeft de waarde van [XmlDocument::get_LocalName](../get_localname/) het deel van de naam na de dubbelepunt weer. De gekwalificeerde naam mag geen voorvoegsel **xmlns** bevatten. |

### ReturnValue

Het nieuwe [XmlElement](../../xmlelement/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


Maakt een element met het opgegeven [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) en [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| prefix | const String\& | Het voorvoegsel van het nieuwe element (indien aanwezig). [String::Empty](../../../system/string/empty/) en **nullptr** zijn equivalent. |
| localName | const String\& | De lokale naam van het nieuwe element. |
| namespaceURI | const String\& | De namespace-URI van het nieuwe element (indien aanwezig). [String::Empty](../../../system/string/empty/) en **nullptr** zijn equivalent. |

### ReturnValue

Het nieuwe [XmlElement](../../xmlelement/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


Maakt een [XmlElement](../../xmlelement/) met de gekwalificeerde naam en [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| qualifiedName | const String\& | De gekwalificeerde naam van het element. Als de naam een dubbele punt bevat, zal de waarde van [XmlNode::get_Prefix](../../xmlnode/get_prefix/) het deel van de naam vóór de dubbele punt weergeven en zal de waarde van [XmlDocument::get_LocalName](../get_localname/) het deel van de naam na de dubbele punt weergeven. De gekwalificeerde naam mag geen prefix **xmlns** bevatten. |
| namespaceURI | const String\& | De namespace-URI van het element. |

### ReturnValue

Het nieuwe [XmlElement](../../xmlelement/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
