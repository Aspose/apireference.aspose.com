---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Page για C++"
description: "System::SafeInvoke method. Υλοποίηση της μετάφρασης του τελεστή ''?.'' σε C++."
type: docs
weight: 36900
url: /el/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Υλοποίηση της μετάφρασης του τελεστή '?.'.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parameter | Περιγραφή |
| --- | --- |
| T0 | Τύπος έκφρασης. |
| T1 | Τύπος του lambda που ενσωματώνει την έκφραση 'WhenTrue'. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| expr | T0 | τιμή έκφρασης. |
| func | T1 | Η έκφραση 'WhenTrue' δεσμευμένη σε functor. |

### ReturnValue

Αν η τιμή expr δεν είναι null, επιστρέφει τη func που καλείται με την τιμή της ως πρώτο όρισμα, διαφορετικά επιστρέφει null.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
