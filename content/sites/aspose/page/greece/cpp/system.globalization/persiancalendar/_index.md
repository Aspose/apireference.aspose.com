---
title: "System::Globalization::PersianCalendar κλάση"
linktitle: "PersianCalendar"
second_title: "Aspose.Page για C++"
description: "System::Globalization::PersianCalendar κλάση. Περσικό ημερολόγιο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2000
url: /el/cpp/system.globalization/persiancalendar/
---
## PersianCalendar class


Περσικό ημερολόγιο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class PersianCalendar : public System::Globalization::Calendar
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
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Πληροφορίες RTTI. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο έτος. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο έτος. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Λαμβάνει το δίσεκτο μήνα για το καθορισμένο έτος. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Λαμβάνει το δίσεκτο μήνα για το καθορισμένο έτος. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Λαμβάνει τον αριθμό των μηνών στο καθορισμένο έτος. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Λαμβάνει τον αριθμό των μηνών στο καθορισμένο έτος. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Ελέγχει αν ο μήνας είναι δίσεκτος. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Ελέγχει αν ο μήνας είναι δίσεκτος. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Ελέγχει αν το έτος είναι δίσεκτο. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Ελέγχει αν το έτος είναι δίσεκτο. |
| [PersianCalendar](./persiancalendar/)() | Κατασκευαστής. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [PersianEra](./persianera/) | Τρέχουσα περσική εποχή. |
## Δείτε επίσης

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
