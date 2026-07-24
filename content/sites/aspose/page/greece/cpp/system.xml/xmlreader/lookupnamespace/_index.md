---
title: "System::Xml::XmlReader::LookupNamespace method"
linktitle: "LookupNamespace"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::LookupNamespace μέθοδος. Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, επιλύει ένα πρόθεμα ονόματος χώρου στην εμβέλεια του τρέχοντος στοιχείου σε C++."
type: docs
weight: 3100
url: /el/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιλύει ένα πρόθεμα χώρου ονομάτων στην εμβέλεια του τρέχοντος στοιχείου.

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| πρόθεμα | const String\& | Το πρόθεμα του οποίου το URI του ονόματος χώρου θέλετε να επιλύσετε. Για να ταιριάξετε το προεπιλεγμένο όνομα χώρου, περάστε μια κενή συμβολοσειρά. |

### ReturnValue

Το URI ονοματοχώρου στο οποίο αντιστοιχεί το πρόθεμα ή **nullptr** εάν δεν βρεθεί αντίστοιχο πρόθεμα.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
