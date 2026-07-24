---
title: "System::Resources::ResourceManager κλάση"
linktitle: "ResourceManager"
second_title: "Aspose.Page για C++"
description: "System::Resources::ResourceManager κλάση. Παρέχει API για τη διαχείριση πόρων. Δεν είναι υλοποιημένη. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.resources/resourcemanager/
---
## ResourceManager class


Παρέχει API για τη διαχείριση πόρων. Δεν είναι υλοποιημένη. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ResourceManager : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | Λαμβάνει αντικείμενο από πόρο. Το όνομα δεν είναι GetObject() για να αντιμετωπιστεί το πρόβλημα ορισμού GetObjectA. |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Λαμβάνει αντικείμενο από πόρο. Το όνομα δεν είναι GetObject() για να αντιμετωπιστεί το πρόβλημα ορισμού GetObjectA. |
| virtual [GetString](./getstring/)(String) | Λαμβάνει πόρο συμβολοσειράς. |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Λαμβάνει πόρο συμβολοσειράς. |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Πληροφορίες RTTI. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Page for C++](../../)
