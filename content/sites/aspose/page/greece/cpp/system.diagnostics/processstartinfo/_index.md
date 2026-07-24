---
title: "κλάση System::Diagnostics::ProcessStartInfo"
linktitle: "ProcessStartInfo"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Diagnostics::ProcessStartInfo. Περιγράφει τις παραμέτρους εκκίνησης της διαδικασίας. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σε σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


Περιγράφει τις παραμέτρους εκκίνησης της διαδικασίας. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σε σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ProcessStartInfo : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | Λαμβάνει τα επιχειρήματα της διαδικασίας. |
| [get_CreateNoWindow](./get_createnowindow/)() const | Λαμβάνει την ιδιότητα NoWindow. |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | Λαμβάνει τις μεταβλητές περιβάλλοντος της διαδικασίας. |
| [get_FileName](./get_filename/)() const | Λαμβάνει το όνομα αρχείου της διαδικασίας. |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | Λαμβάνει την ιδιότητα RedirectStandardError. |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | Λαμβάνει την ιδιότητα RedirectStandardInput. |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | Λαμβάνει την ιδιότητα RedirectStandardOutput. |
| [get_UseShellExecute](./get_useshellexecute/)() const | Λαμβάνει την ιδιότητα UseShellExecute. |
| [get_WindowStyle](./get_windowstyle/)() const | Λαμβάνει το στυλ παραθύρου. |
| [get_WorkingDirectory](./get_workingdirectory/)() const | Λαμβάνει τον κατάλογο εργασίας της διαδικασίας. |
| [ProcessStartInfo](./processstartinfo/)() | Δημιουργεί κενό αντικείμενο πληροφοριών εκκίνησης. |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | Δημιουργεί αντικείμενο πληροφοριών εκκίνησης. |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | Δημιουργεί αντικείμενο πληροφοριών εκκίνησης. |
| [set_Arguments](./set_arguments/)(const String\&) | Ορίζει τα επιχειρήματα της διαδικασίας. |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | Ορίζει την ιδιότητα NoWindow. |
| [set_FileName](./set_filename/)(const String\&) | Ορίζει το όνομα αρχείου της διαδικασίας. |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | Ορίζει την ιδιότητα RedirectStandardError. |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | Ορίζει την ιδιότητα RedirectStandardInput. |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | Ορίζει την ιδιότητα RedirectStandardOutput. |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | Ορίζει την ιδιότητα UseShellExecute. |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | Ορίζει το στυλ παραθύρου. |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | Ορίζει τον φάκελο εργασίας της διεργασίας. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
