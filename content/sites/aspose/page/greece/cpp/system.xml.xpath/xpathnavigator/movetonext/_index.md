---
title: "System::Xml::XPath::XPathNavigator::MoveToNext μέθοδος"
linktitle: "MoveToNext"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::MoveToNext μέθοδος. Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, μετακινεί το XPathNavigator στον επόμενο αδελφό κόμβο του τρέχοντος κόμβου σε C++."
type: docs
weight: 6000
url: /el/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, μετακινεί το [XPathNavigator](../) στον επόμενο αδελφό κόμβο του τρέχοντος κόμβου.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Δείτε επίσης

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


Μετακινεί το [XPathNavigator](../) στον επόμενο αδελφό κόμβο με το καθορισμένο τοπικό όνομα και το URI του ονόματος χώρου.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του επόμενου αδελφού κόμβου προς μετακίνηση. |
| namespaceURI | String | Το URI του ονόματος χώρου του επόμενου αδελφού κόμβου προς μετακίνηση. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


Μετακινεί το [XPathNavigator](../) στον επόμενο αδελφό κόμβο του τρέχοντος κόμβου που ταιριάζει με το καθορισμένο [XPathNodeType](../../xpathnodetype/).

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| type | XPathNodeType | Το [XPathNodeType](../../xpathnodetype/) του αδελφού κόμβου προς μετακίνηση. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Δείτε επίσης

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
