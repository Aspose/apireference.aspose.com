---
title: "System::Globalization::HijriCalendar class"
linktitle: "HijriCalendar"
second_title: "Aspose.Page για C++"
description: "System::Globalization::HijriCalendar class. Ηιραμπικό ημερολόγιο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1200
url: /el/cpp/system.globalization/hijricalendar/
---
## HijriCalendar class


Ηιραμπικό ημερολόγιο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class HijriCalendar : public System::Globalization::Calendar
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Πληροφορίες RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Λαμβάνει τον τύπο αλγορίθμου. |
| [get_Eras](./get_eras/)() const override | Λαμβάνει τη λίστα των εποχών που υπάρχουν στο ημερολόγιο. |
| [get_HijriAdjustment](./get_hijriadjustment/)() const | Λαμβάνει τη ρύθμιση Hijri. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Μέγιστο χρονικό σημείο που υποστηρίζεται από το ημερολόγιο. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Ελάχιστο χρονικό σημείο που υποστηρίζεται από το ημερολόγιο. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Λαμβάνει την ημέρα της εβδομάδας για το καθορισμένο χρονικό σημείο. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Λαμβάνει το δίσεκτο μήνα για το καθορισμένο έτος. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Πληροφορίες RTTI. |
| [HijriCalendar](./hijricalendar/)() | Κατασκευαστής. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Ελέγχει αν η ημέρα είναι δίσεκτη. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Ελέγχει αν ο μήνας είναι δίσεκτος. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Ελέγχει αν ο μήνας είναι δίσεκτος. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Ελέγχει αν το έτος είναι δίσεκτο. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Ελέγχει αν το έτος είναι δίσεκτο. |
| [set_HijriAdjustment](./set_hijriadjustment/)(int) | Ορίζει τη ρύθμιση Hijri. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [HijriEra](./hijriera/) | Τρέχουσα εποχή Hijri. |
## Δείτε επίσης

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
