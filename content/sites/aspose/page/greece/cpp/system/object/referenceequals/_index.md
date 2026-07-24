---
title: "Μέθοδος System::Object::ReferenceEquals"
linktitle: "ReferenceEquals"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Object::ReferenceEquals. Εξειδίκευση του Object::ReferenceEquals για την περίπτωση συμβολοσειράς και nullptr σε C++."
type: docs
weight: 1200
url: /el/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


Εξειδίκευση του [Object::ReferenceEquals](./) για την περίπτωση συμβολοσειράς και nullptr.

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | String const\& | [String](../../string/) για σύγκριση με nullptr. |

### ReturnValue

αληθές εάν η συμβολοσειρά είναι null, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


Εξειδίκευση του [Object::ReferenceEquals](./) για την περίπτωση συμβολοσειρών.

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str1 | String const\& | Πρώτη συμβολοσειρά για σύγκριση. |
| str2 | String const\& | Δεύτερη συμβολοσειρά για σύγκριση. |

### ReturnValue

αληθές εάν οι συμβολοσειρές ταιριάζουν, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


Συγκρίνει αντικείμενα κατά αναφορά.

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| objA | ptr const\& | Πρώτος δείκτης για σύγκριση. |
| objB | ptr const\& | Δεύτερος δείκτης για σύγκριση. |

### ReturnValue

Αληθές εάν οι δείκτες ταιριάζουν και ψευδές διαφορετικά.

## Δείτε επίσης

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Το Reference-συγκρίνει αντικείμενο τύπου τιμής με nullptr.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος του αντικειμένου για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| objA | T const\& | Πρώτο αντικείμενο για σύγκριση. |

### ReturnValue

Επιστρέφει πάντα ψευδές επειδή οι τύποι τιμών δεν μπορούν να είναι null.

## Δείτε επίσης

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


Συγκρίνει αντικείμενα κατά αναφορά.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος των αντικειμένων για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| objA | T const\& | Πρώτο αντικείμενο για σύγκριση. |
| objB | T const\& | Δεύτερο αντικείμενο για σύγκριση. |

### ReturnValue

Αληθές εάν οι διευθύνσεις των αντικειμένων ταιριάζουν και ψευδές διαφορετικά.

## Δείτε επίσης

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
