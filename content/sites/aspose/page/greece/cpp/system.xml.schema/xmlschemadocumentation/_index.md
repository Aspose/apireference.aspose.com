---
title: "System::Xml::Schema::XmlSchemaDocumentation class"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaDocumentation class. Αντιπροσωπεύει το στοιχείο documentation από το XML Schema όπως ορίζεται από το World Wide Web Consortium (W3C). Αυτή η κλάση καθορίζει πληροφορίες που πρέπει να διαβαστούν ή να χρησιμοποιηθούν από ανθρώπους μέσα σε μια σημείωση σε C++."
type: docs
weight: 2500
url: /el/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


Αντιπροσωπεύει το **documentation** στοιχείο από το XML [Schema](../) όπως ορίζεται από το World Wide [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση καθορίζει πληροφορίες που πρέπει να διαβαστούν ή να χρησιμοποιηθούν από ανθρώπους μέσα σε ένα **annotation**.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Language](./get_language/)() | Επιστρέφει το χαρακτηριστικό **xml:lang**. Αυτό λειτουργεί ως ένδειξη της γλώσσας που χρησιμοποιείται στα περιεχόμενα. |
| [get_Markup](./get_markup/)() | Επιστρέφει έναν πίνακα αντικειμένων [XmlNode](../../system.xml/xmlnode/) που αντιπροσωπεύει τους παιδικούς κόμβους documentation. |
| [get_Source](./get_source/)() | Επιστρέφει την πηγή Uniform Resource Identifier (URI) των πληροφοριών. |
| [set_Language](./set_language/)(const String\&) | Ορίζει το χαρακτηριστικό **xml:lang**. Αυτό λειτουργεί ως ένδειξη της γλώσσας που χρησιμοποιείται στα περιεχόμενα. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Ορίζει έναν πίνακα αντικειμένων [XmlNode](../../system.xml/xmlnode/) που αντιπροσωπεύει τους παιδικούς κόμβους documentation. |
| [set_Source](./set_source/)(const String\&) | Ορίζει την πηγή Uniform Resource Identifier (URI) των πληροφοριών. |
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
