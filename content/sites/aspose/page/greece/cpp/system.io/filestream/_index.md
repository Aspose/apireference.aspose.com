---
title: "System::IO::FileStream κλάση"
linktitle: "FileStream"
second_title: "Aspose.Page για C++"
description: "System::IO::FileStream class. Αντιπροσωπεύει μια ροή αρχείου που υποστηρίζει συγχρονικές και ασύγχρονες λειτουργίες ανάγνωσης και εγγραφής. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1500
url: /el/cpp/system.io/filestream/
---
## FileStream class


Αντιπροσωπεύει μια ροή αρχείου που υποστηρίζει συγχρονικές και ασύγχρονες λειτουργίες ανάγνωσης και εγγραφής. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class FileStream : public System::IO::Stream
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Close](./close/)() override | Κλείνει το τρέχον αντικείμενο [FileStream](./). |
| [FileStream](./filestream/)(const String\&, FileMode) | Δημιουργεί μια νέα παρουσία της κλάσης [FileStream](./) και την αρχικοποιεί με τις καθορισμένες παραμέτρους. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | Δημιουργεί μια νέα παρουσία της κλάσης [FileStream](./) και την αρχικοποιεί με τις καθορισμένες παραμέτρους. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | Δημιουργεί μια νέα παρουσία της κλάσης [FileStream](./) και την αρχικοποιεί με τις καθορισμένες παραμέτρους. |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | Καθαρίζει τις προσωρινές μνήμες αυτής της ροής και γράφει όλα τα δεδομένα στο υποκείμενο αρχείο. |
| [Flush](./flush/)(bool) | Καθαρίζει τις προσωρινές μνήμες αυτής της ροής και γράφει όλα τα δεδομένα στο υποκείμενο αρχείο. Συνώνυμο της μεθόδου [Flush()](./flush/). |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | Ασύγχρονα εκκαθαρίζει όλα τα buffers για αυτή τη ροή, προκαλεί την εγγραφή τυχόν δεδομένων που είναι στη μνήμη buffer στη βασική συσκευή, και παρακολουθεί αιτήματα ακύρωσης. |
| [get_CanRead](./get_canread/)() const override | Καθορίζει εάν η ροή είναι αναγνώσιμη. |
| [get_CanSeek](./get_canseek/)() const override | Καθορίζει αν το ρεύμα υποστηρίζει αναζήτηση. |
| [get_CanWrite](./get_canwrite/)() const override | Καθορίζει αν το ρεύμα είναι εγγράψιμο. |
| [get_Length](./get_length/)() const override | Επιστρέφει το μήκος του ρεύματος σε bytes. |
| [get_Name](./get_name/)() const | Επιστρέφει το όνομα του αρχείου που περιβάλλεται από το τρέχον αντικείμενο [FileStream](./). |
| [get_Position](./get_position/)() const override | Επιστρέφει την τρέχουσα θέση του ρεύματος. |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Ασύγχρονα διαβάζει μια ακολουθία byte από την τρέχουσα ροή, προχωρά τη θέση μέσα στη ροή κατά τον αριθμό των byte που διαβάστηκαν, και παρακολουθεί αιτήματα ακύρωσης. |
| [ReadByte](./readbyte/)() override | Διαβάζει ένα μόνο byte από τη ροή και επιστρέφει μια τιμή 32-bit ακέραιου ισοδύναμη με την τιμή του διαβασμένου byte. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Ορίζει τη θέση της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_Position](./set_position/)(int64_t) override | Αδειάζει τη ροή και στη συνέχεια ορίζει τη θέση της ροής. |
| [SetLength](./setlength/)(int64_t) override | Ορίζει το μήκος της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Ασύγχρονα γράφει μια ακολουθία byte στην τρέχουσα ροή, προχωρά τη τρέχουσα θέση μέσα σε αυτή τη ροή κατά τον αριθμό των byte που γράφτηκαν, και παρακολουθεί αιτήματα ακύρωσης. |
| [WriteByte](./writebyte/)(uint8_t) override | Γράφει την καθορισμένη μη-υπογεγραμμένη τιμή 8-bit ακέραιου στη ροή. |
| [~FileStream](./~filestream/)() | Καταστροφέας. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | Προεπιλεγμένη τιμή του αριθμού των byte που αποθηκεύονται προσωρινά κατά τις λειτουργίες ανάγνωσης και εγγραφής. |
| static [Null](../stream/null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Δείτε επίσης

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
