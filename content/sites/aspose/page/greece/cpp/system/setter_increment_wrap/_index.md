---
title: "Μέθοδος System::setter_increment_wrap"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::setter_increment_wrap. Ο μεταφραστής μεταφράζει τις εκφράσεις αύξησης του C# που στοχεύουν σε ιδιότητα κλάσης που έχει ορισμένο setter και getter, σε κλήση αυτής της συνάρτησης σε C++."
type: docs
weight: 37400
url: /el/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Ο μεταφραστής μεταφράζει τις εκφράσεις αύξησης του C# που στοχεύουν σε ιδιότητα κλάσης που έχει ορισμένο setter και getter, σε κλήση αυτής της συνάρτησης.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος της ιδιότητας |
| Host | - κλάση του αντικειμένου που θα τροποποιηθεί |
| HostGet | - Ο ίδιος ο Host, ή ο βασικός του τύπος, όπου ορίζεται ο getter της ιδιότητας |
| HostSet | - Ο ίδιος ο Host, ή ο βασικός του τύπος, όπου ορίζεται ο setter της ιδιότητας |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| host | Host *const | Ένας δείκτης σε ένα αντικείμενο του οποίου η ιδιότητα πρόκειται να αυξηθεί. |
| pGetter | T(HostGet::*)() | Δείκτης συνάρτησης που δείχνει στη μέθοδο getter της ιδιότητας. |
| pSetter | void(HostSet::*)(T) | Δείκτης συνάρτησης που δείχνει στη μέθοδο setter της ιδιότητας. |

### ReturnValue

Η αυξημένη τιμή της ιδιότητας.

## Δείτε επίσης

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


Ο μεταφραστής μεταφράζει τις εκφράσεις αύξησης του C# που στοχεύουν σε ιδιότητα κλάσης που έχει ορισμένο setter και getter, σε κλήση αυτής της συνάρτησης.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος της ιδιότητας |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| pGetter | T(*)() | Δείκτης συνάρτησης που δείχνει στη ελεύθερη συνάρτηση getter της ιδιότητας |
| pSetter | void(*)(T) | Δείκτης συνάρτησης που δείχνει στη ελεύθερη συνάρτηση setter της ιδιότητας |

### ReturnValue

Η αυξημένη τιμή της ιδιότητας.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
