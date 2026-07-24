---
title: "System::Xml::Schema::XmlSchemaIdentityConstraint class"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint class. Κλάση για τους περιορισμούς ταυτότητας: key, keyref και unique στοιχεία σε C++."
type: docs
weight: 3400
url: /el/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


Κλάση για τους περιορισμούς ταυτότητας: τα στοιχεία **key**, **keyref**, και **unique**.

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Fields](./get_fields/)() | Επιστρέφει τη συλλογή των πεδίων που εφαρμόζονται ως παιδιά για την έκφραση [XPath](../../system.xml.xpath/) selector. |
| [get_Name](./get_name/)() | Επιστρέφει το όνομα του περιορισμού ταυτότητας. |
| [get_QualifiedName](./get_qualifiedname/)() | Επιστρέφει το πλήρες όνομα του περιορισμού ταυτότητας, το οποίο περιέχει την μετά-μεταγλώττιση ερμηνεία της τιμής **QualifiedName**. |
| [get_Selector](./get_selector/)() | Επιστρέφει το στοιχείο **selector** της έκφρασης [XPath](../../system.xml.xpath/). |
| [set_Name](./set_name/)(const String\&) | Ορίζει το όνομα του περιορισμού ταυτότητας. |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | Ορίζει το στοιχείο **selector** της έκφρασης [XPath](../../system.xml.xpath/). |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | Αρχικοποιεί ένα νέο παράδειγμα της κλάσης [XmlSchemaIdentityConstraint](./). |
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
