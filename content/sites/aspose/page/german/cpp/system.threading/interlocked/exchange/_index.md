---
title: "System::Threading::Interlocked::Exchange-Methode"
linktitle: "Austausch"
second_title: "Aspose.Page für C++"
description: "System::Threading::Interlocked::Exchange-Methode. Tauscht den Wert einer Variablen aus: speichert den neuen Wert und gibt den Wert zurück, den die Variable unmittelbar vor dem Speichern in C++ hatte."
type: docs
weight: 400
url: /de/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Tauscht den Wert einer Variablen aus: speichert den neuen Wert und gibt den Wert zurück, den die Variable unmittelbar vor dem Speichern hatte.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Variablentyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location1 | T\& | Variablenreferenz zum Ändern. |
| Wert | T | Zu speichernder Wert. |

### ReturnValue

Wert der Variablen unmittelbar bevor sie geändert wurde.

## Siehe auch

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Tauscht den Wert einer Variablen aus: speichert den neuen Wert und gibt den Wert zurück, den die Variable unmittelbar vor dem Speichern hatte. Nicht implementiert.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Variablentyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location1 | T\& | Variablenreferenz zum Ändern. |
| Wert | T | Zu speichernder Wert. |

### ReturnValue

Wert der Variablen unmittelbar bevor sie geändert wurde.

## Siehe auch

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
