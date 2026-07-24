---
title: "System::Xml::XmlQualifiedName κλάση"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlQualifiedName κλάση. Αντιπροσωπεύει ένα προσδιορισμένο όνομα XML στη C++."
type: docs
weight: 3200
url: /el/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


Αντιπροσωπεύει ένα προσδιορισμένο όνομα XML.

```cpp
class XmlQualifiedName : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Καθορίζει εάν το καθορισμένο αντικείμενο [XmlQualifiedName](./) είναι ίσο με το τρέχον αντικείμενο [XmlQualifiedName](./). |
| [get_IsEmpty](./get_isempty/)() const | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlQualifiedName](./) είναι κενό. |
| [get_Name](./get_name/)() const | Επιστρέφει μια αναπαράσταση συμβολοσειράς του προσδιορισμένου ονόματος του [XmlQualifiedName](./). |
| [get_Namespace](./get_namespace/)() const | Επιστρέφει μια αναπαράσταση συμβολοσειράς του χώρου ονομάτων του [XmlQualifiedName](./). |
| [GetHashCode](./gethashcode/)() const override | Επιστρέφει τον κωδικό κατακερματισμού για το [XmlQualifiedName](./). |
| static [ToString](./tostring/)(const String\&, const String\&) | Επιστρέφει την τιμή συμβολοσειράς του [XmlQualifiedName](./). |
| [ToString](./tostring/)() const override | Επιστρέφει την τιμή συμβολοσειράς του [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)() | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlQualifiedName](./) με το καθορισμένο όνομα. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlQualifiedName](./) με το καθορισμένο όνομα και χώρο ονομάτων. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](./empty/) | Παρέχει ένα κενό [XmlQualifiedName](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
