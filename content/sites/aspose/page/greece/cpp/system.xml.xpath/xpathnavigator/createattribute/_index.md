---
title: "System::Xml::XPath::XPathNavigator::CreateAttribute μέθοδος"
linktitle: "CreateAttribute"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::CreateAttribute μέθοδος. Δημιουργεί έναν κόμβο χαρακτηριστικού στον τρέχοντα κόμβο στοιχείου χρησιμοποιώντας το πρόθεμα ονοματοχώρου, το τοπικό όνομα και το URI ονοματοχώρου που καθορίζονται με την τιμή που καθορίζεται σε C++."
type: docs
weight: 700
url: /el/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


Δημιουργεί έναν κόμβο χαρακτηριστικού στον τρέχοντα κόμβο στοιχείου χρησιμοποιώντας το πρόθεμα ονοματοχώρου, το τοπικό όνομα και το URI ονοματοχώρου που έχουν καθοριστεί με την τιμή που δόθηκε.

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| πρόθεμα | String | Το πρόθεμα ονοματοχώρου του νέου κόμβου χαρακτηριστικού (εάν υπάρχει). |
| localName | String | Το τοπικό όνομα του νέου κόμβου χαρακτηριστικού που δεν μπορεί να είναι [String::Empty](../../../system/string/empty/) ή **nullptr**. |
| namespaceURI | String | Το URI ονοματοχώρου για το νέο κόμβο χαρακτηριστικού (εάν υπάρχει). |
| value | String | Η τιμή του νέου κόμβου χαρακτηριστικού. Εάν περαστούν [String::Empty](../../../system/string/empty/) ή **nullptr**, δημιουργείται ένας κενός κόμβος χαρακτηριστικού. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
