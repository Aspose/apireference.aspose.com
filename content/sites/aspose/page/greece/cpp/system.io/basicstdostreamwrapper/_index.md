---
title: "System::IO::BasicSTDOStreamWrapper κλάση"
linktitle: "BasicSTDOStreamWrapper"
second_title: "Aspose.Page για C++"
description: "System::IO::BasicSTDOStreamWrapper κλάση. Αντιπροσωπεύει έναν τύπο περιτύλιξης παρόμοιο με System.IO.Stream-like για std::basic_ostream και τα παράγωγά του. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.io/basicstdostreamwrapper/
---
## BasicSTDOStreamWrapper class


Αντιπροσωπεύει έναν τύπο περιτύλιξης παρόμοιο με [System.IO.Stream](../stream/)-like για std::basic_ostream και τα παράγωγά του. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T,typename>class BasicSTDOStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Δημιουργεί ένα νέο στιγμιότυπο του [BasicSTDOStreamWrapper](./). |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(const BasicSTDOStreamWrapper\&) | Κατασκευαστής αντιγραφής. Διαγράφηκε. |
| [Flush](./flush/)() override | Καθαρίζει τις εσωτερικές μνήμες του ρεύματος και γράφει όλα τα δεδομένα που έχουν αποθηκευτεί στην υποκείμενη αποθήκευση. |
| [operator=](./operator=/)(const BasicSTDOStreamWrapper\&) | Τελεστής ανάθεσης αντιγραφής. Διαγράφηκε. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Εάν η λειτουργία περιτύλιξης είναι δυαδική, διαβάζει τον καθορισμένο αριθμό byte από τη ροή, διαφορετικά διαβάζει τον καθορισμένο αριθμό χαρακτήρων και τους μετατρέπει σε τύπο uint8_t. Γράφει το αποτέλεσμα της ανάγνωσης στον καθορισμένο πίνακα byte. Δεν υποστηρίζεται! |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReadByte](./readbyte/)() override | Εάν η λειτουργία περιτύλιξης είναι δυαδική, διαβάζει ένα μόνο byte από την αποθήκευση του τελευταίου αποκωδικοποιημένου χαρακτήρα, διαφορετικά διαβάζει έναν μόνο χαρακτήρα από τη ροή και τον μετατρέπει σε τύπο uint8_t. Δεν υποστηρίζεται! |
| [SetLength](./setlength/)(int64_t) override | Ορίζει το μήκος της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Εάν η λειτουργία περιτύλιξης είναι δυαδική, γράφει στη ροή το καθορισμένο υποσύνολο των byte από τον καθορισμένο πίνακα byte, διαφορετικά μετατρέπει το καθορισμένο υποσύνολο των byte από τον καθορισμένο πίνακα byte σε τύπο [char_type](./char_type/) και στη συνέχεια γράφει το αποτέλεσμα στη ροή. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| [WriteByte](./writebyte/)(uint8_t) override | Εάν η λειτουργία περιτύλιξης είναι δυαδική, γράφει στη ροή την καθορισμένη μη-υπογεγραμμένη τιμή 8-bit ακέραιου, διαφορετικά τη μετατρέπει σε τύπο [char_type](./char_type/) και στη συνέχεια γράφει το αποτέλεσμα στη ροή. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Null](../stream/null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Πληροφορίες RTTI. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Δείτε επίσης

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
