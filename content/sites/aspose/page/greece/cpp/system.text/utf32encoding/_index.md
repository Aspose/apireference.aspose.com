---
title: "Κλάση System::Text::UTF32Encoding"
linktitle: "UTF32Encoding"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Text::UTF32Encoding. Κωδικοποίηση UTF-32. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() . Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2600
url: /el/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


Κωδικοποίηση UTF-32. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Κλωνοποιεί το αντικείμενο κωδικοποίησης. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Συγκρίνει με το αντικείμενο. |
| [GetHashCode](./gethashcode/)() const override | Λαμβάνει τον κωδικό κατακερματισμού της κωδικοποίησης. |
| [GetPreamble](./getpreamble/)() override | Λαμβάνει την προαπόσπασμα κωδικοσελίδας. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | Συγκρίνει τις παραμέτρους των κωδικοποιήσεων. |
| [UTF32Encoding](./utf32encoding/)() | Κατασκευαστής. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | Κατασκευαστής. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | Κατασκευαστής. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | Μαγικός αριθμός που χρησιμοποιείται από το [Windows](../../system.windows/) για το αναγνωριστικό κωδικοσελίδας UTF-32 big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Προεπιλεγμένη τιμή κωδικοσελίδας. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | Μαγικός αριθμός που χρησιμοποιείται από το [Windows](../../system.windows/) για το αναγνωριστικό κωδικοσελίδας UTF-32 little endian. |
## Δείτε επίσης

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
