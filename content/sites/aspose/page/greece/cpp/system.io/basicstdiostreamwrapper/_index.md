---
title: "System::IO::BasicSTDIOStreamWrapper κλάση"
linktitle: "BasicSTDIOStreamWrapper"
second_title: "Aspose.Page για C++"
description: "System::IO::BasicSTDIOStreamWrapper κλάση. Αντιπροσωπεύει έναν wrapper τύπου System.IO.Stream για std::basic_iostream και τα παράγωγά του. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.io/basicstdiostreamwrapper/
---
## BasicSTDIOStreamWrapper class


Represents a [System.IO.Stream](../stream/)-like wrapper for std::basic_iostream and its derived objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename T,typename>class BasicSTDIOStreamWrapper : public System::IO::BasicSTDIStreamWrapper<T>,
                                                             public System::IO::BasicSTDOStreamWrapper<T>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/)(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) | Δημιουργεί ένα νέο στιγμιότυπο του [BasicSTDIOStreamWrapper](./). |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/)(const BasicSTDIOStreamWrapper\&) | Κατασκευαστής αντιγραφής. Διαγράφηκε. |
| [Flush](./flush/)() override | Καθαρίζει τις εσωτερικές μνήμες του ρεύματος και γράφει όλα τα δεδομένα που έχουν αποθηκευτεί στην υποκείμενη αποθήκευση. |
| [operator=](./operator=/)(const BasicSTDIOStreamWrapper\&) | Τελεστής ανάθεσης αντιγραφής. Διαγράφηκε. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Εάν η λειτουργία περιτύλιξης είναι δυαδική, διαβάζει τον καθορισμένο αριθμό byte από το ρεύμα, διαφορετικά διαβάζει τον καθορισμένο αριθμό χαρακτήρων και τους μετατρέπει σε τύπο uint8_t. Γράφει το αποτέλεσμα της ανάγνωσης στον καθορισμένο πίνακα byte. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReadByte](./readbyte/)() override | Εάν η λειτουργία περιτύλιξης είναι δυαδική, διαβάζει ένα μόνο byte από την αποθήκευση του τελευταίου αποκωδικοποιημένου χαρακτήρα, διαφορετικά διαβάζει έναν μόνο χαρακτήρα από το ρεύμα και τον μετατρέπει σε τύπο uint8_t. |
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
| [BaseIType](./baseitype/) |  |
| [BaseOType](./baseotype/) |  |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Πληροφορίες RTTI. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Δείτε επίσης

* Class [BasicSTDIStreamWrapper](../basicstdistreamwrapper/)
* Class [BasicSTDOStreamWrapper](../basicstdostreamwrapper/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
