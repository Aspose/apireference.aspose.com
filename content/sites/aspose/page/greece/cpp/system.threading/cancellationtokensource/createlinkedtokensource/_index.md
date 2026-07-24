---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource μέθοδος"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Page για C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource μέθοδος. Δημιουργεί μια συνδεδεμένη πηγή διακριτικού που ακυρώνεται όταν οποιοδήποτε από τα παρεχόμενα διακριτικά ακυρωθεί σε C++."
type: docs
weight: 600
url: /el/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


Δημιουργεί μια συνδεδεμένη πηγή διακριτικού που ακυρώνεται όταν οποιοδήποτε από τα παρεχόμενα διακριτικά ακυρώνεται.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| token1 | const CancellationToken\& | Πρώτο διακριτικό ακύρωσης για παρακολούθηση. |
| token2 | const CancellationToken\& | Δεύτερο διακριτικό ακύρωσης για παρακολούθηση. |

### ReturnValue

Νέα πηγή διακριτικού που θα ακυρωθεί όταν οποιοδήποτε από τα εισερχόμενα διακριτικά ακυρωθεί.
## Παρατηρήσεις



Η επιστρεφόμενη πηγή θα ακυρωθεί αμέσως εάν οποιοδήποτε από τα εισερχόμενα διακριτικά είναι ήδη ακυρωμένο.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
