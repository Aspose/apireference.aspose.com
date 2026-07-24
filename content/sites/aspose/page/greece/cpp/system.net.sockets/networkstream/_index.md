---
title: "System::Net::Sockets::NetworkStream κλάση"
linktitle: "NetworkStream"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::NetworkStream κλάση. Παρέχει το υποκείμενο ρεύμα των δεδομένων για την πρόσβαση στο δίκτυο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.net.sockets/networkstream/
---
## NetworkStream class


Παρέχει το υποκείμενο ρεύμα των δεδομένων για την πρόσβαση στο δίκτυο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class NetworkStream : public System::IO::Stream
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Ξεκινά μια ασύγχρονη λειτουργία ανάγνωσης. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Ξεκινά μια ασύγχρονη λειτουργία εγγραφής. |
| [Close](./close/)(int) | Κλείνει το τρέχον αντικείμενο μετά τη λήξη του καθορισμένου χρόνου. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία ανάγνωσης. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Τελειώνει μια ασύγχρονη λειτουργία εγγραφής. Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία εγγραφής. |
| [Flush](./flush/)() override | Καθαρίζει τις εσωτερικές μνήμες του ρεύματος και γράφει όλα τα δεδομένα που έχουν αποθηκευτεί στην υποκείμενη αποθήκευση. |
| [get_CanRead](./get_canread/)() const override | Πληροφορίες RTTI. |
| [get_CanSeek](./get_canseek/)() const override | Καθορίζει αν το ρεύμα υποστηρίζει αναζήτηση. |
| [get_CanTimeout](./get_cantimeout/)() const override | Λαμβάνει μια τιμή που καθορίζει αν το τρέχον ρεύμα μπορεί να λήξει. |
| [get_CanWrite](./get_canwrite/)() const override | Καθορίζει αν το ρεύμα είναι εγγράψιμο. |
| [get_DataAvailable](./get_dataavailable/)() const | Επιστρέφει μια τιμή που υποδεικνύει αν υπάρχει διαθέσιμο δεδομένο για ανάγνωση. |
| [get_Length](./get_length/)() const override | Επιστρέφει το μήκος του ρεύματος σε bytes. |
| [get_Position](./get_position/)() const override | Επιστρέφει την τρέχουσα θέση του ρεύματος. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Λαμβάνει μια τιμή, σε χιλιοστά του δευτερολέπτου, που καθορίζει πόσο χρόνο θα προσπαθήσει το ρεύμα να διαβάσει πριν λήξει. |
| [get_Socket](./get_socket/)() | Λαμβάνει το υποκείμενο [Socket](../socket/). |
| [get_WriteTimeout](./get_writetimeout/)() const override | Λαμβάνει μια τιμή, σε χιλιοστά του δευτερολέπτου, που καθορίζει πόσο χρόνο θα προσπαθήσει η ροή να γράψει πριν λήξει το χρονικό όριο. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>) | Δημιουργεί μια νέα παρουσία. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) | Δημιουργεί μια νέα παρουσία. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) | Δημιουργεί μια νέα παρουσία. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Ορίζει τη θέση της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_Position](./set_position/)(int64_t) override | Ορίζει τη θέση της ροής. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Ορίζει μια τιμή που καθορίζει αν η τρέχουσα ροή μπορεί να λήξει. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Ορίζει μια τιμή, σε χιλιοστά του δευτερολέπτου, που καθορίζει πόσο χρόνο θα προσπαθήσει η ροή να διαβάσει πριν λήξει το χρονικό όριο. |
| [SetLength](./setlength/)(int64_t) override | Ορίζει το μήκος της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| virtual [~NetworkStream](./~networkstream/)() | Καταστρέφει την τρέχουσα παρουσία. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Δείτε επίσης

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
