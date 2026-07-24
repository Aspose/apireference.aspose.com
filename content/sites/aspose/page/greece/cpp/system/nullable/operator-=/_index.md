---
title: "System::Nullable::operator-= μέθοδος"
linktitle: "operator-="
second_title: "Aspose.Page για C++"
description: "System::Nullable::operator-= μέθοδος. Εφαρμόζει το operator-=() στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο Nullable ως δεξιό όρισμα σε C++."
type: docs
weight: 1500
url: /el/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


Εφαρμόζει το [operator-=()](./) στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../) ως δεξιό όρισμα.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο υποκείμενος τύπος ενός αντικειμένου [Nullable](../) της τιμής του οποίου χρησιμοποιείται ως δεξιό όρισμα του [operator-=()](./) |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Μια σταθερή αναφορά σε αντικείμενο [Nullable](../) της τιμής του οποίου χρησιμοποιείται ως δεξιό όρισμα του [operator-=()](./) που εφαρμόζεται στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |

### ReturnValue

Μια αναφορά στον εαυτό

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(const T1\&) method


Εφαρμόζει το [operator-=()](./) στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας την καθορισμένη τιμή ως δεξιό όρισμα.

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο τύπος της τιμής που χρησιμοποιείται ως δεξιά τιμή του [operator-=()](./) |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| other | const T1\& | Μια σταθερή αναφορά στην τιμή που χρησιμοποιείται ως δεξιά τιμή του [operator-=()](./) που εφαρμόζεται στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |

### ReturnValue

Μια αναφορά στον εαυτό

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(T1) method


Επιστρέφει μια παρουσία της κλάσης [Nullable](../) που αντιπροσωπεύει μια μηδενική τιμή.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
