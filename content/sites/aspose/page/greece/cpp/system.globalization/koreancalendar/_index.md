---
title: "System::Globalization::KoreanCalendar κλάση"
linktitle: "KoreanCalendar"
second_title: "Aspose.Page για C++"
description: "System::Globalization::KoreanCalendar κλάση. Κορεατικό ημερολόγιο. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1700
url: /el/cpp/system.globalization/koreancalendar/
---
## KoreanCalendar class


Κορεατικό ημερολόγιο. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class KoreanCalendar : public System::Globalization::Calendar
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Πληροφορίες RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Λαμβάνει τον τύπο αλγορίθμου. |
| [get_Eras](./get_eras/)() const override | Λαμβάνει τη λίστα των εποχών που υπάρχουν στο ημερολόγιο. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Μέγιστο χρονικό σημείο που υποστηρίζεται από το ημερολόγιο. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Ελάχιστο χρονικό σημείο που υποστηρίζεται από το ημερολόγιο. |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | Λαμβάνει την ημέρα του μήνα για το καθορισμένο χρονικό σημείο. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Λαμβάνει την ημέρα της εβδομάδας για το καθορισμένο χρονικό σημείο. |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | Λαμβάνει την ημέρα του έτους για το καθορισμένο χρονικό σημείο. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο μήνα. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο μήνα. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο έτος. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο έτος. |
| [GetEra](./getera/)(DateTime) const override | Λαμβάνει την εποχή για το καθορισμένο χρονικό σημείο. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Λαμβάνει το δίσεκτο μήνα για το καθορισμένο έτος. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Λαμβάνει το δίσεκτο μήνα για το καθορισμένο έτος. |
| [GetMonth](./getmonth/)(DateTime) const override | Λαμβάνει το μήνα για το καθορισμένο χρονικό σημείο. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Λαμβάνει τον αριθμό των μηνών στο καθορισμένο έτος. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Πληροφορίες RTTI. |
| [GetYear](./getyear/)(DateTime) const override | Λαμβάνει το έτος για το καθορισμένο χρονικό σημείο. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Ελέγχει αν ο μήνας είναι δίσεκτος. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Ελέγχει αν ο μήνας είναι δίσεκτος. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Ελέγχει αν το έτος είναι δίσεκτο. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Ελέγχει αν το έτος είναι δίσεκτο. |
| [KoreanCalendar](./koreancalendar/)() | Κατασκευαστής. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Δημιουργεί το αντικείμενο [DateTime](../../system/datetime/) από τα συστατικά. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Δημιουργεί το αντικείμενο [DateTime](../../system/datetime/) από τα συστατικά. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [KoreanEra](./koreanera/) | Τρέχουσα κορεατική εποχή. |
## Δείτε επίσης

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
