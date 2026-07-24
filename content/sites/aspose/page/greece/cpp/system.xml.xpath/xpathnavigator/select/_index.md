---
title: "System::Xml::XPath::XPathNavigator::Select μέθοδος"
linktitle: "Επιλογή"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::Select μέθοδος. Επιλέγει ένα σύνολο κόμβων χρησιμοποιώντας το καθορισμένο XPathExpression σε C++."
type: docs
weight: 7100
url: /el/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


Επιλέγει ένα σύνολο κόμβων χρησιμοποιώντας το καθορισμένο [XPathExpression](../../xpathexpression/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Ένα αντικείμενο [XPathExpression](../../xpathexpression/) που περιέχει το μεταγλωττισμένο ερώτημα [XPath](../../). |

### ReturnValue

Ένας [XPathNodeIterator](../../xpathnodeiterator/) που δείχνει στο επιλεγμένο σύνολο κόμβων.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String) method


Επιλέγει ένα σύνολο κόμβων, χρησιμοποιώντας την καθορισμένη έκφραση [XPath](../../).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xpath | String | Ένα [String](../../../system/string/) που αντιπροσωπεύει μια έκφραση [XPath](../../). |

### ReturnValue

Ένας [XPathNodeIterator](../../xpathnodeiterator/) που δείχνει στο επιλεγμένο σύνολο κόμβων.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


Επιλέγει ένα σύνολο κόμβων χρησιμοποιώντας την καθορισμένη έκφραση [XPath](../../) με το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που έχει καθοριστεί για την επίλυση προθεμάτων ονοματοχώρων.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xpath | String | Ένα [String](../../../system/string/) που αντιπροσωπεύει μια έκφραση [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που χρησιμοποιείται για την επίλυση προθεμάτων ονομάτων. |

### ReturnValue

Ένας [XPathNodeIterator](../../xpathnodeiterator/) που δείχνει στο επιλεγμένο σύνολο κόμβων.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
