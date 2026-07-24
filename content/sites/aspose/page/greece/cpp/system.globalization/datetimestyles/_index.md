---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "Aspose.Page για C++"
description: "System::Globalization::DateTimeStyles enum. Ορίζει επιλογές μορφοποίησης ημερομηνίας και ώρας. Δυαδικές σημαίες σε C++."
type: docs
weight: 3500
url: /el/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


Ορίζει επιλογές μορφοποίησης ημερομηνίας και ώρας. Δυαδικές σημαίες.

```cpp
enum class DateTimeStyles : int32_t
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| None | 0 | Προεπιλογή. |
| AllowLeadingWhite | 1 | Αγνοεί τα αρχικά κενά διαστήματα. |
| AllowTrailingWhite | 2 | Αγνοεί τα τελικά κενά διαστήματα. |
| AllowInnerWhite | 4 | Αγνοήστε τα εσωτερικά κενά διαστήματα. |
| AllowWhiteSpaces | n/a | Αγνοήστε όλα τα κενά διαστήματα. |
| NoCurrentDateDefault | 8 | Κατά την ανάλυση μιας συμβολοσειράς ημερομηνίας/ώρας, εάν λείπουν όλα τα έτος/μήνας/ημέρα, ορίστε την προεπιλεγμένη ημερομηνία σε 0001/1/1, αντί για το τρέχον έτος/μήνα/ημέρα. |
| AdjustToUniversal | 16 | Κατά την ανάλυση μιας συμβολοσειράς ημερομηνίας/ώρας, εάν υπάρχει προσδιοριστής ζώνης ώρας ("GMT","Z","+xxxx", "-xxxx"), θα προσαρμόσουμε την αναλυμένη ώρα βάσει GMT. |
| AssumeLocal | 32 | Εάν δεν δοθεί ζώνη ώρας, χρησιμοποιήστε την τοπική ζώνη ώρας. |
| AssumeUniversal | 64 | Εάν δεν δοθεί ζώνη ώρας, χρησιμοποιήστε UTC. |
| RoundtripKind | 128 | Προσπαθήστε να διατηρήσετε αν η είσοδος είναι ακαθόριστη, τοπική ή UTC. |

## Δείτε επίσης

* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
