---
title: "System::Threading::SynchronizationContext class"
linktitle: "SynchronizationContext"
second_title: "Aspose.Page για C++"
description: "System::Threading::SynchronizationContext class. Παρέχει τη βασική λειτουργικότητα για τη διάδοση ενός synchronization context μέσω διαφόρων λειτουργιών συγχρονισμού σε C++."
type: docs
weight: 1100
url: /el/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


Παρέχει τη βασική λειτουργικότητα για τη διάδοση ενός πλαισίου συγχρονισμού σε διάφορες λειτουργίες συγχρονισμού.

```cpp
class SynchronizationContext : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [get_Current](./get_current/)() | Λαμβάνει το synchronization context για το τρέχον νήμα. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | Ορίζει το synchronization context για το τρέχον νήμα. |
| [SynchronizationContext](./synchronizationcontext/)() | Πληροφορίες RTTI. |
## Παρατηρήσεις


Αυτή η κλάση επιτρέπει τη διάδοση του synchronization context μεταξύ νημάτων και χρησιμοποιείται για τη μεταφορά callbacks ή κλήσεων σε κατάλληλο νήμα ή synchronization context.
Ψεύτικη υλοποίηση.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
