---
title: "System::Nullable::operator+ μέθοδος"
linktitle: "operator+"
second_title: "Aspose.Page για C++"
description: "System::Nullable::operator+ μέθοδος. Προσθέτει τιμές nullable σε C++."
type: docs
weight: 1200
url: /el/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


Προσθέτει nullable τιμές.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Τύπος δεξιού τελεστή. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | const Nullable\<T1\>\& | τιμή προς προσθήκη. |

### ReturnValue

Αποτέλεσμα άθροισης.

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(const T1\&) const method


Προσθέτει nullable και non-nullable τιμές.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Τύπος δεξιού τελεστή. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | const T1\& | τιμή προς προσθήκη. |

### ReturnValue

Αποτέλεσμα άθροισης.

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


Επιστρέφει ένα προεπιλεγμένο κατασκευασμένο αντικείμενο της κλάσης Nullable<T>.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
