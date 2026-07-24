---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing method"
linktitle: "MoveToFollowing"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing method. Μετακινεί το XPathNavigator στο στοιχείο με το τοπικό όνομα και το URI του χώρου ονομάτων που καθορίζονται με τη σειρά του εγγράφου σε C++."
type: docs
weight: 5700
url: /el/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


Μετακινεί το [XPathNavigator](../) στο στοιχείο με το τοπικό όνομα και το URI του χώρου ονομάτων που καθορίζονται με τη σειρά του εγγράφου.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του στοιχείου. |
| namespaceURI | String | Το URI του χώρου ονομάτων του στοιχείου. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


Μετακινεί το [XPathNavigator](../) στο στοιχείο με το τοπικό όνομα και το URI του χώρου ονομάτων που καθορίζονται, μέχρι το καθορισμένο όριο, με τη σειρά του εγγράφου.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του στοιχείου. |
| namespaceURI | String | Το URI του χώρου ονομάτων του στοιχείου. |
| end | SharedPtr\<XPathNavigator\> | Το αντικείμενο [XPathNavigator](../) τοποθετημένο στο όριο του στοιχείου το οποίο το τρέχον [XPathNavigator](../) δεν θα περάσει κατά την αναζήτηση του επόμενου στοιχείου. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


Μετακινεί το [XPathNavigator](../) στο επόμενο στοιχείο του [XPathNodeType](../../xpathnodetype/) που καθορίζεται με τη σειρά του εγγράφου.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| type | XPathNodeType | The [XPathNodeType](../../xpathnodetype/) του στοιχείου. Ο [XPathNodeType](../../xpathnodetype/) δεν μπορεί να είναι [XPathNodeType::Attribute](../../xpathnodetype/) ή [XPathNodeType::Namespace](../../xpathnodetype/). |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Δείτε επίσης

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


Μετακινεί το [XPathNavigator](../) στο επόμενο στοιχείο του καθορισμένου [XPathNodeType](../../xpathnodetype/), στο καθορισμένο όριο, με σειρά εγγράφου.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| type | XPathNodeType | The [XPathNodeType](../../xpathnodetype/) του στοιχείου. Ο [XPathNodeType](../../xpathnodetype/) δεν μπορεί να είναι [XPathNodeType::Attribute](../../xpathnodetype/) ή [XPathNodeType::Namespace](../../xpathnodetype/). |
| end | SharedPtr\<XPathNavigator\> | Το αντικείμενο [XPathNavigator](../) τοποθετημένο στο όριο του στοιχείου το οποίο το τρέχον [XPathNavigator](../) δεν θα περάσει κατά την αναζήτηση του επόμενου στοιχείου. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Δείτε επίσης

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
