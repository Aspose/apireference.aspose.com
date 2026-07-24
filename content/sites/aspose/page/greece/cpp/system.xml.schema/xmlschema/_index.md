---
title: "System::Xml::Schema::XmlSchema κλάση"
linktitle: "XmlSchema"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchema κλάση. Μία αναπαράσταση στη μνήμη ενός XML Schema, όπως ορίζεται από το World Wide Web Consortium (W3C) και σε C++."
type: docs
weight: 400
url: /el/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


Μία αναπαράσταση στη μνήμη ενός XML [Schema](../), όπως ορίζεται από το World Wide [Web](../../system.web/) Consortium (W3C) [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) και [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/).

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | Συγκεντρώνει το XML [Schema](../)[Object](../../system/object/) Model (SOM) σε πληροφορίες σχήματος για επικύρωση. Χρησιμοποιείται για τον έλεγχο της συντακτικής και σημασιολογικής δομής του προγραμματιστικά δημιουργημένου SOM. Ο έλεγχος σημασιολογικής επικύρωσης εκτελείται κατά τη μεταγλώττιση. |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | Συγκεντρώνει το XML [Schema](../)[Object](../../system/object/) Model (SOM) σε πληροφορίες σχήματος για επικύρωση. Χρησιμοποιείται για τον έλεγχο της συντακτικής και σημασιολογικής δομής του προγραμματιστικά δημιουργημένου SOM. Ο έλεγχος σημασιολογικής επικύρωσης εκτελείται κατά τη μεταγλώττιση. |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | Επιστρέφει τη μορφή για τα χαρακτηριστικά που δηλώνονται στο target namespace του σχήματος. |
| [get_AttributeGroups](./get_attributegroups/)() | Επιστρέφει την τιμή μετά τη μεταγλώττιση του σχήματος για όλες τις παγκόσμιες ομάδες χαρακτηριστικών στο σχήμα. |
| [get_Attributes](./get_attributes/)() | Επιστρέφει την τιμή μετά τη μεταγλώττιση του σχήματος για όλα τα χαρακτηριστικά στο σχήμα. |
| [get_BlockDefault](./get_blockdefault/)() | Επιστρέφει το χαρακτηριστικό **blockDefault** που ορίζει την προεπιλεγμένη τιμή του χαρακτηριστικού **block** σε στοιχεία και σύνθετους τύπους στο **targetNamespace** του σχήματος. |
| [get_ElementFormDefault](./get_elementformdefault/)() | Επιστρέφει τη μορφή για τα στοιχεία που δηλώνονται στο target namespace του σχήματος. |
| [get_Elements](./get_elements/)() | Επιστρέφει την τιμή μετά τη μεταγλώττιση του σχήματος για όλα τα στοιχεία στο σχήμα. |
| [get_FinalDefault](./get_finaldefault/)() | Επιστρέφει το χαρακτηριστικό **finalDefault** που ορίζει την προεπιλεγμένη τιμή του χαρακτηριστικού **final** σε στοιχεία και σύνθετους τύπους στο target namespace του σχήματος. |
| [get_Groups](./get_groups/)() | Επιστρέφει την τιμή μετά τη μεταγλώττιση του σχήματος για όλες τις ομάδες στο σχήμα. |
| [get_Id](./get_id/)() | Επιστρέφει το αναγνωριστικό συμβολοσειράς. |
| [get_Includes](./get_includes/)() | Επιστρέφει τη συλλογή των περιλαμβανόμενων και εισαγόμενων σχημάτων. |
| [get_IsCompiled](./get_iscompiled/)() | Δείχνει αν το σχήμα έχει μεταγλωττιστεί. |
| [get_Items](./get_items/)() | Επιστρέφει τη συλλογή των στοιχείων σχήματος στο σχήμα και χρησιμοποιείται για την προσθήκη νέων τύπων στοιχείων στο επίπεδο του στοιχείου **schema**. |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | Επιστρέφει τον αριθμό γραμμής στο αρχείο στο οποίο αναφέρεται το στοιχείο **schema**. |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | Επιστρέφει τη θέση γραμμής στο αρχείο στο οποίο αναφέρεται το στοιχείο **schema**. |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | Επιστρέφει τα XmlSerializerNamespaces που θα χρησιμοποιηθούν με αυτό το αντικείμενο σχήματος. |
| [get_Notations](./get_notations/)() | Επιστρέφει την τιμή μετά τη μεταγλώττιση του σχήματος για όλες τις σημειώσεις στο σχήμα. |
| [get_Parent](../xmlschemaobject/get_parent/)() | Επιστρέφει τον γονέα αυτού του [XmlSchemaObject](../xmlschemaobject/). |
| [get_SchemaTypes](./get_schematypes/)() | Επιστρέφει την τιμή μετά τη μεταγλώττιση του σχήματος για όλους τους τύπους σχήματος στο σχήμα. |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | Επιστρέφει τη θέση προέλευσης του αρχείου που φόρτωσε το σχήμα. |
| [get_TargetNamespace](./get_targetnamespace/)() | Επιστρέφει το Uniform Resource Identifier (URI) του χώρου ονομάτων προορισμού του σχήματος. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Επιστρέφει τα προσδιορισμένα χαρακτηριστικά που δεν ανήκουν στον χώρο ονομάτων προορισμού του σχήματος. |
| [get_Version](./get_version/)() | Επιστρέφει την έκδοση του σχήματος. |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | Διαβάζει ένα XML [Schema](../) από τον παρεχόμενο [IO::TextReader](../../system.io/textreader/). |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | Διαβάζει ένα XML [Schema](../) από το παρεχόμενο stream. |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | Διαβάζει ένα XML [Schema](../) από τον παρεχόμενο [XmlReader](../../system.xml/xmlreader/). |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | Ορίζει τη μορφή για τα χαρακτηριστικά που δηλώνονται στον χώρο ονομάτων προορισμού του σχήματος. |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | Ορίζει το χαρακτηριστικό **blockDefault** που ορίζει την προεπιλεγμένη τιμή του χαρακτηριστικού **block** σε στοιχεία και σύνθετους τύπους στον **targetNamespace** του σχήματος. |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | Ορίζει τη μορφή για τα στοιχεία που δηλώνονται στον χώρο ονομάτων προορισμού του σχήματος. |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | Ορίζει το χαρακτηριστικό **finalDefault** που ορίζει την προεπιλεγμένη τιμή του χαρακτηριστικού **final** σε στοιχεία και σύνθετους τύπους στον χώρο ονομάτων προορισμού του σχήματος. |
| [set_Id](./set_id/)(const String\&) | Ορίζει το αναγνωριστικό συμβολοσειράς. |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | Ορίζει τον αριθμό γραμμής στο αρχείο στο οποίο αναφέρεται το στοιχείο **schema**. |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | Ορίζει τη θέση γραμμής στο αρχείο στο οποίο αναφέρεται το στοιχείο **schema**. |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Ορίζει το XmlSerializerNamespaces που θα χρησιμοποιηθεί με αυτό το αντικείμενο σχήματος. |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Ορίζει το γονικό στοιχείο του [XmlSchemaObject](../xmlschemaobject/). |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | Ορίζει τη θέση προέλευσης για το αρχείο που φόρτωσε το σχήμα. |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | Ορίζει το Uniform Resource Identifier (URI) του χώρου ονομάτων-στόχου του σχήματος. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Ορίζει τα προσδιορισμένα χαρακτηριστικά που δεν ανήκουν στον χώρο ονομάτων-στόχο του σχήματος. |
| [set_Version](./set_version/)(const String\&) | Ορίζει την έκδοση του σχήματος. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | Γράφει το XML [Schema](../) στο παρεχόμενο ρεύμα δεδομένων. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Γράφει το XML [Schema](../) στο παρεχόμενο ρεύμα χρησιμοποιώντας το καθορισμένο [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/). |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | Γράφει το XML [Schema](../) στον παρεχόμενο [IO::TextWriter](../../system.io/textwriter/). |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Γράφει το XML [Schema](../) στον παρεχόμενο TextWriter. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | Γράφει το XML [Schema](../) στον παρεχόμενο [XmlWriter](../../system.xml/xmlwriter/). |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Γράφει το XML [Schema](../) στον παρεχόμενο [XmlWriter](../../system.xml/xmlwriter/). |
| [XmlSchema](./xmlschema/)() | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlSchema](./). |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlSchemaObject](../xmlschemaobject/). |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | Ο χώρος ονομάτων στιγμιοτύπου XML schema. Αυτό το πεδίο είναι σταθερό. |
| static [Namespace](./namespace/) | Ο χώρος ονομάτων XML schema. Αυτό το πεδίο είναι σταθερό. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
