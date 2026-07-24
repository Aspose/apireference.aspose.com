---
title: "System::Threading::CancellationTokenSource κλάση"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Page για C++"
description: "System::Threading::CancellationTokenSource κλάση. Πηγή διακριτικού ακύρωσης που μπορεί να χρησιμοποιηθεί για την ενεργοποίηση ειδοποιήσεων ακύρωσης σε C++."
type: docs
weight: 400
url: /el/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


Μια πηγή διακριτικού ακύρωσης που μπορεί να χρησιμοποιηθεί για την ενεργοποίηση ειδοποιήσεων ακύρωσης.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Cancel](./cancel/)() | Επικοινωνεί ένα αίτημα ακύρωσης. |
| [CancellationTokenSource](./cancellationtokensource/)() | Δημιουργεί ένα νέο [CancellationTokenSource](./). |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | Δημιουργεί μια συνδεδεμένη πηγή διακριτικού που ακυρώνεται όταν οποιοδήποτε από τα παρεχόμενα διακριτικά ακυρώνεται. |
| [Dispose](./dispose/)() override | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από το [CancellationTokenSource](./). |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Λαμβάνει αν έχει ζητηθεί η ακύρωση. |
| [get_Token](./get_token/)() const | Λαμβάνει το διακριτικό ακύρωσης που σχετίζεται με αυτήν την πηγή. |
## Παρατηρήσεις


Παρέχει μηχανισμούς για τη δημιουργία και τον έλεγχο διακριτικών ακύρωσης για συνεργατική ακύρωση λειτουργιών.
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
