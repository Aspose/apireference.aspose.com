---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing metod"
linktitle: "MoveToFollowing"
second_title: "Aspose.Page för C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing metod. Flyttar XPathNavigator till elementet med det lokala namnet och namnrymds‑URI som anges i dokumentordning i C++."
type: docs
weight: 5700
url: /sv/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


Flyttar [XPathNavigator](../) till elementet med det lokala namnet och namnrymds‑URI som anges i dokumentordning.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på elementet. |
| namespaceURI | String | Namespace‑URI för elementet. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Se även

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


Flyttar [XPathNavigator](../) till elementet med det lokala namnet och namnrymds‑URI som anges, till den angivna gränsen, i dokumentordning.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på elementet. |
| namespaceURI | String | Namespace‑URI för elementet. |
| end | SharedPtr\<XPathNavigator\> | [XPathNavigator](../)-objektet placerat på elementgränsen som den aktuella [XPathNavigator](../) inte kommer att passera när den söker efter följande element. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


Flyttar [XPathNavigator](../) till följande element av den angivna [XPathNodeType](../../xpathnodetype/) i dokumentordning.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| type | XPathNodeType | Den [XPathNodeType](../../xpathnodetype/) för elementet. Den [XPathNodeType](../../xpathnodetype/) kan inte vara [XPathNodeType::Attribute](../../xpathnodetype/) eller [XPathNodeType::Namespace](../../xpathnodetype/). |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Se även

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


Flyttar [XPathNavigator](../) till det efterföljande elementet av den angivna [XPathNodeType](../../xpathnodetype/), till den angivna gränsen, i dokumentordning.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| type | XPathNodeType | Den [XPathNodeType](../../xpathnodetype/) för elementet. Den [XPathNodeType](../../xpathnodetype/) kan inte vara [XPathNodeType::Attribute](../../xpathnodetype/) eller [XPathNodeType::Namespace](../../xpathnodetype/). |
| end | SharedPtr\<XPathNavigator\> | [XPathNavigator](../)-objektet placerat på elementgränsen som den aktuella [XPathNavigator](../) inte kommer att passera när den söker efter följande element. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Se även

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
