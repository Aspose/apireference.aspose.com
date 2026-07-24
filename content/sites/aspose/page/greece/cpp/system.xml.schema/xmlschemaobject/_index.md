---
title: "System::Xml::Schema::XmlSchemaObject class"
linktitle: "XmlSchemaObject"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaObject class. Αναπαριστά την κεντρική κλάση για την ιεραρχία του μοντέλου αντικειμένων σχήματος Xml και λειτουργεί ως βασική κλάση για κλάσεις όπως η κλάση XmlSchema σε C++."
type: docs
weight: 5000
url: /el/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


Αναπαριστά την κεντρική κλάση για την ιεραρχία του μοντέλου αντικειμένων σχήματος [Xml](../../system.xml/) και λειτουργεί ως βασική κλάση για κλάσεις όπως η κλάση [XmlSchema](../xmlschema/).

```cpp
class XmlSchemaObject : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | Επιστρέφει τον αριθμό γραμμής στο αρχείο στο οποίο αναφέρεται το στοιχείο **schema**. |
| [get_LinePosition](./get_lineposition/)() | Επιστρέφει τη θέση γραμμής στο αρχείο στο οποίο αναφέρεται το στοιχείο **schema**. |
| [get_Namespaces](./get_namespaces/)() | Επιστρέφει τα XmlSerializerNamespaces που θα χρησιμοποιηθούν με αυτό το αντικείμενο σχήματος. |
| [get_Parent](./get_parent/)() | Επιστρέφει τον γονέα αυτού του [XmlSchemaObject](./). |
| [get_SourceUri](./get_sourceuri/)() | Επιστρέφει τη θέση προέλευσης του αρχείου που φόρτωσε το σχήμα. |
| [set_LineNumber](./set_linenumber/)(int32_t) | Ορίζει τον αριθμό γραμμής στο αρχείο στο οποίο αναφέρεται το στοιχείο **schema**. |
| [set_LinePosition](./set_lineposition/)(int32_t) | Ορίζει τη θέση γραμμής στο αρχείο στο οποίο αναφέρεται το στοιχείο **schema**. |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Ορίζει το XmlSerializerNamespaces που θα χρησιμοποιηθεί με αυτό το αντικείμενο σχήματος. |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Ορίζει τον γονέα αυτού του [XmlSchemaObject](./). |
| [set_SourceUri](./set_sourceuri/)(const String\&) | Ορίζει τη θέση προέλευσης για το αρχείο που φόρτωσε το σχήμα. |
| [XmlSchemaObject](./xmlschemaobject/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaObject](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
