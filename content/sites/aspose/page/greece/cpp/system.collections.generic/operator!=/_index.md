---
title: "System::Collections::Generic::operator!= μέθοδος"
linktitle: "operator!="
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::operator!= μέθοδος. Συγκρίνει δύο ζεύγη κλειδιού‑τιμής χρησιμοποιώντας αντίστροφη σημασιολογία ''equals'' σε C++."
type: docs
weight: 5300
url: /el/cpp/system.collections.generic/operator!=/
---
## System::Collections::Generic::operator!= method


Συγκρίνει δύο ζεύγη κλειδιού‑τιμής χρησιμοποιώντας αντίστροφη σημασιολογία 'equals'.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator!=(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| Parameter | Περιγραφή |
| --- | --- |
| TKey | Τύπος κλειδιού. |
| TValue | Τύπος τιμής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αριστερά | const KeyValuePair\<TKey, TValue\>\& | Τελεστικό LHS. |
| δεξιά | const KeyValuePair\<TKey, TValue\>\& | Τελεστέο RHS. |

### ReturnValue

Αληθές εάν και τα κλειδιά και οι τιμές δεν ταιριάζουν, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
