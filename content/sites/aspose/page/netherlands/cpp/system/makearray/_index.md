---
title: "System::MakeArray method"
linktitle: "MaakArray"
second_title: "Aspose.Page voor C++"
description: "System::MakeArray method. Een fabrieksfunctie die een nieuw Array‑object maakt en de opgegeven argumenten doorgeeft aan de constructor in C++."
type: docs
weight: 24000
url: /nl/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


Een fabrieksfunctie die een nieuw [Array](../array/) object maakt en de opgegeven argumenten doorgeeft aan de constructor.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type elementen van het [Array](../array/) object dat de functie construeert |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| args | Args\&&... | De argumenten die worden doorgegeven aan de constructor van het [Array](../array/) object dat wordt geconstrueerd |

### ReturnValue

Een slimme pointer die wijst naar het geconstrueerde [Array](../array/) object

## Zie ook

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


Een fabrieksfunctie die een nieuw [Array](../array/) object maakt en de opgegeven argumenten doorgeeft aan de constructor.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type elementen van het [Array](../array/) object dat de functie construeert |
| Geheel | Type van de arraygrootte. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| size | Geheel | Grootte van de array die wordt aangemaakt. |
| args | Args\&&... | De argumenten die worden doorgegeven aan de constructor van het [Array](../array/) object dat wordt geconstrueerd |

### ReturnValue

Een slimme pointer die wijst naar het geconstrueerde [Array](../array/) object

## Zie ook

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


Een fabrieksfunctie die een nieuw [Array](../array/) object construeert, het vult met de elementen uit de opgegeven initialisatielijst en een slimme pointer retourneert die naar het [Array](../array/) object wijst.

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type elementen van het [Array](../array/) object dat de functie construeert |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| init | std::initializer_list\<T\> | De initialisatielijst die de elementen bevat om de array mee te vullen |

### ReturnValue

Een slimme pointer die wijst naar het geconstrueerde [Array](../array/) object

## Zie ook

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
