---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Page για C++"
description: "System::Threading::CancellationTokenRegistration class. Αντιπροσωπεύει μια εγγραφή για ένα callback token ακύρωσης στο C++."
type: docs
weight: 300
url: /el/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


Αναπαριστά μια εγγραφή για κλήση επιστροφής (callback) διακριτικού ακύρωσης.

```cpp
class CancellationTokenRegistration
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Dispose](./dispose/)() | Αποδεσμεύει την εγγραφή και αφαιρεί το callback από το σχετικό [CancellationTokenSource](../cancellationtokensource/). Μετά την κλήση αυτής της μεθόδου, το καταχωρημένο callback δεν θα κληθεί πλέον όταν το σχετικό [CancellationTokenSource](../cancellationtokensource/) ακυρωθεί. |
## Παρατηρήσεις


Αυτή η κλάση επιτρέπει την αποεγγραφή ενός callback από ένα token ακύρωσης. Όταν αποδεσμευτεί, αφαιρεί το callback από το σχετικό [CancellationTokenSource](../cancellationtokensource/).
Αυτή η κλάση δεν πρέπει να δημιουργείται άμεσα - επιστρέφεται από τις μεθόδους εγγραφής του [CancellationToken](../cancellationtoken/).

## Δείτε επίσης

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
