---
title: "System::Is μέθοδος"
linktitle: "Είναι"
second_title: "Aspose.Page για C++"
description: "System::Is μέθοδος. Συνάρτηση αντιστοίχισης υψηλού επιπέδου. Εφαρμόζει ένα μοτίβο σε μια τιμή σε C++."
type: docs
weight: 21900
url: /el/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Συνάρτηση αντιστοίχισης υψηλού επιπέδου. Εφαρμόζει ένα μοτίβο σε μια τιμή.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Parameter | Περιγραφή |
| --- | --- |
| A | Τύπος μοτίβου (πρέπει να κληρονομεί από Details::Pattern). |
| E | Τύπος της τιμής προς αντιστοίχιση. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| e | const E\& | Τιμή προς αντιστοίχιση. |
| ένα | const A\& | Μοτίβο προς εφαρμογή. |

### ReturnValue

αληθές εάν το μοτίβο ταιριάζει με την τιμή.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


Υλοποιεί τη μετάφραση του σταθερού μοτίβου 'is'.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Parameter | Περιγραφή |
| --- | --- |
| ExpressionT | τύπος αριστερού έκφρασης. |
| ConstantT | τύπος σταθερής έκφρασης. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αριστερά | const ExpressionT\& | έκφραση που θα ελεγχθεί. |
| σταθερά | const ConstantT\& | έκφραση που θα συγκριθεί με την αριστερή. |

### ReturnValue

αληθές εάν ο έλεγχος τύπου είναι επιτυχής, ψευδές διαφορετικά.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


Υλοποιεί τη μετάφραση του μοτίβου δήλωσης 'is'.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Parameter | Περιγραφή |
| --- | --- |
| PatternT | τύπος προς έλεγχο. |
| ExpressionT | τύπος αριστερού έκφρασης. |
| ResultT | τύπος της έκφρασης αποτελέσματος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αριστερά | const ExpressionT\& | έκφραση που θα ελεγχθεί. |
| αποτέλεσμα | ResultT\& | μεταβλητή που θα εκχωρηθεί στον ελεγμένο τύπο. |

### ReturnValue

αληθές εάν ο έλεγχος τύπου είναι επιτυχής, ψευδές διαφορετικά.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
