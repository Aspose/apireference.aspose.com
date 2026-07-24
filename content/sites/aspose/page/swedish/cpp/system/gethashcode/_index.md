---
title: "System::GetHashCode‑metod"
linktitle: "HämtaHashKod"
second_title: "Aspose.Page för C++"
description: "System::GetHashCode‑metod. Specialisering för std::thread::id; Returnerar hash‑koden för det angivna trådföremålet i C++."
type: docs
weight: 21200
url: /sv/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


Specialisering för std::thread::id; Returnerar hash‑koden för det angivna trådföremålet.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Returnerar en hash‑kod för det angivna skalära värdet.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av värdet för vilket funktionen genererar hash‑kod |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const T\& | Värdet att generera hash‑kod för |

### ReturnValue

Hash‑koden som genererats för det angivna värdet

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Returnerar en hashkod för det angivna objektet.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av objektet för vilket funktionen genererar hashkod |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const T\& | Den [SmartPtr](../smartptr/) som pekar på objektet för att generera hashkod för |

### ReturnValue

Hashkoden som genererats för det angivna objektet

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Returnerar en hashkod för det angivna objektet som är ett undantag.

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av objektet för vilket funktionen genererar hashkod |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const T\& | Den [Exception](../exception/) omslutaren som innehåller objektet för att generera hashkod för |

### ReturnValue

Hashkoden som genererats för det angivna objektet

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Returnerar en hashkod för det angivna objektet som varken är en smart pekare eller ett undantag.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av objektet för vilket funktionen genererar hashkod |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const T\& | En konstant referens till objektet för att generera hashkod för |

### ReturnValue

Hashkoden som genererats för det angivna objektet

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
