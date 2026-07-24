---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors μέθοδος"
linktitle: "SelectAncestors"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors μέθοδος. Επιλέγει όλους τους προγονικούς κόμβους του τρέχοντος κόμβου που έχουν το καθορισμένο τοπικό όνομα και URI χώρου ονομάτων σε C++."
type: docs
weight: 7200
url: /el/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Επιλέγει όλους τους προγονικούς κόμβους του τρέχοντος κόμβου που έχουν το καθορισμένο τοπικό όνομα και το URI ονοματοχώρου.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το τοπικό όνομα των προγονικών κόμβων. |
| namespaceURI | String | Το URI του χώρου ονομάτων των προγονικών κόμβων. |
| matchSelf | bool | Για να συμπεριλάβετε τον κόμβο περιβάλλοντος στην επιλογή, **true**· διαφορετικά, **false**. |

### ReturnValue

Ένα [XPathNodeIterator](../../xpathnodeiterator/) που περιέχει τους επιλεγμένους κόμβους. Οι επιστρεφόμενοι κόμβοι είναι σε αντίστροφη σειρά εγγράφου.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Επιλέγει όλους τους προγονικούς κόμβους του τρέχοντος κόμβου που έχουν έναν ταιριαστό [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| type | XPathNodeType | Ο [XPathNodeType](../../xpathnodetype/) των προγονικών κόμβων. |
| matchSelf | bool | Για να συμπεριλάβετε τον κόμβο περιβάλλοντος στην επιλογή, **true**· διαφορετικά, **false**. |

### ReturnValue

Ένα [XPathNodeIterator](../../xpathnodeiterator/) που περιέχει τους επιλεγμένους κόμβους. Οι επιστρεφόμενοι κόμβοι είναι σε αντίστροφη σειρά εγγράφου.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
