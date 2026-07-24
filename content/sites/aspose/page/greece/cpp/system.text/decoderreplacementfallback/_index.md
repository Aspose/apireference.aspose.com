---
title: "System::Text::DecoderReplacementFallback κλάση"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Page για C++"
description: "System::Text::DecoderReplacementFallback κλάση. Παρέχει στρατηγική εναλλακτικού μηχανισμού αντικατάστασης εσφαλμένου συμβόλου με υποκατάστατο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 700
url: /el/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


Παρέχει στρατηγική εναλλακτικού μηχανισμού αντικατάστασης εσφαλμένου συμβόλου με υποκατάστατο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Δημιουργεί εναλλακτικό buffer. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | Κατασκευαστής που χρησιμοποιεί την προεπιλεγμένη συμβολοσειρά αντικατάστασης "?". |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | Κατασκευαστής. |
| [get_DefaultString](./get_defaultstring/)() const | Λαμβάνει τη συμβολοσειρά αντικατάστασης. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Λαμβάνει το μέγιστο πλήθος χαρακτήρων που μπορεί να επιστρέψει το αντικείμενο. |
## Δείτε επίσης

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
