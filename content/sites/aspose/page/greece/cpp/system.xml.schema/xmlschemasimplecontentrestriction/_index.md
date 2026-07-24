---
title: "Κλάση System::Xml::Schema::XmlSchemaSimpleContentRestriction"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::Schema::XmlSchemaSimpleContentRestriction. Αντιπροσωπεύει το στοιχείο περιορισμού για απλό περιεχόμενο από το XML Schema όπως ορίζεται από το Παγκόσμιο Συμβούλιο Ιστού (W3C). Αυτή η κλάση μπορεί να χρησιμοποιηθεί για την παραγωγή απλών τύπων μέσω περιορισμού. Τέτοιες παραγώγοι μπορούν να χρησιμοποιηθούν για τον περιορισμό του εύρους τιμών του στοιχείου σε ένα υποσύνολο των τιμών που ορίζονται στον κληρονομημένο απλό τύπο σε C++."
type: docs
weight: 6100
url: /el/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


Αντιπροσωπεύει το στοιχείο **restriction** για απλό περιεχόμενο από το XML [Schema](../) όπως ορίζεται από το Παγκόσμιο [Web](../../system.web/) Συμβούλιο (W3C). Αυτή η κλάση μπορεί να χρησιμοποιηθεί για την παραγωγή απλών τύπων μέσω περιορισμού. Τέτοιες παραγώγοι μπορούν να χρησιμοποιηθούν για τον περιορισμό του εύρους τιμών του στοιχείου σε ένα υποσύνολο των τιμών που ορίζονται στον κληρονομημένο απλό τύπο.

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Επιστρέφει ένα [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) που θα χρησιμοποιηθεί για την τιμή του χαρακτηριστικού. |
| [get_Attributes](./get_attributes/)() | Επιστρέφει τη συλλογή των [XmlSchemaAttribute](../xmlschemaattribute/) και [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) χαρακτηριστικών για τον απλό τύπο. |
| [get_BaseType](./get_basetype/)() | Επιστρέφει τη βασική τιμή του απλού τύπου. |
| [get_BaseTypeName](./get_basetypename/)() | Επιστρέφει το όνομα του ενσωματωμένου τύπου δεδομένων ή του απλού τύπου από τον οποίο προέρχεται αυτός ο τύπος. |
| [get_Facets](./get_facets/)() | Επιστρέφει ένα [Xml](../../system.xml/)[Schema](../) χαρακτηριστικό. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Ορίζει ένα [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) που θα χρησιμοποιηθεί για την τιμή του χαρακτηριστικού. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Ορίζει τη βασική τιμή του απλού τύπου. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα του ενσωματωμένου τύπου δεδομένων ή του απλού τύπου από τον οποίο προέρχεται αυτός ο τύπος. |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlSchemaSimpleContentRestriction](./). |
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
