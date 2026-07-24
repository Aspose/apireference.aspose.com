---
title: "System::Security::SecureString κλάση"
linktitle: "SecureString"
second_title: "Aspose.Page για C++"
description: "System::Security::SecureString κλάση. Secure string, αντιπροσωπεύει κείμενο που πρέπει να παραμείνει εμπιστευτικό. Αυτή η κλάση ΔΕΝ ΚΑΤΑΚΤΥΠΩΝΕΙ τα εσωτερικά δεδομένα. Αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.security/securestring/
---
## SecureString class


Secure string, αντιπροσωπεύει κείμενο που πρέπει να παραμείνει εμπιστευτικό. Αυτή η κλάση ΔΕΝ ΚΑΤΑΚΤΥΠΩΝΕΙ τα εσωτερικά δεδομένα. Αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class SecureString : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | Προσθέτει έναν χαρακτήρα στο τέλος της συμβολοσειράς. |
| [Clear](./clear/)() | Διαγράψτε όλους τους χαρακτήρες από την τρέχουσα ασφαλή συμβολοσειρά. |
| [Copy](./copy/)() const | Δημιουργεί ένα αντίγραφο αυτής της ασφαλούς συμβολοσειράς. |
| [Dispose](./dispose/)() override | Απελευθερώστε όλους τους πόρους που χρησιμοποιεί το τρέχον αντικείμενο. |
| [get_Length](./get_length/)() const | Λαμβάνει τον αριθμό των χαρακτήρων σε αυτή τη ασφαλή συμβολοσειρά. |
| [InsertAt](./insertat/)(int32_t, char16_t) | Εισάγει έναν χαρακτήρα στη συγκεκριμένη θέση. |
| [IsReadOnly](./isreadonly/)() const | Λαμβάνει τη σημαία που υποδεικνύει εάν αυτό το αντικείμενο είναι σημειωμένο ως μόνο για ανάγνωση. |
| [MakeReadOnly](./makereadonly/)() | Κάνει αυτή τη ασφαλή συμβολοσειρά μόνο για ανάγνωση. |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | Αφαιρεί τον χαρακτήρα στη συγκεκριμένη θέση. |
| [SecureString](./securestring/)() | Πληροφορίες RTTI. |
| [SecureString](./securestring/)(const char16_t *, int32_t) | Κατασκευαστής. |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | Αντικαθιστά τον υπάρχοντα χαρακτήρα στη συγκεκριμένη θέση. |
| [ToUnsecureString](./tounsecurestring/)() const | Αντιγράφει τα περιεχόμενα αυτής της ασφαλούς συμβολοσειράς σε μη ασφαλές αντικείμενο [String](../../system/string/). Χρησιμοποιήστε το με προσοχή. |
| [~SecureString](./~securestring/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
