---
title: "Κλάση System::IO::BasicSTDIStreamWrapper"
linktitle: "BasicSTDIStreamWrapper"
second_title: "Aspose.Page για C++"
description: "System::IO::BasicSTDIStreamWrapper κλάση. Αναπαριστά ένα περιτύλιγμα τύπου System.IO.Stream για std::basic_istream και τα παράγωγά του. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.io/basicstdistreamwrapper/
---
## BasicSTDIStreamWrapper class


Αναπαριστά ένα [System.IO.Stream](../stream/)-τύπου περιτύλιγμα για std::basic_istream και τα παράγωγά του. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T,typename>class BasicSTDIStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Δημιουργεί ένα νέο στιγμιότυπο του [BasicSTDIStreamWrapper](./). |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(const BasicSTDIStreamWrapper\&) | Κατασκευαστής αντιγραφής. Διαγράφηκε. |
| [Flush](./flush/)() override | Καθαρίζει τα buffers αυτής της ροής και γράφει όλα τα δεδομένα που έχουν αποθηκευτεί προσωρινά στην υποκείμενη αποθήκευση. Δεν υποστηρίζεται! |
| [operator=](./operator=/)(const BasicSTDIStreamWrapper\&) | Τελεστής ανάθεσης αντιγραφής. Διαγράφηκε. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Εάν η λειτουργία περιτύλιξης είναι δυαδική, διαβάζει τον καθορισμένο αριθμό byte από το ρεύμα, διαφορετικά διαβάζει τον καθορισμένο αριθμό χαρακτήρων και τους μετατρέπει σε τύπο uint8_t. Γράφει το αποτέλεσμα της ανάγνωσης στον καθορισμένο πίνακα byte. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReadByte](./readbyte/)() override | Εάν η λειτουργία περιτύλιξης είναι δυαδική, διαβάζει ένα μόνο byte από την αποθήκευση του τελευταίου αποκωδικοποιημένου χαρακτήρα, διαφορετικά διαβάζει έναν μόνο χαρακτήρα από το ρεύμα και τον μετατρέπει σε τύπο uint8_t. |
| [SetLength](./setlength/)(int64_t) override | Ορίζει το μήκος της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. Δεν υποστηρίζεται! |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Εάν η λειτουργία περιτύλιξης είναι δυαδική, γράφει στη ροή το καθορισμένο υποσύνολο των byte από τον καθορισμένο πίνακα byte, διαφορετικά μετατρέπει το καθορισμένο υποσύνολο των byte από τον καθορισμένο πίνακα byte σε τύπο [char_type](./char_type/) και στη συνέχεια γράφει το αποτέλεσμα στη ροή. Δεν υποστηρίζεται! |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή. |
| [WriteByte](./writebyte/)(uint8_t) override | Εάν η λειτουργία περιτύλιξης είναι δυαδική, γράφει στη ροή την καθορισμένη μη υπογεγραμμένη τιμή 8-bit, διαφορετικά τη μετατρέπει σε τύπο [char_type](./char_type/) και στη συνέχεια γράφει το αποτέλεσμα στη ροή. Δεν υποστηρίζεται! |
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
