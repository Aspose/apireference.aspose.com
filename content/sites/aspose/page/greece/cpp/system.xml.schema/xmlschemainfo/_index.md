---
title: "System::Xml::Schema::XmlSchemaInfo κλάση"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaInfo κλάση. Αντιπροσωπεύει το post-schema-validation infoset ενός επικυρωμένου κόμβου XML στη C++."
type: docs
weight: 3800
url: /el/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


Αντιπροσωπεύει το post-schema-validation infoset ενός επικυρωμένου κόμβου XML.

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | Επιστρέφει το αντικείμενο [XmlSchemaContentType](../xmlschemacontenttype/) που αντιστοιχεί στον τύπο περιεχομένου αυτού του επικυρωμένου κόμβου XML. |
| [get_IsDefault](./get_isdefault/)() override | Επιστρέφει μια τιμή που υποδεικνύει αν αυτός ο επικυρωμένος κόμβος XML ορίστηκε ως αποτέλεσμα μιας προεπιλογής που εφαρμόστηκε κατά τη διάρκεια της επικύρωσης σχήματος XML [Schema](../) Definition Language (XSD). |
| [get_IsNil](./get_isnil/)() override | Επιστρέφει μια τιμή που υποδεικνύει αν η τιμή για αυτόν τον επικυρωμένο κόμβο XML είναι **nil**. |
| [get_MemberType](./get_membertype/)() override | Επιστρέφει τον δυναμικό τύπο σχήματος για αυτόν τον επικυρωμένο κόμβο XML. |
| [get_SchemaAttribute](./get_schemaattribute/)() override | Επιστρέφει το μεταγλωττισμένο αντικείμενο [XmlSchemaAttribute](../xmlschemaattribute/) που αντιστοιχεί σε αυτόν τον επικυρωμένο κόμβο XML. |
| [get_SchemaElement](./get_schemaelement/)() override | Επιστρέφει το μεταγλωττισμένο αντικείμενο [XmlSchemaElement](../xmlschemaelement/) που αντιστοιχεί σε αυτόν τον επικυρωμένο κόμβο XML. |
| [get_SchemaType](./get_schematype/)() override | Επιστρέφει τον στατικό τύπο σχήματος XML [Schema](../) Definition Language (XSD) για αυτόν τον επικυρωμένο κόμβο XML. |
| [get_Validity](./get_validity/)() override | Επιστρέφει την τιμή [XmlSchemaValidity](../xmlschemavalidity/) αυτού του επικυρωμένου κόμβου XML. |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | Ορίζει το αντικείμενο [XmlSchemaContentType](../xmlschemacontenttype/) που αντιστοιχεί στον τύπο περιεχομένου αυτού του επικυρωμένου κόμβου XML. |
| [set_IsDefault](./set_isdefault/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν αυτός ο επικυρωμένος κόμβος XML ορίστηκε ως αποτέλεσμα μιας προεπιλογής που εφαρμόστηκε κατά τη διάρκεια της επικύρωσης σχήματος XML [Schema](../) Definition Language (XSD). |
| [set_IsNil](./set_isnil/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν η τιμή για αυτόν τον επικυρωμένο κόμβο XML είναι **nil**. |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Ορίζει τον δυναμικό τύπο σχήματος για αυτόν τον επικυρωμένο κόμβο XML. |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | Ορίζει το μεταγλωττισμένο αντικείμενο [XmlSchemaAttribute](../xmlschemaattribute/) που αντιστοιχεί σε αυτόν τον επικυρωμένο κόμβο XML. |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | Ορίζει το μεταγλωττισμένο αντικείμενο [XmlSchemaElement](../xmlschemaelement/) που αντιστοιχεί σε αυτόν τον επικυρωμένο κόμβο XML. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Ορίζει τον στατικό τύπο σχήματος XML [Schema](../) Definition Language (XSD) για αυτόν τον επικυρωμένο κόμβο XML. |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | Ορίζει την τιμή [XmlSchemaValidity](../xmlschemavalidity/) αυτού του επικυρωμένου κόμβου XML. |
| [XmlSchemaInfo](./xmlschemainfo/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaInfo](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
