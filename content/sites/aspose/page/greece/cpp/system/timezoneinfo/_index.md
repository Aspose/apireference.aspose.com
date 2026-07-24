---
title: "κλάση System::TimeZoneInfo"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Page για C++"
description: "Κλάση System::TimeZoneInfo. Αντιπροσωπεύει πληροφορίες που περιγράφουν μια συγκεκριμένη ζώνη ώρας. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 6300
url: /el/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


Αντιπροσωπεύει πληροφορίες που περιγράφουν μια συγκεκριμένη ζώνη ώρας. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../makeobject/) function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | Καθαρισμός των αποθηκευμένων δεδομένων ζώνης ώρας. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) χρόνο από μία ζώνη ώρας σε άλλη. |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) χρόνο στην ώρα σε καθορισμένη ζώνη ώρας. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) χρόνο στην ώρα σε καθορισμένη ζώνη ώρας. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) χρόνο στην ώρα σε καθορισμένη ζώνη ώρας. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) χρόνο στην ώρα σε καθορισμένη ζώνη ώρας. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) χρόνο στην ώρα σε καθορισμένη ζώνη ώρας. |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | Μετατρέπει την ώρα UTC στην ώρα σε καθορισμένη ζώνη ώρας. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | Μετατρέπει τον χρόνο σε ώρα UTC. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | Μετατρέπει τον χρόνο σε ώρα UTC. |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | Μετατρέπει τον χρόνο σε ώρα UTC. ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | Δημιουργεί προσαρμοσμένη ζώνη ώρας. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | Δημιουργεί προσαρμοσμένη ζώνη ώρας. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | Δημιουργεί προσαρμοσμένη ζώνη ώρας. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | Καθορίζει αν τα τρέχοντα και τα καθορισμένα αντικείμενα είναι ίσα. |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | Λαμβάνει τη ζώνη ώρας με καθορισμένο αναγνωριστικό. |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | Επιστρέφει ένα στιγμιότυπο του [TimeSpan](../timespan/) που αντιπροσωπεύει ένα χρονικό διάστημα μεταξύ της τυπικής ώρας της τρέχουσας ζώνης ώρας και της ώρας UTC. |
| [get_DaylightName](./get_daylightname/)() const | Λαμβάνει το όνομα για την θερινή ώρα της τρέχουσας ζώνης ώρας. |
| [get_DisplayName](./get_displayname/)() const | Λαμβάνει το όνομα για την τρέχουσα ζώνη ώρας. |
| [get_Id](./get_id/)() const | Επιστρέφει το αναγνωριστικό της ζώνης ώρας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [get_Local](./get_local/)() | Επιστρέφει ένα στιγμιότυπο του [TimeZoneInfo](./) που αντιπροσωπεύει μια τοπική ζώνη ώρας. |
| [get_StandardName](./get_standardname/)() const | Λαμβάνει το όνομα για την τυπική ώρα της τρέχουσας ζώνης ώρας. |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | Λαμβάνει τη σημαία που υποδεικνύει αν η ζώνη ώρας έχει κανόνες θερινής ώρας. |
| static [get_Utc](./get_utc/)() | Επιστρέφει ένα στιγμιότυπο του [TimeZoneInfo](./) που αντιπροσωπεύει μια ζώνη ώρας UTC. |
| [GetAdjustmentRules](./getadjustmentrules/)() const | Επιστρέφει έναν πίνακα που αποτελείται από αντικείμενα [AdjustmentRule](./adjustmentrule/) που αντιπροσωπεύουν κανόνες προσαρμογής που εφαρμόζονται στο τρέχον αντικείμενο [TimeZoneInfo](./). |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | Λαμβάνει τις ημερομηνίες και ώρες UTC στις οποίες μπορεί να αντιστοιχιστεί μια καθορισμένη ημερομηνία και ώρα. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | Λαμβάνει τις ημερομηνίες και ώρες UTC στις οποίες μπορεί να αντιστοιχιστεί μια καθορισμένη ημερομηνία και ώρα. |
| [GetHashCode](./gethashcode/)() const override | Αναλογία της μεθόδου C# [Object.GetHashCode()](../object/gethashcode/). Ενεργοποιεί τη δημιουργία κατακερματισμού προσαρμοσμένων αντικειμένων. |
| static [GetSystemTimeZones](./getsystemtimezones/)() | Λαμβάνει ταξινομημένη συλλογή όλων των ζωνών ώρας που είναι διαθέσιμες στο τοπικό σύστημα. |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | Υπολογίζει τη διαφορά μεταξύ της ώρας σε αυτή τη ζώνη ώρας και της ζώνης ώρας UTC για μια καθορισμένη ημερομηνία και ώρα. |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | Υπολογίζει τη διαφορά μεταξύ της ώρας σε αυτή τη ζώνη ώρας και της ζώνης ώρας UTC για μια καθορισμένη ημερομηνία και ώρα. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | Εσωτερική βοηθητική συνάρτηση που επιστρέφει την απόκλιση UTC για μια ημερομηνία-ώρα UTC σε μια καθορισμένη ζώνη ώρας. ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | Εσωτερική βοηθητική συνάρτηση που επιστρέφει την απόκλιση UTC για μια ημερομηνία-ώρα UTC σε μια καθορισμένη ζώνη ώρας. ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | Υπολογίζει τη διαφορά μεταξύ της ώρας σε αυτή τη ζώνη ώρας και της ζώνης ώρας UTC για μια καθορισμένη ημερομηνία και ώρα. ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | Ελέγχει εάν η τρέχουσα και μια άλλη ζώνη ώρας έχουν τους ίδιους κανόνες προσαρμογής. |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | Ελέγχει εάν η καθορισμένη ημερομηνία και ώρα είναι ασαφής και μπορεί να αντιστοιχιστεί σε πολλές ώρες UTC. |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | Ελέγχει εάν η καθορισμένη ημερομηνία και ώρα είναι ασαφής και μπορεί να αντιστοιχιστεί σε πολλές ώρες UTC. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | Ελέγχει εάν η καθορισμένη ημερομηνία και ώρα εμπίπτει στο εύρος της θερινής ώρας. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | Ελέγχει εάν η καθορισμένη ημερομηνία και ώρα εμπίπτει στο εύρος της θερινής ώρας. |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | Ελέγχει εάν η καθορισμένη ημερομηνία και ώρα εμπίπτει στο εύρος της θερινής ώρας. |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | Ελέγχει εάν η καθορισμένη ημερομηνία και ώρα είναι μη έγκυρη. |
| [ToString](./tostring/)() const override | Αναλογία της μεθόδου C# [Object.ToString()](../object/tostring/). Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | Βοηθητική συνάρτηση που μετατρέπει ένα έτος και το [TransitionTime](./transitiontime/) σε ένα [DateTime](../datetime/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | Ένα ψευδώνυμο για έναν κοινόχρηστο δείκτη σε μια παρουσία της κλάσης [AdjustmentRule](./adjustmentrule/). |
## Δείτε επίσης

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
