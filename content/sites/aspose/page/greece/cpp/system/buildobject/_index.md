---
title: "Μέθοδος System::BuildObject"
linktitle: "BuildObject"
second_title: "Aspose.Page για C++"
description: "System::BuildObject method. Δημιουργήστε ένα αντικείμενο με κοινή ιδιοκτησία στην C++."
type: docs
weight: 15200
url: /el/cpp/system/buildobject/
---
## System::BuildObject method


Δημιουργήστε ένα αντικείμενο με κοινή ιδιοκτησία.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος αντικειμένου προς δημιουργία |
| Παράμετροι | Τύποι ορισμάτων για δημιουργία αντικειμένου |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| args | Args\&&... | Ορίσματα για προώθηση στον κατασκευαστή αντικειμένου |

### ReturnValue

ObjectBuilder διαμορφωμένο για κατασκευή κοινόχρηστου δείκτη
## Παρατηρήσεις



Δημιουργεί ένα [SharedPtr<T>](../sharedptr/) και επιστρέφει έναν builder για αυτό.
[Object](../object/) construction must be finished with [Get()](../get/) call 

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
