---
title: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope method"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page για C++"
description: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope method. Επιστρέφει μια συλλογή των ορισμένων αντιστοιχίσεων πρόθεμα-χώρος ονομάτων που είναι αυτή τη στιγμή σε εμβέλεια σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


Επιστρέφει μια συλλογή ορισμένων αντιστοιχίσεων προθέματος-ονοματοχώρου που είναι αυτή τη στιγμή εντός εμβέλειας.

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| scope | XmlNamespaceScope | Μια τιμή [XmlNamespaceScope](../../xmlnamespacescope/) που καθορίζει τον τύπο των κόμβων namespace που θα επιστραφούν. |

### ReturnValue

Μια συλλογή IDictionary που περιέχει τους τρέχοντες χώρους ονομάτων σε εμβέλεια.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
