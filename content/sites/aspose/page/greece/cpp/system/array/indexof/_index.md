---
title: "System::Array::IndexOf μέθοδος"
linktitle: "IndexOf"
second_title: "Aspose.Page για C++"
description: "System::Array::IndexOf method. Καθορίζει τη θέση της πρώτης εμφάνισης του καθορισμένου στοιχείου στον πίνακα σε C++."
type: docs
weight: 2900
url: /el/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


Καθορίζει το δείκτη της πρώτης εμφάνισης του καθορισμένου στοιχείου στον πίνακα.

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| στοιχείο | const T\& | Δείκτης του στοιχείου του οποίου πρέπει να προσδιοριστεί |

### ReturnValue

Δείκτης της πρώτης εμφάνισης του καθορισμένου στοιχείου εάν το στοιχείο βρεθεί, διαφορετικά -1

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Καθορίζει το δείκτη της πρώτης εμφάνισης του καθορισμένου στοιχείου στον πίνακα.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| ArrayType | Τύπος στοιχείων στον στόχο πίνακα |
| ValueType | τύπος του στοιχείου προς αναζήτηση στον πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) για αναζήτηση του συγκεκριμένου στοιχείου σε |
| τιμή | const ValueType\& | Δείκτης του στοιχείου του οποίου πρέπει να προσδιοριστεί |

### ReturnValue

Δείκτης της πρώτης εμφάνισης του καθορισμένου στοιχείου εάν το στοιχείο βρεθεί, διαφορετικά -1

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Καθορίζει το δείκτη της πρώτης εμφάνισης του καθορισμένου στοιχείου στον πίνακα ξεκινώντας από τον καθορισμένο δείκτη.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
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

### ReturnValue

Δείκτης της πρώτης εμφάνισης του καθορισμένου στοιχείου εάν το στοιχείο βρεθεί, διαφορετικά -1

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Καθορίζει το δείκτη της πρώτης εμφάνισης του καθορισμένου στοιχείου σε μια περιοχή στοιχείων του πίνακα που ορίζεται από τον αρχικό δείκτη και τον αριθμό των στοιχείων στην περιοχή.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
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

Δείκτης της πρώτης εμφάνισης του καθορισμένου στοιχείου εάν το στοιχείο βρεθεί, διαφορετικά -1

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
