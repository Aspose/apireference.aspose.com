---
title: "Μέθοδος System::setter_wrap"
linktitle: "setter_wrap"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::setter_wrap. Υπερφόρτωση για συναρτήσεις setter στιγμιοτύπου με μετατροπή τύπου σε C++."
type: docs
weight: 38200
url: /el/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Υπερφόρτωση για συναρτήσεις setter στιγμιοτύπου με μετατροπή τύπου.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος τιμής. |
| T2 | Τύπος που αναμένεται από τη συνάρτηση setter. |
| Host | Τύπος στιγμιότυπου. |
| HostSet | - Ο ίδιος ο Host, ή ο βασικός του τύπος, όπου ο setter της ιδιότητας ορίζεται. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| host | Host *const | [Object](../object/) για να καλέσετε τη συνάρτηση setter για. |
| pSetter | void(HostSet::*)(T2) | Αναφορά στη συνάρτηση setter. |
| τιμή | T | Τιμή προς ορισμό. |

### ReturnValue

ορίστε τιμή.

## Δείτε επίσης

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Υπερφόρτωση για στατικές συναρτήσεις setter με μετατροπή τύπου.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος τιμής. |
| T2 | Τύπος που αναμένεται από τη συνάρτηση setter. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| pSetter | void(*)(T2) | Αναφορά σε στατική συνάρτηση setter. |
| τιμή | T | Τιμή προς ορισμό. |

### ReturnValue

ορίστε τιμή.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
