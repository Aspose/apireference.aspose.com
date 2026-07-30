---
title: "System::Threading::Interlocked::Exchange Methode"
linktitle: "Exchange"
second_title: "Aspose.Font für C++"
description: "System::Threading::Interlocked::Exchange Methode. Tauscht den Wert einer Variablen aus: speichert den neuen Wert und gibt den Wert zurück, den die Variable unmittelbar vor dem Speichern hatte, in C++."
type: docs
weight: 400
url: /de/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Exchanges-Wert einer Variablen: speichert den neuen Wert und gibt den Wert zurück, den die Variable unmittelbar vor dem Speichern hatte.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Variablentyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location1 | T\& | Variablenreferenz zum Ändern. |
| Wert | T | Wert zum Speichern. |

### ReturnValue

Wert der Variable unmittelbar bevor sie geändert wurde.

## Siehe auch

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Exchanges-Wert einer Variablen: speichert den neuen Wert und gibt den Wert zurück, den die Variable unmittelbar vor dem Speichern hatte. Nicht implementiert.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Variablentyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location1 | T\& | Variablenreferenz zum Ändern. |
| Wert | T | Wert zum Speichern. |

### ReturnValue

Wert der Variable unmittelbar bevor sie geändert wurde.

## Siehe auch

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
