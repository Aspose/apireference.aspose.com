---
title: "System::setter_post_decrement_wrap μέθοδος"
linktitle: "setter_post_decrement_wrap"
second_title: "Aspose.Page για C++"
description: "System::setter_post_decrement_wrap μέθοδος. Ο μεταφραστής μεταφράζει τις εκφράσεις post-decrement της C# που στοχεύουν στην ιδιότητα ενός αντικειμένου που έχει ορισμένο setter και getter, σε κλήση αυτής της συνάρτησης (υπερφόρτωση για const getter) σε C++."
type: docs
weight: 37600
url: /el/cpp/system/setter_post_decrement_wrap/
---
## System::setter_post_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


Ο μεταφραστής μεταφράζει τις εκφράσεις post-decrement της C# που στοχεύουν στην ιδιότητα ενός αντικειμένου που έχει ορισμένο setter και getter, σε κλήση αυτής της συνάρτησης (υπερφόρτωση για const getter).

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος της ιδιότητας. |
| Host | - κλάση του αντικειμένου που θα τροποποιηθεί |
| HostConstGet | - Ο ίδιος ο Host, ή ο βασικός του τύπος, όπου ορίζεται ο getter της ιδιότητας |
| HostSet | - Ο ίδιος ο Host, ή ο βασικός του τύπος, όπου ορίζεται ο setter της ιδιότητας |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| host | Host *const | Αντικείμενο για το οποίο καλούνται οι getters και setters. |
| pGetter | T(HostConstGet::*)() const | Δείκτης συνάρτησης που δείχνει στη συνάρτηση getter της ιδιότητας |
| pSetter | void(HostSet::*)(T) | Δείκτης συνάρτησης που δείχνει στη συνάρτηση setter της ιδιότητας |

### ReturnValue

Η τιμή της ιδιότητας πριν την αύξηση

## Δείτε επίσης

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_post_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Ο μεταφραστής μεταφράζει τις εκφράσεις post-decrement της C# που στοχεύουν στην ιδιότητα ενός αντικειμένου που έχει ορισμένο setter και getter, σε κλήση αυτής της συνάρτησης (υπερφόρτωση για non-const getter).

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος της ιδιότητας. |
| Host | - κλάση του αντικειμένου που θα τροποποιηθεί |
| HostGet | - Ο ίδιος ο Host, ή ο βασικός του τύπος, όπου ορίζεται ο getter της ιδιότητας |
| HostSet | - Ο ίδιος ο Host, ή ο βασικός του τύπος, όπου ορίζεται ο setter της ιδιότητας |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| host | Host *const | Αντικείμενο για το οποίο καλούνται οι getters και setters. |
| pGetter | T(HostGet::*)() | Δείκτης συνάρτησης που δείχνει στη συνάρτηση getter της ιδιότητας |
| pSetter | void(HostSet::*)(T) | Δείκτης συνάρτησης που δείχνει στη συνάρτηση setter της ιδιότητας |

### ReturnValue

Η τιμή της ιδιότητας πριν την αύξηση

## Δείτε επίσης

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_post_decrement_wrap(T(*)(), void(*)(T)) method


Ο μεταφραστής μεταφράζει τις εκφράσεις post-decrement της C# που στοχεύουν στην ιδιότητα μιας κλάσης που έχει ορισμένο setter και getter, σε κλήση αυτής της συνάρτησης.

```cpp
template<typename T> T System::setter_post_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος της ιδιότητας |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| pGetter | T(*)() | Δείκτης συνάρτησης που δείχνει στη ελεύθερη συνάρτηση getter της ιδιότητας |
| pSetter | void(*)(T) | Δείκτης συνάρτησης που δείχνει στη ελεύθερη συνάρτηση setter της ιδιότητας |

### ReturnValue

Η τιμή της ιδιότητας πριν την αύξηση

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
