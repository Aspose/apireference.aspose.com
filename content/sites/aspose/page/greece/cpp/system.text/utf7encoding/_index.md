---
title: "System::Text::UTF7Encoding κλάση"
linktitle: "UTF7Encoding"
second_title: "Aspose.Page για C++"
description: "System::Text::UTF7Encoding κλάση. Κωδικοποίηση UTF-7. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2700
url: /el/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


Κωδικοποίηση UTF-7. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Κλωνοποιεί το αντικείμενο κωδικοποίησης. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Συγκρίνει με το αντικείμενο. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση μιας συμβολοσειράς. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(const String\&) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer byte. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer byte. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| [GetDecoder](./getdecoder/)() override | Λάβετε έναν αποκωδικοποιητή που προωθεί αιτήματα σε αυτό το αντικείμενο. |
| [GetEncoder](./getencoder/)() override | Λάβετε έναν κωδικοποιητή που προωθεί αιτήματα σε αυτό το αντικείμενο. |
| [GetHashCode](./gethashcode/)() const override | Λαμβάνει τον κωδικό κατακερματισμού της κωδικοποίησης. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Λαμβάνει τον μέγιστο αριθμό byte που απαιτούνται για την κωδικοποίηση ενός συγκεκριμένου αριθμού χαρακτήρων. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Λαμβάνει τον μέγιστο αριθμό χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός συγκεκριμένου αριθμού byte. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| virtual [GetString](./getstring/)(uint8_t *, int) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Αποκωδικοποιεί ένα buffer από byte σε συμβολοσειρά. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | Συγκρίνει τις παραμέτρους των κωδικοποιήσεων. |
| [UTF7Encoding](./utf7encoding/)() | Κατασκευαστής. |
| [UTF7Encoding](./utf7encoding/)(bool) | Κατασκευαστής. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Προεπιλεγμένη τιμή κωδικοσελίδας. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | Μαγικός αριθμός που χρησιμοποιείται από το [Windows](../../system.windows/) για το αναγνωριστικό κωδικοσελίδας UTF-7. |
## Δείτε επίσης

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
