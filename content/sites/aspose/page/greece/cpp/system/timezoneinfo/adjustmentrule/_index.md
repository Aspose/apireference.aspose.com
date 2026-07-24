---
title: "System::TimeZoneInfo::AdjustmentRule κλάση"
linktitle: "AdjustmentRule"
second_title: "Aspose.Page για C++"
description: "System::TimeZoneInfo::AdjustmentRule κλάση. Παρέχει πληροφορίες σχετικά με μια ρύθμιση ζώνης ώρας. Αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3300
url: /el/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


Παρέχει πληροφορίες σχετικά με μια ρύθμιση ζώνης ώρας. Αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | Δημιουργεί ένα στιγμιότυπο της κλάσης [AdjustmentRule](./) που αντιπροσωπεύει έναν κανόνα ρύθμισης χρόνου περιγραφόμενο με τις καθορισμένες παραμέτρους. |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | Δημιουργεί ένα στιγμιότυπο της κλάσης [AdjustmentRule](./) που αντιπροσωπεύει έναν κανόνα ρύθμισης χρόνου περιγραφόμενο με τις καθορισμένες παραμέτρους. |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | Επιστρέφει μια διαφορά από την προεπιλεγμένη μετατόπιση UTC. |
| [get_DateEnd](./get_dateend/)() const | Επιστρέφει ένα αντικείμενο [DateTime](../../datetime/) που αντιπροσωπεύει την ημερομηνία και ώρα κατά την οποία ο κανόνας ρύθμισης δεν ισχύει πλέον. |
| [get_DateStart](./get_datestart/)() const | Επιστρέφει ένα αντικείμενο [DateTime](../../datetime/) που αντιπροσωπεύει την ημερομηνία και ώρα κατά την οποία ο κανόνας ρύθμισης τίθεται σε ισχύ. |
| [get_DaylightDelta](./get_daylightdelta/)() const | Επιστρέφει ένα αντικείμενο [TimeSpan](../../timespan/) που αντιπροσωπεύει το χρονικό διάστημα που απαιτείται για τη δημιουργία της θερινής ώρας της ζώνης ώρας. |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | Επιστρέφει τις πληροφορίες σχετικά με τη μετάβαση από την κανονική ώρα στη θερινή ώρα. |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | Επιστρέφει τις πληροφορίες σχετικά με τη μετάβαση από τη θερινή ώρα στην κανονική ώρα. |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | ΓΙΑ ΕΣΩΤΡΙΑΚΗ ΧΡΗΣΗ. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος της C# [Object.GetHashCode()](../../object/gethashcode/). Επιτρέπει την κατακερματισμό προσαρμοσμένων αντικειμένων. |
## Δείτε επίσης

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
