---
title: "System::Xml::XPath::XPathNavigator::GetAttribute μέθοδος"
linktitle: "GetAttribute"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::GetAttribute μέθοδος. Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο τοπικό όνομα και το URI του χώρου ονομάτων σε C++."
type: docs
weight: 3800
url: /el/cpp/system.xml.xpath/xpathnavigator/getattribute/
---
## XPathNavigator::GetAttribute method


Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου.

```cpp
virtual String System::Xml::XPath::XPathNavigator::GetAttribute(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του χαρακτηριστικού. **localName** είναι ευαίσθητο σε πεζά-κεφαλαία. |
| namespaceURI | String | Το URI του χώρου ονομάτων του χαρακτηριστικού. |

### ReturnValue

Ένα [String](../../../system/string/) που περιέχει την τιμή του καθορισμένου χαρακτηριστικού· [String::Empty](../../../system/string/empty/) εάν δεν βρεθεί αντίστοιχο χαρακτηριστικό ή εάν ο [XPathNavigator](../) δεν είναι τοποθετημένος σε κόμβο στοιχείου.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
