---
title: "System::Array::LastIndexOf μέθοδος"
linktitle: "LastIndexOf"
second_title: "Aspose.Page για C++"
description: "System::Array::LastIndexOf μέθοδος. Προσδιορίζει τον δείκτη της τελευταίας εμφάνισης του συγκεκριμένου στοιχείου σε ένα εύρος στοιχείων του πίνακα που καθορίζεται από τον αρχικό δείκτη και τον αριθμό των στοιχείων στο εύρος σε C++."
type: docs
weight: 5500
url: /el/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Καθορίζει το δείκτη της τελευταίας εμφάνισης του καθορισμένου στοιχείου σε μια περιοχή στοιχείων του πίνακα που ορίζεται από τον αρχικό δείκτη και τον αριθμό των στοιχείων στην περιοχή.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Parameter | Περιγραφή |
| --- | --- |
| ArrayType | Τύπος στοιχείων στον στόχο πίνακα |
| ValueType | τύπος του στοιχείου προς αναζήτηση στον πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) για αναζήτηση του συγκεκριμένου στοιχείου σε |
| τιμή | const ValueType\& | Δείκτης του στοιχείου του οποίου πρέπει να προσδιοριστεί |
| startIndex | int | Δείκτης από τον οποίο ξεκινά η αναζήτηση |
| count | int | Αριθμός στοιχείων του εύρους προς αναζήτηση |

### ReturnValue

Δείκτης της τελευταίας εμφάνισης του συγκεκριμένου στοιχείου εάν βρεθεί, διαφορετικά -1

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Καθορίζει το δείκτη της τελευταίας εμφάνισης του καθορισμένου στοιχείου στον πίνακα.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| ArrayType | Τύπος στοιχείων στον στόχο πίνακα |
| ValueType | τύπος του στοιχείου προς αναζήτηση στον πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) για αναζήτηση του συγκεκριμένου στοιχείου σε |
| τιμή | const ValueType\& | Δείκτης του στοιχείου του οποίου πρέπει να προσδιοριστεί |

### ReturnValue

Δείκτης της τελευταίας εμφάνισης του συγκεκριμένου στοιχείου εάν βρεθεί, διαφορετικά -1

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Καθορίζει το δείκτη της τελευταίας εμφάνισης του καθορισμένου στοιχείου στον πίνακα ξεκινώντας από τον καθορισμένο δείκτη.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| Parameter | Περιγραφή |
| --- | --- |
| ArrayType | Τύπος στοιχείων στον στόχο πίνακα |
| ValueType | τύπος του στοιχείου προς αναζήτηση στον πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) για αναζήτηση του συγκεκριμένου στοιχείου σε |
| τιμή | const ValueType\& | Δείκτης του στοιχείου του οποίου πρέπει να προσδιοριστεί |
| startIndex | int | Δείκτης από τον οποίο ξεκινά η αναζήτηση |

### ReturnValue

Δείκτης της τελευταίας εμφάνισης του συγκεκριμένου στοιχείου εάν βρεθεί, διαφορετικά -1

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
