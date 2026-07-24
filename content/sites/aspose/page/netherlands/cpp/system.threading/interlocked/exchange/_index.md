---
title: "System::Threading::Interlocked::Exchange method"
linktitle: "Exchange"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Interlocked::Exchange-methode. Wisselt de waarde op de variabele: slaat de nieuwe waarde op en retourneert de waarde die de variabele onmiddellijk vóór het opslaan had in C++."
type: docs
weight: 400
url: /nl/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Wisselt de waarde op een variabele: slaat de nieuwe waarde op en retourneert de waarde die de variabele onmiddellijk vóór het opslaan had.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Variabeletype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| location1 | T\& | Variabele-referentie om te wijzigen. |
| value | T | Waarde om op te slaan. |

### ReturnValue

Waarde van de variabele direct voordat deze werd gewijzigd.

## Zie ook

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Wisselt de waarde op een variabele: slaat de nieuwe waarde op en retourneert de waarde die de variabele onmiddellijk vóór het opslaan had. Niet geïmplementeerd.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Variabeletype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| location1 | T\& | Variabele-referentie om te wijzigen. |
| value | T | Waarde om op te slaan. |

### ReturnValue

Waarde van de variabele direct voordat deze werd gewijzigd.

## Zie ook

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
