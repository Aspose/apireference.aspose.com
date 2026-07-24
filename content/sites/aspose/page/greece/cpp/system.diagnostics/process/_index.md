---
title: "System::Diagnostics::Process class"
linktitle: "Process"
second_title: "Aspose.Page για C++"
description: "System::Diagnostics::Process class. Περιλαμβάνει πληροφορίες διεργασίας και χειρισμό. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.diagnostics/process/
---
## Process class


Περιλαμβάνει πληροφορίες διεργασίας και χειρισμό. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class Process : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | Λαμβάνει εάν το γεγονός Exited πρέπει να ενεργοποιηθεί όταν η διεργασία τερματιστεί. |
| [get_ExitCode](./get_exitcode/)() const | Λαμβάνει τον κωδικό εξόδου της διεργασίας. |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | Λαμβάνει το μέγεθος του ιδιωτικού συνόλου μνήμης της διεργασίας. |
| [get_ProcessName](./get_processname/)() const | Λαμβάνει το όνομα της διαδικασίας. |
| [get_StandardError](./get_standarderror/)() const | Παρέχει αναγνώστη για ανάγνωση από την έξοδο σφαλμάτων της διαδικασίας. Δεν έχει υλοποιηθεί. |
| [get_StandardOutput](./get_standardoutput/)() const | Παρέχει αναγνώστη για ανάγνωση από την τυπική έξοδο της διαδικασίας. Δεν έχει υλοποιηθεί. |
| [get_StartInfo](./get_startinfo/)() const | Λαμβάνει πληροφορίες εκκίνησης της διαδικασίας. |
| [get_WorkingSet64](./get_workingset64/)() const | Λαμβάνει το μέγεθος του συνόλου εργασίας μνήμης της διαδικασίας. |
| static [GetCurrentProcess](./getcurrentprocess/)() | Λαμβάνει πληροφορίες για την τρέχουσα διαδικασία. Μόνο [Windows](../../system.windows/). |
| [GetOutputText](./getoutputtext/)() const | Λαμβάνει το κείμενο εξόδου της διαδικασίας. |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | Ορίζει αν το γεγονός Exited πρέπει να ενεργοποιηθεί όταν η διαδικασία τερματιστεί. |
| [Start](./start/)() | Ξεκινά τη διαδικασία με προ-ορισμένες παραμέτρους. |
| static [Start](./start/)(const String\&, const String\&) | Ξεκινά τη διαδικασία με καθορισμένη διαδρομή και ορίσματα. |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | Ξεκινά τη διαδικασία με καθορισμένη διαδρομή και ορίσματα. |
| [WaitForExit](./waitforexit/)(int) | Περιμένει τη διαδικασία να τερματιστεί. Δεν έχει υλοποιηθεί. |
| [WaitForExit](./waitforexit/)() | Περιμένει τη διαδικασία να τερματιστεί, δεν επιστρέφει μέχρι να ολοκληρωθεί. |
| virtual [~Process](./~process/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
