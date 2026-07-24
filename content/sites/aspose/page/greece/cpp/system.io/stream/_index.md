---
title: "System::IO::Stream κλάση"
linktitle: "Stream"
second_title: "Aspose.Page για C++"
description: "System::IO::Stream κλάση. Μια βασική κλάση για μια ποικιλία υλοποιήσεων ροών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2100
url: /el/cpp/system.io/stream/
---
## Stream class


Μια βασική κλάση για μια ποικιλία υλοποιήσεων ροών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class Stream : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Ξεκινά μια ασύγχρονη λειτουργία ανάγνωσης. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Ξεκινά μια ασύγχρονη λειτουργία εγγραφής. |
| virtual [Close](./close/)() | Κλείνει τη ροή. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | Αντιγράφει byte στη καθορισμένη ροή. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | Αντιγράφει byte στη καθορισμένη ροή, χρησιμοποιώντας το καθορισμένο μέγεθος buffer. |
| [Dispose](./dispose/)() override | Απελευθερώνει όλους τους πόρους που χρησιμοποιεί το τρέχον αντικείμενο και κλείνει τη ροή. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία ανάγνωσης. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | Τελειώνει μια ασύγχρονη λειτουργία εγγραφής. Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία εγγραφής. |
| virtual [Flush](./flush/)() | Καθαρίζει τις εσωτερικές μνήμες του ρεύματος και γράφει όλα τα δεδομένα που έχουν αποθηκευτεί στην υποκείμενη αποθήκευση. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | Ασύγχρονα εκκαθαρίζει όλα τα buffers για αυτή τη ροή, προκαλεί την εγγραφή τυχόν δεδομένων που είναι στη μνήμη buffer στη βασική συσκευή, και παρακολουθεί αιτήματα ακύρωσης. |
| [FlushAsync](./flushasync/)() | Ασύγχρονα εκκαθαρίζει όλα τα buffers για αυτή τη ροή, προκαλεί την εγγραφή τυχόν δεδομένων που είναι στη μνήμη buffer στη βασική συσκευή, και παρακολουθεί αιτήματα ακύρωσης. |
| virtual [get_CanRead](./get_canread/)() const | Καθορίζει εάν η ροή είναι αναγνώσιμη. |
| virtual [get_CanSeek](./get_canseek/)() const | Καθορίζει αν το ρεύμα υποστηρίζει αναζήτηση. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | Λαμβάνει μια τιμή που καθορίζει αν το τρέχον ρεύμα μπορεί να λήξει. |
| virtual [get_CanWrite](./get_canwrite/)() const | Καθορίζει αν το ρεύμα είναι εγγράψιμο. |
| virtual [get_Length](./get_length/)() const | Επιστρέφει το μήκος του ρεύματος σε bytes. |
| virtual [get_Position](./get_position/)() const | Επιστρέφει την τρέχουσα θέση του ρεύματος. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | Λαμβάνει μια τιμή, σε χιλιοστά του δευτερολέπτου, που καθορίζει πόσο χρόνο θα προσπαθήσει το ρεύμα να διαβάσει πριν λήξει. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | Λαμβάνει μια τιμή, σε χιλιοστά του δευτερολέπτου, που καθορίζει πόσο χρόνο θα προσπαθήσει η ροή να γράψει πριν λήξει το χρονικό όριο. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Ασύγχρονα διαβάζει μια ακολουθία byte από την τρέχουσα ροή, προχωρά τη θέση μέσα στη ροή κατά τον αριθμό των byte που διαβάστηκαν, και παρακολουθεί αιτήματα ακύρωσης. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Ασύγχρονα διαβάζει μια ακολουθία byte από την τρέχουσα ροή, προχωρά τη θέση μέσα στη ροή κατά τον αριθμό των byte που διαβάστηκαν, και παρακολουθεί αιτήματα ακύρωσης. |
| virtual [ReadByte](./readbyte/)() | Διαβάζει ένα μόνο byte από τη ροή και επιστρέφει μια τιμή 32-bit ακέραιου ισοδύναμη με την τιμή του διαβασμένου byte. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | Ορίζει τη θέση της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| virtual [set_Position](./set_position/)(int64_t) | Ορίζει τη θέση της ροής. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | Ορίζει μια τιμή που καθορίζει αν η τρέχουσα ροή μπορεί να λήξει. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | Ορίζει μια τιμή, σε χιλιοστά του δευτερολέπτου, που καθορίζει πόσο χρόνο θα προσπαθήσει η ροή να διαβάσει πριν λήξει το χρονικό όριο. |
| virtual [SetLength](./setlength/)(int64_t) | Ορίζει το μήκος της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Ασύγχρονα γράφει μια ακολουθία byte στην τρέχουσα ροή, προχωρά τη τρέχουσα θέση μέσα σε αυτή τη ροή κατά τον αριθμό των byte που γράφτηκαν, και παρακολουθεί αιτήματα ακύρωσης. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Ασύγχρονα γράφει μια ακολουθία byte στην τρέχουσα ροή, προχωρά τη τρέχουσα θέση μέσα σε αυτή τη ροή κατά τον αριθμό των byte που γράφτηκαν, και παρακολουθεί αιτήματα ακύρωσης. |
| virtual [WriteByte](./writebyte/)(uint8_t) | Γράφει την καθορισμένη μη-υπογεγραμμένη τιμή 8-bit ακέραιου στη ροή. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Null](./null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για έναν κοινό δείκτη (shared pointer) σε αυτήν την κλάση. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
