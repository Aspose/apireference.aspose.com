---
title: "Κατασκευαστής System::Array::Array"
linktitle: "Πίνακας"
second_title: "Aspose.Page για C++"
description: "Κατασκευαστής System::Array::Array. Δημιουργεί έναν κενό πίνακα σε C++."
type: docs
weight: 100
url: /el/cpp/system/array/array/
---
## Array::Array() constructor


Δημιουργεί έναν κενό πίνακα.

```cpp
System::Array<T>::Array()
```

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


Δημιουργεί ένα αντικείμενο [Array](../) και το γεμίζει με τιμές από τον καθορισμένο πίνακα που περιέχει στοιχεία τύπου **[UnderlyingType](../underlyingtype/)**.

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| Parameter | Περιγραφή |
| --- | --- |
| InitArraySize | Αριθμός στοιχείων του πίνακα **init**. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | [Array](../) για αντιγραφή στον πίνακα που κατασκευάζεται. |

## Δείτε επίσης

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


Δημιουργεί ένα αντικείμενο [Array](../) και το γεμίζει με τιμές που αντιγράφονται από ένα αντικείμενο std::vector του οποίου ο τύπος των τιμών είναι ίδιος με **T** αλλά διαφορετικός από **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Q | Ο τύπος των στοιχείων του αντικειμένου std::vector από το οποίο αντιγράφονται τα στοιχεία |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const std::vector\<Q\>\& | std::vector για αντιγραφή των τιμών από |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const vector_t\&) constructor


Κατασκευαστής αντιγραφής.

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| assgn | const vector_t\& | std::vector για αντιγραφή τιμών από |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T\&) constructor


Κατασκευαστής πλήρωσης.

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| count | int | Αρχικό μέγεθος του πίνακα |
| init | const T\& | Η αρχική τιμή που χρησιμοποιείται για τη γέμιση του πίνακα |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T) constructor


Κατασκευαστής πλήρωσης.

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| count | int | Αρχικό μέγεθος του πίνακα |
| αρχικοποιεί | const T | Τιμές για τη γέμιση του πίνακα |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


Δημιουργεί ένα αντικείμενο [Array](../) και το γεμίζει με τιμές από τη συγκεκριμένη λίστα αρχικοποίησης που περιέχει στοιχεία τύπου bool.

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | Λίστα αρχικοποίησης που περιέχει στοιχεία για τη γέμιση του πίνακα |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


Δημιουργεί ένα αντικείμενο [Array](../) και το γεμίζει με τιμές από τη συγκεκριμένη λίστα αρχικοποίησης που περιέχει στοιχεία τύπου **[UnderlyingType](../underlyingtype/)**.

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | Λίστα αρχικοποίησης που περιέχει στοιχεία για τη γέμιση του πίνακα |

## Δείτε επίσης

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


Δημιουργεί ένα αντικείμενο [Array](../) και το γεμίζει με τιμές που μετακινήθηκαν από ένα αντικείμενο std::vector του οποίου ο τύπος των τιμών είναι ίδιος με **T** αλλά διαφορετικός από **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Q | Ο τύπος των στοιχείων του αντικειμένου std::vector από το οποίο θα μετακινηθούν τα στοιχεία |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | std::vector\<Q\>\&& | std::vector για αντιγραφή των τιμών από |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


Κατασκευαστής πλήρωσης.

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| Parameter | Περιγραφή |
| --- | --- |
| ValueType | Τύπος αρχικής τιμής |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | Αρχικό μέγεθος του πίνακα |
| init | ValueType | Η αρχική τιμή που χρησιμοποιείται για τη γέμιση του πίνακα |

## Δείτε επίσης

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(vector_t\&&) constructor


Κατασκευαστής μετακίνησης.

```cpp
System::Array<T>::Array(vector_t &&value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | vector_t\&& | std::vector, τα στοιχεία του οποίου αποκτώνται από τον πίνακα |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
