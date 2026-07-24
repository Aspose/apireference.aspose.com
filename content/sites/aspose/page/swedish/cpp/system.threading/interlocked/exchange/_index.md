---
title: "System::Threading::Interlocked::Exchange metod"
linktitle: "Utbyte"
second_title: "Aspose.Page för C++"
description: "System::Threading::Interlocked::Exchange metod. Byter värde på variabeln: lagrar det nya värdet och returnerar det värde variabeln hade omedelbart innan lagringen i C++."
type: docs
weight: 400
url: /sv/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Byter värde på variabel: lagrar det nya värdet och returnerar det värde variabeln hade omedelbart innan lagringen.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Variabeltyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| location1 | T\& | Variabelreferens för att ändra. |
| value | T | Värde att lagra. |

### ReturnValue

Variabelns värde precis innan den ändrades.

## Se även

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Byter värde på variabel: lagrar det nya värdet och returnerar det värde variabeln hade omedelbart innan lagringen. Inte implementerad.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Variabeltyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| location1 | T\& | Variabelreferens för att ändra. |
| value | T | Värde att lagra. |

### ReturnValue

Variabelns värde precis innan den ändrades.

## Se även

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
