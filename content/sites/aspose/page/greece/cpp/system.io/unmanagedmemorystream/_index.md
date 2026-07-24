---
title: "System::IO::UnmanagedMemoryStream κλάση"
linktitle: "UnmanagedMemoryStream"
second_title: "Aspose.Page για C++"
description: "System::IO::UnmanagedMemoryStream κλάση. Παρέχει πρόσβαση σε μη διαχειριζόμενη μνήμη. Τα αντικείμενα αυτής της κλάσης θα πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2800
url: /el/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


Παρέχει πρόσβαση σε μη διαχειριζόμενη μνήμη. Τα αντικείμενα αυτής της κλάσης θα πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Flush](./flush/)() override | Δεν κάνει τίποτα. |
| [get_CanRead](./get_canread/)() const override | Καθορίζει εάν η ροή είναι αναγνώσιμη. |
| [get_CanSeek](./get_canseek/)() const override | Καθορίζει αν το ρεύμα υποστηρίζει αναζήτηση. |
| [get_CanWrite](./get_canwrite/)() const override | Καθορίζει αν το ρεύμα είναι εγγράψιμο. |
| virtual [get_Capacity](./get_capacity/)() const | Επιστρέφει τη τρέχουσα χωρητικότητα του υποκείμενου buffer μνήμης. |
| [get_Length](./get_length/)() const override | Επιστρέφει το μήκος του ρεύματος σε bytes. |
| [get_Position](./get_position/)() const override | Επιστρέφει την τρέχουσα θέση του ρεύματος. |
| [get_PositionPointer](./get_positionpointer/)() | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Ορίζει τη θέση της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_Position](./set_position/)(int64_t) override | Ορίζει τη θέση της ροής. |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [SetLength](./setlength/)(int64_t) override | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | Δημιουργεί ένα νέο στιγμιότυπο του [UnmanagedMemoryStream](./). |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | Δημιουργεί ένα νέο στιγμιότυπο του [UnmanagedMemoryStream](./). |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Null](../stream/null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Δείτε επίσης

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
