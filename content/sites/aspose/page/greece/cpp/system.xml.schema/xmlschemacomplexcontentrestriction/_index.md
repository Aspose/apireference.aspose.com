---
title: "System::Xml::Schema::XmlSchemaComplexContentRestriction κλάση"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaComplexContentRestriction κλάση. Αντιπροσωπεύει το στοιχείο restriction από το XML Schema όπως καθορίζεται από το Παγκόσμιο Συμβούλιο Ιστού (W3C). Αυτή η κλάση προορίζεται για σύνθετους τύπους με μοντέλο σύνθετου περιεχομένου που προέρχεται από περιορισμό. Περιορίζει το περιεχόμενο του σύνθετου τύπου σε ένα υποσύνολο του κληρονομημένου σύνθετου τύπου σε C++."
type: docs
weight: 2000
url: /el/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


Αντιπροσωπεύει το στοιχείο **restriction** από το XML [Schema](../) όπως καθορίζεται από το Παγκόσμιο [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση προορίζεται για σύνθετους τύπους με μοντέλο σύνθετου περιεχομένου που προέρχεται από περιορισμό. Περιορίζει το περιεχόμενο του σύνθετου τύπου σε ένα υποσύνολο του κληρονομημένου σύνθετου τύπου.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Επιστρέφει το στοιχείο [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) του μοντέλου σύνθετου περιεχομένου. |
| [get_Attributes](./get_attributes/)() | Επιστρέφει τη συλλογή των χαρακτηριστικών για τον σύνθετο τύπο. Περιέχει τα στοιχεία [XmlSchemaAttribute](../xmlschemaattribute/) και [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Επιστρέφει το όνομα ενός σύνθετου τύπου από τον οποίο αυτός ο τύπος προέρχεται μέσω περιορισμού. |
| [get_Particle](./get_particle/)() | Επιστρέφει μία από τις κλάσεις [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), ή [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Ορίζει το στοιχείο [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) του μοντέλου σύνθετου περιεχομένου. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα ενός σύνθετου τύπου από τον οποίο αυτός ο τύπος προέρχεται μέσω περιορισμού. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Ορίζει μία από τις κλάσεις [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), ή [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaComplexContentRestriction](./). |
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
