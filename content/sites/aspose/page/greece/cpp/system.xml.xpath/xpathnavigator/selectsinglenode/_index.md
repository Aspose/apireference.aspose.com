---
title: "System::Xml::XPath::XPathNavigator::SelectSingleNode μέθοδος"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::SelectSingleNode μέθοδος. Επιλέγει έναν μοναδικό κόμβο στο XPathNavigator χρησιμοποιώντας το καθορισμένο αντικείμενο XPathExpression σε C++."
type: docs
weight: 7500
url: /el/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


Επιλέγει έναν μοναδικό κόμβο στο [XPathNavigator](../) χρησιμοποιώντας το καθορισμένο αντικείμενο [XPathExpression](../../xpathexpression/).

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | Ένα αντικείμενο [XPathExpression](../../xpathexpression/) που περιέχει το μεταγλωττισμένο ερώτημα [XPath](../../). |

### ReturnValue

Ένα αντικείμενο [XPathNavigator](../) που περιέχει τον πρώτο αντιστοιχούντα κόμβο για το καθορισμένο ερώτημα [XPath](../../); διαφορετικά **nullptr** εάν δεν υπάρχουν αποτελέσματα ερωτήματος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


Επιλέγει έναν μοναδικό κόμβο στο ερώτημα [XPath](../../).

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xpath | String | Ένα [String](../../../system/string/) που αντιπροσωπεύει μια έκφραση [XPath](../../). |

### ReturnValue

Ένα αντικείμενο [XPathNavigator](../) που περιέχει τον πρώτο αντιστοιχούντα κόμβο για το καθορισμένο ερώτημα [XPath](../../); διαφορετικά, **nullptr** εάν δεν υπάρχουν αποτελέσματα ερωτήματος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


Επιλέγει έναν μοναδικό κόμβο στο αντικείμενο [XPathNavigator](../) χρησιμοποιώντας το καθορισμένο ερώτημα [XPath](../../) με το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που έχει καθοριστεί για την επίλυση προθεμάτων ονοματοχώρου.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xpath | String | Ένα [String](../../../system/string/) που αντιπροσωπεύει μια έκφραση [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που χρησιμοποιείται για την επίλυση προθεμάτων ονοματοχώρου στο ερώτημα [XPath](../../). |

### ReturnValue

Ένα αντικείμενο [XPathNavigator](../) που περιέχει τον πρώτο αντιστοιχούντα κόμβο για το καθορισμένο ερώτημα [XPath](../../); διαφορετικά **nullptr** εάν δεν υπάρχουν αποτελέσματα ερωτήματος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
