---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants μέθοδος"
linktitle: "SelectDescendants"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants μέθοδος. Επιλέγει όλους τους απογόνους κόμβους του τρέχοντος κόμβου με το τοπικό όνομα και το URI ονοματοχώρου που καθορίζονται σε C++."
type: docs
weight: 7400
url: /el/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Επιλέγει όλους τους απογόνους κόμβους του τρέχοντος κόμβου με το καθορισμένο τοπικό όνομα και το URI ονοματοχώρου.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το τοπικό όνομα των απογόνων κόμβων. |
| namespaceURI | String | Το URI ονοματοχώρου των απογόνων κόμβων. |
| matchSelf | bool | **true** για να συμπεριληφθεί ο κόμβος περιβάλλοντος στην επιλογή· διαφορετικά, **false**. |

### ReturnValue

Ένας [XPathNodeIterator](../../xpathnodeiterator/) που περιέχει τους επιλεγμένους κόμβους.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Επιλέγει όλους τους απογόνους κόμβους του τρέχοντος κόμβου που έχουν έναν αντιστοιχούν [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| type | XPathNodeType | Το [XPathNodeType](../../xpathnodetype/) των απογόνων κόμβων. |
| matchSelf | bool | **true** για να συμπεριληφθεί ο κόμβος περιβάλλοντος στην επιλογή· διαφορετικά, **false**. |

### ReturnValue

Ένας [XPathNodeIterator](../../xpathnodeiterator/) που περιέχει τους επιλεγμένους κόμβους.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
