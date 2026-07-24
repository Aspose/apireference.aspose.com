---
title: "Μέθοδος System::CastEnumerableTo"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::CastEnumerableTo. Εκτελεί την explicit μετατροπή των στοιχείων του καθορισμένου αντικειμένου enumerable σε διαφορετικό τύπο σε C++."
type: docs
weight: 15500
url: /el/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Εκτελεί την explicit μετατροπή των στοιχείων του καθορισμένου αντικειμένου enumerable σε διαφορετικό τύπο.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Περιγραφή |
| --- | --- |
| Προς | Ο τύπος στον οποίο θα μετατραπούν στατικά τα στοιχεία του αντικειμένου enumerable |
| From | Ο τύπος του αντικειμένου enumerable |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| enumerable | const From\& | Αντικείμενο Enumerable που περιέχει τα στοιχεία προς μετατροπή |

### ReturnValue

Δείκτης σε μια νέα συλλογή που περιέχει στοιχεία τύπου **To** ισοδύναμα με τα στοιχεία του **enumerable**

## Δείτε επίσης

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


Εκτελεί την explicit μετατροπή των στοιχείων του καθορισμένου αντικειμένου enumerable σε διαφορετικό τύπο.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Περιγραφή |
| --- | --- |
| Προς | Ο τύπος στον οποίο θα μετατραπούν στατικά τα στοιχεία του αντικειμένου enumerable |
| From | Ο τύπος του αντικειμένου enumerable |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| enumerable | const From\& | είναι κληρονόμος του αντικειμένου Enumerable με ορισμένη μέθοδο get_Count και που περιέχει τα στοιχεία προς μετατροπή |

### ReturnValue

Δείκτης σε μια νέα συλλογή που περιέχει στοιχεία τύπου **To** ισοδύναμα με τα στοιχεία του **enumerable**

## Δείτε επίσης

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
