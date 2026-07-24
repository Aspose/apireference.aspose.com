---
title: "System::Text::RegularExpressions::Match class"
linktitle: "Match"
second_title: "Aspose.Page για C++"
description: "System::Text::RegularExpressions::Match class. Μία μοναδική αντιστοίχιση του κανονικού εκφράσματος σε συμβολοσειρά. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Προσθέτει σύλληψη στην αντιστοίχιση. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Προσθέτει ομάδα στην αντιστοίχιση. |
| static [get_Empty](./get_empty/)() | Πρόσβαση σε κενή αντιστοίχιση. |
| [get_Groups](./get_groups/)() | Λαμβάνει τη λίστα ομάδων. |
| [Match](./match/)(const UStringPtr\&, int, int) | Κατασκευαστής. |
| [NextMatch](./nextmatch/)() | Επανάληψη πάνω στις αντιστοιχίες. |
| virtual [Result](./result/)(const String\&) | Διαμορφώνει τη συμβολοσειρά αντικαθιστώντας τις αναφορές υποαντιστοιχίας με τις τιμές τους. |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## Δείτε επίσης

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
