---
title: "System::TimeSpan class"
linktitle: "TimeSpan"
second_title: "Aspose.Page για C++"
description: "System::TimeSpan class. Αντιπροσωπεύει ένα χρονικό διάστημα. Αυτός ο τύπος πρέπει να κατανεμηθεί στη στοίβα και να περάσει σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση System::SmartPtr για τη διαχείριση αντικειμένων αυτού του τύπου σε C++."
type: docs
weight: 6100
url: /el/cpp/system/timespan/
---
## TimeSpan class


Αντιπροσωπεύει ένα χρονικό διάστημα. Αυτός ο τύπος πρέπει να κατανεμηθεί στη στοίβα και να περάσει σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση [System::SmartPtr](../smartptr/) για τη διαχείριση αντικειμένων αυτού του τύπου.

```cpp
class TimeSpan
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Επιστρέφει μια νέα παρουσία της κλάσης [TimeSpan](./) που αντιπροσωπεύει ένα χρονικό διάστημα το οποίο είναι το άθροισμα των χρονικών διαστημάτων που αντιπροσωπεύονται από το τρέχον και το καθορισμένο αντικείμενο. |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | Συγκρίνει δύο αντικείμενα [TimeSpan](./). |
| [CompareTo](./compareto/)(TimeSpan) const | Συγκρίνει το τρέχον και το καθορισμένο αντικείμενο. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Συγκρίνει το τρέχον και το καθορισμένο αντικείμενο. |
| [Duration](./duration/)() const | Επιστρέφει ένα νέο στιγμιότυπο του αντικειμένου [TimeSpan](./) του οποίου η τιμή είναι η απόλυτη τιμή του τρέχοντος αντικειμένου. |
| [Equals](./equals/)(TimeSpan) const | Καθορίζει εάν το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι ίσο με το χρονικό διάστημα που αντιπροσωπεύεται από το καθορισμένο αντικείμενο. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Καθορίζει εάν το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι ίσο με το χρονικό διάστημα που αντιπροσωπεύεται από το καθορισμένο αντικείμενο. |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | Επιστρέφει true εάν τα καθορισμένα αντικείμενα αντιπροσωπεύουν το ίδιο χρονικό διάστημα, διαφορετικά - false. |
| static [FromDays](./fromdays/)(double) | Επιστρέφει ένα νέο αντικείμενο [TimeSpan](./) που αντιπροσωπεύει το καθορισμένο διάστημα. |
| static [FromHours](./fromhours/)(double) | Επιστρέφει ένα νέο αντικείμενο [TimeSpan](./) που αντιπροσωπεύει το καθορισμένο διάστημα. |
| static [FromMilliseconds](./frommilliseconds/)(double) | Επιστρέφει ένα νέο αντικείμενο [TimeSpan](./) που αντιπροσωπεύει το καθορισμένο διάστημα. |
| static [FromMinutes](./fromminutes/)(double) | Επιστρέφει ένα νέο αντικείμενο [TimeSpan](./) που αντιπροσωπεύει το καθορισμένο διάστημα. |
| static [FromSeconds](./fromseconds/)(double) | Επιστρέφει ένα νέο αντικείμενο [TimeSpan](./) που αντιπροσωπεύει το καθορισμένο διάστημα. |
| static [FromTicks](./fromticks/)(int64_t) | Επιστρέφει ένα νέο αντικείμενο [TimeSpan](./) που αντιπροσωπεύει το καθορισμένο διάστημα. |
| [get_Days](./get_days/)() const | Επιστρέφει το στοιχείο ημερών του χρονικού διαστήματος που αντιπροσωπεύεται από το τρέχον αντικείμενο [TimeSpan](./). |
| [get_Hours](./get_hours/)() const | Επιστρέφει το στοιχείο ωρών του χρονικού διαστήματος που αντιπροσωπεύεται από το τρέχον αντικείμενο [TimeSpan](./). |
| [get_Milliseconds](./get_milliseconds/)() const | Επιστρέφει το στοιχείο χιλιοστών του χρονικού διαστήματος που αντιπροσωπεύεται από το τρέχον αντικείμενο [TimeSpan](./). |
| [get_Minutes](./get_minutes/)() const | Επιστρέφει το στοιχείο λεπτών του χρονικού διαστήματος που αντιπροσωπεύεται από το τρέχον αντικείμενο [TimeSpan](./). |
| [get_Seconds](./get_seconds/)() const | Επιστρέφει το στοιχείο δευτερολέπτων του χρονικού διαστήματος που αντιπροσωπεύεται από το τρέχον αντικείμενο [TimeSpan](./). |
| [get_Ticks](./get_ticks/)() const | Επιστρέφει τον αριθμό των διαστημάτων 100-νανοδευτερολέπτων που αποτελούν το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο [TimeSpan](./). |
| [get_TotalDays](./get_totaldays/)() const | Επιστρέφει την τιμή του τρέχοντος αντικειμένου [TimeSpan](./) εκφρασμένη σε ολόκληρες και κλασματικές ημέρες. |
| [get_TotalHours](./get_totalhours/)() const | Επιστρέφει την τιμή του τρέχοντος αντικειμένου [TimeSpan](./) εκφρασμένη σε ολόκληρες και κλασματικές ώρες. |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | Επιστρέφει την τιμή του τρέχοντος αντικειμένου [TimeSpan](./) εκφρασμένη σε ολόκληρες και κλασματικές χιλιοστά του δευτερολέπτου. |
| [get_TotalMinutes](./get_totalminutes/)() const | Επιστρέφει την τιμή του τρέχοντος αντικειμένου [TimeSpan](./) εκφρασμένη σε ολόκληρα και κλασματικά λεπτά. |
| [get_TotalSeconds](./get_totalseconds/)() const | Επιστρέφει την τιμή του τρέχοντος αντικειμένου [TimeSpan](./) εκφρασμένη σε ολόκληρα και κλασματικά δευτερόλεπτα. |
| [GetHashCode](./gethashcode/)() const | Επιστρέφει έναν κωδικό κατακερματισμού για το τρέχον αντικείμενο. |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | Επιστρέφει ένα νέο στιγμιότυπο του αντικειμένου [TimeSpan](./) που αντιπροσωπεύει την αρνητική τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο [TimeSpan](./). |
| [operator!=](./operator!=/)(TimeSpan) const | Καθορίζει εάν το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο δεν είναι ίσο με το χρονικό διάστημα που αντιπροσωπεύεται από το καθορισμένο αντικείμενο. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Επιστρέφει μια νέα παρουσία της κλάσης [TimeSpan](./) που αντιπροσωπεύει ένα χρονικό διάστημα το οποίο είναι το άθροισμα των χρονικών διαστημάτων που αντιπροσωπεύονται από το τρέχον και το καθορισμένο αντικείμενο. |
| [operator+](./operator+/)() const | Επιστρέφει τον εαυτό του. |
| [operator+=](./operator+=/)(TimeSpan) | Αναθέτει στο τρέχον αντικείμενο το χρονικό διάστημα που είναι το άθροισμα του χρονικού διαστήματος που αντιπροσωπεύεται από το τρέχον και τα καθορισμένα αντικείμενα. |
| [operator-](./operator-/)(TimeSpan) const | Επιστρέφει ένα νέο στιγμιότυπο της κλάσης [TimeSpan](./) που αντιπροσωπεύει ένα χρονικό διάστημα που είναι το αποτέλεσμα της αφαίρεσης του χρονικού διαστήματος που αντιπροσωπεύεται από το καθορισμένο αντικείμενο από το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [operator-](./operator-/)() const | Επιστρέφει ένα νέο στιγμιότυπο του αντικειμένου [TimeSpan](./) που αντιπροσωπεύει την αρνητική τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο [TimeSpan](./). |
| [operator-=](./operator-=/)(TimeSpan) | Αναθέτει στο τρέχον αντικείμενο το χρονικό διάστημα που είναι το αποτέλεσμα της αφαίρεσης του χρονικού διαστήματος που αντιπροσωπεύεται από το καθορισμένο αντικείμενο από το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | Καθορίζει εάν το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερο από το χρονικό διάστημα που αντιπροσωπεύεται από το καθορισμένο αντικείμενο. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | Καθορίζει εάν το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερο ή ίσο με το χρονικό διάστημα που αντιπροσωπεύεται από το καθορισμένο αντικείμενο. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | Ορίζει το χρονικό διάστημα που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [TimeSpan](./) στο τρέχον αντικείμενο [TimeSpan](./). |
| [operator==](./operator==/)(TimeSpan) const | Καθορίζει εάν το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι ίσο με το χρονικό διάστημα που αντιπροσωπεύεται από το καθορισμένο αντικείμενο. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | Καθορίζει εάν το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερο από το χρονικό διάστημα που αντιπροσωπεύεται από το καθορισμένο αντικείμενο. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | Καθορίζει εάν το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερο ή ίσο με το χρονικό διάστημα που αντιπροσωπεύεται από το καθορισμένο αντικείμενο. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Μετατρέπει τη συμβολοσειρά σε ισοδύναμο αντικείμενο [TimeSpan](./). |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Μετατρέπει τη συμβολοσειρά σε ισοδύναμο αντικείμενο [TimeSpan](./) χρησιμοποιώντας τον καθορισμένο πάροχο μορφής. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Μετατρέπει τη συμβολοσειρά σε ισοδύναμο αντικείμενο [TimeSpan](./) χρησιμοποιώντας τις καθορισμένες μορφές, τον πάροχο μορφής και τα στυλ. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Μετατρέπει τη συμβολοσειρά σε ισοδύναμο αντικείμενο [TimeSpan](./) χρησιμοποιώντας τη καθορισμένη μορφή, τον πάροχο μορφής και τα στυλ. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | Επιστρέφει ένα νέο στιγμιότυπο της κλάσης [TimeSpan](./) που αντιπροσωπεύει ένα χρονικό διάστημα που είναι το αποτέλεσμα της αφαίρεσης του χρονικού διαστήματος που αντιπροσωπεύεται από το καθορισμένο αντικείμενο από το χρονικό διάστημα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [TimeSpan](./timespan/)() | Δημιουργεί ένα αντικείμενο [TimeSpan](./) που αντιπροσωπεύει ένα μηδενικό χρονικό διάστημα. |
| explicit [TimeSpan](./timespan/)(int64_t) | Δημιουργεί μια παρουσία της κλάσης [TimeSpan](./) που αντιπροσωπεύει το καθορισμένο χρονικό διάστημα. |
| [TimeSpan](./timespan/)(int, int, int) | Δημιουργεί μια παρουσία της κλάσης [TimeSpan](./) που αντιπροσωπεύει το χρονικό διάστημα ίσο με το άθροισμα του καθορισμένου αριθμού ωρών, λεπτών και δευτερολέπτων. |
| [TimeSpan](./timespan/)(int, int, int, int, int) | Δημιουργεί μια παρουσία της κλάσης [TimeSpan](./) που αντιπροσωπεύει το χρονικό διάστημα ίσο με το άθροισμα του καθορισμένου αριθμού ωρών, λεπτών, δευτερολέπτων και χιλιοσκοδευτερόλεπτα. |
| [TimeSpan](./timespan/)(const TimeSpan\&) | Δημιουργεί ένα αντικείμενο [TimeSpan](./) που αντιπροσωπεύει το χρονικό διάστημα ίσο με το χρονικό διάστημα που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [TimeSpan](./). |
| [ToString](./tostring/)() const | Επιστρέφει την αναπαράσταση της συμβολοσειράς του χρονικού διαστήματος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [ToString](./tostring/)(const String\&) const | Μετατρέπει την τιμή του τρέχοντος αντικειμένου σε ισοδύναμη αναπαράσταση συμβολοσειράς, χρησιμοποιώντας τη καθορισμένη μορφή. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Μετατρέπει την τιμή του τρέχοντος αντικειμένου σε ισοδύναμη αναπαράσταση συμβολοσειράς, χρησιμοποιώντας τη καθορισμένη μορφή και τον πάροχο μορφής. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | Μετατρέπει τη συμβολοσειρά σε ισοδύναμο αντικείμενο [TimeSpan](./) και επιστρέφει το αποτέλεσμα της μετατροπής. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Μετατρέπει τη συμβολοσειρά σε ισοδύναμο αντικείμενο [TimeSpan](./) χρησιμοποιώντας τον καθορισμένο πάροχο μορφής και επιστρέφει το αποτέλεσμα της μετατροπής. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Μετατρέπει τη συμβολοσειρά σε ισοδύναμο αντικείμενο [TimeSpan](./) χρησιμοποιώντας τις καθορισμένες μορφές και τον πάροχο μορφής, και επιστρέφει το αποτέλεσμα της μετατροπής. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Μετατρέπει τη συμβολοσειρά σε ισοδύναμο αντικείμενο [TimeSpan](./) χρησιμοποιώντας τη καθορισμένη μορφή, τον πάροχο μορφής και τα στυλ, και επιστρέφει το αποτέλεσμα της μετατροπής. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Μετατρέπει τη συμβολοσειρά σε ισοδύναμο αντικείμενο [TimeSpan](./) χρησιμοποιώντας τις καθορισμένες μορφές, τον πάροχο μορφής και τα στυλ, και επιστρέφει το αποτέλεσμα της μετατροπής. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Μετατρέπει τη συμβολοσειρά σε ισοδύναμο αντικείμενο [TimeSpan](./) χρησιμοποιώντας τη καθορισμένη μορφή και τον πάροχο μορφής, και επιστρέφει το αποτέλεσμα της μετατροπής. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | Επιστρέφει ένα αντικείμενο [TypeInfo](../typeinfo/) που αντιπροσωπεύει τη δομή [TimeSpan](./). |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [MaxValue](./maxvalue/) | Το αντικείμενο [TimeSpan](./) που αντιπροσωπεύει το μεγαλύτερο δυνατό διάστημα. |
| static [MinValue](./minvalue/) | /// Το αντικείμενο [TimeSpan](./) που αντιπροσωπεύει το μικρότερο δυνατό διάστημα. |
| static constexpr [TicksPerDay](./ticksperday/) | Ο αριθμός των διαστημάτων των 100 νανοδευτερολέπτων σε μια ημέρα (διάστημα 24 ωρών). |
| static constexpr [TicksPerHour](./ticksperhour/) | Ο αριθμός των διαστημάτων των 100 νανοδευτερολέπτων σε μία ώρα. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Ο αριθμός των διαστημάτων των 100 νανοδευτερολέπτων σε ένα χιλιοστό του δευτερολέπτου. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Ο αριθμός των διαστημάτων 100 νανοδευτερολέπτων σε ένα λεπτό. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Ο αριθμός των διαστημάτων 100 νανοδευτερολέπτων σε ένα δευτερόλεπτο. |
| static [Zero](./zero/) | Το αντικείμενο [TimeSpan](./) που αντιπροσωπεύει το μηδενικό διάστημα. |
## Παρατηρήσεις



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
