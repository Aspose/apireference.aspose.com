---
title: "Μέθοδος System::StaticCastArray"
linktitle: "StaticCastArray"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::StaticCastArray. Εκτελεί μετατροπή τύπου των στοιχείων του καθορισμένου πίνακα σε διαφορετικό τύπο. Υπερφόρτωση για περιπτώσεις όπου το From είναι αντικείμενο SmartPtr σε C++."
type: docs
weight: 39800
url: /el/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Εκτελεί μετατροπή τύπου των στοιχείων του καθορισμένου πίνακα σε διαφορετικό τύπο. Υπερφόρτωση για περιπτώσεις όπου το From είναι αντικείμενο [SmartPtr](../smartptr/).

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parameter | Περιγραφή |
| --- | --- |
| Προς | Ο τύπος στον οποίο θα μετατραπούν τα στοιχεία του καθορισμένου πίνακα |
| From | Ο τύπος των στοιχείων των στοιχείων του πίνακα των οποίων θα γίνει η μετατροπή |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Κοινός δείκτης προς τον πίνακα που περιέχει τα στοιχεία προς μετατροπή |

### ReturnValue

Δείκτης σε νέο πίνακα που περιέχει στοιχεία τύπου **To** ισοδύναμα με τα στοιχεία του **from**

## Deprecated
Προστέθηκε για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντ' αυτού.

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Εκτελεί μετατροπή τύπου των στοιχείων του καθορισμένου πίνακα σε διαφορετικό τύπο. Υπερφόρτωση για περιπτώσεις όπου το From είναι Boxable και το To είναι [Object](../object/).

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parameter | Περιγραφή |
| --- | --- |
| Προς | Ο τύπος στον οποίο θα μετατραπούν τα στοιχεία του καθορισμένου πίνακα |
| From | Ο τύπος των στοιχείων των στοιχείων του πίνακα των οποίων θα γίνει η μετατροπή |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Κοινός δείκτης προς τον πίνακα που περιέχει τα στοιχεία προς μετατροπή |

### ReturnValue

Δείκτης σε νέο πίνακα που περιέχει στοιχεία τύπου **To** ισοδύναμα με τα στοιχεία του **from**

## Deprecated
Προστέθηκε για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντ' αυτού.

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
