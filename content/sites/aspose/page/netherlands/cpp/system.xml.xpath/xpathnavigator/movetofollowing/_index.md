---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing methode"
linktitle: "MoveToFollowing"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing methode. Verplaatst de XPathNavigator naar het element met de opgegeven lokale naam en namespace-URI in documentvolgorde in C++."
type: docs
weight: 5700
url: /nl/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


Verplaatst de [XPathNavigator](../) naar het element met de opgegeven lokale naam en namespace-URI in documentvolgorde.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het element. |
| namespaceURI | String | De namespace-URI van het element. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Zie ook

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


Verplaatst de [XPathNavigator](../) naar het element met de opgegeven lokale naam en namespace-URI, tot de opgegeven grens, in documentvolgorde.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het element. |
| namespaceURI | String | De namespace-URI van het element. |
| end | SharedPtr\<XPathNavigator\> | Het [XPathNavigator](../)-object gepositioneerd op de elementgrens die de huidige [XPathNavigator](../) niet zal overschrijden tijdens het zoeken naar het volgende element. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


Verplaatst de [XPathNavigator](../) naar het volgende element van het opgegeven [XPathNodeType](../../xpathnodetype/) in documentvolgorde.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type | XPathNodeType | Het [XPathNodeType](../../xpathnodetype/) van het element. Het [XPathNodeType](../../xpathnodetype/) kan niet [XPathNodeType::Attribute](../../xpathnodetype/) of [XPathNodeType::Namespace](../../xpathnodetype/) zijn. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Zie ook

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


Verplaatst de [XPathNavigator](../) naar het volgende element van het opgegeven [XPathNodeType](../../xpathnodetype/), tot de opgegeven grens, in documentvolgorde.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type | XPathNodeType | Het [XPathNodeType](../../xpathnodetype/) van het element. Het [XPathNodeType](../../xpathnodetype/) kan niet [XPathNodeType::Attribute](../../xpathnodetype/) of [XPathNodeType::Namespace](../../xpathnodetype/) zijn. |
| end | SharedPtr\<XPathNavigator\> | Het [XPathNavigator](../)-object gepositioneerd op de elementgrens die de huidige [XPathNavigator](../) niet zal overschrijden tijdens het zoeken naar het volgende element. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Zie ook

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
