---
title: "System::IO::StringWriter κλάση"
linktitle: "StringWriter"
second_title: "Aspose.Page για C++"
description: "System::IO::StringWriter κλάση. Υλοποιεί έναν TextWriter που γράφει πληροφορίες σε μια συμβολοσειρά. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2500
url: /el/cpp/system.io/stringwriter/
---
## StringWriter class


Υλοποιεί έναν [TextWriter](../textwriter/) που γράφει πληροφορίες σε μια συμβολοσειρά. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class StringWriter : public System::IO::TextWriter
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Επιστρέφει την τρέχουσα κωδικοποίηση που χρησιμοποιείται. |
| virtual [GetStringBuilder](./getstringbuilder/)() | Επιστρέφει τον τρέχοντα χρησιμοποιούμενο StringBuilder. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | Δημιουργεί ένα νέο στιγμιότυπο του [StringWriter](./) χρησιμοποιώντας το καθορισμένο StringBuilder και το [IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | Δημιουργεί ένα νέο στιγμιότυπο του [StringWriter](./) χρησιμοποιώντας το καθορισμένο StringBuilder και το [IFormatProvider](../../system/iformatprovider/) από την τρέχουσα πολιτισμική ρύθμιση. |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | Δημιουργεί ένα νέο στιγμιότυπο του [StringWriter](./) χρησιμοποιώντας το καθορισμένο [IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)() | Δημιουργεί ένα νέο στιγμιότυπο του [StringWriter](./) χρησιμοποιώντας το [IFormatProvider](../../system/iformatprovider/) από την τρέχουσα πολιτισμική ρύθμιση. |
| [ToString](./tostring/)() const override | Επιστρέφει τη υποκείμενη συμβολοσειρά. |
| [Write](./write/)(char_t) override | Γράφει τον καθορισμένο χαρακτήρα στη ροή. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Γράφει το καθορισμένο υποσύνολο χαρακτήρων από τον καθορισμένο πίνακα χαρακτήρων στη ροή. |
| [Write](./write/)(const String\&) override | Γράφει τη καθορισμένη συμβολοσειρά στη ροή. |
## Δείτε επίσης

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
