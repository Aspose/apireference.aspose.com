---
title: "System::Char κλάση"
linktitle: "Char"
second_title: "Aspose.Page για C++"
description: "System::Char κλάση. Παρέχει μεθόδους για τη διαχείριση χαρακτήρων που αντιπροσωπεύονται ως μονάδες κώδικα UTF-16. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπων. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με οποιονδήποτε τρόπο σε C++."
type: docs
weight: 1200
url: /el/cpp/system/char/
---
## Char class


Παρέχει μεθόδους για τη διαχείριση χαρακτήρων που αναπαρίστανται ως μονάδες κώδικα UTF-16. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπου. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με κανέναν τρόπο.

```cpp
class Char
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | Μετατρέπει τη μονάδα κώδικα UTF-32 σε ένα στιγμιότυπο της κλάσης [System::String](../string/). |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | Μετατρέπει το καθορισμένο ζεύγος διαδεκτών UTF-16 σε μονάδα κώδικα UTF-32. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | Μετατρέπει την τιμή ενός χαρακτήρα κωδικοποιημένου σε UTF-16 ή ζεύγους υποκατάστασης σε καθορισμένη θέση σε μια συμβολοσειρά σε μονάδα κώδικα UTF-32. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | Μετατρέπει τον καθορισμένο χαρακτήρα UTF-16 σε αριθμητική τιμή κινητής υποδιαστολής διπλής ακρίβειας. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | Επιστρέφει μια τιμή που αντιπροσωπεύει την κατηγορία Unicode του καθορισμένου χαρακτήρα. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως χαρακτήρας λευκού διαστήματος ASCII. |
| static [IsControl](./iscontrol/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στο καθορισμένο buffer χαρακτήρων ταξινομείται ως χαρακτήρας ελέγχου Unicode. |
| static [IsControl](./iscontrol/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως χαρακτήρας ελέγχου Unicode. |
| static [IsDigit](./isdigit/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στο καθορισμένο buffer χαρακτήρων ταξινομείται ως δεκαδικό ψηφίο. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στην καθορισμένη συμβολοσειρά ταξινομείται ως δεκαδικό ψηφίο. |
| static [IsDigit](./isdigit/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως δεκαδικό ψηφίο. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στην καθορισμένη συμβολοσειρά είναι μονάδα κώδικα υψηλού υποκατάστασης UTF-16. |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στο καθορισμένο buffer χαρακτήρων είναι υψηλό υποκατάστατο. |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας είναι υψηλό υποκατάστατο. |
| static [IsLetter](./isletter/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στο καθορισμένο buffer χαρακτήρων ταξινομείται ως γράμμα Unicode. |
| static [IsLetter](./isletter/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως γράμμα Unicode. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στο καθορισμένο buffer χαρακτήρων ταξινομείται ως γράμμα Unicode ή δεκαδικό ψηφίο. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως γράμμα Unicode ή δεκαδικό ψηφίο. |
| static [IsLower](./islower/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στο καθορισμένο buffer χαρακτήρων ταξινομείται ως πεζό γράμμα. |
| static [IsLower](./islower/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως πεζό γράμμα. |
| static [IsLower](./islower/)(const String\&, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στην καθορισμένη συμβολοσειρά ταξινομείται ως πεζό γράμμα. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στο καθορισμένο buffer χαρακτήρων είναι χαμηλό υποκατάστατο. |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας είναι χαμηλό υποκατάστατο. |
| static [IsNumber](./isnumber/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στο καθορισμένο buffer χαρακτήρων ταξινομείται ως αριθμός. |
| static [IsNumber](./isnumber/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως αριθμός. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη καθορισμένη θέση στο καθορισμένο buffer χαρακτήρων ταξινομείται ως χαρακτήρας στίξης. |
| static [IsPunctuation](./ispunctuation/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως χαρακτήρας στίξης. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη συγκεκριμένη θέση στον καθορισμένο buffer χαρακτήρων ταξινομείται ως χαρακτήρας διαχωριστικού. |
| static [IsSeparator](./isseparator/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως χαρακτήρας διαχωριστικού. |
| static [IsSurrogate](./issurrogate/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας είναι μονάδα κώδικα υποκατάστασης UTF-16. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | Καθορίζει εάν ο χαρακτήρας στη συγκεκριμένη θέση στη συγκεκριμένη συμβολοσειρά είναι μονάδα κώδικα υποκατάστασης UTF-16. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | Καθορίζει εάν οι δύο καθορισμένοι χαρακτήρες για ένα ζεύγος υποκατάστασης UTF-16. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | Καθορίζει εάν δύο διαδοχικοί χαρακτήρες στον καθορισμένο buffer χαρακτήρων αποτελούν ζεύγος υποκατάστασης. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη συγκεκριμένη θέση στον καθορισμένο buffer χαρακτήρων ταξινομείται ως χαρακτήρας συμβόλου. |
| static [IsSymbol](./issymbol/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως χαρακτήρας συμβόλου. |
| static [IsUpper](./isupper/)(const String\&, int) | Καθορίζει εάν ο χαρακτήρας στη συγκεκριμένη θέση στη συγκεκριμένη συμβολοσειρά ταξινομείται ως κεφαλαίο γράμμα. |
| static [IsUpper](./isupper/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη συγκεκριμένη θέση στον καθορισμένο buffer χαρακτήρων ταξινομείται ως κεφαλαίο γράμμα. |
| static [IsUpper](./isupper/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως κεφαλαίο γράμμα. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | Καθορίζει εάν ο χαρακτήρας στη συγκεκριμένη θέση στον καθορισμένο buffer χαρακτήρων ταξινομείται ως χαρακτήρας λευκού διαστήματος. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας ταξινομείται ως χαρακτήρας λευκού διαστήματος. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | Καθορίζει εάν ο χαρακτήρας στη συγκεκριμένη θέση στη συγκεκριμένη συμβολοσειρά ταξινομείται ως χαρακτήρας λευκού διαστήματος. |
| static [Parse](./parse/)(const String\&) | Μετατρέπει τον πρώτο και μοναδικό χαρακτήρα της συγκεκριμένης συμβολοσειράς σε τιμή char_t. |
| static [ToLower](./tolower/)(char_t) | Μετατρέπει τον καθορισμένο χαρακτήρα σε πεζά. |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Μετατρέπει τον καθορισμένο χαρακτήρα σε πεζά. |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | Μετατρέπει τον καθορισμένο χαρακτήρα σε πεζά. |
| static [ToUpper](./toupper/)(char_t) | Μετατρέπει τον καθορισμένο χαρακτήρα σε κεφαλαία. |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Μετατρέπει τον καθορισμένο χαρακτήρα σε κεφαλαία. |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | Μετατρέπει τον καθορισμένο χαρακτήρα σε κεφαλαία. |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | Προσπαθεί να μετατρέψει μια συμβολοσειρά που αποτελείται από έναν μόνο χαρακτήρα σε χαρακτήρα UTF-16. Η συνάρτηση επιτυγχάνει μόνο όταν η είσοδος δεν είναι null και έχει μήκος ακριβώς ενός χαρακτήρα. |
## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
