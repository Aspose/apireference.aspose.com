---
title: "System::Xml::XmlWhitespace class"
linktitle: "XmlWhitespace"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlWhitespace class. Αντιπροσωπεύει το λευκό διάστημα στο περιεχόμενο στοιχείου σε C++."
type: docs
weight: 4300
url: /el/cpp/system.xml/xmlwhitespace/
---
## XmlWhitespace class


Αντιπροσωπεύει λευκό διάστημα στο περιεχόμενο του στοιχείου.

```cpp
class XmlWhitespace : public System::Xml::XmlCharacterData
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του κόμβου. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του κόμβου. |
| [get_PreviousText](./get_previoustext/)() override | Επιστρέφει τον κόμβο κειμένου που προηγείται αμέσως αυτού του κόμβου. |
| [get_Value](./get_value/)() override | Επιστρέφει την τιμή του κόμβου. |
| [set_Value](./set_value/)(String) override | Ορίζει την τιμή του κόμβου. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει όλα τα παιδιά του κόμβου στον καθορισμένο [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τον κόμβο στον καθορισμένο [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
