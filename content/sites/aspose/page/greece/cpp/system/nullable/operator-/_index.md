---
title: "System::Nullable::operator- μέθοδος"
linktitle: "operator-"
second_title: "Aspose.Page για C++"
description: "System::Nullable::operator- μέθοδος. Αφαιρεί τιμές nullable σε C++."
type: docs
weight: 1400
url: /el/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


Αφαιρεί nullable τιμές.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Τύπος δεξιού τελεστή. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | const Nullable\<T1\>\& | τιμή προς αφαίρεση. |

### ReturnValue

Αποτέλεσμα αφαίρεσης.

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(const T1\&) const method


Αφαιρεί nullable και non-nullable τιμές.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Τύπος δεξιού τελεστή. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | const T1\& | τιμή προς αφαίρεση. |

### ReturnValue

Αποτέλεσμα αφαίρεσης.

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(T1) const method


Αφαιρεί nullable και null-pointed τιμές.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Τύπος δεξιού τελεστή, πρέπει να είναι nullptr_t. |

### ReturnValue

Κενό αντικείμενο [Nullable](../).

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
