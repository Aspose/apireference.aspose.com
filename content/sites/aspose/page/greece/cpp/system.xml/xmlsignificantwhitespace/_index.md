---
title: "System::Xml::XmlSignificantWhitespace κλάση"
linktitle: "XmlSignificantWhitespace"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlSignificantWhitespace κλάση. Αντιπροσωπεύει λευκό διάστημα μεταξύ σήμανσης σε κόμβο μικτής περιεχομένου ή λευκό διάστημα εντός περιοχής xml:space=''preserve''. Αυτό επίσης αναφέρεται ως σημαντικό λευκό διάστημα σε C++."
type: docs
weight: 3700
url: /el/cpp/system.xml/xmlsignificantwhitespace/
---
## XmlSignificantWhitespace class


Αντιπροσωπεύει λευκό διάστημα μεταξύ σήμανσης σε έναν κόμβο μικτής περιεχομένου ή λευκό διάστημα εντός ενός πεδίου **xml:space='preserve'**. Αυτό αναφέρεται επίσης ως σημαντικό λευκό διάστημα.

```cpp
class XmlSignificantWhitespace : public System::Xml::XmlCharacterData
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του κόμβου. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
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
