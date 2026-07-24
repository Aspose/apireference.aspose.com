---
title: "System::CastEnumerableTo methode"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page voor C++"
description: "System::CastEnumerableTo methode. Voert de expliciete cast uit van elementen van het opgegeven enumerable object naar een ander type in C++."
type: docs
weight: 15500
url: /nl/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Voert de expliciete cast uit van elementen van het opgegeven enumerable object naar een ander type.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Beschrijving |
| --- | --- |
| Naar | Het type waarnaar de elementen van het enumerable object statisch worden gecast |
| From | Het type van het enumerable object |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| enumerable | const From\& | Enumerable object dat de te casten elementen bevat |

### ReturnValue

Een pointer naar een nieuwe collectie die elementen van type **To** bevat die gelijkwaardig zijn aan de elementen van **enumerable**

## Zie ook

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


Voert de expliciete cast uit van elementen van het opgegeven enumerable object naar een ander type.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Beschrijving |
| --- | --- |
| Naar | Het type waarnaar de elementen van het enumerable object statisch worden gecast |
| From | Het type van het enumerable object |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| enumerable | const From\& | is afstammeling van een Enumerable object met een gedefinieerde get_Count‑methode en dat de te casten elementen bevat |

### ReturnValue

Een pointer naar een nieuwe collectie die elementen van type **To** bevat die gelijkwaardig zijn aan de elementen van **enumerable**

## Zie ook

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
