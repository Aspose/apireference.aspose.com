---
title: "System::Xml::Schema::XmlSchemaObjectTable class"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaObjectTable class. Παρέχει τις συλλογές για τα περιεχόμενα στοιχεία στην κλάση XmlSchema (για παράδειγμα, Attributes, AttributeGroups, Elements κ.λπ.) στη C++."
type: docs
weight: 5300
url: /el/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


Παρέχει τις συλλογές για τα περιεχόμενα στοιχεία στην κλάση [XmlSchema](../xmlschema/) (για παράδειγμα, Attributes, AttributeGroups, Elements κ.λπ.).

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | Καθορίζει εάν το καθορισμένο πλήρες όνομα υπάρχει στη συλλογή. |
| [get_Count](./get_count/)() | Επιστρέφει τον αριθμό των στοιχείων που περιέχονται στο [XmlSchemaObjectTable](./). |
| [get_Names](./get_names/)() | Επιστρέφει μια συλλογή όλων των ονομασμένων στοιχείων στο [XmlSchemaObjectTable](./). |
| [get_Values](./get_values/)() | Επιστρέφει μια συλλογή όλων των τιμών για όλα τα στοιχεία στο [XmlSchemaObjectTable](./). |
| [GetEnumerator](./getenumerator/)() override | Επιστρέφει έναν απαριθμητή που μπορεί να διατρέξει το [XmlSchemaObjectTable](./). |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | Επιστρέφει το στοιχείο στο [XmlSchemaObjectTable](./) που καθορίζεται από το πλήρες όνομα. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
