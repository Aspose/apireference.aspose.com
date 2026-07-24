---
title: "System::Xml::Schema::XmlSchemaCollectionEnumerator κλάση"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaCollectionEnumerator κλάση. Υποστηρίζει μια απλή επανάληψη πάνω σε μια συλλογή. Αυτή η κλάση δεν μπορεί να κληρονομηθεί σε C++."
type: docs
weight: 1600
url: /el/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


Υποστηρίζει μια απλή επανάληψη πάνω σε μια συλλογή. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Κλωνοποιεί τον τρέχοντα επαναλήπτη. |
| [Dispose](./dispose/)() override | Δεν κάνει τίποτα. |
| [get_Current](./get_current/)() const override | Επιστρέφει το τρέχον [XmlSchema](../xmlschema/) στη συλλογή. |
| [MoveNext](./movenext/)() override | Προχωρά τον απαριθμητή στο επόμενο σχήμα στη συλλογή. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
