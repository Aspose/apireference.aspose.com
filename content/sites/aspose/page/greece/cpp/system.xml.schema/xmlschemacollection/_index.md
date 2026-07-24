---
title: "System::Xml::Schema::XmlSchemaCollection κλάση"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaCollection κλάση. Περιέχει μια κρυφή μνήμη ορισμών XML Schema (XSD) και σχήματα XML-Data Reduced (XDR) σε C++."
type: docs
weight: 1500
url: /el/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


Περιέχει μια κρυφή μνήμη ορισμών XML [Schema](../) (XSD) και σχήματα XML-Data Reduced (XDR).

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Προσθέτει το σχήμα που βρίσκεται στη δοθείσα διεύθυνση URL στη συλλογή σχήματος. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | Προσθέτει το σχήμα που περιέχεται στον [XmlReader](../../system.xml/xmlreader/) στη συλλογή σχήματος. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Προσθέτει το σχήμα που περιέχεται στον [XmlReader](../../system.xml/xmlreader/) στη συλλογή σχήματος. Ο καθορισμένος [XmlResolver](../../system.xml/xmlresolver/) χρησιμοποιείται για την επίλυση τυχόν εξωτερικών πόρων. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Προσθέτει το [XmlSchema](../xmlschema/) στη συλλογή. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Προσθέτει το [XmlSchema](../xmlschema/) στη συλλογή. Ο καθορισμένος [XmlResolver](../../system.xml/xmlresolver/) χρησιμοποιείται για την επίλυση τυχόν εξωτερικών αναφορών. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | Προσθέτει όλους τους χώρους ονομάτων που ορίζονται στη δεδομένη συλλογή (συμπεριλαμβανομένων των σχετικών σχημάτων) σε αυτή τη συλλογή. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Επιστρέφει μια τιμή που υποδεικνύει εάν το **targetNamespace** του καθορισμένου [XmlSchema](../xmlschema/) βρίσκεται στη συλλογή. |
| [Contains](./contains/)(const String\&) | Επιστρέφει μια τιμή που υποδεικνύει εάν ένα σχήμα με τον καθορισμένο χώρο ονομάτων βρίσκεται στη συλλογή. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Αντιγράφει όλα τα αντικείμενα [XmlSchema](../xmlschema/) από αυτή τη συλλογή στον δοθέντα πίνακα, ξεκινώντας από τον δοθέντα δείκτη. |
| [get_Count](./get_count/)() | Επιστρέφει τον αριθμό των χώρων ονομάτων που ορίζονται σε αυτή τη συλλογή. |
| [get_NameTable](./get_nametable/)() | Επιστρέφει τον προεπιλεγμένο [XmlNameTable](../../system.xml/xmlnametable/) που χρησιμοποιείται από το [XmlSchemaCollection](./) κατά τη φόρτωση νέων σχημάτων. |
| [GetEnumerator](./getenumerator/)() override | Παρέχει υποστήριξη για επανάληψη πάνω στη συλλογή των σχημάτων. |
| [idx_get](./idx_get/)(const String\&) | Επιστρέφει το [XmlSchema](../xmlschema/) που σχετίζεται με το δοθέν URI χώρου ονομάτων. |
| [XmlSchemaCollection](./xmlschemacollection/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaCollection](./). |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaCollection](./) με τον καθορισμένο [XmlNameTable](../../system.xml/xmlnametable/). Ο [XmlNameTable](../../system.xml/xmlnametable/) χρησιμοποιείται κατά τη φόρτωση σχημάτων. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις


## Deprecated
Η κλάση XmlSchemaCollection είναι παρωχημένη. Χρησιμοποιήστε το XmlSchemaSet αντ' αυτού.

Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
