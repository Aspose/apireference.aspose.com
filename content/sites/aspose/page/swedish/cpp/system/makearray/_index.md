---
title: "System::MakeArray metod"
linktitle: "SkapaArray"
second_title: "Aspose.Page för C++"
description: "System::MakeArray metod. En fabrikfunktion som konstruerar ett nytt Array‑objekt och vidarebefordrar de angivna argumenten till dess konstruktor i C++."
type: docs
weight: 24000
url: /sv/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


En fabrikfunktion som konstruerar ett nytt [Array](../array/)‑objekt och vidarebefordrar de angivna argumenten till dess konstruktor.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av element i det [Array](../array/)‑objekt som funktionen konstruerar |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| args | Args\&&... | Argumenten som skickas till konstruktorn för det [Array](../array/)‑objekt som konstrueras |

### ReturnValue

En smart pekare som pekar på det konstruerade [Array](../array/)‑objektet

## Se även

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


En fabrikfunktion som konstruerar ett nytt [Array](../array/)‑objekt och vidarebefordrar de angivna argumenten till dess konstruktor.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av element i det [Array](../array/)‑objekt som funktionen konstruerar |
| Integral | Typ av array‑storlek. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| size | Integral | Storlek på den array som skapas. |
| args | Args\&&... | Argumenten som skickas till konstruktorn för det [Array](../array/)‑objekt som konstrueras |

### ReturnValue

En smart pekare som pekar på det konstruerade [Array](../array/)‑objektet

## Se även

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


En fabrikfunktion som konstruerar ett nytt [Array](../array/)‑objekt, fyller det med elementen från den angivna initieringslistan och returnerar en smart pekare som pekar på [Array](../array/)‑objektet.

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av element i det [Array](../array/)‑objekt som funktionen konstruerar |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| init | std::initializer_list\<T\> | Initieringslistan som innehåller elementen för att fylla arrayen med |

### ReturnValue

En smart pekare som pekar på det konstruerade [Array](../array/)‑objektet

## Se även

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
