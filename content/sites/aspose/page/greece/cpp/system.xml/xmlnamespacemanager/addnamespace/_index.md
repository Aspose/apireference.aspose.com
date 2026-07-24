---
title: "System::Xml::XmlNamespaceManager::AddNamespace μέθοδος"
linktitle: "AddNamespace"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNamespaceManager::AddNamespace μέθοδος. Προσθέτει τον δεδομένο χώρο ονομάτων στη συλλογή σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


Προσθέτει το δεδομένο χώρο ονομάτων στη συλλογή.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| prefix | String | Το πρόθεμα που θα συσχετιστεί με τον χώρο ονομάτων που προστίθεται. Χρησιμοποιήστε [String::Empty](../../../system/string/empty/) για να προσθέσετε έναν προεπιλεγμένο χώρο ονομάτων. Εάν το [XmlNamespaceManager](../) θα χρησιμοποιηθεί για την επίλυση χώρων ονομάτων σε μια έκφραση XML Path Language ([XPath](../../../system.xml.xpath/)), πρέπει να καθοριστεί πρόθεμα. Εάν μια έκφραση [XPath](../../../system.xml.xpath/) δεν περιλαμβάνει πρόθεμα, θεωρείται ότι το Uniform Resource Identifier (URI) του χώρου ονομάτων είναι ο κενός χώρος ονομάτων. Για περισσότερες πληροφορίες σχετικά με τις εκφράσεις [XPath](../../../system.xml.xpath/) και το [XmlNamespaceManager](../), ανατρέξτε στις μεθόδους XmlNode::SelectNodes(String) και XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) methods. |
| uri | String | Ο χώρος ονομάτων για προσθήκη. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
