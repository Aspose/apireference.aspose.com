---
title: "System::GetHashCode μέθοδος"
linktitle: "ΑνάκτησηΚώδικαΚατακερματισμού"
second_title: "Aspose.Page για C++"
description: "System::GetHashCode μέθοδος. Εξειδίκευση για std::thread::id· Επιστρέφει τον κωδικό hash για το καθορισμένο αντικείμενο νήματος σε C++."
type: docs
weight: 21200
url: /el/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


Εξειδίκευση για std::thread::id· Επιστρέφει τον κωδικό hash για το καθορισμένο αντικείμενο νήματος.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Επιστρέφει έναν κωδικό hash για την καθορισμένη βαθμωτή τιμή.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος της τιμής για την οποία η συνάρτηση δημιουργεί κωδικό hash |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | Η τιμή για την οποία θα δημιουργηθεί κωδικός hash |

### ReturnValue

Ο κωδικός hash που δημιουργήθηκε για την καθορισμένη τιμή

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Επιστρέφει έναν κωδικό κατακερματισμού για το συγκεκριμένο αντικείμενο.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του αντικειμένου για τον οποίο η συνάρτηση δημιουργεί κωδικό κατακερματισμού |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | Το [SmartPtr](../smartptr/) που δείχνει στο αντικείμενο για το οποίο θα δημιουργηθεί κωδικός κατακερματισμού |

### ReturnValue

Ο κωδικός κατακερματισμού που δημιουργήθηκε για το συγκεκριμένο αντικείμενο

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Επιστρέφει έναν κωδικό κατακερματισμού για το συγκεκριμένο αντικείμενο που είναι εξαίρεση.

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του αντικειμένου για τον οποίο η συνάρτηση δημιουργεί κωδικό κατακερματισμού |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | Το [Exception](../exception/) Wrapper που περιέχει το αντικείμενο για το οποίο θα δημιουργηθεί κωδικός κατακερματισμού |

### ReturnValue

Ο κωδικός κατακερματισμού που δημιουργήθηκε για το συγκεκριμένο αντικείμενο

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Επιστρέφει έναν κωδικό κατακερματισμού για το συγκεκριμένο αντικείμενο που δεν είναι smart pointer ούτε εξαίρεση.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του αντικειμένου για τον οποίο η συνάρτηση δημιουργεί κωδικό κατακερματισμού |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | Μία const αναφορά στο αντικείμενο για το οποίο θα δημιουργηθεί κωδικός κατακερματισμού |

### ReturnValue

Ο κωδικός κατακερματισμού που δημιουργήθηκε για το συγκεκριμένο αντικείμενο

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
