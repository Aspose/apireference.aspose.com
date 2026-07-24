---
title: "System::IO::BufferedStream κλάση"
linktitle: "BufferedStream"
second_title: "Aspose.Page για C++"
description: "System::IO::BufferedStream κλάση. Προσθέτει ένα επίπεδο προσωρινής αποθήκευσης πάνω από ένα άλλο ρεύμα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.io/bufferedstream/
---
## BufferedStream class


Προσθέτει ένα επίπεδο προσωρινής αποθήκευσης πάνω από ένα άλλο ρεύμα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class BufferedStream : public System::IO::Stream
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | Δημιουργεί ένα αντικείμενο [BufferedStream](./) που περιβάλλει το καθορισμένο ρεύμα και χρησιμοποιεί μια προσωρινή μνήμη 4096 byte. |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | Δημιουργεί ένα αντικείμενο [BufferedStream](./) που περιβάλλει το καθορισμένο ρεύμα και χρησιμοποιεί μια προσωρινή μνήμη του καθορισμένου μεγέθους. |
| [Flush](./flush/)() override | Γράφει το περιεχόμενο της προσωρινής μνήμης στο υποκείμενο ρεύμα. |
| [get_CanRead](./get_canread/)() const override | Καθορίζει εάν η ροή είναι αναγνώσιμη. |
| [get_CanSeek](./get_canseek/)() const override | Καθορίζει αν το ρεύμα υποστηρίζει αναζήτηση. |
| [get_CanWrite](./get_canwrite/)() const override | Καθορίζει αν το ρεύμα είναι εγγράψιμο. |
| [get_Length](./get_length/)() const override | Επιστρέφει το μήκος του ρεύματος. |
| [get_Position](./get_position/)() const override | Επιστρέφει την τρέχουσα θέση του ρεύματος. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από το υποκείμενο ρεύμα και τα γράφει στον καθορισμένο πίνακα byte. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από το υποκείμενο ρεύμα και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReadByte](./readbyte/)() override | Διαβάζει ένα μόνο byte από το υποκείμενο ρεύμα και επιστρέφει μια τιμή 32-bit ακέραιου που είναι ισοδύναμη με την τιμή του διαβασμένου byte. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Ορίζει τη θέση της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_Position](./set_position/)(int64_t) override | Αδειάζει τη μνήμη buffer στη βασική ροή και στη συνέχεια ορίζει τη θέση της ροής. |
| [SetLength](./setlength/)(int64_t) override | Ορίζει το μήκος της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποσύνολο των byte από τον καθορισμένο πίνακα byte στη βασική ροή. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποσύνολο των byte από τον καθορισμένο πίνακα byte στη βασική ροή. |
| [WriteByte](./writebyte/)(uint8_t) override | Γράφει την καθορισμένη μη-υπογεγραμμένη τιμή 8-bit ακέραιου στη βασική ροή. |
| virtual [~BufferedStream](./~bufferedstream/)() | Καταστροφέας. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Null](../stream/null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Δείτε επίσης

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
