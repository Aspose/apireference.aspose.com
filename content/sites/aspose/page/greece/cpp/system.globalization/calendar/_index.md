---
title: "System::Globalization::Calendar κλάση"
linktitle: "Ημερολόγιο"
second_title: "Aspose.Page για C++"
description: "System::Globalization::Calendar κλάση. Ημερολόγιο που ορίζει πώς οι ημερομηνίες διαχειρίζονται, υπολογίζονται, μορφοποιούνται κ.λπ. Οι λειτουργίες ορισμού είναι ενεργές μόνο σε αντικείμενα που δεν είναι μόνο για ανάγνωση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | Προσθέτει ημέρες στο σημείο χρόνου. |
| virtual [AddHours](./addhours/)(DateTime, int) const | Προσθέτει ώρες στο σημείο χρόνου. |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | Προσθέτει χιλιοστά του δευτερολέπτου στο σημείο χρόνου. |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | Προσθέτει λεπτά στο σημείο χρόνου. |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | Προσθέτει μήνες στο σημείο χρόνου. |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | Προσθέτει δευτερόλεπτα στο σημείο χρόνου. |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | Προσθέτει εβδομάδες στο σημείο χρόνου. |
| virtual [AddYears](./addyears/)(DateTime, int) const | Προσθέτει έτη στο σημείο χρόνου. |
| [Calendar](./calendar/)(const Calendar\&) | Πληροφορίες RTTI. |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | Λαμβάνει τον τύπο αλγορίθμου. |
| [get_CurrentEra](./get_currentera/)() const | Λαμβάνει τον δείκτη της τρέχουσας εποχής. |
| [get_CurrentEraValue](./get_currenteravalue/)() const | Λαμβάνει την τιμή της τρέχουσας εποχής. |
| virtual [get_Eras](./get_eras/)() const | Λαμβάνει τη λίστα των εποχών που υπάρχουν στο ημερολόγιο. |
| virtual [get_ID](./get_id/)() const | Λαμβάνει το αναγνωριστικό του ημερολογίου. |
| [get_IsReadOnly](./get_isreadonly/)() const | Ελέγχει αν το ημερολόγιο είναι μόνο για ανάγνωση. |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | Μέγιστο χρονικό σημείο που υποστηρίζεται από το ημερολόγιο. |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | Ελάχιστο χρονικό σημείο που υποστηρίζεται από το ημερολόγιο. |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | Λαμβάνει το τελευταίο έτος που μπορεί να αναπαρασταθεί με 2 ψηφία. |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | Λαμβάνει την ημέρα του μήνα για το καθορισμένο χρονικό σημείο. |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | Λαμβάνει την ημέρα της εβδομάδας για το καθορισμένο χρονικό σημείο. |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | Λαμβάνει την ημέρα του έτους για το καθορισμένο χρονικό σημείο. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο μήνα. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο μήνα. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο έτος. |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο έτος. |
| virtual [GetEra](./getera/)(DateTime) const | Λαμβάνει την εποχή για το καθορισμένο χρονικό σημείο. |
| virtual [GetHour](./gethour/)(DateTime) const | Λαμβάνει τις ώρες για το καθορισμένο σημείο χρόνου. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Λαμβάνει το δίσεκτο μήνα για το καθορισμένο έτος. |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | Λαμβάνει το δίσεκτο μήνα για το καθορισμένο έτος. |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | Λαμβάνει τα χιλιοστά του δευτερολέπτου για το καθορισμένο σημείο χρόνου. |
| virtual [GetMinute](./getminute/)(DateTime) const | Λαμβάνει τα λεπτά για το καθορισμένο σημείο χρόνου. |
| virtual [GetMonth](./getmonth/)(DateTime) const | Λαμβάνει το μήνα για το καθορισμένο χρονικό σημείο. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Λαμβάνει τον αριθμό των μηνών στο καθορισμένο έτος. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | Λαμβάνει τον αριθμό των μηνών στο καθορισμένο έτος. |
| virtual [GetSecond](./getsecond/)(DateTime) const | Λαμβάνει τα δευτερόλεπτα για το καθορισμένο σημείο χρόνου. |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | Λαμβάνει την εβδομάδα του έτους για το καθορισμένο σημείο χρόνου. |
| virtual [GetYear](./getyear/)(DateTime) const | Λαμβάνει το έτος για το καθορισμένο χρονικό σημείο. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Ελέγχει αν ο μήνας είναι δίσεκτος. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | Ελέγχει αν ο μήνας είναι δίσεκτος. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Ελέγχει αν το έτος είναι δίσεκτο. |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | Ελέγχει αν το έτος είναι δίσεκτο. |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | Ελέγχει τις τιμές του έτους, του μήνα, της ημέρας και της εποχής. |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | Λαμβάνει την έκδοση μόνο για ανάγνωση του ημερολογίου. |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | Ορίζει το τελευταίο έτος που μπορεί να αναπαρασταθεί με 2 ψηφία. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Δημιουργεί το αντικείμενο [DateTime](../../system/datetime/) από τα συστατικά. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | Δημιουργεί το αντικείμενο [DateTime](../../system/datetime/) από τα συστατικά. |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | Μετατρέπει το έτος σε 4-ψήφιο έτος χρησιμοποιώντας την ιδιότητα TwoDigitYearMax. |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
