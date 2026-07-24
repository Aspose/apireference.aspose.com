---
title: "System::Globalization::HebrewCalendar κλάση"
linktitle: "HebrewCalendar"
second_title: "Aspose.Page για C++"
description: "System::Globalization::HebrewCalendar κλάση. Εβραϊκό ημερολόγιο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1100
url: /el/cpp/system.globalization/hebrewcalendar/
---
## HebrewCalendar class


Εβραϊκό ημερολόγιο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HebrewCalendar : public System::Globalization::Calendar
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Πληροφορίες RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Λαμβάνει τον τύπο αλγορίθμου. |
| [get_Eras](./get_eras/)() const override | Λαμβάνει τη λίστα των εποχών που υπάρχουν στο ημερολόγιο. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Μέγιστο χρονικό σημείο που υποστηρίζεται από το ημερολόγιο. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Ελάχιστο χρονικό σημείο που υποστηρίζεται από το ημερολόγιο. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Λαμβάνει την ημέρα της εβδομάδας για το καθορισμένο χρονικό σημείο. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο μήνα. |
| [GetEra](./getera/)(DateTime) const override | Λαμβάνει την εποχή για το καθορισμένο χρονικό σημείο. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Λαμβάνει το δίσεκτο μήνα για το καθορισμένο έτος. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Πληροφορίες RTTI. |
| [GetMonth](./getmonth/)(DateTime) const override | Λαμβάνει το μήνα για το καθορισμένο χρονικό σημείο. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Λαμβάνει τον αριθμό των μηνών στο καθορισμένο έτος. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Λαμβάνει τον αριθμό των μηνών στο καθορισμένο έτος. |
| [HebrewCalendar](./hebrewcalendar/)() | Κατασκευαστής. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Ελέγχει αν ο μήνας είναι δίσεκτος. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Ελέγχει αν ο μήνας είναι δίσεκτος. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Ελέγχει αν το έτος είναι δίσεκτο. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Ελέγχει αν το έτος είναι δίσεκτο. |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | Ορίζει το τελευταίο έτος που μπορεί να αναπαρασταθεί με 2 ψηφία. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Δημιουργεί το αντικείμενο [DateTime](../../system/datetime/) από τα συστατικά. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Δημιουργεί το αντικείμενο [DateTime](../../system/datetime/) από τα συστατικά. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [HebrewEra](./hebrewera/) | Τρέχουσα εβραϊκή εποχή. |
## Δείτε επίσης

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
