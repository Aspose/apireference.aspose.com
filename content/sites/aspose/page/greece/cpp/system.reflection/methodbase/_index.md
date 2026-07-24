---
title: "Κλάση System::Reflection::MethodBase"
linktitle: "MethodBase"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Reflection::MethodBase. Βασικές πληροφορίες για τη μέθοδο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 800
url: /el/cpp/system.reflection/methodbase/
---
## MethodBase class


Βασικές πληροφορίες για τη μέθοδο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Δείχνει τον τύπο του μέλους - μέθοδο, κατασκευαστή, συμβάν κ.λπ. |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | Αυτή η μέθοδος επιτρέπει την λήψη του τρέχοντος ονόματος της μεθόδου. Ο μεταφραστής αντικαθιστά αυτόματα το ASPOSE_CURRENT_FUNCTION ως παράμετρο. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [MethodBase](./). |
## Δείτε επίσης

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
