---
title: "System::Threading::CancellationToken κλάση"
linktitle: "CancellationToken"
second_title: "Aspose.Page για C++"
description: "System::Threading::CancellationToken κλάση. Διαδίδει ειδοποίηση ότι οι λειτουργίες πρέπει να ακυρωθούν. Αυτή η κλάση παρέχει έναν μηχανισμό συνεργατικής ακύρωσης μεταξύ νημάτων, επιτρέποντας σε ένα νήμα να ενημερώνει τα άλλα ότι μια λειτουργία πρέπει να ακυρωθεί σε C++."
type: docs
weight: 200
url: /el/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


Διαδίδει ειδοποίηση ότι οι λειτουργίες πρέπει να ακυρωθούν. Αυτή η κλάση παρέχει έναν μηχανισμό συνεργατικής ακύρωσης μεταξύ νημάτων, επιτρέποντας σε ένα νήμα να ειδοποιεί τα άλλα ότι μια λειτουργία πρέπει να ακυρωθεί.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | Προεπιλεγμένος κατασκευαστής. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | Καθορίζει εάν αυτό το token μπορεί να βρίσκεται στην κατάσταση ακυρωμένου. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Καθορίζει εάν έχει ζητηθεί ακύρωση για αυτό το token. |
| static [get_None](./get_none/)() | Επιστρέφει μια κενή τιμή [System::Threading::CancellationToken](./). |
| [Register](./register/)(const Action<>\&) const | Καταχωρεί μια κλήση επιστροφής που θα κληθεί όταν ζητηθεί η ακύρωση. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | Ρίχνει ένα OperationCanceledException εάν έχει ζητηθεί η ακύρωση. |
## Παρατηρήσεις



Ένα [CancellationToken](./) μπορεί να ακυρωθεί μόνο μέσω του σχετικού [CancellationTokenSource](../cancellationtokensource/).

## Δείτε επίσης

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
