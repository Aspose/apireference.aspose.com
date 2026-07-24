---
title: "System::Threading::CancellationToken::Register μέθοδος"
linktitle: "Register"
second_title: "Aspose.Page για C++"
description: "System::Threading::CancellationToken::Register μέθοδος. Καταχωρεί μια callback που θα κληθεί όταν ζητηθεί ακύρωση σε C++."
type: docs
weight: 400
url: /el/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


Καταχωρεί μια κλήση επιστροφής που θα κληθεί όταν ζητηθεί η ακύρωση.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| callback | const Action<>\& | Η [Action<>](../../../system/action/) που θα εκτελεστεί όταν ζητηθεί ακύρωση. |

### ReturnValue

Ένα αντικείμενο [CancellationTokenRegistration](../../cancellationtokenregistration/) που μπορεί να χρησιμοποιηθεί για την αποεγγραφή της callback.
## Παρατηρήσεις



Εάν η ακύρωση έχει ήδη ζητηθεί, η callback θα κληθεί αμέσως.

## Δείτε επίσης

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
