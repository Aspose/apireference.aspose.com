---
title: "System::CastEnumerableTo metod"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page för C++"
description: "System::CastEnumerableTo metod. Utför den explicita omvandlingen av element i det angivna enumerable‑objektet till en annan typ i C++."
type: docs
weight: 15500
url: /sv/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Utför den explicita omvandlingen av element i det angivna enumerable‑objektet till en annan typ.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Beskrivning |
| --- | --- |
| Till | Typen att statiskt omvandla elementen i enumerable‑objektet till |
| From | Typen av enumerable‑objektet |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| enumerable | const From\& | Enumerable-objekt som innehåller elementen som ska kastas |

### ReturnValue

En pekare till en ny samling som innehåller element av typen **To** motsvarande elementen i **enumerable**

## Se även

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


Utför den explicita omvandlingen av element i det angivna enumerable‑objektet till en annan typ.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Beskrivning |
| --- | --- |
| Till | Typen att statiskt omvandla elementen i enumerable‑objektet till |
| From | Typen av enumerable‑objektet |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| enumerable | const From\& | är en arvtagare till ett Enumerable-objekt med definierad get_Count-metod och som innehåller elementen som ska kastas |

### ReturnValue

En pekare till en ny samling som innehåller element av typen **To** motsvarande elementen i **enumerable**

## Se även

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
