---
title: "System::Xml::Xsl::XsltSettings κλάση"
linktitle: "XsltSettings"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XsltSettings κλάση. Καθορίζει τις δυνατότητες XSLT που θα υποστηριχθούν κατά την εκτέλεση του φύλλου στυλ XSLT σε C++."
type: docs
weight: 800
url: /el/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


Καθορίζει τις δυνατότητες XSLT που θα υποστηριχθούν κατά την εκτέλεση του φύλλου στυλ XSLT.

```cpp
class XsltSettings : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [get_Default](./get_default/)() | Επιστρέφει ένα αντικείμενο [XsltSettings](./) με προεπιλεγμένες ρυθμίσεις. Η υποστήριξη για τη λειτουργία XSLT **document()** και τα ενσωματωμένα μπλοκ κώδικα είναι απενεργοποιημένη. |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | Επιστρέφει μια τιμή που υποδεικνύει αν θα ενεργοποιηθεί η υποστήριξη για τη λειτουργία XSLT **document()**. |
| [get_EnableScript](./get_enablescript/)() | Επιστρέφει μια τιμή που υποδεικνύει αν θα ενεργοποιηθεί η υποστήριξη για ενσωματωμένα μπλοκ κώδικα. |
| static [get_TrustedXslt](./get_trustedxslt/)() | Επιστρέφει ένα αντικείμενο [XsltSettings](./) που ενεργοποιεί την υποστήριξη για τη λειτουργία XSLT **document()** και τα ενσωματωμένα μπλοκ κώδικα. |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν θα ενεργοποιηθεί η υποστήριξη για τη λειτουργία XSLT **document()**. |
| [set_EnableScript](./set_enablescript/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν θα ενεργοποιηθεί η υποστήριξη για ενσωματωμένα μπλοκ κώδικα. |
| [XsltSettings](./xsltsettings/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XsltSettings](./) με προεπιλεγμένες ρυθμίσεις. |
| [XsltSettings](./xsltsettings/)(bool, bool) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XsltSettings](./) με τις καθορισμένες ρυθμίσεις. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
