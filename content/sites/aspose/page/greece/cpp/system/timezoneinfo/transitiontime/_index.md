---
title: "System::TimeZoneInfo::TransitionTime κλάση"
linktitle: "TransitionTime"
second_title: "Aspose.Page για C++"
description: "System::TimeZoneInfo::TransitionTime κλάση. Πληροφορίες RTTI σε C++."
type: docs
weight: 3400
url: /el/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


Πληροφορίες RTTI.

```cpp
class TransitionTime
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | Δημιουργεί μια παρουσία της κλάσης [TransitionTime](./) που αντιπροσωπεύει έναν κανόνα σταθερής ημερομηνίας (αλλαγή ώρας που συμβαίνει σε συγκεκριμένη ημέρα ενός συγκεκριμένου μήνα). |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | Δημιουργεί μια παρουσία της κλάσης [TransitionTime](./) που αντιπροσωπεύει έναν κανόνα κυμαινόμενης ημερομηνίας (αλλαγή ώρας που συμβαίνει σε συγκεκριμένη ημέρα μιας συγκεκριμένης εβδομάδας ενός συγκεκριμένου μήνα). |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | Δημιουργεί μια παρουσία της κλάσης [TransitionTime](./) που αντιπροσωπεύει μια αλλαγή ώρας περιγραφόμενη με τις καθορισμένες παραμέτρους. |
| [get_Day](./get_day/)() const | Επιστρέφει τον αριθμό σειράς της ημέρας της εβδομάδας κατά την οποία συμβαίνει η αλλαγή ώρας. |
| [get_DayOfWeek](./get_dayofweek/)() const | Επιστρέφει την τιμή που αντιπροσωπεύει την ημέρα της εβδομάδας κατά την οποία συμβαίνει η αλλαγή ώρας. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | Επιστρέφει την τιμή που υποδεικνύει αν η αλλαγή ώρας συμβαίνει σε σταθερή ημερομηνία και ώρα ή σε κυμαινόμενη ημερομηνία και ώρα. |
| [get_Month](./get_month/)() const | Επιστρέφει τον αριθμό σειράς του μήνα του έτους κατά την οποία συμβαίνει η αλλαγή ώρας. |
| [get_TimeOfDay](./get_timeofday/)() const | Επιστρέφει ένα αντικείμενο [DateTime](../../datetime/) που αντιπροσωπεύει τη συγκεκριμένη ώρα κατά την οποία συμβαίνει η αλλαγή ώρας. |
| [get_Week](./get_week/)() const | Επιστρέφει τον αριθμό σειράς της εβδομάδας του μήνα κατά την οποία συμβαίνει η αλλαγή ώρας. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | Προεπιλεγμένος κατασκευαστής. ΓΙΑ ΕΣΩΤΡΙΑ ΧΡΗΣΗ. |
## Παρατηρήσεις


Παρέχει πληροφορίες σχετικά με μια αλλαγή ώρας σε μια ζώνη ώρας.
## Δείτε επίσης

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
