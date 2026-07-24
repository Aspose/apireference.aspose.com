---
title: "System::Xml::XPath::XPathNavigator::SelectChildren μέθοδος"
linktitle: "SelectChildren"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::SelectChildren μέθοδος. Επιλέγει όλους τους κόμβους-παιδιά του τρέχοντος κόμβου που έχουν το τοπικό όνομα και το URI του ονόματος χώρου που καθορίζονται σε C++."
type: docs
weight: 7300
url: /el/cpp/system.xml.xpath/xpathnavigator/selectchildren/
---
## XPathNavigator::SelectChildren(String, String) method


Επιλέγει όλους τους θυγατρικούς κόμβους του τρέχοντος κόμβου που έχουν το καθορισμένο τοπικό όνομα και το URI ονοματοχώρου.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(String name, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το τοπικό όνομα των κόμβων-παιδιών. |
| namespaceURI | String | Το URI του ονόματος χώρου των κόμβων-παιδιών. |

### ReturnValue

Ένας [XPathNodeIterator](../../xpathnodeiterator/) που περιέχει τους επιλεγμένους κόμβους.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectChildren(XPathNodeType) method


Επιλέγει όλους τους κόμβους-παιδιά του τρέχοντος κόμβου που ταιριάζουν με το [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(XPathNodeType type)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| type | XPathNodeType | Το [XPathNodeType](../../xpathnodetype/) των κόμβων-παιδιών. |

### ReturnValue

Ένας [XPathNodeIterator](../../xpathnodeiterator/) που περιέχει τους επιλεγμένους κόμβους.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
