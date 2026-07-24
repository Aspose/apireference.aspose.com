---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension κλάση"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension κλάση. Αντιπροσωπεύει το στοιχείο επέκτασης για απλό περιεχόμενο από το XML Schema όπως καθορίζεται από το World Wide Web Consortium (W3C). Αυτή η κλάση μπορεί να χρησιμοποιηθεί για την παραγωγή απλών τύπων μέσω επέκτασης. Τέτοιες παραγωγές χρησιμοποιούνται για την επέκταση του περιεχομένου του απλού τύπου του στοιχείου προσθέτοντας ιδιότητες σε C++."
type: docs
weight: 6000
url: /el/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


Αντιπροσωπεύει το στοιχείο **extension** για απλό περιεχόμενο από το XML [Schema](../) όπως καθορίζεται από το World Wide [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση μπορεί να χρησιμοποιηθεί για την παραγωγή απλών τύπων μέσω επέκτασης. Τέτοιες παραγωγές χρησιμοποιούνται για την επέκταση του περιεχομένου του απλού τύπου του στοιχείου προσθέτοντας ιδιότητες.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Επιστρέφει το [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) που θα χρησιμοποιηθεί για την τιμή της ιδιότητας. |
| [get_Attributes](./get_attributes/)() | Επιστρέφει τη συλλογή των [XmlSchemaAttribute](../xmlschemaattribute/) και [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Επιστρέφει το όνομα ενός ενσωματωμένου τύπου δεδομένων ή απλού τύπου από τον οποίο επεκτείνεται αυτός ο τύπος. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Ορίζει το [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) που θα χρησιμοποιηθεί για την τιμή της ιδιότητας. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα ενός ενσωματωμένου τύπου δεδομένων ή απλού τύπου από τον οποίο επεκτείνεται αυτός ο τύπος. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaSimpleContentExtension](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
