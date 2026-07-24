---
title: "System::Security::Cryptography::CryptoStream κλάση"
linktitle: "CryptoStream"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::CryptoStream κλάση. Υλοποίηση ροής που τυλίγει υπάρχουσα ροή με κρυπτογραφική λειτουργία. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 500
url: /el/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


Υλοποίηση ροής που τυλίγει υπάρχουσα ροή με κρυπτογραφική λειτουργία. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class CryptoStream : public System::IO::Stream
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Close](./close/)() override | Κλείνει τη σύνδεση. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | Κατασκευαστής. |
| [Flush](./flush/)() override | Αδειάζει την προσωρινή μνήμη στη τυλιγμένη ροή. Δεν κάνει τίποτα καθώς ο αλγόριθμος μετασχηματισμού μπορεί ακόμη να περιμένει περισσότερα δεδομένα. |
| [FlushFinalBlock](./flushfinalblock/)() | Γράφει τα δεδομένα που παραμένουν στην προσωρινή μνήμη στη ροή. |
| [get_CanRead](./get_canread/)() const override | Ελέγχει αν η ροή είναι αναγνώσιμη. |
| [get_CanSeek](./get_canseek/)() const override | Ελέγχει αν η ροή είναι αναζητήσιμη. |
| [get_CanWrite](./get_canwrite/)() const override | Ελέγχει αν η ροή είναι εγγράψιμη. |
| [get_Length](./get_length/)() const override | Λαμβάνει το μήκος της ροής. Δεν υποστηρίζεται. |
| [get_Position](./get_position/)() const override | Λαμβάνει τη τρέχουσα θέση στη ροή. Δεν υποστηρίζεται. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει δεδομένα από τη ροή. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει δεδομένα από τη ροή. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Αναζητά θέση στη ροή. Δεν υποστηρίζεται. |
| [set_Position](./set_position/)(int64_t) override | Αναζητά θέση στη ροή. Δεν υποστηρίζεται. |
| [SetLength](./setlength/)(int64_t) override | Αναζητά το μέγεθος της ροής. Δεν υποστηρίζεται. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Γράφει δεδομένα στη ροή. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Γράφει δεδομένα στη ροή. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Δείτε επίσης

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
