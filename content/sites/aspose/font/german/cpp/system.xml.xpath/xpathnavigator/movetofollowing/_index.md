---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing-Methode"
linktitle: "MoveToFollowing"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing-Methode. Verschiebt den XPathNavigator zum Element mit dem angegebenen lokalen Namen und Namespace-URI in Dokumentreihenfolge in C++."
type: docs
weight: 5700
url: /de/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


Verschiebt den [XPathNavigator](../) zum Element mit dem angegebenen lokalen Namen und Namespace-URI in Dokumentreihenfolge.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des Elements. |
| namespaceURI | String | Die Namespace-URI des Elements. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


Verschiebt den [XPathNavigator](../) zum Element mit dem angegebenen lokalen Namen und Namespace-URI, bis zur angegebenen Grenze, in Dokumentreihenfolge.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des Elements. |
| namespaceURI | String | Die Namespace-URI des Elements. |
| end | SharedPtr\<XPathNavigator\> | Das [XPathNavigator](../)-Objekt, das an der Elementgrenze positioniert ist, die der aktuelle [XPathNavigator](../) beim Suchen des folgenden Elements nicht überschreiten wird. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


Verschiebt den [XPathNavigator](../) zum folgenden Element des angegebenen [XPathNodeType](../../xpathnodetype/) in Dokumentreihenfolge.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | XPathNodeType | Der [XPathNodeType](../../xpathnodetype/) des Elements. Der [XPathNodeType](../../xpathnodetype/) kann nicht [XPathNodeType::Attribute](../../xpathnodetype/) oder [XPathNodeType::Namespace](../../xpathnodetype/) sein. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Siehe auch

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


Verschiebt den [XPathNavigator](../) zum folgenden Element des angegebenen [XPathNodeType](../../xpathnodetype/), bis zur angegebenen Grenze, in Dokumentreihenfolge.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | XPathNodeType | Der [XPathNodeType](../../xpathnodetype/) des Elements. Der [XPathNodeType](../../xpathnodetype/) kann nicht [XPathNodeType::Attribute](../../xpathnodetype/) oder [XPathNodeType::Namespace](../../xpathnodetype/) sein. |
| end | SharedPtr\<XPathNavigator\> | Das [XPathNavigator](../)-Objekt, das an der Elementgrenze positioniert ist, die der aktuelle [XPathNavigator](../) beim Suchen des folgenden Elements nicht überschreiten wird. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Siehe auch

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
