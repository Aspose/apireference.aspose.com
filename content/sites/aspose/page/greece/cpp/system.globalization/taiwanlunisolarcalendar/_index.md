---
title: "System::Globalization::TaiwanLunisolarCalendar κλάση"
linktitle: "TaiwanLunisolarCalendar"
second_title: "Aspose.Page για C++"
description: "System::Globalization::TaiwanLunisolarCalendar κλάση. Ταϊβανέσιος σεληνιακό-ηλιακό ημερολόγιο. Δεν έχει υλοποιηθεί. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2600
url: /el/cpp/system.globalization/taiwanlunisolarcalendar/
---
## TaiwanLunisolarCalendar class


Ταϊβανέσιος σεληνιακό-ηλιακό ημερολόγιο. Δεν έχει υλοποιηθεί. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class TaiwanLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Πληροφορίες RTTI. |
| [get_Eras](./get_eras/)() const override | Λαμβάνει τη λίστα των εποχών που υπάρχουν στο ημερολόγιο. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Μέγιστο χρονικό σημείο που υποστηρίζεται από το ημερολόγιο. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Ελάχιστο χρονικό σημείο που υποστηρίζεται από το ημερολόγιο. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο μήνα. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Λαμβάνει τον αριθμό των ημερών σε συγκεκριμένο μήνα. |
| [GetEra](./getera/)(DateTime) const override | Λαμβάνει την εποχή για το καθορισμένο χρονικό σημείο. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Λαμβάνει το δίσεκτο μήνα για το καθορισμένο έτος. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Λαμβάνει το δίσεκτο μήνα για το καθορισμένο έτος. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Λαμβάνει τον αριθμό των μηνών στο καθορισμένο έτος. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Πληροφορίες RTTI. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Ελέγχει αν το έτος είναι δίσεκτο. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Ελέγχει αν το έτος είναι δίσεκτο. |
| [TaiwanLunisolarCalendar](./taiwanlunisolarcalendar/)() | Κατασκευαστής. |
## Δείτε επίσης

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
