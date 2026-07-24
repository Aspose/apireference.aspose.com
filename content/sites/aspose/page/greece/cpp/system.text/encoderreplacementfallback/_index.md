---
title: "System::Text::EncoderReplacementFallback κλάση"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Page για C++"
description: "System::Text::EncoderReplacementFallback κλάση. Παρέχει στρατηγική εναλλακτικού χειρισμού αντικατάστασης εσφαλμένου συμβόλου με ένα υποκατάστατο. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε στις συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1400
url: /el/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


Παρέχει στρατηγική εναλλακτικού μηχανισμού αντικατάστασης εσφαλμένου συμβόλου με υποκατάστατο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Δημιουργεί εναλλακτικό buffer. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | Κατασκευαστής που χρησιμοποιεί την προεπιλεγμένη συμβολοσειρά αντικατάστασης "?". |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | Κατασκευαστής. |
| [get_DefaultString](./get_defaultstring/)() const | Λαμβάνει τη συμβολοσειρά αντικατάστασης. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Λαμβάνει το μέγιστο πλήθος χαρακτήρων που μπορεί να επιστρέψει το αντικείμενο. |
## Δείτε επίσης

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
