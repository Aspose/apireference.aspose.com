---
title: "System::Nullable::Equals μέθοδος"
linktitle: "Ισούται"
second_title: "Aspose.Page για C++"
description: "System::Nullable::Equals μέθοδος. Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο Nullable σε C++."
type: docs
weight: 200
url: /el/cpp/system/nullable/equals/
---
## Nullable::Equals method


Καθορίζει εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../).

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Ο υποκείμενος τύπος του αντικειμένου [Nullable](../) για σύγκριση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| other | const T1\& | Μια σταθερή αναφορά στο αντικείμενο [Nullable](../) για σύγκριση. |

### ReturnValue

Αληθές εάν η τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι ίση με την τιμή που αντιπροσωπεύεται από το καθορισμένο αντικείμενο [Nullable](../), διαφορετικά - ψευδές

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
