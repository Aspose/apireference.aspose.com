---
title: "Κλάση System::Net::WebClient"
linktitle: "WebClient"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Net::WebClient. Το WebClient παρέχει κοινές μεθόδους για αποστολή και λήψη δεδομένων. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3500
url: /el/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | Κατεβάζει τον καθορισμένο πόρο ως πίνακα byte. |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | Κατεβάζει τον καθορισμένο πόρο ως πίνακα byte. |
| [DownloadString](./downloadstring/)(const String\&) const | Κατεβάζει τον καθορισμένο πόρο ως συμβολοσειρά. |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | Κατεβάζει τον καθορισμένο πόρο ως συμβολοσειρά. |
| [get_Encoding](./get_encoding/)() const | Λαμβάνει την κωδικοποίηση που χρησιμοποιείται για τη λήψη ή αποστολή συμβολοσειρών. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | Ορίζει την κωδικοποίηση που χρησιμοποιείται για τη λήψη ή αποστολή συμβολοσειρών. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [WebClient](./webclient/)() | Πληροφορίες RTTI. |
| [~WebClient](./~webclient/)() | Καταστρέφει την τρέχουσα παρουσία. |
## Δείτε επίσης

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
