---
title: "Μέθοδος System::AsCast"
linktitle: "AsCast"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::AsCast. Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας την μετατροπή με τον τελεστή ''as''. Χρησιμοποιείται όταν απαιτείται απλή μετατροπή τύπου παρόμοια με κατασκευαστή σε C++."
type: docs
weight: 13500
url: /el/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή με τον τελεστή 'as'. Χρησιμοποιείται όταν απαιτείται απλή μετατροπή τύπου παρόμοια με κατασκευαστή.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται όταν οι τύποι προέλευσης και αποτελέσματος είναι ίδιοι.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής.

## Δείτε επίσης

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται για περιτυλίγματα εξαιρέσεων.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής. Επιστρέφει nullptr εάν δεν υπάρχει διαθέσιμη μετατροπή.

## Δείτε επίσης

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται για μετατροπή αντικειμένου σε εξαίρεση.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής. Επιστρέφει nullptr εάν δεν υπάρχει διαθέσιμη μετατροπή.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται όταν τόσο η προέλευση όσο και το αποτέλεσμα είναι έξυπνοι δείκτες.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής. Επιστρέφει nullptr εάν δεν υπάρχει διαθέσιμη μετατροπή.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται όταν τόσο η προέλευση όσο και το αποτέλεσμα είναι έξυπνοι δείκτες (με ρητό [SmartPtr<...>](../smartptr/) στον τύπο αποτελέσματος).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής. Επιστρέφει nullptr εάν δεν υπάρχει διαθέσιμη μετατροπή.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται για αποσυσκευασία αντικειμένου σε nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής. Επιστρέφει κενό nullable εάν δεν υπάρχει διαθέσιμη μετατροπή.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Μη έγκυρη αποσυσκευασία σε μη-αντικειμενικό τύπο.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Επιστρέφει πάντα null.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μη έγκυρη αποσυσκευασία σε μη-αντικειμενικό τύπο.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Επιστρέφει πάντα null.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται για συσκευασία nullable αντικειμένου.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται για συσκευασία κοινό αντικείμενο.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται για συσκευασία κοινό αντικείμενο.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται για αποσυσκευασία συμβολοσειράς.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται για περίπτωση nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Μετατρέπει τον τύπο προέλευσης στον τύπο αποτελέσματος χρησιμοποιώντας τη μετατροπή του τελεστή 'as'. Χρησιμοποιείται για μετατροπή μεταξύ πινάκων.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Πηγή | Ο τύπος προέλευσης. |
| Result | Ο τύπος αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) προς μετατροπή. |

### ReturnValue

Το αποτέλεσμα της μετατροπής. Επιστρέφει nullptr εάν δεν υπάρχει διαθέσιμη μετατροπή για κανένα μέλος του πίνακα.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
