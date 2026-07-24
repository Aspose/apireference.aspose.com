---
title: "Κλάση System::Xml::Schema::XmlSchemaSimpleType"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::Schema::XmlSchemaSimpleType. Αντιπροσωπεύει το στοιχείο simpleType για απλό περιεχόμενο από το XML Schema όπως ορίζεται από το Παγκόσμιο Συμβούλιο Ιστού (W3C). Αυτή η κλάση ορίζει έναν απλό τύπο. Οι απλοί τύποι μπορούν να καθορίζουν πληροφορίες και περιορισμούς για την τιμή των χαρακτηριστικών ή των στοιχείων με περιεχόμενο μόνο κειμένου σε C++."
type: docs
weight: 6200
url: /el/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


Αντιπροσωπεύει το στοιχείο **simpleType** για απλό περιεχόμενο από το XML [Schema](../) όπως ορίζεται από το Παγκόσμιο [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση ορίζει έναν απλό τύπο. Οι απλοί τύποι μπορούν να καθορίζουν πληροφορίες και περιορισμούς για την τιμή των χαρακτηριστικών ή των στοιχείων με περιεχόμενο μόνο κειμένου.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Content](./get_content/)() | Επιστρέφει ένα από τα [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), ή [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | Ορίζει ένα από τα [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), ή [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlSchemaSimpleType](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
