---
title: "System::Nullable::operator< method"
linktitle: "operator<"
second_title: "Aspose.Page για C++"
description: "System::Nullable::operator< method. Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερη από την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο Nullable εφαρμόζοντας operator<() σε αυτές τις τιμές σε C++."
type: docs
weight: 1600
url: /el/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερη από την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../) εφαρμόζοντας [operator<()](./) σε αυτές τις τιμές.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο υποκείμενος τύπος του αντικειμένου [Nullable](../) για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Μια σταθερή αναφορά στο αντικείμενο [Nullable](../) για σύγκριση. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερη από την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../), διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(const T1\&) const method


Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερη από την καθορισμένη τιμή εφαρμόζοντας [operator<()](./) σε αυτές τις τιμές.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο τύπος της τιμής για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | const T1\& | Μια σταθερή αναφορά στην τιμή για σύγκριση. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μικρότερη από την καθορισμένη τιμή, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Πάντα επιστρέφει false.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
τίτλος: System::Nullable::operator> method
τίτλος συνδέσμου: operator>
second_title: Aspose.Page για C++
περιγραφή: 'System::Nullable::operator> method. Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερη από την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο Nullable εφαρμόζοντας operator>() σε αυτές τις τιμές σε C++.'
type: docs
βάρος: 2000
url: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερη από την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../) εφαρμόζοντας [operator>()](./) σε αυτές τις τιμές.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο υποκείμενος τύπος του αντικειμένου [Nullable](../) για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Μια σταθερή αναφορά στο αντικείμενο [Nullable](../) για σύγκριση. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερη από την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../), διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(const T1\&) const method


Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερη από την καθορισμένη τιμή εφαρμόζοντας [operator>()](./) σε αυτές τις τιμές.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο τύπος της τιμής για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | const T1\& | Μια σταθερή αναφορά στην τιμή για σύγκριση. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μεγαλύτερη από την καθορισμένη τιμή, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Πάντα επιστρέφει false.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
