---
title: "System::String κλάση"
linktitle: "String"
second_title: "Aspose.Page για C++"
description: "System::String κλάση. Κλάση String που χρησιμοποιείται σε όλη τη βιβλιοθήκη. Είναι υποκατάστατο για το C# System.String κατά τη μετάφραση κώδικα. Για λόγους βελτιστοποίησης, δεν θεωρείται υποκατηγορία του Object. Αυτός ο τύπος πρέπει να κατανεμηθεί στη στοίβα και να περάσει σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την System::SmartPtr κλάση για τη διαχείριση αντικειμένων αυτού του τύπου σε C++."
type: docs
weight: 5800
url: /el/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) είναι τύπος τιμής στην πλευρά του C++ που υλοποιεί έμμεσα (χωρίς κληρονομικότητα) ορισμένα interfaces. |
| [begin](./begin/)() const | Επιστρέφει δείκτη στην αρχή του πραγματικού buffer της συμβολοσειράς. Ποτέ δεν επανεκχωρεί τίποτα. Δεν εγγυάται ότι το buffer θα είναι τερματισμένο με null. |
| [Clone](./clone/)() const | Δημιουργεί ένα αντίγραφο της τρέχουσας συμβολοσειράς. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greater-συγκρίνει δύο υποσυμβολοσειρές. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater-συγκρίνει δύο υποσυμβολοσειρές. |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greater-συγκρίνει δύο συμβολοσειρές. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greater-συγκρίνει δύο συμβολοσειρές. |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greater-συγκρίνει δύο συμβολοσειρές. |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater-συγκρίνει δύο συμβολοσειρές. |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greater-συγκρίνει δύο συμβολοσειρές χρησιμοποιώντας τη λειτουργία ordinal. |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greater-συγκρίνει δύο συμβολοσειρές χρησιμοποιώντας τη λειτουργία ordinal. |
| [CompareTo](./compareto/)(const String\&) const | Συγκρίνει δύο συμβολοσειρές σε στυλ 'less-equals-more'. Χρησιμοποιεί την τρέχουσα πολιτισμική ρύθμιση. |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | Συνενώνει συμβολοσειρές. |
| static [Concat](./concat/)(const String\&, const String\&) | Συνενώνει συμβολοσειρές. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | Συνενώνει συμβολοσειρές. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | Συνενώνει συμβολοσειρές. |
| [Contains](./contains/)(const String\&) const | Ελέγχει αν το str είναι υποσυμβολοσειρά της τρέχουσας συμβολοσειράς. |
| [Contains](./contains/)(char16_t) const | Ελέγχει αν η συμβολοσειρά περιέχει τον δεδομένο χαρακτήρα. |
| static [Copy](./copy/)(const String\&) | Δημιουργεί αντίγραφο συμβολοσειράς. |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | Αντιγράφει χαρακτήρες της συμβολοσειράς σε υπάρχοντα στοιχεία του πίνακα. Δεν γίνεται αλλαγή μεγέθους. |
| [end](./end/)() const | Επιστρέφει δείκτη στο τέλος του πραγματικού buffer της συμβολοσειράς. Ποτέ δεν επανεκχωρεί τίποτα. Δεν εγγυάται ότι το buffer θα είναι τερματισμένο με null. |
| [EndsWith](./endswith/)(const String\&) const | Ελέγχει αν η συμβολοσειρά τελειώνει με την καθορισμένη υποσυμβολοσειρά. |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | Ελέγχει αν η συμβολοσειρά τελειώνει με την καθορισμένη υποσυμβολοσειρά. |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Ελέγχει αν η συμβολοσειρά τελειώνει με την καθορισμένη υποσυμβολοσειρά. |
| [Equals](./equals/)(const String\&, System::StringComparison) const | [String](./) σύγκριση ισότητας. Υποστηρίζονται αρκετές λειτουργίες που παρέχονται από την απαρίθμηση [StringComparison](../stringcomparison/). |
| [Equals](./equals/)(const String\&) const | [String](./) σύγκριση ισότητας. Χρησιμοποιεί τη λειτουργία σύγκρισης [System::StringComparison::Ordinal](../stringcomparison/). |
| static [Equals](./equals/)(const String\&, const String\&) | Equal-συγκρίνει δύο συμβολοσειρές χρησιμοποιώντας τη λειτουργία σύγκρισης Ordial. |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Equal-συγκρίνει δύο συμβολοσειρές. |
| [FastToAscii](./fasttoascii/)(char, int) const | Προσπαθεί να μετατρέψει ένα [String](./) σε συμβολοσειρά ASCII. |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | Μορφοποιεί τη συμβολοσειρά σε στυλ C#. |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | Μορφοποιεί τη συμβολοσειρά σε στυλ C#. |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | Μορφοποιεί τη συμβολοσειρά σε στυλ C#. |
| static [Format](./format/)(const String\&, const Args\&...) | Μορφοποιεί τη συμβολοσειρά σε στυλ C#. |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | Μορφοποιεί τη συμβολοσειρά σε στυλ C#. |
| static [FromAscii](./fromascii/)(const char *) | Δημιουργεί [String](./) από συμβολοσειρά ASCII. |
| static [FromAscii](./fromascii/)(const char *, int) | Δημιουργεί [String](./) από συμβολοσειρά ASCII. |
| static [FromAscii](./fromascii/)(const std::string\&) | Δημιουργεί [String](./) από συμβολοσειρά ASCII. |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | Δημιουργεί [String](./) από συμβολοσειρά utf16. |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | Δημιουργεί [String](./) από συμβολοσειρά utf32. |
| static [FromUtf8](./fromutf8/)(const char *) | Δημιουργεί [String](./) από συμβολοσειρά utf8. |
| static [FromUtf8](./fromutf8/)(const char *, int) | Δημιουργεί [String](./) από συμβολοσειρά utf8. |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | Δημιουργεί [String](./) από συμβολοσειρά utf8. |
| static [FromUtf8](./fromutf8/)(const std::string\&) | Δημιουργεί [String](./) από συμβολοσειρά utf8. |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | Δημιουργεί [String](./) από widestring. |
| [get_Length](./get_length/)() const | Λαμβάνει το μήκος της συμβολοσειράς. |
| [GetHashCode](./gethashcode/)() const | Η συμβολοσειρά περιέχει κατακερματισμούς. Υλοποιήθηκε στο ICU, δεν ταιριάζει με τους κατακερματισμούς στο C#. |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | Αναζήτηση προς τα εμπρός σε υποσυμβολοσειρά. |
| [IndexOf](./indexof/)(char_t, int) const | Αναζήτηση χαρακτήρα προς τα εμπρός. |
| [IndexOf](./indexof/)(char_t, int, int) const | Αναζήτηση χαρακτήρα προς τα εμπρός σε υποσυμβολοσειρά. |
| [IndexOf](./indexof/)(const String\&, int) const | Αναζήτηση προς τα εμπρός σε υποσυμβολοσειρά. |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | Αναζήτηση προς τα εμπρός σε υποσυμβολοσειρά. |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | Αναζήτηση προς τα εμπρός σε υποσυμβολοσειρά. |
| [IndexOf](./indexof/)(const String\&, int, int) const | Αναζήτηση προς τα εμπρός σε υποσυμβολοσειρά. |
| [IndexOfAny](./indexofany/)(char_t, int) const | Αναζήτηση χαρακτήρα προς τα εμπρός. |
| [IndexOfAny](./indexofany/)(const String\&, int) const | Κατ' αυτόν τον τρόπο αναζητά όλους τους χαρακτήρες του str σε αυτό. Εάν βρεθεί ο πρώτος χαρακτήρας, επιστρέφεται η θέση του, διαφορετικά αναζητείται ο δεύτερος και ούτω καθεξής. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε ολόκληρη τη συμβολοσειρά. Συγκρίνει τον πρώτο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον δεύτερο κ.λπ. Επιστρέφει το δείκτη του πρώτου που ταιριάζει με οποιονδήποτε από τους στόχους χαρακτήρες. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε υποσυμβολοσειρά. Συγκρίνει τον πρώτο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον δεύτερο κ.λπ. Επιστρέφει το δείκτη του πρώτου που ταιριάζει με οποιονδήποτε από τους στόχους χαρακτήρες. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε υποσυμβολοσειρά. Συγκρίνει τον πρώτο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον δεύτερο κ.λπ. Επιστρέφει το δείκτη του πρώτου που ταιριάζει με οποιονδήποτε από τους στόχους χαρακτήρες. |
| [Insert](./insert/)(int, const String\&) const | Εισάγει υποσυμβολοσειρά στη συγκεκριμένη θέση. |
| [Is](./is/)(const System::TypeInfo\&) const | Ελέγχει εάν το αντικείμενο συμβολοσειράς είναι του τύπου που καθορίζεται από το [TypeInfo](../typeinfo/) που δόθηκε. |
| [IsAsciiString](./isasciistring/)() const | Δείχνει εάν ένα [String](./) περιέχει μόνο σύμβολα ASCII. |
| [IsEmpty](./isempty/)() const | Ελέγχει εάν η συμβολοσειρά είναι ταυτόχρονα μη μηδενική και κενή. |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | Ελέγχει εάν η συμβολοσειρά Unicode είναι κανονικοποιημένη χρησιμοποιώντας τη μορφή κανονικοποίησης που καθορίστηκε. |
| [IsNull](./isnull/)() const | Ελέγχει εάν η συμβολοσειρά θεωρείται μηδενική. Το [String](./) είναι μηδενικό μόνο εάν δημιουργείται μέσω του κατασκευαστή [String()](./string/), μετακινείται, αντιγράφεται ή εκχωρείται από μηδενική συμβολοσειρά ή κλήθηκε η μέθοδος [reset()](./reset/). |
| [IsNullOrEmpty](./isnullorempty/)() const | Ελέγχει εάν η συμβολοσειρά είναι κενή ή θεωρείται μηδενική. |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | Ελέγχει εάν η δοθείσα συμβολοσειρά είναι μηδενική ή κενή. |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | Δείχνει εάν μια συγκεκριμένη συμβολοσειρά είναι μηδενική, κενή ή αποτελείται μόνο από χαρακτήρες λευκού διαστήματος. |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | Συνδέει τον πίνακα χρησιμοποιώντας τη συμβολοσειρά ως διαχωριστικό. |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | Συνδέει τον πίνακα χρησιμοποιώντας τη συμβολοσειρά ως διαχωριστικό. |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | Συνδέει τον πίνακα χρησιμοποιώντας τη συμβολοσειρά ως διαχωριστικό. |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | Συνδέει τον πίνακα χρησιμοποιώντας τη συμβολοσειρά ως διαχωριστικό. |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | Αναζήτηση προς τα πίσω σε υποσυμβολοσειρά. |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | Αναζήτηση προς τα πίσω σε υποσυμβολοσειρά. |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | Αναζήτηση προς τα πίσω σε υποσυμβολοσειρά. |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | Αναζήτηση προς τα πίσω σε υποσυμβολοσειρά. |
| [LastIndexOf](./lastindexof/)(char_t) const | Αναζήτηση χαρακτήρα προς τα πίσω. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | Αναζήτηση χαρακτήρα προς τα πίσω. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | Αναζήτηση χαρακτήρα προς τα πίσω. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε ολόκληρη τη συμβολοσειρά προς τα πίσω. Συγκρίνει τον τελευταίο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον προηγούμενο κ.λπ. Επιστρέφει το δείκτη του πρώτου ευρέθέντος αντιστοιχίας. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε υποσυμβολοσειρά προς τα πίσω. Συγκρίνει τον τελευταίο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον προηγούμενο κ.λπ. Επιστρέφει το δείκτη του πρώτου ευρέθέντος αντιστοιχίας. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Αναζητά οποιονδήποτε από τους δοθέντες χαρακτήρες σε υποσυμβολοσειρά προς τα πίσω. Συγκρίνει τον τελευταίο χαρακτήρα της συμβολοσειράς με όλους τους χαρακτήρες στο anyOf, έπειτα συγκρίνει τον προηγούμενο κ.λπ. Επιστρέφει το δείκτη του πρώτου ευρέθέντος αντιστοιχίας. |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | Κανονικοποιεί τη συμβολοσειρά Unicode χρησιμοποιώντας τη μορφή κανονικοποίησης που καθορίστηκε. |
| [operator!=](./operator!=/)(const String\&) const | Τελεστής σύγκρισης ανισότητας. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Ελέγχει εάν η συμβολοσειρά δεν είναι μηδενική. Εφαρμόζει την ίδια λογική με την κλήση [IsNull()](./isnull/). |
| [operator+](./operator+/)(const String\&) const | [String](./) τελεστής συνένωσης. |
| [operator+](./operator+/)(const T\&) const | [String](./) σύζευξη με κυριολεκτικό συμβολοσειράς ή δείκτη χαρακτήρα συμβολοσειράς. |
| [operator+](./operator+/)(char_t) const | Προσθέτει χαρακτήρα στο τέλος της συμβολοσειράς. |
| [operator+](./operator+/)(int) const | Προσθέτει την αναπαράσταση σε συμβολοσειρά της ακέραιας τιμής στο τέλος της συμβολοσειράς. |
| [operator+](./operator+/)(uint32_t) const | Προσθέτει την αναπαράσταση σε συμβολοσειρά της μη-υπογεγραμμένης ακέραιας τιμής στο τέλος της συμβολοσειράς. |
| [operator+](./operator+/)(double) const | Προσθέτει την αναπαράσταση σε συμβολοσειρά της τιμής κινητής υποδιαστολής στο τέλος της συμβολοσειράς. |
| [operator+](./operator+/)(int64_t) const | Προσθέτει την αναπαράσταση σε συμβολοσειρά της ακέραιας τιμής στο τέλος της συμβολοσειράς. |
| [operator+](./operator+/)(const T\&) const | Προσθέτει την αναπαράσταση σε συμβολοσειρά του αντικειμένου τύπου αναφοράς στο τέλος της συμβολοσειράς. |
| [operator+](./operator+/)(const T\&) const | Προσθέτει την αναπαράσταση σε συμβολοσειρά του αντικειμένου τύπου αναφοράς στο τέλος της συμβολοσειράς. |
| [operator+](./operator+/)(T) const | Προσθέτει την αναπαράσταση σε συμβολοσειρά της λογικής τιμής στο τέλος της συμβολοσειράς. |
| [operator+=](./operator+=/)(char_t) | Τελεστής ανάθεσης σύζευξης. |
| [operator+=](./operator+=/)(const String\&) | Τελεστής ανάθεσης σύζευξης. |
| [operator+=](./operator+=/)(double) | Τελεστής ανάθεσης σύζευξης. |
| [operator+=](./operator+=/)(uint8_t) | Τελεστής ανάθεσης σύζευξης. |
| [operator+=](./operator+=/)(int16_t) | Τελεστής ανάθεσης σύζευξης. |
| [operator+=](./operator+=/)(uint16_t) | Τελεστής ανάθεσης σύζευξης. |
| [operator+=](./operator+=/)(int32_t) | Τελεστής ανάθεσης σύζευξης. |
| [operator+=](./operator+=/)(uint32_t) | Τελεστής ανάθεσης σύζευξης. |
| [operator+=](./operator+=/)(int64_t) | Τελεστής ανάθεσης σύζευξης. |
| [operator+=](./operator+=/)(uint64_t) | Τελεστής ανάθεσης σύζευξης. |
| [operator+=](./operator+=/)(T) | Τελεστής ανάθεσης σύζευξης. |
| [operator<](./operator_/)(const String\&) const | Συγκρίνει τις συμβολοσειρές κατά σειρά. |
| [operator=](./operator=/)(const String\&) | Τελεστής ανάθεσης. |
| [operator=](./operator=/)(String\&&) | Τελεστής ανάθεσης μετακίνησης. |
| [operator==](./operator==/)(const String\&) const | Τελεστής σύγκρισης ισότητας. |
| [operator==](./operator==/)(std::nullptr_t) const | Ελέγχει αν η συμβολοσειρά είναι null. Εφαρμόζει την ίδια λογική με την κλήση [IsNull()](./isnull/). |
| [operator>](./operator_/)(const String\&) const | Συγκρίνει τις συμβολοσειρές κατά σειρά. |
| [operator[]](./operator[]/)(int) const | Λαμβάνει τον χαρακτήρα στη συγκεκριμένη θέση. |
| [PadLeft](./padleft/)(int, char_t) const | Προσθέτει γεμίσματα στα αριστερά της αρχικής συμβολοσειράς. |
| [PadRight](./padright/)(int, char_t) const | Προσθέτει γεμίσματα στα δεξιά της αρχικής συμβολοσειράς. |
| [rbegin](./rbegin/)() const | Επιστρέφει αντίστροφο iterator στον τελευταίο χαρακτήρα (αν υπάρχει) του πραγματικού buffer της συμβολοσειράς. |
| [Remove](./remove/)(int32_t, int32_t) const | Εξάγει τα πάντα εκτός της υποσυμβολοσειράς από την τρέχουσα συμβολοσειρά. |
| [rend](./rend/)() const | Επιστρέφει αντίστροφο iterator πριν από τον πρώτο χαρακτήρα (αν υπάρχει) του πραγματικού buffer της συμβολοσειράς. |
| [Replace](./replace/)(char_t, char_t) const | Αντικαθιστά όλες τις εμφανίσεις του χαρακτήρα στη συμβολοσειρά. |
| [Replace](./replace/)(const String\&, const String\&) const | Αντικαθιστά όλες τις εμφανίσεις της αναζήτησης σε αυτή τη συμβολοσειρά. |
| [reset](./reset/)() | Ορίζει τη συμβολοσειρά σε null. Είναι ανάλογο του 'string_variable_name = null' στη C#. |
| [SetCharAt](./setcharat/)(int, char_t) | Ορίζει τον χαρακτήρα στη συγκεκριμένη θέση. |
| [Split](./split/)(char_t, StringSplitOptions) const | Διαιρεί τη συμβολοσειρά κατά χαρακτήρα. |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | Διαιρεί τη συμβολοσειρά κατά χαρακτήρα. |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | Διαιρεί τη συμβολοσειρά με έναν από δύο χαρακτήρες. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | Διαχωρίζει τη συμβολοσειρά με έναν από τους καθορισμένους χαρακτήρες. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | Διαχωρίζει τη συμβολοσειρά με έναν από τους καθορισμένους χαρακτήρες. |
| [Split](./split/)(const String\&, StringSplitOptions) const | Διαχωρίζει τη συμβολοσειρά με υποσυμβολοσειρά. |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | Διαχωρίζει τη συμβολοσειρά με υποσυμβολοσειρά. |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | Διαχωρίζει τη συμβολοσειρά με υποσυμβολοσειρά. |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | Διαχωρίζει τη συμβολοσειρά με υποσυμβολοσειρά. Προς το παρόν, υποστηρίζει μόνο πίνακα διαχωριστών με μηδέν ή ένα στοιχεία. |
| [StartsWith](./startswith/)(const String\&) const | Ελέγχει αν η συμβολοσειρά αρχίζει με την καθορισμένη υποσυμβολοσειρά. |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | Ελέγχει αν η συμβολοσειρά αρχίζει με την καθορισμένη υποσυμβολοσειρά. |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Ελέγχει αν η συμβολοσειρά αρχίζει με την καθορισμένη υποσυμβολοσειρά. |
| [String](./string/)() | Προεπιλεγμένος κατασκευαστής. Δημιουργεί αντικείμενο συμβολοσειράς που θεωρείται μηδενικό. |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | Δημιουργεί συμβολοσειρά από κυριολεκτικό συμβολοσειράς. Θεωρεί το κυριολεκτικό ως συμβολοσειρά με τερματισμό null, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του μεγέθους του κυριολεκτικού. |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | Δημιουργεί συμβολοσειρά από δείκτη χαρακτήρα συμβολοσειράς. Θεωρεί τη δείχθηκε συμβολοσειρά ως null-τερματισμένη, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του χαρακτήρα null. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | Δημιουργεί συμβολοσειρά από κυριολεκτικό συμβολοσειράς. Θεωρεί το κυριολεκτικό ως null-τερματισμένη συμβολοσειρά σε UTF8, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του μεγέθους του κυριολεκτικού. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | Δημιουργεί συμβολοσειρά από δείκτη χαρακτήρα συμβολοσειράς. Θεωρεί τη δείχθηκε συμβολοσειρά ως null-τερματισμένη σε UTF8, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του χαρακτήρα null. |
| [String](./string/)(const char16_t *, int) | Δημιουργεί συμβολοσειρά από δείκτη χαρακτήρα συμβολοσειράς και ρητό μήκος. |
| [String](./string/)(const char *, int) | Δημιουργεί συμβολοσειρά από δείκτη χαρακτήρα συμβολοσειράς και ρητό μήκος. |
| [String](./string/)(const char16_t *, int, int) | Δημιουργεί συμβολοσειρά από δείκτη χαρακτήρα συμβολοσειράς από τη θέση εκκίνησης χρησιμοποιώντας το μήκος. |
| explicit [String](./string/)(const char16_t, int) | Κατασκευαστής γεμίσματος. |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | Κατασκευαστής nullptr. Δηλώνεται ως πρότυπο για την επίλυση προτεραιοτήτων με άλλους κατασκευαστές προτύπων. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | Δημιουργεί συμβολοσειρά από κυριολεκτικό widestring. Θεωρεί το κυριολεκτικό ως null-τερματισμένη συμβολοσειρά, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του μεγέθους του κυριολεκτικού. Η μετατροπή από wchar_t είναι χρονοβόρα σε ορισμένες πλατφόρμες, επομένως δεν επιτρέπονται έμμεσες μετατροπές. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | Δημιουργεί συμβολοσειρά από δείκτη widecharacter συμβολοσειράς. Θεωρεί τη δείχθηκε συμβολοσειρά ως null-τερματισμένη, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του χαρακτήρα null. Η μετατροπή από wchar_t είναι χρονοβόρα σε ορισμένες πλατφόρμες, επομένως δεν επιτρέπονται έμμεσες μετατροπές. |
| explicit [String](./string/)(const wchar_t *, int) | Δημιουργεί συμβολοσειρά από δείκτη widecharacter συμβολοσειράς και ρητό μήκος. Η μετατροπή από wchar_t είναι χρονοβόρα σε ορισμένες πλατφόρμες, επομένως δεν επιτρέπονται έμμεσες μετατροπές. |
| explicit [String](./string/)(const wchar_t, int) | Κατασκευαστής γεμίσματος. Η μετατροπή από wchar_t είναι χρονοβόρα σε ορισμένες πλατφόρμες, επομένως δεν επιτρέπονται έμμεσες μετατροπές. |
| [String](./string/)(const String\&) | Κατασκευαστής αντιγραφής. |
| [String](./string/)(String\&&) | Κατασκευαστής μετακίνησης. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | Μετατρέπει ολόκληρο τον πίνακα χαρακτήρων σε συμβολοσειρά. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | Μετατρέπει υποεύρος πίνακα χαρακτήρων σε συμβολοσειρά. Εάν οι παράμετροι είναι εκτός ορίων του πίνακα, δημιουργείται κενή συμβολοσειρά. |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | Τυλίγει το UnicodeString σε [String](./). |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | Κατασκευαστής μετακίνησης. |
| explicit [String](./string/)(const std::wstring\&) | Δημιουργεί [String](./) από widestring. |
| explicit [String](./string/)(const std::u16string\&) | Δημιουργεί [String](./) από συμβολοσειρά utf16. |
| explicit [String](./string/)(const std::string\&) | Δημιουργεί [String](./) από συμβολοσειρά std::string που παρουσιάζεται σε μορφή UTF-8. |
| explicit [String](./string/)(const std::u32string\&) | Δημιουργεί [String](./) από συμβολοσειρά std::u32string. |
| [Substring](./substring/)(int32_t) const | Εξάγει υποσυμβολοσειρά. |
| [Substring](./substring/)(int32_t, int32_t) const | Εξάγει υποσυμβολοσειρά. |
| [ToAsciiString](./toasciistring/)() const | Μετατρέπει τη συμβολοσειρά σε std::string. Χρησιμοποιεί κωδικοποίηση ASCII. |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | Μετατρέπει τη συμβολοσειρά ή την υποσυμβολοσειρά σε πίνακα byte. |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | Μετατρέπει τη συμβολοσειρά ή το υποσύνολο σε πίνακα χαρακτήρων. |
| [ToLower](./tolower/)() const | Μετατρέπει όλους τους χαρακτήρες της συμβολοσειράς σε πεζά. |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Μετατρέπει όλους τους χαρακτήρες της συμβολοσειράς σε πεζά χρησιμοποιώντας συγκεκριμένο πολιτισμό. |
| [ToLowerInvariant](./tolowerinvariant/)() const | Μετατρέπει όλους τους χαρακτήρες της συμβολοσειράς σε πεζά χρησιμοποιώντας αμετάβλητο πολιτισμό. |
| [ToString](./tostring/)() const | Περιτύλιγμα για τη διαχείριση της κλάσης [String](./) σε περιβάλλοντα όπου καλείται η [ToString()](./tostring/) σε αντικείμενα τύπου τιμής. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Περιτύλιγμα για τη διαχείριση της κλάσης [String](./) σε περιβάλλοντα όπου καλείται η [ToString()](./tostring/) σε αντικείμενα τύπου τιμής. |
| [ToU16Str](./tou16str/)() const | Μετατρέπει τη συμβολοσειρά σε std::u16string. |
| [ToU32Str](./tou32str/)() const | Μετατρέπει τη συμβολοσειρά σε std::u32string. |
| [ToUpper](./toupper/)() const | Μετατρέπει όλους τους χαρακτήρες της συμβολοσειράς σε κεφαλαία. |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Μετατρέπει όλους τους χαρακτήρες της συμβολοσειράς σε κεφαλαία χρησιμοποιώντας συγκεκριμένο πολιτισμό. |
| [ToUpperInvariant](./toupperinvariant/)() const | Μετατρέπει όλους τους χαρακτήρες της συμβολοσειράς σε κεφαλαία χρησιμοποιώντας αμετάβλητο πολιτισμό. |
| [ToUtf8String](./toutf8string/)() const | Μετατρέπει τη συμβολοσειρά σε std::string. Χρησιμοποιεί κωδικοποίηση UTF-8. |
| [ToWCS](./towcs/)() const | Μετατρέπει τη συμβολοσειρά σε std::wstring. |
| [Trim](./trim/)() const | Αφαιρεί όλους τους χαρακτήρες κενών διαστημάτων από την αρχή και το τέλος της συμβολοσειράς. |
| [Trim](./trim/)(char_t) const | Αφαιρεί όλες τις εμφανίσεις του δοσμένου χαρακτήρα από την αρχή και το τέλος της συμβολοσειράς. |
| [Trim](./trim/)(const String\&) const | Αφαιρεί όλες τις εμφανίσεις των δοσμένων χαρακτήρων από την αρχή και το τέλος της συμβολοσειράς. |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | Αφαιρεί όλες τις εμφανίσεις των δοσμένων χαρακτήρων από την αρχή και το τέλος της συμβολοσειράς. |
| [TrimEnd](./trimend/)() const | Αφαιρεί όλους τους χαρακτήρες κενών διαστημάτων από το τέλος της συμβολοσειράς. |
| [TrimEnd](./trimend/)(char_t) const | Αφαιρεί όλες τις εμφανίσεις του δοσμένου χαρακτήρα από το τέλος της συμβολοσειράς. |
| [TrimEnd](./trimend/)(const String\&) const | Αφαιρεί όλες τις εμφανίσεις των δοσμένων χαρακτήρων από το τέλος της συμβολοσειράς. |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | Αφαιρεί όλες τις εμφανίσεις των δοσμένων χαρακτήρων από το τέλος της συμβολοσειράς. |
| [TrimStart](./trimstart/)() const | Αφαιρεί όλους τους χαρακτήρες κενών διαστημάτων από την αρχή της συμβολοσειράς. |
| [TrimStart](./trimstart/)(char_t) const | Αφαιρεί όλες τις εμφανίσεις του δοσμένου χαρακτήρα από την αρχή της συμβολοσειράς. |
| [TrimStart](./trimstart/)(const String\&) const | Αφαιρεί όλες τις εμφανίσεις των δοσμένων χαρακτήρων από την αρχή της συμβολοσειράς. |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | Αφαιρεί όλες τις εμφανίσεις των δοσμένων χαρακτήρων από την αρχή της συμβολοσειράς. |
| [u_str](./u_str/)() const | Επιστρέφει buffer τύπου null-terminated όπως το ICU. Μπορεί να επανακατανείμει τη συμβολοσειρά. |
| [~String](./~string/)() | Καταστροφέας. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](./empty/) | Κενή συμβολοσειρά. |
| static [Null](./null/) | Μηδενική συμβολοσειρά. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | Τύπος αντίστροφου επαναλήπτη. |
## Παρατηρήσεις



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // Δημιουργεί μια συμβολοσειρά από τον πίνακα χαρακτήρων και την εκτυπώνει.
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // Δημιουργήστε μια συμβολοσειρά από τον πίνακα των bytes και εκτυπώστε την.
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // Κόψτε τη συμβολοσειρά παρακάτω και εκτυπώστε την.
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // Εκτυπώστε τον αριθμό των λέξεων στο .
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
