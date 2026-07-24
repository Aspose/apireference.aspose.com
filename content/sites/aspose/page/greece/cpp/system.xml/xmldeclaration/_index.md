---
title: "Κλάση System::Xml::XmlDeclaration"
linktitle: "XmlDeclaration"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::XmlDeclaration. Αντιπροσωπεύει τον κόμβο δήλωσης XML <?xml version=''1.0''...?> σε C++."
type: docs
weight: 1300
url: /el/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


Αναπαριστά τον κόμβο δήλωσης XML **<?xml version='1.0'...?>**.

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. |
| [get_Encoding](./get_encoding/)() | Επιστρέφει το επίπεδο κωδικοποίησης του εγγράφου XML. |
| [get_InnerText](./get_innertext/)() override | Επιστρέφει τις συνενωμένες τιμές του [XmlDeclaration](./). |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του κόμβου. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_Standalone](./get_standalone/)() | Επιστρέφει την τιμή του χαρακτηριστικού standalone. |
| [get_Value](./get_value/)() override | Επιστρέφει την τιμή του [XmlDeclaration](./). |
| [get_Version](./get_version/)() | Επιστρέφει την έκδοση XML του εγγράφου. |
| [set_Encoding](./set_encoding/)(const String\&) | Ορίζει το επίπεδο κωδικοποίησης του εγγράφου XML. |
| [set_InnerText](./set_innertext/)(String) override | Ορίζει τις συνενωμένες τιμές του [XmlDeclaration](./). |
| [set_Standalone](./set_standalone/)(const String\&) | Ορίζει την τιμή του χαρακτηριστικού standalone. |
| [set_Value](./set_value/)(String) override | Ορίζει την τιμή του [XmlDeclaration](./). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τα παιδιά του κόμβου στον καθορισμένο [XmlWriter](../xmlwriter/). Επειδή οι κόμβοι [XmlDeclaration](./) δεν έχουν παιδιά, αυτή η μέθοδος δεν έχει καμία επίδραση. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τον κόμβο στον καθορισμένο [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
