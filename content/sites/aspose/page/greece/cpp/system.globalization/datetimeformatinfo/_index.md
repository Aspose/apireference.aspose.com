---
title: "System::Globalization::DateTimeFormatInfo κλάση"
linktitle: "DateTimeFormatInfo"
second_title: "Aspose.Page για C++"
description: "System::Globalization::DateTimeFormatInfo κλάση. Σύνολο παραμέτρων μορφοποίησης ημερομηνίας και ώρας. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


Σύνολο παραμέτρων μορφοποίησης ημερομηνίας και ώρας. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Κλωνοποιεί τις πληροφορίες μορφοποίησης. |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | Προεπιλεγμένος κατασκευαστής, δημιουργεί αμετάβλητες πληροφορίες μορφής. |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | Λαμβάνει συντομευμένα ονόματα ημερών. |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | Λαμβάνει συντομευμένα ονόματα μηνών σε γενική μορφή. |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | Λαμβάνει συντομευμένα ονόματα μηνών. |
| [get_AMDesignator](./get_amdesignator/)() const | Λαμβάνει τον προσδιοριστή π.μ. |
| [get_Calendar](./get_calendar/)() const | Λαμβάνει το ημερολόγιο που σχετίζεται με τον μορφοποιητή. |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | Λαμβάνει τον κανόνα εβδομάδας ημερολογίου που σχετίζεται με τον μορφοποιητή. |
| static [get_CurrentInfo](./get_currentinfo/)() | Λαμβάνει τον μορφοποιητή ημερομηνίας και ώρας του τρέχοντος νήματος. |
| [get_DateSeparator](./get_dateseparator/)() const | Λαμβάνει το διαχωριστικό ημερομηνίας. |
| [get_DayNames](./get_daynames/)() const | Λαμβάνει τα ονόματα των ημερών. |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | Λαμβάνει την πρώτη ημέρα της εβδομάδας. |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | Λαμβάνει το πλήρες πρότυπο ημερομηνίας και ώρας. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Λαμβάνει τον αμετάβλητο μορφοποιητή ημερομηνίας και ώρας. |
| [get_IsReadOnly](./get_isreadonly/)() const | Ελέγχει εάν ο μορφοποιητής είναι μόνο για ανάγνωση. |
| [get_LongDatePattern](./get_longdatepattern/)() const | Λαμβάνει το μακρύ πρότυπο ημερομηνίας. |
| [get_LongTimePattern](./get_longtimepattern/)() const | Λαμβάνει το μακρύ πρότυπο ώρας. |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | Λαμβάνει το πρότυπο ημέρας μήνα. |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | Λαμβάνει τα ονόματα των μηνών σε γενική πτώση. |
| [get_MonthNames](./get_monthnames/)() const | Λαμβάνει τα ονόματα των μηνών. |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | Λαμβάνει το όνομα του εγχώριου ημερολογίου εάν είναι διαθέσιμο. |
| [get_PMDesignator](./get_pmdesignator/)() const | Λαμβάνει το σύμβολο ΜΜ. |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | Λαμβάνει το πρότυπο RFC1123. |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | Λαμβάνει το σύντομο πρότυπο ημερομηνίας. |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | Λαμβάνει τα πιο σύντομα ονόματα ημερών που είναι δυνατόν. |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | Λαμβάνει το σύντομο πρότυπο ώρας. |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | Λαμβάνει το ταξινομήσιμο πρότυπο ημερομηνίας και ώρας. |
| [get_TimeSeparator](./get_timeseparator/)() const | Λαμβάνει το διαχωριστικό ώρας. |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | Λαμβάνει το καθολικό ταξινομήσιμο πρότυπο ημερομηνίας και ώρας. |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | Λαμβάνει το πρότυπο έτους και μήνα. |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | Λαμβάνει το συντομευμένο όνομα ημέρας της εβδομάδας. |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | Λαμβάνει το συντομευμένο όνομα εποχής. |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | Λαμβάνει το συντομευμένο όνομα μήνα. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | Λαμβάνει όλα τα πρότυπα στα οποία μπορούν να μορφοποιηθούν τιμές ημερομηνίας και ώρας. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | Λαμβάνει όλα τα πρότυπα στα οποία μπορούν να μορφοποιηθούν τιμές ημερομηνίας και ώρας χρησιμοποιώντας το καθορισμένο συμβολοσειρά μορφής. |
| [GetDayName](./getdayname/)(DayOfWeek) const | Λαμβάνει το όνομα της ημέρας της εβδομάδας. |
| [GetEra](./getera/)(const String\&) const | Λαμβάνει την εποχή με βάση το όνομα. |
| [GetEraName](./geteraname/)(int) const | Λαμβάνει το όνομα της εποχής. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Λαμβάνει μορφοποιητή συγκεκριμένου τύπου. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Λαμβάνει μορφοποιητή που σχετίζεται με τον πάροχο μορφής. |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | Λαμβάνει το όνομα του μήνα δίσεκτου έτους. |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | Λαμβάνει το γενικό όνομα του μήνα. |
| [GetMonthName](./getmonthname/)(int) const | Λαμβάνει το όνομα του μήνα. |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | Λαμβάνει το πιο σύντομο όνομα για την καθορισμένη ημέρα της εβδομάδας. |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | Λαμβάνει την έκδοση μόνο για ανάγνωση του μορφοποιητή. |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | Ορίζει συντομευμένα ονόματα ημερών. |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | Ορίζει συντομευμένα ονόματα μηνών σε γενική μορφή. |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | Ορίζει συντομευμένα ονόματα μηνών. |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | Ορίζει το σύμβολο ΠΜ. |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | Ορίζει το ημερολόγιο που συνδέεται με τον μορφοποιητή. |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | Ορίζει τον κανόνα εβδομάδας του ημερολογίου που συνδέεται με τον μορφοποιητή. |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | Ορίζει το διαχωριστικό ημερομηνίας. |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | Ορίζει τα ονόματα των ημερών. |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | Ορίζει την πρώτη ημέρα της εβδομάδας. |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | Ορίζει το πλήρες πρότυπο ημερομηνίας και ώρας. |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | Ορίζει το μακρύ πρότυπο ημερομηνίας. |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | Ορίζει το μακρύ πρότυπο ώρας. |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | Ορίζει το πρότυπο ημέρας μήνα. |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | Ορίζει τα ονόματα των μηνών σε γενική μορφή. |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | Ορίζει τα ονόματα των μηνών. |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | Ορίζει το σύμβολο ΜΜ. |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | Ορίζει το σύντομο πρότυπο ημερομηνίας. |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | Ορίζει τα πιο σύντομα δυνατά ονόματα ημερών. |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | Ορίζει το σύντομο πρότυπο ώρας. |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | Ορίζει το διαχωριστικό ώρας. |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | Ορίζει το πρότυπο έτους και μήνα. |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | Ορίζει πρότυπα για τη συγκεκριμένη μορφή. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
