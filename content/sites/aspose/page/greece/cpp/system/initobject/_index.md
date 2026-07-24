---
title: "System::InitObject method"
linktitle: "ΑρχικοποίησηΑντικειμένου"
second_title: "Aspose.Page για C++"
description: "System::InitObject method. Ξεκινά την αρχικοποίηση ενός αντικειμένου με κοινή ιδιοκτησία σε C++."
type: docs
weight: 21800
url: /el/cpp/system/initobject/
---
## System::InitObject method


Ξεκινά την αρχικοποίηση ενός αντικειμένου με κοινή ιδιοκτησία.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος αντικειμένου προς αρχικοποίηση |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) προς αρχικοποίηση |

### ReturnValue

ObjectBuilder διαμορφωμένο για κατασκευή κοινόχρηστου δείκτη
## Παρατηρήσεις



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
