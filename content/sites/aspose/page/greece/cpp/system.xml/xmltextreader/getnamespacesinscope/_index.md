---
title: "System::Xml::XmlTextReader::GetNamespacesInScope method"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlTextReader::GetNamespacesInScope method. Επιστρέφει μια συλλογή που περιέχει όλα τα namespaces που είναι επί του παρόντος εντός εμβέλειας σε C++."
type: docs
weight: 3400
url: /el/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


Επιστρέφει μια συλλογή που περιέχει όλους τους χώρους ονομάτων που είναι αυτή τη στιγμή εντός εμβέλειας.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| scope | XmlNamespaceScope | Μια τιμή [XmlNamespaceScope](../../xmlnamespacescope/) που καθορίζει τον τύπο των κόμβων namespace που θα επιστραφούν. |

### ReturnValue

Ένα αντικείμενο IDictionary που περιέχει όλα τα τρέχοντα namespaces εντός εμβέλειας. Εάν ο αναγνώστης δεν βρίσκεται σε ένα στοιχείο, επιστρέφεται ένα κενό λεξικό (χωρίς namespaces).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
