---
title: "System::Xml::Schema::XmlSchemaAttributeGroup κλάση"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroup κλάση. Αντιπροσωπεύει το στοιχείο attributeGroup από το XML Schema όπως καθορίζεται από το World Wide Web Consortium (W3C). Το AttributesGroups παρέχει έναν μηχανισμό για ομαδοποίηση ενός συνόλου δηλώσεων attribute ώστε να μπορούν να ενσωματωθούν ως ομάδα σε ορισμούς σύνθετων τύπων σε C++."
type: docs
weight: 1200
url: /el/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


Αντιπροσωπεύει το στοιχείο **attributeGroup** από το XML [Schema](../) όπως καθορίζεται από το Παγκόσμιο Συμβούλιο [Web](../../system.web/) (W3C). Το AttributesGroups παρέχει έναν μηχανισμό για ομαδοποίηση ενός συνόλου δηλώσεων χαρακτηριστικών ώστε να μπορούν να ενσωματωθούν ως ομάδα σε ορισμούς σύνθετων τύπων.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Επιστρέφει το στοιχείο [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) της ομάδας χαρακτηριστικών. |
| [get_Attributes](./get_attributes/)() | Επιστρέφει τη συλλογή των χαρακτηριστικών για την ομάδα χαρακτηριστικών. Περιέχει τα στοιχεία [XmlSchemaAttribute](../xmlschemaattribute/) και [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_Name](./get_name/)() | Επιστρέφει το όνομα της ομάδας χαρακτηριστικών. |
| [get_QualifiedName](./get_qualifiedname/)() | Επιστρέφει το πλήρες όνομα της ομάδας χαρακτηριστικών. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | Επιστρέφει την ιδιότητα επαναπροσδιορισμένης ομάδας χαρακτηριστικών από το XML [Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Ορίζει το στοιχείο [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) της ομάδας χαρακτηριστικών. |
| [set_Name](./set_name/)(const String\&) | Ορίζει το όνομα της ομάδας χαρακτηριστικών. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | Αρχικοποιεί ένα νέο παράδειγμα της κλάσης [XmlSchemaAttributeGroup](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
