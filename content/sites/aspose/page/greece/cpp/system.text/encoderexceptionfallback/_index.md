---
title: "Κλάση System::Text::EncoderExceptionFallback"
linktitle: "EncoderExceptionFallback"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Text::EncoderExceptionFallback. Παρέχει στρατηγική εναλλακτικού μηχανισμού που ρίχνει εξαιρέσεις. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() . Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


Παρέχει στρατηγική εναλλακτικού μηχανισμού που ρίχνει εξαιρέσεις. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Δημιουργεί εναλλακτικό buffer. |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | Κατασκευαστής. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Λαμβάνει το μέγιστο πλήθος χαρακτήρων που μπορεί να επιστρέψει το αντικείμενο. |
## Δείτε επίσης

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
