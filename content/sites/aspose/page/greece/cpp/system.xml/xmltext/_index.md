---
title: "System::Xml::XmlText class"
linktitle: "XmlText"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlText class. Αντιπροσωπεύει το κείμενο περιεχομένου ενός στοιχείου ή ενός χαρακτηριστικού στο C++."
type: docs
weight: 3800
url: /el/cpp/system.xml/xmltext/
---
## XmlText class


Αντιπροσωπεύει το κειμενικό περιεχόμενο ενός στοιχείου ή μιας ιδιότητας.

```cpp
class XmlText : public System::Xml::XmlCharacterData
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
| virtual [SplitText](./splittext/)(int32_t) | Διαιρεί τον κόμβο σε δύο κόμβους στο καθορισμένο offset, διατηρώντας και τους δύο στο δέντρο ως αδέρφια. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει όλα τα παιδιά του κόμβου στον καθορισμένο [XmlWriter](../xmlwriter/). Οι κόμβοι [XmlText](./) δεν έχουν παιδιά, επομένως αυτή η μέθοδος δεν έχει καμία επίδραση. |
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
