---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension κλάση"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension κλάση. Αντιπροσωπεύει το στοιχείο extension από το XML Schema όπως καθορίζεται από το Παγκόσμιο Ιστού Consortium (W3C). Αυτή η κλάση προορίζεται για σύνθετους τύπους με μοντέλο σύνθετου περιεχομένου που προέρχεται από επέκταση. Επεκτείνει τον σύνθετο τύπο προσθέτοντας χαρακτηριστικά ή στοιχεία σε C++."
type: docs
weight: 1900
url: /el/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


Αντιπροσωπεύει το στοιχείο **extension** από το XML [Schema](../) όπως καθορίζεται από το Παγκόσμιου Ιστού [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση προορίζεται για σύνθετους τύπους με μοντέλο σύνθετου περιεχομένου που προέρχεται από επέκταση. Επεκτείνει τον σύνθετο τύπο προσθέτοντας χαρακτηριστικά ή στοιχεία.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Επιστρέφει το στοιχείο [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) του μοντέλου σύνθετου περιεχομένου. |
| [get_Attributes](./get_attributes/)() | Επιστρέφει τη συλλογή των χαρακτηριστικών για το σύνθετο περιεχόμενο. Περιέχει τα στοιχεία [XmlSchemaAttribute](../xmlschemaattribute/) και [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Επιστρέφει το όνομα του σύνθετου τύπου από τον οποίο αυτός ο τύπος προέρχεται μέσω επέκτασης. |
| [get_Particle](./get_particle/)() | Επιστρέφει μία από τις κλάσεις [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), ή [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Ορίζει το στοιχείο [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) του μοντέλου σύνθετου περιεχομένου. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα του σύνθετου τύπου από τον οποίο αυτός ο τύπος προέρχεται μέσω επέκτασης. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Ορίζει μία από τις κλάσεις [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), ή [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlSchemaComplexContentExtension](./). |
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
