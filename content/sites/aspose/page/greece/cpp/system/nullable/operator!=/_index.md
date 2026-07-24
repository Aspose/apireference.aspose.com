---
title: "System::Nullable::operator!= μέθοδος"
linktitle: "operator!="
second_title: "Aspose.Page για C++"
description: "System::Nullable::operator!= μέθοδος. Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο δεν είναι ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο Nullable σε C++."
type: docs
weight: 1000
url: /el/cpp/system/nullable/operator!=/
---
## Nullable::operator!=(const Nullable\<T1\>\&) const method


Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο δεν είναι ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../).

```cpp
template<typename T1> bool System::Nullable<T>::operator!=(const Nullable<T1> &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο υποκείμενος τύπος του αντικειμένου [Nullable](../) για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Μια σταθερή αναφορά στο αντικείμενο [Nullable](../) για σύγκριση. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο δεν είναι ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../), διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator!=(const T1\&) const method


Καθορίζει αν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο δεν είναι ίση με την καθορισμένη τιμή.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator!=(const T1 &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο τύπος της τιμής για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | const T1\& | Μια σταθερή αναφορά στην τιμή για σύγκριση. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο δεν είναι ίση με την καθορισμένη τιμή, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator!=(std::nullptr_t) const method


Καθορίζει αν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο δεν είναι null.

```cpp
bool System::Nullable<T>::operator!=(std::nullptr_t) const
```


### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο δεν είναι null, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
