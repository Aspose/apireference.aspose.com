---
title: "System::Xml::Schema::XmlSchemaType κλάση"
linktitle: "XmlSchemaType"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaType κλάση. Η βασική κλάση για όλους τους απλούς τύπους και τους σύνθετους τύπους σε C++."
type: docs
weight: 6800
url: /el/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


Η βασική κλάση για όλους τους απλούς και σύνθετους τύπους.

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | Επιστρέφει τον τύπο αντικειμένου μετά τη μεταγλώττιση ή τον ενσωματωμένο τύπο δεδομένων XML [Schema](../) Definition Language (XSD), στοιχείο simpleType ή στοιχείο complexType. Αυτή είναι μια τιμή infoset μετά τη μεταγλώττιση του σχήματος. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | Επιστρέφει την τιμή μετά τη μεταγλώττιση για τον βασικό τύπο αυτού του τύπου σχήματος. |
| [get_Datatype](./get_datatype/)() | Επιστρέφει την τιμή μετά τη μεταγλώττιση για τον τύπο δεδομένων του σύνθετου τύπου. |
| [get_DerivedBy](./get_derivedby/)() | Επιστρέφει τις πληροφορίες μετά τη μεταγλώττιση σχετικά με το πώς αυτό το στοιχείο προήλθε από τον βασικό του τύπο. |
| [get_Final](./get_final/)() | Επιστρέφει το τελικό χαρακτηριστικό της παράγωγης τύπου που υποδεικνύει αν επιτρέπονται περαιτέρω παραγώγοι. |
| [get_FinalResolved](./get_finalresolved/)() | Επιστρέφει την ερμηνεία μετά τη μεταγλώττιση της τιμής [XmlSchemaType::get_Final](./get_final/). |
| virtual [get_IsMixed](./get_ismixed/)() | Επιστρέφει μια τιμή που υποδεικνύει αν αυτός ο τύπος έχει μοντέλο μεικτού περιεχομένου. Αυτή η κλήση είναι έγκυρη μόνο σε σύνθετο τύπο. |
| [get_Name](./get_name/)() | Επιστρέφει το όνομα του τύπου. |
| [get_QualifiedName](./get_qualifiedname/)() | Επιστρέφει το πλήρες όνομα για τον τύπο που δημιουργείται από το χαρακτηριστικό **Name** αυτού του τύπου. Αυτή είναι μια τιμή μετά τη μεταγλώττιση του σχήματος. |
| [get_TypeCode](./get_typecode/)() | Επιστρέφει το [XmlTypeCode](../xmltypecode/) του τύπου. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | Επιστρέφει ένα [XmlSchemaComplexType](../xmlschemacomplextype/) που αντιπροσωπεύει τον ενσωματωμένο σύνθετο τύπο του καθορισμένου σύνθετου τύπου. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | Επιστρέφει ένα [XmlSchemaComplexType](../xmlschemacomplextype/) που αντιπροσωπεύει τον ενσωματωμένο σύνθετο τύπο του σύνθετου τύπου που καθορίζεται με πλήρες όνομα. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | Επιστρέφει ένα [XmlSchemaSimpleType](../xmlschemasimpletype/) που αντιπροσωπεύει τον ενσωματωμένο απλό τύπο του απλού τύπου που καθορίζεται με πλήρες όνομα. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | Επιστρέφει ένα [XmlSchemaSimpleType](../xmlschemasimpletype/) που αντιπροσωπεύει τον ενσωματωμένο απλό τύπο του καθορισμένου απλού τύπου. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | Επιστρέφει μια τιμή που υποδεικνύει αν ο καθορισμένος παράγωγος τύπος σχήματος προέρχεται από τον καθορισμένο βασικό τύπο σχήματος. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Ορίζει το χαρακτηριστικό final της παραγώγησης τύπου που υποδεικνύει αν επιτρέπονται περαιτέρω παραγώγες. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν αυτός ο τύπος έχει μοντέλο μεικτού περιεχομένου. Αυτή η κλήση είναι έγκυρη μόνο σε σύνθετο τύπο. |
| [set_Name](./set_name/)(const String\&) | Ορίζει το όνομα του τύπου. |
| [XmlSchemaType](./xmlschematype/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaType](./). |
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
