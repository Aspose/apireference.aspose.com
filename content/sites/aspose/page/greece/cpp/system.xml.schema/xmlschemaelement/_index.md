---
title: "System::Xml::Schema::XmlSchemaElement κλάση"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaElement κλάση. Αναπαριστά το **element** στοιχείο από το XML Schema όπως ορίζεται από το Παγκόσμιο Ιστό Συνεταιρισμό (W3C). Αυτή η κλάση είναι η βασική κλάση για όλους τους τύπους σωματιδίων και χρησιμοποιείται για την περιγραφή ενός στοιχείου σε ένα XML έγγραφο σε C++."
type: docs
weight: 2600
url: /el/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


Αναπαριστά το **element** στοιχείο από το XML [Schema](../) όπως ορίζεται από το Παγκόσμιο [Web](../../system.web/) Συνεταιρισμό (W3C). Αυτή η κλάση είναι η βασική κλάση για όλους τους τύπους σωματιδίων και χρησιμοποιείται για την περιγραφή ενός στοιχείου σε ένα XML έγγραφο.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Block](./get_block/)() | Επιστρέφει μια **Block** παράγωγο. |
| [get_BlockResolved](./get_blockresolved/)() | Επιστρέφει την ερμηνεία μετά τη μεταγλώττιση της τιμής **Block**. |
| [get_Constraints](./get_constraints/)() | Επιστρέφει τη συλλογή των περιορισμών στο στοιχείο. |
| [get_DefaultValue](./get_defaultvalue/)() | Επιστρέφει την προεπιλεγμένη τιμή του στοιχείου εάν το περιεχόμενό του είναι απλός τύπος ή το περιεχόμενο του στοιχείου είναι **textOnly**. |
| [get_ElementSchemaType](./get_elementschematype/)() | Επιστρέφει ένα αντικείμενο [XmlSchemaType](../xmlschematype/) που αντιπροσωπεύει τον τύπο του στοιχείου βάσει των τιμών [XmlSchemaElement::get_SchemaType](./get_schematype/) ή [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) του στοιχείου. |
| [get_ElementType](./get_elementtype/)() | Επιστρέφει ένα αντικείμενο βασισμένο στο [XmlSchemaElement](./) ή [XmlSchemaElement](./) του στοιχείου, το οποίο περιέχει την ερμηνεία μετά τη μεταγλώττιση της τιμής **ElementType**. |
| [get_Final](./get_final/)() | Επιστρέφει την τιμή **Final** για να υποδείξει ότι δεν επιτρέπονται περαιτέρω παράγωγοι. |
| [get_FinalResolved](./get_finalresolved/)() | Επιστρέφει την ερμηνεία μετά τη μεταγλώττιση της τιμής **Final**. |
| [get_FixedValue](./get_fixedvalue/)() | Επιστρέφει τη σταθερή τιμή. |
| [get_Form](./get_form/)() | Επιστρέφει τη μορφή για το στοιχείο. |
| [get_IsAbstract](./get_isabstract/)() | Επιστρέφει πληροφορίες για να υποδείξει εάν το στοιχείο μπορεί να χρησιμοποιηθεί σε ένα έγγραφο στιγμιοτύπου. |
| [get_IsNillable](./get_isnillable/)() | Επιστρέφει πληροφορίες που υποδεικνύουν εάν το **xsi:nil** μπορεί να εμφανιστεί στα δεδομένα στιγμιοτύπου. Υποδεικνύει εάν μια ρητή τιμή nil μπορεί να εκχωρηθεί στο στοιχείο. |
| [get_Name](./get_name/)() | Επιστρέφει το όνομα του στοιχείου. |
| [get_QualifiedName](./get_qualifiedname/)() | Επιστρέφει το πραγματικό πλήρες όνομα για το δοσμένο στοιχείο. |
| [get_RefName](./get_refname/)() | Επιστρέφει το όνομα αναφοράς ενός στοιχείου που δηλώθηκε σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων). |
| [get_SchemaType](./get_schematype/)() | Επιστρέφει τον τύπο του στοιχείου. Αυτό μπορεί να είναι είτε σύνθετος τύπος είτε απλός τύπος. |
| [get_SchemaTypeName](./get_schematypename/)() | Επιστρέφει το όνομα ενός ενσωματωμένου τύπου δεδομένων που ορίζεται σε αυτό το σχήμα ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | Επιστρέφει το όνομα ενός στοιχείου που αντικαθίσταται από αυτό το στοιχείο. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Ορίζει μια **Block** παράγωγη. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Ορίζει την προεπιλεγμένη τιμή του στοιχείου εάν το περιεχόμενό του είναι απλός τύπος ή το περιεχόμενο του στοιχείου είναι **textOnly**. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Ορίζει την τιμή **Final** για να υποδείξει ότι δεν επιτρέπονται περαιτέρω παραγώγοι. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Ορίζει τη σταθερή τιμή. |
| [set_Form](./set_form/)(XmlSchemaForm) | Ορίζει τη μορφή του στοιχείου. |
| [set_IsAbstract](./set_isabstract/)(bool) | Ορίζει πληροφορίες για να υποδείξει αν το στοιχείο μπορεί να χρησιμοποιηθεί σε ένα έγγραφο στιγμιοτύπου. |
| [set_IsNillable](./set_isnillable/)(bool) | Ορίζει πληροφορίες που υποδεικνύουν αν το **xsi:nil** μπορεί να εμφανιστεί στα δεδομένα στιγμιοτύπου. Υποδεικνύει αν μπορεί να εκχωρηθεί μια ρητή τιμή nil στο στοιχείο. |
| [set_Name](./set_name/)(const String\&) | Ορίζει το όνομα του στοιχείου. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα αναφοράς ενός στοιχείου που δηλώνεται σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Ορίζει τον τύπο του στοιχείου. Αυτό μπορεί να είναι είτε σύνθετος τύπος είτε απλός τύπος. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα ενός ενσωματωμένου τύπου δεδομένων που ορίζεται σε αυτό το σχήμα ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα ενός στοιχείου που αντικαθίσταται από αυτό το στοιχείο. |
| [XmlSchemaElement](./xmlschemaelement/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaElement](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
