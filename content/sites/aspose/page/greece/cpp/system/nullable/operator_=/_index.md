---
title: "System::Nullable::operator<= μέθοδος"
linktitle: "operator<="
second_title: "Aspose.Page για C++"
description: "System::Nullable::operator<= μέθοδος. Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο Nullable εφαρμόζοντας την operator<=() σε αυτές τις τιμές στην C++."
type: docs
weight: 1700
url: /el/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../) εφαρμόζοντας την [operator<=()](./) σε αυτές τις τιμές.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο υποκείμενος τύπος του αντικειμένου [Nullable](../) για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Μια σταθερή αναφορά στο αντικείμενο [Nullable](../) για σύγκριση. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../), διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(const T1\&) const method


Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερη ή ίση με την καθορισμένη τιμή εφαρμόζοντας την [operator<=()](./) σε αυτές τις τιμές.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο τύπος της τιμής για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | const T1\& | Μια σταθερή αναφορά στην τιμή για σύγκριση. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερη ή ίση με την καθορισμένη τιμή, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


Πάντα επιστρέφει false.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
τίτλος: System::Nullable::operator>= μέθοδος
linktitle: operator>=
second_title: Aspose.Page για C++
description: 'System::Nullable::operator>= μέθοδος. Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο Nullable εφαρμόζοντας την operator>=() σε αυτές τις τιμές στην C++.'
type: docs
βάρος: 2100
διεύθυνση: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../) εφαρμόζοντας την [operator>=()](./) σε αυτές τις τιμές.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο υποκείμενος τύπος του αντικειμένου [Nullable](../) για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Μια σταθερή αναφορά στο αντικείμενο [Nullable](../) για σύγκριση. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../), διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(const T1\&) const method


Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο εφαρμόζοντας το [operator>=()](./) σε αυτές τις τιμές.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο υποκείμενος τύπος της τιμής για σύγκριση με την τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | const T1\& | Μια σταθερή αναφορά σε ένα αντικείμενο για σύγκριση με το τρέχον αντικείμενο. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερη ή ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


Πάντα επιστρέφει false.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

Πάντα - ψευδές

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
Τίτλος: System::Nullable::operator|= method
Τίτλος συνδέσμου: operator|=
second_title: Aspose.Page για C++
Περιγραφή: 'System::Nullable::operator|= method. Εφαρμόζει το operator|=() στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας την καθορισμένη τιμή ως δεξιό όρισμα σε C++.'
type: docs
Βάρος: 2200
διεύθυνση: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


Εφαρμόζει το [operator|=()](./) στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας την καθορισμένη τιμή ως δεξιό όρισμα.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Η παράμετρος προτύπου για να λειτουργήσει το SFINAE. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | bool | Μια λογική τιμή που χρησιμοποιείται ως δεξιό όρισμα του [operator | =()](./) που εφαρμόζεται στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |

### ReturnValue

Μια αναφορά στον εαυτό.

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
