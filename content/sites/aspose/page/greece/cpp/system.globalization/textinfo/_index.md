---
title: "System::Globalization::TextInfo class"
linktitle: "TextInfo"
second_title: "Aspose.Page για C++"
description: "System::Globalization::TextInfo class. Ορίζει ιδιότητες κειμένου ειδικές για την περιοχή. Οι λειτουργίες ορισμού είναι ενεργοποιημένες μόνο σε αντικείμενα που δεν είναι μόνο για ανάγνωση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2800
url: /el/cpp/system.globalization/textinfo/
---
## TextInfo class


Ορίζει ιδιότητες κειμένου ειδικές για την περιοχή. Οι λειτουργίες ορισμού είναι ενεργοποιημένες μόνο σε αντικείμενα που δεν είναι μόνο για ανάγνωση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class TextInfo : public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Πληροφορίες RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | Λαμβάνει τη σελίδα κώδικα ANSI. |
| [get_CultureName](./get_culturename/)() const | Λαμβάνει το όνομα του πολιτισμού. |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | Λαμβάνει τη σελίδα κώδικα EBCDIC. |
| [get_IsReadOnly](./get_isreadonly/)() const | Ελέγχει αν η μορφή είναι μόνο για ανάγνωση. |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | Ελέγχει αν το κείμενο γράφεται από αριστερά προς δεξιά. |
| [get_LCID](./get_lcid/)() const | Λαμβάνει το αναγνωριστικό περιοχής. |
| virtual [get_ListSeparator](./get_listseparator/)() const | Λαμβάνει το διαχωριστικό λίστας. |
| virtual [get_MacCodePage](./get_maccodepage/)() const | Λαμβάνει τη σελίδα κώδικα Macintosh. |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | Λαμβάνει τη σελίδα κώδικα OEM. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | Λαμβάνει μια έκδοση μόνο για ανάγνωση του πολιτισμού. |
| virtual [set_ListSeparator](./set_listseparator/)(String) | Ορίζει το διαχωριστικό λίστας. |
| [TextInfo](./textinfo/)(const TextInfo\&) | Πληροφορίες RTTI. |
| virtual [ToLower](./tolower/)(char_t) const | Μετατρέπει τον χαρακτήρα σε πεζά. |
| virtual [ToLower](./tolower/)(String) const | Μετατρέπει τη συμβολοσειρά σε πεζά. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| [ToTitleCase](./totitlecase/)(String) const | Μετατρέπει τη συμβολοσειρά σε μορφή τίτλου (εκτός από ακρωνύμια που είναι ήδη κεφαλαία). |
| virtual [ToUpper](./toupper/)(char_t) const | Μετατρέπει τον χαρακτήρα σε κεφαλαία. |
| virtual [ToUpper](./toupper/)(String) const | Μετατρέπει τη συμβολοσειρά σε κεφαλαία. |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
