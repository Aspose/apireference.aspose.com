---
title: "System::Xml::Schema::ValidationEventArgs κλάση"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::ValidationEventArgs κλάση. Επιστρέφει λεπτομερείς πληροφορίες σχετικές με το ValidationEventHandler σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


Επιστρέφει λεπτομερείς πληροφορίες σχετικές με το [ValidationEventHandler](../validationeventhandler/).

```cpp
class ValidationEventArgs : public System::EventArgs
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Exception](./get_exception/)() | Επιστρέφει το [XmlSchemaException](../xmlschemaexception/) που σχετίζεται με το γεγονός επικύρωσης. |
| [get_Message](./get_message/)() | Επιστρέφει την περιγραφή κειμένου που αντιστοιχεί στο γεγονός επικύρωσης. |
| [get_Severity](./get_severity/)() | Επιστρέφει τη σοβαρότητα του γεγονότος επικύρωσης. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ένα στατικό μέλος που αντιπροσωπεύει έναν "κενό" [EventArgs](../../system/eventargs/) δείκτη κοινόχρηστου (null-pointer). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
