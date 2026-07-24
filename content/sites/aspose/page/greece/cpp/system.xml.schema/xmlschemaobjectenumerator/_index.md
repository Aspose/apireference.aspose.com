---
title: "System::Xml::Schema::XmlSchemaObjectEnumerator κλάση"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaObjectEnumerator κλάση. Αντιπροσωπεύει τον απαριθμητή για το XmlSchemaObjectCollection σε C++."
type: docs
weight: 5200
url: /el/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


Αντιπροσωπεύει τον απαριθμητή για τη [XmlSchemaObjectCollection](../xmlschemaobjectcollection/).

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Κλωνοποιεί τον τρέχοντα επαναλήπτη. |
| [Dispose](./dispose/)() override | Δεν κάνει τίποτα. |
| [get_Current](./get_current/)() const override | Επιστρέφει το τρέχον [XmlSchemaObject](../xmlschemaobject/) στη συλλογή. |
| [MoveNext](./movenext/)() override | Μεταβαίνει στο επόμενο στοιχείο στη συλλογή. |
| [Reset](./reset/)() override | Επαναφέρει τον απαριθμητή στην αρχή της συλλογής. |
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
