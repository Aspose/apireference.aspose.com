---
title: "System::SmartPtr::Cast μέθοδος"
linktitle: "Cast"
second_title: "Aspose.Page για C++"
description: "System::SmartPtr::Cast μέθοδος. Μετατρέπει τον δείκτη στον ίδιο του τον τύπο στην C++."
type: docs
weight: 400
url: /el/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


Μετατρέπει τον δείκτη στον ίδιο του τον τύπο.

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Περιγραφή |
| --- | --- |
| Y | Τύπος-στόχος του αντικειμένου στο οποίο δείχνει. |
| Check | Σημαίες για να ρίξει εξαίρεση εάν δεν υπάρχει διαθέσιμη μετατροπή. |

### ReturnValue

Δείκτης αλλαγμένου τύπου που είναι πάντα σε κοινή λειτουργία.

## Δείτε επίσης

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Μετατρέπει τον δείκτη σε βασικό τύπο χρησιμοποιώντας static_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Περιγραφή |
| --- | --- |
| Y | Τύπος-στόχος του αντικειμένου στο οποίο δείχνει. |
| Check | Σημαίες για να ρίξει εξαίρεση εάν δεν υπάρχει διαθέσιμη μετατροπή. |

### ReturnValue

Δείκτης αλλαγμένου τύπου που είναι πάντα σε κοινή λειτουργία.

## Δείτε επίσης

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Μετατρέπει τον δείκτη σε παράγωγο τύπο χρησιμοποιώντας dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Περιγραφή |
| --- | --- |
| Y | Τύπος-στόχος του αντικειμένου στο οποίο δείχνει. |
| Check | Σημαίες για να ρίξει εξαίρεση εάν δεν υπάρχει διαθέσιμη μετατροπή. |

### ReturnValue

Δείκτης αλλαγμένου τύπου που είναι πάντα σε κοινόχρηστη λειτουργία. Ρίχνει InvalidCastException εάν δεν υπάρχει διαθέσιμη μετατροπή.

## Δείτε επίσης

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Μετατρέπει τον δείκτη σε παράγωγο τύπο χρησιμοποιώντας dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Περιγραφή |
| --- | --- |
| Y | Τύπος-στόχος του αντικειμένου στο οποίο δείχνει. |
| Check | Σημαίες για να ρίξει εξαίρεση εάν δεν υπάρχει διαθέσιμη μετατροπή. |

### ReturnValue

Δείκτης αλλαγμένου τύπου που είναι πάντα σε κοινόχρηστη λειτουργία. Επιστρέφει nullptr εάν δεν υπάρχει διαθέσιμη μετατροπή.

## Δείτε επίσης

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
