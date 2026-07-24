---
title: "System::Xml::XPath::XPathNavigator::PrependChildElement μέθοδος"
linktitle: "PrependChildElement"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::PrependChildElement μέθοδος. Δημιουργεί ένα νέο στοιχείο παιδί στην αρχή της λίστας των παιδικών κόμβων του τρέχοντος κόμβου χρησιμοποιώντας το πρόθεμα ονοματοχώρου, το τοπικό όνομα και το URI ονοματοχώρου που καθορίζονται με την τιμή που έχει οριστεί σε C++."
type: docs
weight: 6700
url: /el/cpp/system.xml.xpath/xpathnavigator/prependchildelement/
---
## XPathNavigator::PrependChildElement method


Δημιουργεί ένα νέο θυγατρικό στοιχείο στην αρχή της λίστας των θυγατρικών κόμβων του τρέχοντος κόμβου χρησιμοποιώντας το πρόθεμα ονοματοχώρου, το τοπικό όνομα και το URI ονοματοχώρου που έχουν καθοριστεί με την καθορισμένη τιμή.

```cpp
virtual void System::Xml::XPath::XPathNavigator::PrependChildElement(String prefix, String localName, String namespaceURI, String value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| πρόθεμα | String | Το πρόθεμα χώρου ονομάτων του νέου παιδικού στοιχείου (εάν υπάρχει). |
| localName | String | Το τοπικό όνομα του νέου παιδικού στοιχείου (εάν υπάρχει). |
| namespaceURI | String | Το URI του χώρου ονομάτων του νέου παιδικού στοιχείου (εάν υπάρχει). [String::Empty](../../../system/string/empty/) και **nullptr** είναι ισοδύναμα. |
| value | String | Η τιμή του νέου παιδικού στοιχείου. Εάν [String::Empty](../../../system/string/empty/) ή **nullptr** περαστούν, δημιουργείται ένα κενό στοιχείο. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
