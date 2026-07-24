---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion κλάση"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion κλάση. Αντιπροσωπεύει το στοιχείο union για απλούς τύπους από το XML Schema όπως ορίζεται από το World Wide Web Consortium (W3C). Ένα datatype union μπορεί να χρησιμοποιηθεί για να καθορίσει το περιεχόμενο ενός simpleType. Η τιμή του στοιχείου simpleType πρέπει να είναι οποιοδήποτε από ένα σύνολο εναλλακτικών datatypes που ορίζονται στην union. Οι τύποι union είναι πάντα παράγωγοι τύποι και πρέπει να περιλαμβάνουν τουλάχιστον δύο εναλλακτικά datatypes σε C++."
type: docs
weight: 6600
url: /el/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


Αντιπροσωπεύει το στοιχείο **union** για απλούς τύπους από το XML [Schema](../) όπως ορίζεται από το World Wide [Web](../../system.web/) Consortium (W3C). Ένα datatype **union** μπορεί να χρησιμοποιηθεί για να καθορίσει το περιεχόμενο ενός **simpleType**. Η τιμή του στοιχείου **simpleType** πρέπει να είναι οποιοδήποτε από ένα σύνολο εναλλακτικών datatypes που ορίζονται στην union. Οι τύποι union είναι πάντα παράγωγοι τύποι και πρέπει να περιλαμβάνουν τουλάχιστον δύο εναλλακτικά datatypes.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | Επιστρέφει έναν πίνακα από αντικείμενα [XmlSchemaSimpleType](../xmlschemasimpletype/) που αντιπροσωπεύουν τον τύπο του στοιχείου **simpleType** βάσει των τιμών [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) και [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) του απλού τύπου. |
| [get_BaseTypes](./get_basetypes/)() | Επιστρέφει τη συλλογή των βασικών τύπων. |
| [get_MemberTypes](./get_membertypes/)() | Επιστρέφει τον πίνακα των πλήρων ονομάτων μελών των ενσωματωμένων τύπων δεδομένων ή των στοιχείων **simpleType** που ορίζονται σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων). |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Ορίζει τον πίνακα των πλήρων ονομάτων μελών των ενσωματωμένων τύπων δεδομένων ή των στοιχείων **simpleType** που ορίζονται σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων). |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlSchemaSimpleTypeUnion](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
