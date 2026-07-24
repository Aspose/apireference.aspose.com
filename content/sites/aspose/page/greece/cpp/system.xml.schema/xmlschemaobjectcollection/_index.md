---
title: "Κλάση System::Xml::Schema::XmlSchemaObjectCollection"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::Schema::XmlSchemaObjectCollection. Μια συλλογή των XmlSchemaObjects σε C++."
type: docs
weight: 5100
url: /el/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


Μια συλλογή αντικειμένων XmlSchemaObjects.

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | Προσθέτει ένα [XmlSchemaObject](../xmlschemaobject/) στη [XmlSchemaObjectCollection](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | Δείχνει αν το καθορισμένο [XmlSchemaObject](../xmlschemaobject/) βρίσκεται στη [XmlSchemaObjectCollection](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | Αντιγράφει όλα τα XmlSchemaObjects από τη συλλογή στον δεδομένο πίνακα, ξεκινώντας από το δεδομένο ευρετήριο. |
| [GetEnumerator](./getenumerator/)() override | Επιστρέφει έναν απαριθμητή για την επανάληψη μέσω των XmlSchemaObjects που περιέχονται στη [XmlSchemaObjectCollection](./). |
| virtual [idx_get](./idx_get/)(int32_t) | Επιστρέφει το [XmlSchemaObject](../xmlschemaobject/) στο καθορισμένο ευρετήριο. |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | Ορίζει το [XmlSchemaObject](../xmlschemaobject/) στο καθορισμένο ευρετήριο. |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | Επιστρέφει το ευρετήριο της συλλογής που αντιστοιχεί στο καθορισμένο [XmlSchemaObject](../xmlschemaobject/). |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | Εισάγει ένα [XmlSchemaObject](../xmlschemaobject/) στη [XmlSchemaObjectCollection](./). |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | Αφαιρεί ένα [XmlSchemaObject](../xmlschemaobject/) από τη [XmlSchemaObjectCollection](./). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ορίστε το n'th όρισμα προτύπου ως αδύναμο δείκτη (αντί για κοινόχρηστο). Επιτρέπει την εναλλαγή δεικτών σε containers σε αδύναμη λειτουργία. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlSchemaObjectCollection](./). |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlSchemaObjectCollection](./) που δέχεται ένα [XmlSchemaObject](../xmlschemaobject/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
