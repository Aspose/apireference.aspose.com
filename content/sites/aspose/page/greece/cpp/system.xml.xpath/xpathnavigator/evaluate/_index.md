---
title: "System::Xml::XPath::XPathNavigator::Evaluate μέθοδος"
linktitle: "Evaluate"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::Evaluate μέθοδος. Αξιολογεί το XPathExpression και επιστρέφει το τυποποιημένο αποτέλεσμα σε C++."
type: docs
weight: 1200
url: /el/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


Αξιολογεί το [XPathExpression](../../xpathexpression/) και επιστρέφει το τυποποιημένο αποτέλεσμα.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Ένα [XPathExpression](../../xpathexpression/) που μπορεί να αξιολογηθεί. |

### ReturnValue

Το αποτέλεσμα της έκφρασης ([Boolean](../../../system/boolean/), αριθμός, συμβολοσειρά ή σύνολο κόμβων). Αυτό αντιστοιχεί στα αντικείμενα [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), ή [XPathNodeIterator](../../xpathnodeiterator/) αντίστοιχα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


Χρησιμοποιεί το παρεχόμενο πλαίσιο για την αξιολόγηση του [XPathExpression](../../xpathexpression/), και επιστρέφει το τυποποιημένο αποτέλεσμα.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Ένα [XPathExpression](../../xpathexpression/) που μπορεί να αξιολογηθεί. |
| context | SharedPtr\<XPathNodeIterator\> | Ένας [XPathNodeIterator](../../xpathnodeiterator/) που δείχνει στο επιλεγμένο σύνολο κόμβων πάνω στο οποίο θα γίνει η αξιολόγηση. |

### ReturnValue

Το αποτέλεσμα της έκφρασης ([Boolean](../../../system/boolean/), αριθμός, συμβολοσειρά ή σύνολο κόμβων). Αυτό αντιστοιχεί στα αντικείμενα [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), ή [XPathNodeIterator](../../xpathnodeiterator/) αντίστοιχα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String) method


Αξιολογεί την καθορισμένη έκφραση [XPath](../../) και επιστρέφει το τυποποιημένο αποτέλεσμα.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xpath | String | Μια συμβολοσειρά που αντιπροσωπεύει μια έκφραση [XPath](../../) που μπορεί να αξιολογηθεί. |

### ReturnValue

Το αποτέλεσμα της έκφρασης ([Boolean](../../../system/boolean/), αριθμός, συμβολοσειρά ή σύνολο κόμβων). Αυτό αντιστοιχεί στα αντικείμενα [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), ή [XPathNodeIterator](../../xpathnodeiterator/) αντίστοιχα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


Αξιολογεί την καθορισμένη έκφραση [XPath](../../) και επιστρέφει το τυποποιημένο αποτέλεσμα, χρησιμοποιώντας το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που έχει καθοριστεί για την επίλυση προθεμάτων ονοματοχώρων στην έκφραση [XPath](../../).

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xpath | String | Μια συμβολοσειρά που αντιπροσωπεύει μια έκφραση [XPath](../../) που μπορεί να αξιολογηθεί. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που χρησιμοποιείται για την επίλυση προθεμάτων ονοματοχώρων στην έκφραση [XPath](../../). |

### ReturnValue

Το αποτέλεσμα της έκφρασης ([Boolean](../../../system/boolean/), αριθμός, συμβολοσειρά ή σύνολο κόμβων). Αυτό αντιστοιχεί στα αντικείμενα [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), ή [XPathNodeIterator](../../xpathnodeiterator/) αντίστοιχα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
