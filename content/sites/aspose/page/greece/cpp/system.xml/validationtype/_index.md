---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Page για C++"
description: "System::Xml::ValidationType enum. Καθορίζει τον τύπο επαλήθευσης που θα εκτελεστεί σε C++."
type: docs
weight: 5500
url: /el/cpp/system.xml/validationtype/
---
## ValidationType enum


Καθορίζει τον τύπο επαλήθευσης που θα εκτελεστεί.

```cpp
enum class ValidationType
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| None | 0 | Δεν εκτελείται επικύρωση και δεν προβάλλονται σφάλματα επικύρωσης. Αυτή η ρύθμιση δημιουργεί έναν συμβατό με XML 1.0 μη-επικυρωτικό αναλυτή. |
| Αυτόματο | 1 | Επικυρώνει εάν βρεθούν πληροφορίες DTD ή σχήματος. |
| DTD | 2 | Επικυρώνει σύμφωνα με το DTD. |
| XDR | 3 | Επικυρώνει σύμφωνα με τα σχήματα XML-Data Reduced (XDR), συμπεριλαμβανομένων των ενσωματωμένων σχημάτων XDR. Τα σχήματα XDR αναγνωρίζονται χρησιμοποιώντας το πρόθεμα χώρου ονομάτων **x-schema** ή την τιμή του [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/). |
| Schema | 4 | Επικυρώνει σύμφωνα με τη γλώσσα ορισμού XML [Schema](../../system.xml.schema/) (XSD), συμπεριλαμβανομένων των ενσωματωμένων XML Σχημάτων. Τα XML Σχήματα συνδέονται με URI χώρων ονομάτων είτε χρησιμοποιώντας το χαρακτηριστικό **schemaLocation** είτε τα παρεχόμενα **Schemas**. |

## Δείτε επίσης

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
