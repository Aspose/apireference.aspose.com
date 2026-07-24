---
title: "μέθοδος System::DynamicCastArray"
linktitle: "DynamicCastArray"
second_title: "Aspose.Page για C++"
description: "μέθοδος System::DynamicCastArray. Εκτελεί μετατροπή των στοιχείων του καθορισμένου πίνακα σε διαφορετικό τύπο σε C++."
type: docs
weight: 17900
url: /el/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Εκτελεί μετατροπή των στοιχείων του καθορισμένου πίνακα σε διαφορετικό τύπο.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Parameter | Περιγραφή |
| --- | --- |
| Προς | Ο τύπος στον οποίο θα μετατραπούν τα στοιχεία του καθορισμένου πίνακα |
| From | Ο τύπος των στοιχείων των στοιχείων του πίνακα των οποίων θα γίνει η μετατροπή |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| from | const SharedPtr\<Array\<From\>\>\& | Κοινός δείκτης προς τον πίνακα που περιέχει τα στοιχεία προς μετατροπή |

### ReturnValue

Δείκτης σε νέο πίνακα που περιέχει στοιχεία τύπου **To** ισοδύναμα με τα στοιχεία του **from**

## Deprecated
Προστέθηκε για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντ' αυτού.

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
