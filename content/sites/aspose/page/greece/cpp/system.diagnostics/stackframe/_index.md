---
title: "System::Diagnostics::StackFrame κλάση"
linktitle: "StackFrame"
second_title: "Aspose.Page για C++"
description: "System::Diagnostics::StackFrame κλάση. Λαμβάνει πληροφορίες για ένα μοναδικό πλαίσιο στοίβας. Μόνο MSVS. Τα αντικείμενα αυτής της κλάσης πρέπει να καταλαμβάνονται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 500
url: /el/cpp/system.diagnostics/stackframe/
---
## StackFrame class


Λαμβάνει πληροφορίες για ένα μοναδικό πλαίσιο στοίβας. Μόνο MSVS. Τα αντικείμενα αυτής της κλάσης πρέπει να καταλαμβάνονται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class StackFrame : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | Λαμβάνει τον αριθμό colnum. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | Λαμβάνει τον αριθμό γραμμής. |
| virtual [GetFileName](./getfilename/)() | Λαμβάνει το όνομα του αρχείου. |
| [GetMethod](./getmethod/)() | Λαμβάνει πληροφορίες μεθόδου. |
| [operator=](./operator=/)(const StackFrame\&) const | Καμία αλλαγή. |
| [StackFrame](./stackframe/)(int) | Δημιουργεί πλαίσιο στοίβας στην τρέχουσα μετατόπιση της στοίβας. |
| [StackFrame](./stackframe/)(const StackFrame\&) | Δεν επιτρέπεται η αντιγραφή. |
| virtual [~StackFrame](./~stackframe/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
