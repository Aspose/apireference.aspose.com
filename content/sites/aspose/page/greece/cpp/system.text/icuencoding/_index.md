---
title: "System::Text::ICUEncoding class"
linktitle: "ICUEncoding"
second_title: "Aspose.Page για C++"
description: "System::Text::ICUEncoding class. Υλοποίηση κωδικοποίησης βασισμένη σε ICU. ΜΟΝΟ ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2200
url: /el/cpp/system.text/icuencoding/
---
## ICUEncoding class


ICU-based encoding implementation. ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ICUEncoding : public System::Text::Encoding
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(const String\&) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Λάβετε τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer byte. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte. |
| [GetDecoder](./getdecoder/)() override | Λάβετε έναν αποκωδικοποιητή που προωθεί αιτήματα σε αυτό το αντικείμενο. |
| [GetEncoder](./getencoder/)() override | Λάβετε έναν κωδικοποιητή που προωθεί αιτήματα σε αυτό το αντικείμενο. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Λαμβάνει τον μέγιστο αριθμό byte που απαιτούνται για την κωδικοποίηση ενός συγκεκριμένου αριθμού χαρακτήρων. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Λαμβάνει τον μέγιστο αριθμό χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός συγκεκριμένου αριθμού byte. |
| [GetPreamble](./getpreamble/)() override | Επιστρέφει μια ακολουθία byte που υποδεικνύει την κωδικοποίηση (π.χ. BOM). |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | Κατασκευαστής. |
| [operator==](./operator==/)(const ICUEncoding\&) const | Συγκρίνει κωδικοποιήσεις χρησιμοποιώντας κωδικοσελίδες. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Προεπιλεγμένη τιμή κωδικοσελίδας. |
## Δείτε επίσης

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
