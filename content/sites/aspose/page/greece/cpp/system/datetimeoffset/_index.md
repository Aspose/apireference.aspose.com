---
title: "System::DateTimeOffset class"
linktitle: "DateTimeOffset"
second_title: "Aspose.Page για C++"
description: "System::DateTimeOffset class. Περιέχει την ημερομηνία και την ώρα της ημέρας σε σχέση με το Συντονισμένο Παγκόσμιο Χρόνο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1700
url: /el/cpp/system/datetimeoffset/
---
## DateTimeOffset class


Περιέχει την ημερομηνία και την ώρα της ημέρας σε σχέση με το Συντονισμένο Παγκόσμιο Χρόνο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class DateTimeOffset
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Προσθέτει ένα καθορισμένο χρονικό διάστημα στο αντικείμενο [DateTimeOffset](./). |
| [AddDays](./adddays/)(double) const | Προσθέτει έναν καθορισμένο αριθμό ημερών στο αντικείμενο [DateTimeOffset](./). |
| [AddHours](./addhours/)(double) const | Προσθέτει έναν καθορισμένο αριθμό ωρών στο αντικείμενο [DateTimeOffset](./). |
| [AddMilliseconds](./addmilliseconds/)(double) const | Προσθέτει έναν καθορισμένο αριθμό χιλιοστών του δευτερολέπτου στο αντικείμενο [DateTimeOffset](./). |
| [AddMinutes](./addminutes/)(double) const | Προσθέτει έναν καθορισμένο αριθμό λεπτών στο αντικείμενο [DateTimeOffset](./). |
| [AddMonths](./addmonths/)(int) const | Προσθέτει έναν καθορισμένο αριθμό μηνών στο αντικείμενο [DateTimeOffset](./). |
| [AddSeconds](./addseconds/)(double) const | Προσθέτει έναν καθορισμένο αριθμό δευτερολέπτων στο αντικείμενο [DateTimeOffset](./). |
| [AddTicks](./addticks/)(int64_t) const | Προσθέτει έναν καθορισμένο αριθμό ticks στο αντικείμενο [DateTimeOffset](./). |
| [AddYears](./addyears/)(int) const | Προσθέτει έναν καθορισμένο αριθμό ετών στο αντικείμενο [DateTimeOffset](./). |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | Συγκρίνει δύο αντικείμενα [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | Συγκρίνει δύο αντικείμενα [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Συγκρίνει δύο αντικείμενα [DateTimeOffset](./). |
| [DateTimeOffset](./datetimeoffset/)() | Προεπιλεγμένος κατασκευαστής. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | Κατασκευαστής. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | Κατασκευαστής. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | Κατασκευαστής. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | Κατασκευαστής. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | Κατασκευαστής. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | Κατασκευαστής. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | Ελέγχει αν δύο αντικείμενα [DateTimeOffset](./) αντιπροσωπεύουν το ίδιο χρονικό σημείο. |
| [Equals](./equals/)(const DateTimeOffset\&) const | Ελέγχει αν δύο αντικείμενα [DateTimeOffset](./) αντιπροσωπεύουν το ίδιο χρονικό σημείο. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Ελέγχει αν δύο αντικείμενα [DateTimeOffset](./) αντιπροσωπεύουν το ίδιο χρονικό σημείο. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | Ελέγχει αν δύο αντικείμενα [DateTimeOffset](./) αντιπροσωπεύουν το ίδιο χρονικό σημείο και έχουν την ίδια μετατόπιση. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | Ελέγχει αν δύο αντικείμενα [DateTimeOffset](./) αντιπροσωπεύουν το ίδιο χρονικό σημείο και έχουν την ίδια μετατόπιση. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) χρόνο αρχείου σε ημερομηνία και ώρα με τοπική μετατόπιση ώρας. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) Unix-time σε αντικείμενο [DateTimeOffset](./). |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) Unix-time σε αντικείμενο [DateTimeOffset](./). |
| [get_Date](./get_date/)() const | Αποκτά το στοιχείο ημερομηνίας του τρέχοντος αντικειμένου. |
| [get_DateTime](./get_datetime/)() const | Αποκτά την τιμή [DateTime](../datetime/). |
| [get_Day](./get_day/)() const | Αποκτά την ημέρα του μήνα του τρέχοντος αντικειμένου. |
| [get_DayOfWeek](./get_dayofweek/)() const | Αποκτά την ημέρα της εβδομάδας του τρέχοντος αντικειμένου. |
| [get_DayOfYear](./get_dayofyear/)() const | Αποκτά την ημέρα του έτους του τρέχοντος αντικειμένου. |
| [get_Hour](./get_hour/)() const | Αποκτά το στοιχείο ώρας του τρέχοντος αντικειμένου. |
| [get_LocalDateTime](./get_localdatetime/)() const | Αποκτά την τιμή [DateTime](../datetime/) που αντιπροσωπεύει την τοπική ημερομηνία και ώρα. |
| [get_Millisecond](./get_millisecond/)() const | Αποκτά το στοιχείο χιλιοστών του τρέχοντος αντικειμένου. |
| [get_Minute](./get_minute/)() const | Αποκτά το στοιχείο λεπτών του τρέχοντος αντικειμένου. |
| [get_Month](./get_month/)() const | Αποκτά το στοιχείο μήνα του τρέχοντος αντικειμένου. |
| static [get_Now](./get_now/)() | Αποκτά το [DateTimeOffset](./) του οποίου η ημερομηνία και ώρα έχουν οριστεί στην τρέχουσα τοπική ώρα και η μετατόπιση έχει οριστεί στη μετατόπιση της τοπικής ώρας. |
| [get_Offset](./get_offset/)() const | Αποκτά τη μετατόπιση από το UTC. |
| [get_Second](./get_second/)() const | Αποκτά το στοιχείο δευτερολέπτων του τρέχοντος αντικειμένου. |
| [get_Ticks](./get_ticks/)() const | Αποκτά τον αριθμό των ticks του τρέχοντος αντικειμένου. |
| [get_TimeOfDay](./get_timeofday/)() const | Αποκτά την ώρα της ημέρας του τρέχοντος αντικειμένου. |
| [get_UtcDateTime](./get_utcdatetime/)() const | Αποκτά την τιμή [DateTime](../datetime/) που αντιπροσωπεύει την ημερομηνία και ώρα UTC. |
| static [get_UtcNow](./get_utcnow/)() | Αποκτά το [DateTimeOffset](./) του οποίου η ημερομηνία και ώρα έχουν οριστεί στην τρέχουσα ώρα UTC και η μετατόπιση είναι [TimeSpan::Zero](../timespan/zero/). |
| [get_UtcTicks](./get_utcticks/)() const | Αποκτά τον αριθμό των ticks του τρέχοντος αντικειμένου σε χρόνο UTC. |
| [get_Year](./get_year/)() const | Αποκτά το στοιχείο έτους του τρέχοντος αντικειμένου. |
| [GetHashCode](./gethashcode/)() const | Λαμβάνει τον κωδικό κατακερματισμού για το τρέχον αντικείμενο [DateTimeOffset](./). |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | Καθορίζει εάν το τρέχον αντικείμενο και το καθορισμένο αντικείμενο [DateTimeOffset](./) αντιπροσωπεύουν διαφορετικές τιμές ημερομηνίας και ώρας. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Επιστρέφει ένα νέο στιγμιότυπο της κλάσης [DateTimeOffset](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που είναι το άθροισμα της τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο και του καθορισμένου χρονικού διαστήματος. |
| [operator-](./operator-/)(TimeSpan) const | Επιστρέφει ένα νέο στιγμιότυπο της κλάσης [DateTimeOffset](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που προκύπτει από την αφαίρεση του καθορισμένου χρονικού διαστήματος από την τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | Επιστρέφει ένα στιγμιότυπο της κλάσης [TimeSpan](../timespan/) που αντιπροσωπεύει το χρονικό διάστημα μεταξύ των τιμών ημερομηνίας και ώρας που αντιπροσωπεύονται από το τρέχον και το καθορισμένο αντικείμενο. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | Καθορίζει εάν το τρέχον αντικείμενο αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που είναι νωρίτερη από την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [DateTimeOffset](./). |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | Καθορίζει εάν το τρέχον αντικείμενο αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που είναι νωρίτερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [DateTimeOffset](./). |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | Καθορίζει εάν το τρέχον αντικείμενο και το καθορισμένο αντικείμενο [DateTimeOffset](./) αντιπροσωπεύουν την ίδια τιμή ημερομηνίας και ώρας. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | Καθορίζει εάν το τρέχον αντικείμενο αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που είναι μεταγενέστερη από την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [DateTimeOffset](./). |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | Καθορίζει εάν το τρέχον αντικείμενο αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που είναι μεταγενέστερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [DateTimeOffset](./). |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Μετατρέπει τη καθορισμένη συμβολοσειρά σε ισοδύναμο [DateTimeOffset](./). |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Μετατρέπει τη καθορισμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](./) χρησιμοποιώντας τον καθορισμένο πάροχο μορφής και το στυλ μορφοποίησης. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Μετατρέπει τη καθορισμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](./) χρησιμοποιώντας τη καθορισμένη μορφή, τον πάροχο μορφής και το στυλ μορφοποίησης. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Μετατρέπει τη καθορισμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](./) χρησιμοποιώντας τις καθορισμένες μορφές, τον πάροχο μορφής και το στυλ μορφοποίησης. |
| [Subtract](./subtract/)(TimeSpan) const | Αφαιρεί ένα καθορισμένο χρονικό διάστημα από το τρέχον αντικείμενο. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | Αφαιρεί μια καθορισμένη τιμή [DateTimeOffset](./) από το τρέχον αντικείμενο. |
| [ToFileTime](./tofiletime/)() const | Μετατρέπει το τρέχον αντικείμενο σε χρόνο αρχείου [Windows](../../system.windows/). |
| [ToLocalTime](./tolocaltime/)() const | Μετατρέπει το τρέχον αντικείμενο σε ένα αντικείμενο που αντιπροσωπεύει την τοπική ώρα. |
| [ToOffset](./tooffset/)(TimeSpan) const | Αντικαθιστά την αντιστάθμιση του τρέχοντος αντικειμένου με την καθορισμένη αντιστάθμιση. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Μετατρέπει το τρέχον αντικείμενο σε συμβολοσειρά χρησιμοποιώντας τη καθορισμένη μορφή και τον πάροχο μορφής. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Μετατρέπει το τρέχον αντικείμενο σε συμβολοσειρά χρησιμοποιώντας τον καθορισμένο πάροχο μορφής. |
| [ToString](./tostring/)(const String\&) const | Μετατρέπει το τρέχον αντικείμενο σε συμβολοσειρά χρησιμοποιώντας τη καθορισμένη μορφή. |
| [ToString](./tostring/)() const | Μετατρέπει το τρέχον αντικείμενο σε συμβολοσειρά. |
| [ToUniversalTime](./touniversaltime/)() const | Μετατρέπει το τρέχον αντικείμενο σε ένα αντικείμενο που αντιπροσωπεύει την ώρα UTC. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Λαμβάνει τα χιλιοστά του δευτερολέπτου που έχουν περάσει από την έναρξη της εποχής Unix. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Λαμβάνει τα δευτερόλεπτα που έχουν περάσει από την έναρξη της εποχής Unix. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | Προσπαθεί να μετατρέψει τη συγκεκριμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](./). |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Προσπαθεί να μετατρέψει τη συγκεκριμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](./) χρησιμοποιώντας τον καθορισμένο πάροχο μορφής και το στυλ μορφοποίησης. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Προσπαθεί να μετατρέψει τη συγκεκριμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](./) χρησιμοποιώντας τις καθορισμένες μορφές, τον πάροχο μορφής και το στυλ μορφοποίησης. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Προσπαθεί να μετατρέψει τη συγκεκριμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](./) χρησιμοποιώντας τη καθορισμένη μορφή, τον πάροχο μορφής και το στυλ μορφοποίησης. |
| static [Type](./type/)() | Επιστρέφει ένα αντικείμενο [TypeInfo](../typeinfo/) που αντιπροσωπεύει τη δομή [TimeSpan](../timespan/). |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | Λαμβάνει τη μέγιστη μετατόπιση σε ticks. |
| static [MaxValue](./maxvalue/) | Λαμβάνει τη μεγαλύτερη τιμή [DateTimeOffset](./). |
| static constexpr [MinOffset](./minoffset/) | Λαμβάνει τη ελάχιστη μετατόπιση σε ticks. |
| static [MinValue](./minvalue/) | Λαμβάνει τη πρώιμη τιμή [DateTimeOffset](./). |
| static [UnixEpoch](./unixepoch/) | Λαμβάνει την έναρξη της εποχής Unix. |
## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
