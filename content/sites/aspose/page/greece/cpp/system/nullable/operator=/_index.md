---
title: "System::Nullable::operator= μέθοδος"
linktitle: "operator="
second_title: "Aspose.Page για C++"
description: "System::Nullable::operator= μέθοδος. Αντικαθιστά την τρέχουσα τιμή που αντιπροσωπεύεται από το αντικείμενο με την καθορισμένη στην C++."
type: docs
weight: 1800
url: /el/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


Αντικαθιστά την τρέχουσα αντιπροσωπευόμενη τιμή του αντικειμένου με την καθορισμένη.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| Parameter | Περιγραφή |
| --- | --- |
| Το | Τύπος της νέας τιμής που θα αντιπροσωπεύεται από το τρέχον αντικείμενο. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | Η νέα τιμή που θα αντιπροσωπεύεται από το τρέχον αντικείμενο. |

### ReturnValue

Μια αναφορά στον εαυτό

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(const T1\&) method


Αντικαθιστά την τρέχουσα αντιπροσωπευόμενη τιμή του αντικειμένου με την καθορισμένη.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| Parameter | Περιγραφή |
| --- | --- |
| Το | Τύπος της νέας τιμής που θα αντιπροσωπεύεται από το τρέχον αντικείμενο. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | const T1\& | Η νέα τιμή που θα αντιπροσωπεύεται από το τρέχον αντικείμενο. |

### ReturnValue

Μια αναφορά στον εαυτό

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


Αναθέτει ένα null στο τρέχον αντικείμενο.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

Ένα αντικείμενο [Nullable](../) που αντιπροσωπεύει τιμή null.

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
