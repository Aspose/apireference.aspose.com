---
title: "System::Diagnostics::StackTrace κλάση"
linktitle: "StackTrace"
second_title: "Aspose.Page για C++"
description: "System::Diagnostics::StackTrace κλάση. Συλλογή πλαισίων στοίβας. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


Συλλογή πλαισίων στοίβας. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class StackTrace : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | Λαμβάνει τον αριθμό των πλαισίων στην καταγραφή στοίβας. |
| virtual [GetFrame](./getframe/)(uint32_t) | Λαμβάνει πλαίσιο στοίβας. |
| [operator=](./operator=/)(const StackTrace\&) const | Καμία ανάθεση. |
| [StackTrace](./stacktrace/)() | Δημιουργεί καταγραφή στοίβας που περιγράφει την τρέχουσα κατάσταση της στοίβας. |
| [StackTrace](./stacktrace/)(bool) | Δημιουργεί καταγραφή στοίβας που περιγράφει την τρέχουσα κατάσταση της στοίβας. |
| [StackTrace](./stacktrace/)(const StackTrace\&) | Δεν επιτρέπεται η αντιγραφή. |
| virtual [~StackTrace](./~stacktrace/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
