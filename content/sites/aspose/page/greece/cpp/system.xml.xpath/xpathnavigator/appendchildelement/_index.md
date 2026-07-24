---
title: "System::Xml::XPath::XPathNavigator::AppendChildElement μέθοδος"
linktitle: "AppendChildElement"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::AppendChildElement μέθοδος. Δημιουργεί έναν νέο κόμβο στοιχείου παιδιού στο τέλος της λίστας των παιδικών κόμβων του τρέχοντος κόμβου χρησιμοποιώντας το προθεματικό ονομαχώρου, το τοπικό όνομα και το URI του ονομαχώρου που έχουν καθοριστεί, με την τιμή που έχει καθοριστεί σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement method


Δημιουργεί έναν νέο κόμβο στοιχείου-παιδί στο τέλος της λίστας των κόμβων-παιδιών του τρέχοντος κόμβου χρησιμοποιώντας το πρόθεμα ονοματοχώρου, το τοπικό όνομα και το URI ονοματοχώρου που έχουν καθοριστεί με την τιμή που δόθηκε.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| πρόθεμα | String | Το προθεματικό ονομαχώρου του νέου κόμβου στοιχείου παιδιού (εάν υπάρχει). |
| localName | String | Το τοπικό όνομα του νέου κόμβου στοιχείου παιδιού (εάν υπάρχει). |
| namespaceURI | String | Το URI του ονοματοχώρου του νέου κόμβου στοιχείου-παιδιού (εάν υπάρχει). [String::Empty](../../../system/string/empty/) και **nullptr** είναι ισοδύναμα. |
| value | String | Η τιμή του νέου κόμβου στοιχείου-παιδιού. Εάν περαστεί [String::Empty](../../../system/string/empty/) ή **nullptr**, δημιουργείται ένα κενό στοιχείο. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
