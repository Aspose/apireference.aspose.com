---
title: "System::Text::DecoderExceptionFallback κλάση"
linktitle: "DecoderExceptionFallback"
second_title: "Aspose.Page για C++"
description: "System::Text::DecoderExceptionFallback κλάση. Παρέχει στρατηγική εναλλακτικού μηχανισμού που ρίχνει εξαιρέσεις. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.text/decoderexceptionfallback/
---
## DecoderExceptionFallback class


Παρέχει στρατηγική εναλλακτικού μηχανισμού που ρίχνει εξαιρέσεις. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class DecoderExceptionFallback : public System::Text::DecoderFallback
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Δημιουργεί εναλλακτικό buffer. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Λαμβάνει το μέγιστο πλήθος χαρακτήρων που μπορεί να επιστρέψει το αντικείμενο. |
## Δείτε επίσης

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
