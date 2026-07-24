---
title: "System::IO::MemoryStream class"
linktitle: "MemoryStream"
second_title: "Aspose.Page για C++"
description: "System::IO::MemoryStream class. Αντιπροσωπεύει μια ροή που διαβάζει από και γράφει στη μνήμη. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1800
url: /el/cpp/system.io/memorystream/
---
## MemoryStream class


Αντιπροσωπεύει μια ροή που διαβάζει από και γράφει στη μνήμη. Αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class MemoryStream : public System::IO::Stream
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Close](./close/)() override | Κλείνει τη ροή. |
| [Flush](./flush/)() override | Δεν κάνει τίποτα. |
| [get_CanRead](./get_canread/)() const override | Καθορίζει εάν η ροή είναι αναγνώσιμη. |
| [get_CanSeek](./get_canseek/)() const override | Καθορίζει αν το ρεύμα υποστηρίζει αναζήτηση. |
| [get_CanWrite](./get_canwrite/)() const override | Καθορίζει αν το ρεύμα είναι εγγράψιμο. |
| [get_Capacity](./get_capacity/)() | Επιστρέφει τη τρέχουσα χωρητικότητα του υποκείμενου buffer μνήμης. |
| [get_Length](./get_length/)() const override | Επιστρέφει το μήκος του ρεύματος σε bytes. |
| [get_Position](./get_position/)() const override | Επιστρέφει την τρέχουσα θέση του ρεύματος. |
| virtual [GetBuffer](./getbuffer/)() | Επιστρέφει έναν δείκτη στο υποκείμενο buffer. |
| [MemoryStream](./memorystream/)() | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [MemoryStream](./) με αρχική χωρητικότητα ίση με 0. |
| [MemoryStream](./memorystream/)(int) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [MemoryStream](./) που αντιπροσωπεύει μια ροή βασισμένη σε buffer μνήμης του καθορισμένου μεγέθους. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [MemoryStream](./) που αντιπροσωπεύει μια ροή μνήμης η οποία είναι συνδεδεμένη με το καθορισμένο buffer μνήμης. Μια παράμετρος καθορίζει αν η ροή είναι εγγράψιμη. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [MemoryStream](./) που αντιπροσωπεύει μια ροή μνήμης η οποία είναι συνδεδεμένη με ένα τμήμα του καθορισμένου buffer μνήμης που ξεκινά από το καθορισμένο δείκτη και περιλαμβάνει τον καθορισμένο αριθμό στοιχείων. Οι παράμετροι καθορίζουν αν η ροή είναι εγγράψιμη και αν μπορεί να κληθεί η μέθοδος GetBytes(). |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReadByte](./readbyte/)() override | Διαβάζει ένα μόνο byte από τη ροή και επιστρέφει μια τιμή 32-bit ακέραιου ισοδύναμη με την τιμή του διαβασμένου byte. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Ορίζει τη θέση της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_Capacity](./set_capacity/)(int) | Ορίζει τη χωρητικότητα του υποκείμενου buffer μνήμης. |
| [set_Position](./set_position/)(int64_t) override | Ορίζει τη θέση της ροής. |
| [SetLength](./setlength/)(int64_t) override | Ορίζει το μήκος της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| virtual [ToArray](./toarray/)() | Επιστρέφει ένα αντίγραφο του υποκείμενου buffer μνήμης ως έναν πίνακα byte. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | Επιστρέφει τον πίνακα των μη υπογεγραμμένων byte από τα οποία δημιουργήθηκε αυτή η ροή. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| [WriteByte](./writebyte/)(uint8_t) override | Γράφει την καθορισμένη μη-υπογεγραμμένη τιμή 8-bit ακέραιου στη ροή. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | Γράφει το περιεχόμενο του υποκείμενου buffer στη καθορισμένη ροή. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Null](../stream/null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για έναν κοινό δείκτη προς τον εαυτό. |
## Δείτε επίσης

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
