---
title: "System::ForceStaticCast μέθοδος"
linktitle: "ΕξαναγκαστικήΣτατικήΜετατροπή"
second_title: "Aspose.Page για C++"
description: "System::ForceStaticCast μέθοδος. Εκτελεί πραγματικό static cast σε αντικείμενα SmartPtr σε C++."
type: docs
weight: 20400
url: /el/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Εκτελεί πραγματικό static cast σε αντικείμενα [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος δείκτη στόχου. |
| TFrom | Τύπος δείκτη πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Δείκτης πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast επιτρέπεται, διαφορετικά η συμπεριφορά είναι ακαθόριστη.

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
