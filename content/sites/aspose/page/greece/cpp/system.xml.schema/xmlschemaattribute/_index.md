---
title: "System::Xml::Schema::XmlSchemaAttribute class"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaAttribute class. Αναπαριστά το στοιχείο attribute από το XML Schema όπως ορίζεται από το Παγκόσμιο Ιστό Συμβούλιο (W3C). Τα χαρακτηριστικά παρέχουν πρόσθετες πληροφορίες για άλλα στοιχεία του εγγράφου. Η ετικέτα attribute είναι ενσωματωμένη μεταξύ των ετικετών ενός στοιχείου του εγγράφου για το σχήμα. Το έγγραφο XML εμφανίζει τα χαρακτηριστικά ως ονομασμένα στοιχεία στην ετικέτα έναρξης ενός στοιχείου σε C++."
type: docs
weight: 1100
url: /el/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


Αναπαριστά το **attribute** στοιχείο από το XML [Schema](../) όπως ορίζεται από το Παγκόσμιο [Web](../../system.web/) Συμβούλιο (W3C). Τα χαρακτηριστικά παρέχουν πρόσθετες πληροφορίες για άλλα στοιχεία του εγγράφου. Η ετικέτα attribute είναι ενσωματωμένη μεταξύ των ετικετών ενός στοιχείου του εγγράφου για το σχήμα. Το έγγραφο XML εμφανίζει τα χαρακτηριστικά ως ονομασμένα στοιχεία στην ετικέτα έναρξης ενός στοιχείου.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | Επιστρέφει ένα αντικείμενο [XmlSchemaSimpleType](../xmlschemasimpletype/) που αντιπροσωπεύει τον τύπο του χαρακτηριστικού βάσει της τιμής [XmlSchemaAttribute::get_SchemaType](./get_schematype/) ή [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) του χαρακτηριστικού. |
| [get_AttributeType](./get_attributetype/)() | Επιστρέφει το αντικείμενο βάσει της τιμής [XmlSchemaAttribute::get_SchemaType](./get_schematype/) ή [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) του χαρακτηριστικού που περιέχει την μετά-μεταγλώττιση ερμηνεία της τιμής **AttributeType**. |
| [get_DefaultValue](./get_defaultvalue/)() | Επιστρέφει την προεπιλεγμένη τιμή για το χαρακτηριστικό. |
| [get_FixedValue](./get_fixedvalue/)() | Επιστρέφει τη σταθερή τιμή για το χαρακτηριστικό. |
| [get_Form](./get_form/)() | Επιστρέφει τη μορφή για το χαρακτηριστικό. |
| [get_Name](./get_name/)() | Επιστρέφει το όνομα του χαρακτηριστικού. |
| [get_QualifiedName](./get_qualifiedname/)() | Επιστρέφει το πλήρες όνομα για το χαρακτηριστικό. |
| [get_RefName](./get_refname/)() | Επιστρέφει το όνομα ενός χαρακτηριστικού που δηλώθηκε σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων). |
| [get_SchemaType](./get_schematype/)() | Επιστρέφει τον τύπο του χαρακτηριστικού σε έναν απλό τύπο. |
| [get_SchemaTypeName](./get_schematypename/)() | Επιστρέφει το όνομα του απλού τύπου που ορίζεται σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από το καθορισμένο χώρο ονομάτων). |
| [get_Use](./get_use/)() | Επιστρέφει πληροφορίες σχετικά με το πώς χρησιμοποιείται το χαρακτηριστικό. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Ορίζει την προεπιλεγμένη τιμή για το χαρακτηριστικό. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Ορίζει τη σταθερή τιμή για το χαρακτηριστικό. |
| [set_Form](./set_form/)(XmlSchemaForm) | Ορίζει τη μορφή για το χαρακτηριστικό. |
| [set_Name](./set_name/)(const String\&) | Ορίζει το όνομα του χαρακτηριστικού. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα ενός χαρακτηριστικού που δηλώνεται σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από το καθορισμένο χώρο ονομάτων). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Ορίζει τον τύπο του χαρακτηριστικού σε έναν απλό τύπο. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα του απλού τύπου που ορίζεται σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από το καθορισμένο χώρο ονομάτων). |
| [set_Use](./set_use/)(XmlSchemaUse) | Ορίζει πληροφορίες σχετικά με το πώς χρησιμοποιείται το χαρακτηριστικό. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaAttribute](./). |
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
