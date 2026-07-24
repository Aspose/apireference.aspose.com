---
title: "System::Xml::XmlNamespaceManager::LookupNamespace μέθοδος"
linktitle: "LookupNamespace"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace μέθοδος. Επιστρέφει το URI του χώρου ονομάτων για το συγκεκριμένο πρόθεμα σε C++."
type: docs
weight: 800
url: /el/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


Επιστρέφει το URI του χώρου ονομάτων για το συγκεκριμένο πρόθεμα.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| prefix | const String\& | Το πρόθεμα του χώρου ονομάτων που θέλετε να επιλύσετε. Για να ταιριάξετε τον προεπιλεγμένο χώρο ονομάτων, περάστε το [String::Empty](../../../system/string/empty/). |

### ReturnValue

Το URI του χώρου ονομάτων για **prefix** ή **nullptr** εάν δεν υπάρχει αντιστοιχισμένος χώρος ονομάτων. Η επιστρεφόμενη συμβολοσειρά είναι ατομική. Για περισσότερες πληροφορίες σχετικά με τις ατομικές συμβολοσειρές, δείτε την κλάση [XmlNameTable](../../xmlnametable/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
