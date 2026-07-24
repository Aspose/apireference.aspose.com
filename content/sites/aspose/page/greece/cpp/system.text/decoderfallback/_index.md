---
title: "System::Text::DecoderFallback κλάση"
linktitle: "DecoderFallback"
second_title: "Aspose.Page για C++"
description: "System::Text::DecoderFallback κλάση. Παρέχει API fallback για τη διαχείριση σφαλμάτων αποκωδικοποίησης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε στις συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 500
url: /el/cpp/system.text/decoderfallback/
---
## DecoderFallback class


Παρέχει API fallback για τη διαχείριση σφαλμάτων αποκωδικοποίησης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε στις συναρτήσεις ως όρισμα.

```cpp
class DecoderFallback : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Λαμβάνει το buffer που σχετίζεται με τον αλγόριθμο fallback. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Λαμβάνει την προεπιλεγμένη υλοποίηση εναλλακτικού χειρισμού εξαιρέσεων. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Λαμβάνει τον μέγιστο αριθμό χαρακτήρων που μπορούν να επιστραφούν από το εναλλακτικό χειρισμό. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Λαμβάνει την προεπιλεγμένη υλοποίηση εναλλακτικού αντικατάστασης. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Λαμβάνει την προεπιλεγμένη τυπική ασφαλή υλοποίηση εναλλακτικού χειρισμού. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
