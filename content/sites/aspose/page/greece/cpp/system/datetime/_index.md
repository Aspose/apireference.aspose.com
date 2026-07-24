---
title: "System::DateTime class"
linktitle: "DateTime"
second_title: "Aspose.Page για C++"
description: "System::DateTime class. Αντιπροσωπεύει μια συγκεκριμένη τιμή ημερομηνίας και ώρας στο χρονικό συνεχές. Αυτός ο τύπος πρέπει να κατανεμηθεί στη στοίβα και να περάσει σε συναρτήσεις ως τιμή ή ως αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση System::SmartPtr για τη διαχείριση αντικειμένων αυτού του τύπου σε C++."
type: docs
weight: 1600
url: /el/cpp/system/datetime/
---
## DateTime class


Αντιπροσωπεύει μια συγκεκριμένη τιμή ημερομηνίας και ώρας στο χρονικό συνεχές. Αυτός ο τύπος πρέπει να κατανεμηθεί στη στοίβα και να περάσει σε συναρτήσεις ως τιμή ή ως αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση [System::SmartPtr](../smartptr/) για τη διαχείριση αντικειμένων αυτού του τύπου.

```cpp
class DateTime
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Επιστρέφει ένα νέο αντικείμενο της κλάσης [DateTime](./) που αντιπροσωπεύει μια τιμή ημερομηνίας και ώρας που προκύπτει από την προσθήκη του καθορισμένου χρονικού διαστήματος στην τιμή ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [AddDays](./adddays/)(double) const | Επιστρέφει ένα νέο αντικείμενο της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας η οποία είναι το άθροισμα της τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο και του καθορισμένου αριθμού ημερών. |
| [AddHours](./addhours/)(double) const | Επιστρέφει ένα νέο αντικείμενο της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας η οποία είναι το άθροισμα της τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο και του καθορισμένου αριθμού ωρών. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Επιστρέφει ένα νέο αντικείμενο της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας η οποία είναι το άθροισμα της τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο και του καθορισμένου αριθμού χιλιοστών του δευτερολέπτου. |
| [AddMinutes](./addminutes/)(double) const | Επιστρέφει ένα νέο αντικείμενο της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας η οποία είναι το άθροισμα της τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο και του καθορισμένου αριθμού λεπτών. |
| [AddMonths](./addmonths/)(int) const | Επιστρέφει ένα νέο αντικείμενο της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας η οποία είναι το άθροισμα της τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο και του καθορισμένου αριθμού μηνών. |
| [AddSeconds](./addseconds/)(double) const | Επιστρέφει ένα νέο αντικείμενο της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας η οποία είναι το άθροισμα της τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο και του καθορισμένου αριθμού δευτερολέπτων. |
| [AddTicks](./addticks/)(int64_t) const | Επιστρέφει ένα νέο αντικείμενο της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας η οποία είναι το άθροισμα της τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο και του καθορισμένου αριθμού διαστημάτων 100-νανοδευτερολέπτων. |
| [AddYears](./addyears/)(int) const | Επιστρέφει ένα νέο αντικείμενο της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας ίση με αυτή που αντιπροσωπεύεται από το τρέχον αντικείμενο, με το στοιχείο του έτους αυξημένο κατά τον καθορισμένο αριθμό. |
| static [Compare](./compare/)(DateTime, DateTime) | Συγκρίνει δύο τιμές που αντιπροσωπεύονται από τις καθορισμένες παρουσίες της κλάσης [DateTime](./) και επιστρέφει την τιμή που υποδεικνύει τη σχετική θέση των τιμών στη χρονογραμμή. |
| [CompareTo](./compareto/)(DateTime) const | Συγκρίνει δύο τιμές ημερομηνίας και ώρας που αντιπροσωπεύονται από το τρέχον αντικείμενο και την καθορισμένη παρουσία της κλάσης [DateTime](./) και επιστρέφει την τιμή που υποδεικνύει τη σχετική θέση των τιμών στη χρονογραμμή. |
| [DateTime](./datetime/)() | Δημιουργεί μια παρουσία που αντιπροσωπεύει τη μικρότερη δυνατή τιμή ημερομηνίας και ώρας ίση με MinValue. |
| [DateTime](./datetime/)(int, int, int) | Δημιουργεί μια παρουσία που αντιπροσωπεύει μια τιμή ημερομηνίας και ώρας που ορίζεται ως συγκεκριμένο έτος, μήνας και ημέρα. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Δημιουργεί μια παρουσία που αντιπροσωπεύει μια τιμή ημερομηνίας και ώρας που ορίζεται ως συγκεκριμένο έτος, μήνας και ημέρα στο καθορισμένο ημερολόγιο. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | Δημιουργεί μια παρουσία που αντιπροσωπεύει μια τιμή ημερομηνίας και ώρας που καθορίζεται ως συγκεκριμένο έτος, μήνας, ημέρα, ώρα, λεπτό και δευτερόλεπτο. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | Δημιουργεί μια παρουσία που αντιπροσωπεύει μια τιμή ημερομηνίας και ώρας που καθορίζεται ως συγκεκριμένο έτος, μήνας, ημέρα, ώρα, λεπτό και δευτερόλεπτο. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Δημιουργεί μια παρουσία που αντιπροσωπεύει μια τιμή ημερομηνίας και ώρας που καθορίζεται ως συγκεκριμένο έτος, μήνας, ημέρα, ώρα, λεπτό και δευτερόλεπτο στο καθορισμένο ημερολόγιο. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | Δημιουργεί μια παρουσία που αντιπροσωπεύει μια τιμή ημερομηνίας και ώρας που καθορίζεται ως συγκεκριμένο έτος, μήνας, ημέρα, ώρα, λεπτό, δευτερόλεπτο και χιλιοστό του δευτερολέπτου. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | Δημιουργεί μια παρουσία που αντιπροσωπεύει μια τιμή ημερομηνίας και ώρας που καθορίζεται ως συγκεκριμένο έτος, μήνας, ημέρα, ώρα, λεπτό, δευτερόλεπτο και χιλιοστό του δευτερολέπτου στο καθορισμένο ημερολόγιο. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | Δημιουργεί μια παρουσία που αντιπροσωπεύει μια τιμή ημερομηνίας και ώρας που καθορίζεται ως αριθμός κροτών. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | Δημιουργεί μια παρουσία που αντιπροσωπεύει μια τιμή ημερομηνίας και ώρας που καθορίζεται ως αριθμός κροτών. ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. |
| [DateTime](./datetime/)(const DateTime\&) | Δημιουργεί ένα αντίγραφο μιας παρουσίας. |
| static [DaysInMonth](./daysinmonth/)(int, int) | Επιστρέφει τον αριθμό των ημερών στον καθορισμένο μήνα του καθορισμένου έτους. |
| static [Equals](./equals/)(DateTime, DateTime) | Καθορίζει εάν οι καθορισμένες παρουσίες της κλάσης [DateTime](./) αντιπροσωπεύουν την ίδια τιμή ημερομηνίας και ώρας. |
| [Equals](./equals/)(DateTime) const | Καθορίζει εάν η καθορισμένη παρουσία της κλάσης [DateTime](./) αντιπροσωπεύει την ίδια τιμή ημερομηνίας και ώρας με το τρέχον αντικείμενο. |
| static [FromBinary](./frombinary/)(int64_t) | Απο-σειριοποιεί την τιμή ημερομηνίας και ώρας από το καθορισμένο μη-υπογεγραμμένο 64-bit ακέραιο και ορίζει τη νέα παρουσία της κλάσης [DateTime](./) σε αυτήν την τιμή. |
| static [FromFileTime](./fromfiletime/)(int64_t) | Μετατρέπει το καθορισμένο File time σε μια παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την ίδια τιμή ημερομηνίας και ώρας ως τοπική ώρα. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | Μετατρέπει το καθορισμένο File time σε μια παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την ίδια τιμή ημερομηνίας και ώρας ως ώρα UTC. |
| static [FromOADate](./fromoadate/)(double) | Επιστρέφει μια παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας ισοδύναμη με την καθορισμένη ημερομηνία OLE Automation. |
| static [FromUnixTime](./fromunixtime/)(time_t) | Μετατρέπει την καθορισμένη τιμή χρόνου Unix σε μια παρουσία της κλάσης [DateTime](./). ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. |
| [get_Date](./get_date/)() const | Επιστρέφει μια νέα παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει το τμήμα ημερομηνίας της ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο, με κάθε στοιχείο του τμήματος ώρας ορισμένο σε 0. |
| [get_Day](./get_day/)() const | Επιστρέφει τον αριθμό σειράς της ημέρας στον μήνα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_DayOfWeek](./get_dayofweek/)() const | Επιστρέφει μια τιμή που αντιπροσωπεύει μια ημέρα της εβδομάδας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_DayOfYear](./get_dayofyear/)() const | Επιστρέφει τον αριθμό σειράς της ημέρας στο έτος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Hour](./get_hour/)() const | Επιστρέφει το στοιχείο ώρας της τιμής ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Kind](./get_kind/)() const | Επιστρέφει την τιμή που υποδεικνύει εάν η ημερομηνία και ώρα που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι τοπική ή UTC ή καμία από τις δύο. |
| [get_Millisecond](./get_millisecond/)() const | Επιστρέφει το στοιχείο χιλιοστού του δευτερολέπτου της τιμής ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Minute](./get_minute/)() const | Επιστρέφει το στοιχείο λεπτού της τιμής ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Month](./get_month/)() const | Επιστρέφει τον αριθμό σειράς του μήνα στο έτος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [get_Now](./get_now/)() | Επιστρέφει μια παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την τρέχουσα ώρα ως τοπική ώρα. |
| [get_Second](./get_second/)() const | Επιστρέφει το δευτερό στοιχείο της ώρας της τιμής ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Ticks](./get_ticks/)() const | Επιστρέφει έναν αριθμό διαστημάτων 100-νανοδευτερολέπτων που έχουν περάσει από τις 0:00:00 UTC, 1 Ιανουαρίου 0001, στο Γρηγοριανό ημερολόγιο, μέχρι την ημερομηνία και ώρα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_TimeOfDay](./get_timeofday/)() const | Επιστρέφει την τιμή που αντιπροσωπεύει το χρονικό διάστημα από την αρχή της ημέρας που αντιπροσωπεύεται από το τρέχον αντικείμενο μέχρι την τιμή ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [get_Today](./get_today/)() | Επιστρέφει μια παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την τρέχουσα ημερομηνία με κάθε στοιχείο του χρονικού τμήματος της τιμής που αντιπροσωπεύεται από το αντικείμενο να έχει οριστεί σε 0. |
| static [get_UtcNow](./get_utcnow/)() | Επιστρέφει μια παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την τρέχουσα ώρα ως UTC. |
| [get_Year](./get_year/)() const | Επιστρέφει το έτος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | Λαμβάνει τα μέρη της ημερομηνίας. ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | Επιστρέφει έναν πίνακα συμβολοσειρών όπου κάθε στοιχείο είναι η αναπαράσταση σε συμβολοσειρά του τρέχοντος αντικειμένου μορφοποιημένη με έναν από τους τυπικούς προσδιοριστές μορφής ημερομηνίας και ώρας. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | Επιστρέφει έναν πίνακα συμβολοσειρών όπου κάθε στοιχείο είναι η αναπαράσταση σε συμβολοσειρά του τρέχοντος αντικειμένου μορφοποιημένη με τον καθορισμένο τυπικό προσδιοριστή μορφής ημερομηνίας και ώρας. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | Επιστρέφει έναν πίνακα συμβολοσειρών όπου κάθε στοιχείο είναι η αναπαράσταση σε συμβολοσειρά του τρέχοντος αντικειμένου μορφοποιημένη με έναν από τους τυπικούς προσδιοριστές μορφής ημερομηνίας και ώρας και με τον καθορισμένο πάροχο μορφής. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | Επιστρέφει έναν πίνακα συμβολοσειρών όπου κάθε στοιχείο είναι η αναπαράσταση σε συμβολοσειρά του τρέχοντος αντικειμένου μορφοποιημένη με τον καθορισμένο τυπικό προσδιοριστή μορφής ημερομηνίας και ώρας και με τον πάροχο μορφής. |
| [GetHashCode](./gethashcode/)() const | Επιστρέφει έναν κωδικό κατακερματισμού για το τρέχον αντικείμενο. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | Καθορίζει εάν η τιμή ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο εμπίπτει στο εύρος της θερινής ώρας για την τρέχουσα ζώνη ώρας. |
| static [IsLeapYear](./isleapyear/)(int) | Καθορίζει εάν το καθορισμένο έτος είναι δίσεκτο. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | Καθορίζει εάν το τρέχον αντικείμενο και το καθορισμένο αντικείμενο [DateTime](./) αντιπροσωπεύουν διαφορετικές τιμές ημερομηνίας και ώρας. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Επιστρέφει μια νέα παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που είναι το άθροισμα της τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο και του καθορισμένου χρονικού διαστήματος. |
| [operator+=](./operator+=/)(TimeSpan) | Ορίζει το τρέχον αντικείμενο στην τιμή ημερομηνίας και ώρας που είναι το άθροισμα της τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο και του καθορισμένου χρονικού διαστήματος. |
| [operator-](./operator-/)(TimeSpan) const | Επιστρέφει μια νέα παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που προκύπτει από την αφαίρεση του καθορισμένου χρονικού διαστήματος από την τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [operator-](./operator-/)(DateTime) const | Επιστρέφει ένα στιγμιότυπο της κλάσης [TimeSpan](../timespan/) που αντιπροσωπεύει το χρονικό διάστημα μεταξύ των τιμών ημερομηνίας και ώρας που αντιπροσωπεύονται από το τρέχον και το καθορισμένο αντικείμενο. |
| [operator-=](./operator-=/)(TimeSpan) | Ορίζει το τρέχον αντικείμενο στην τιμή ημερομηνίας και ώρας που προκύπτει από την αφαίρεση του καθορισμένου χρονικού διαστήματος από την τιμή ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [operator<](./operator_/)(DateTime) const | Καθορίζει εάν το τρέχον αντικείμενο αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που είναι νωρίτερη από την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [DateTime](./). |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | Καθορίζει εάν το τρέχον αντικείμενο αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που είναι νωρίτερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [DateTime](./). |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | Αναθέτει την τιμή που αντιπροσωπεύεται από το καθορισμένο παράδειγμα [DateTime](./) στο τρέχον αντικείμενο. |
| [operator==](./operator==/)(DateTime) const | Καθορίζει εάν το τρέχον αντικείμενο και το καθορισμένο αντικείμενο [DateTime](./) αντιπροσωπεύουν την ίδια τιμή ημερομηνίας και ώρας. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | Καθορίζει εάν το τρέχον αντικείμενο αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που είναι μεταγενέστερη από την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [DateTime](./). |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | Καθορίζει εάν το τρέχον αντικείμενο αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που είναι μεταγενέστερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [DateTime](./). |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας σε ισοδύναμο αντικείμενο [DateTime](./). |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας στο ισοδύναμο αντικείμενο [DateTime](./) χρησιμοποιώντας πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας στο ισοδύναμο αντικείμενο [DateTime](./) χρησιμοποιώντας τη συγκεκριμένη μορφή και πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό. Η μορφή της αναπαράστασης συμβολοσειράς πρέπει να ταιριάζει ακριβώς με τη συγκεκριμένη μορφή. Εκτοπίζει μια εξαίρεση εάν η μετατροπή αποτύχει. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας στο ισοδύναμο αντικείμενο [DateTime](./) χρησιμοποιώντας τις καθορισμένες μορφές, πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό και το στυλ. Η μορφή της αναπαράστασης συμβολοσειράς πρέπει να ταιριάζει ακριβώς με μία ή περισσότερες από τις καθορισμένες μορφές. Εκτοπίζει μια εξαίρεση εάν η μετατροπή αποτύχει. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | Δημιουργεί ένα νέο αντικείμενο [DateTime](./) που αντιπροσωπεύει τον ίδιο αριθμό ticks με το καθορισμένο αντικείμενο [DateTime](./) και αντιπροσωπεύει τοπική ώρα, ώρα UTC ή καμία, όπως καθορίζεται από το όρισμα **kind**. |
| [Subtract](./subtract/)(TimeSpan) const | Επιστρέφει μια νέα παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που προκύπτει από την αφαίρεση του καθορισμένου χρονικού διαστήματος από την τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [Subtract](./subtract/)(DateTime) const | Επιστρέφει μια παρουσία της κλάσης [TimeSpan](../timespan/) που αντιπροσωπεύει το χρονικό διάστημα μεταξύ των τιμών ημερομηνίας και ώρας που αντιπροσωπεύονται από το τρέχον και το καθορισμένο αντικείμενο. |
| [ToBinary](./tobinary/)() const | Σειριοποιεί το τρέχον αντικείμενο. |
| [ToFileTime](./tofiletime/)() const | Επιστρέφει μια τιμή που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο ως File time. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | Μετατρέπει την τιμή ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο σε File time UTC. |
| [ToLocalTime](./tolocaltime/)() const | Επιστρέφει μια νέα παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο ως τοπική ώρα. |
| [ToLongDateString](./tolongdatestring/)() const | Επιστρέφει μια συμβολοσειρά που περιέχει την εκτενή αναπαράσταση ημερομηνίας του τρέχοντος αντικειμένου. |
| [ToLongTimeString](./tolongtimestring/)() const | Επιστρέφει μια συμβολοσειρά που περιέχει την εκτενή αναπαράσταση ώρας του τρέχοντος αντικειμένου. |
| [ToOADate](./tooadate/)() const | Επιστρέφει την τιμή ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο ως OLE Automation Date. |
| [ToShortDateString](./toshortdatestring/)() const | Επιστρέφει μια συμβολοσειρά που περιέχει τη σύντομη αναπαράσταση ημερομηνίας του τρέχοντος αντικειμένου. |
| [ToShortTimeString](./toshorttimestring/)() const | Επιστρέφει μια συμβολοσειρά που περιέχει τη σύντομη αναπαράσταση ώρας του τρέχοντος αντικειμένου. |
| [ToString](./tostring/)() const | Επιστρέφει την αναπαράσταση συμβολοσειράς της τιμής ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας τις συμβάσεις μορφοποίησης που ορίζονται από τον τρέχοντα πολιτισμό. |
| [ToString](./tostring/)(const String\&) const | Επιστρέφει μια αναπαράσταση συμβολοσειράς της τιμής ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας τη συγκεκριμένη μορφή και τις συμβάσεις μορφοποίησης που ορίζονται από τον τρέχοντα πολιτισμό. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Επιστρέφει μια αναπαράσταση συμβολοσειράς της τιμής ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας τις καθορισμένες πληροφορίες μορφής. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Επιστρέφει μια αναπαράσταση συμβολοσειράς της τιμής ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας τις καθορισμένες πληροφορίες μορφής. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | Επιστρέφει μια νέα παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο ως UTC. |
| [ToUnixTime](./tounixtime/)() const | Επιστρέφει μια τιμή που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο ως Unix time. ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας σε ισοδύναμο αντικείμενο [DateTime](./). |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας στο ισοδύναμο αντικείμενο [DateTime](./) χρησιμοποιώντας τις καθορισμένες πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό και το στυλ. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας στο ισοδύναμο αντικείμενο [DateTime](./) χρησιμοποιώντας τη συγκεκριμένη μορφή, πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό και το στυλ. Η μορφή της αναπαράστασης συμβολοσειράς πρέπει να ταιριάζει ακριβώς με τη συγκεκριμένη μορφή. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας στο ισοδύναμο αντικείμενο [DateTime](./) χρησιμοποιώντας τις καθορισμένες μορφές, πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό και το στυλ. Η μορφή της αναπαράστασης συμβολοσειράς πρέπει να ταιριάζει ακριβώς με μία ή περισσότερες από τις καθορισμένες μορφές. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | Επιστρέφει ένα αντικείμενο [TypeInfo](../typeinfo/) που περιέχει πληροφορίες για αυτήν την κλάση. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | Ο αριθμός των 100-νανοδευτερολέπτων στο χρονικό διάστημα μεταξύ της ελάχιστης δυνατής και της μέγιστης δυνατής τιμής [DateTime](./). |
| static [MaxValue](./maxvalue/) | Μία παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει τη μέγιστη δυνατή τιμή ημερομηνίας και ώρας. |
| static constexpr [MinTicks](./minticks/) | Ο ελάχιστος αριθμός ticks που μπορεί να αντιπροσωπεύσει μια παρουσία της κλάσης [DateTime](./). |
| static [MinValue](./minvalue/) | Μια παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την ελάχιστη δυνατή τιμή ημερομηνίας και ώρας. |
| static constexpr [TicksPerDay](./ticksperday/) | Ο αριθμός των ticks σε μια ημέρα. |
| static constexpr [TicksPerHour](./ticksperhour/) | Ο αριθμός των ticks σε μια ώρα. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | Ο αριθμός των ticks σε ένα μικροδευτερόλεπτο. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Ο αριθμός των ticks σε ένα χιλιοστό του δευτερολέπτου. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Ο αριθμός των ticks σε ένα λεπτό. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Ο αριθμός των ticks σε ένα δευτερόλεπτο. |
| static [UnixEpoch](./unixepoch/) | Μια παρουσία της κλάσης [DateTime](./) που αντιπροσωπεύει την έναρξη της εποχής Unix (1970.01.01 00:00:00). |
## Παρατηρήσεις



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // Δημιουργήστε την παρουσία της κλάσης 'DateTime'.
  DateTime dateTime{1990, 10, 30};

  // Εκτυπώστε την παρουσία σε πολλαπλές μορφές.
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
