---
title: "System::Threading::Interlocked::CompareExchange-Methode"
linktitle: "CompareExchange"
second_title: "Aspose.Page für C++"
description: "System::Threading::Interlocked::CompareExchange-Methode. Vergleicht und tauscht den Wert einer Variablen aus: prüft, ob die Variable einem bestimmten Wert entspricht, und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten in C++ entspricht."
type: docs
weight: 200
url: /de/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Vergleicht und tauscht den Wert einer Variablen aus: prüft, ob die Variable einem bestimmten Wert entspricht und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten entspricht.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location1 | int32_t\& | Variablenreferenz zum Ändern. |
| Wert | int32_t | Zu speichernder Wert. |
| Vergleichswert | int32_t | Wert, mit dem der Variablenwert vor dem Austausch verglichen wird. |
| erfolgreich | bool\& | Referenz auf eine Variable, die auf true gesetzt wird, wenn ein Austausch stattgefunden hat, und andernfalls auf false. |

### ReturnValue

Wert der Variablen beim Start der Operation, unabhängig davon, ob sie geändert wurde oder nicht.

## Siehe auch

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Vergleicht und tauscht den Wert einer Variablen aus: prüft, ob die Variable einem bestimmten Wert entspricht und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten entspricht.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Variablentyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location1 | T\& | Variablenreferenz zum Ändern. |
| Wert | T | Zu speichernder Wert. |
| Vergleichswert | T | Wert, mit dem der Variablenwert vor dem Austausch verglichen wird. |

### ReturnValue

Wert der Variablen beim Start der Operation, unabhängig davon, ob sie geändert wurde oder nicht.

## Siehe auch

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Vergleicht und tauscht den Wert einer Variablen aus: prüft, ob die Variable einem bestimmten Wert entspricht und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten entspricht. Nicht implementiert.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Variablentyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location1 | T\& | Variablenreferenz zum Ändern. |
| Wert | T | Zu speichernder Wert. |
| Vergleichswert | T | Wert, mit dem der Variablenwert vor dem Austausch verglichen wird. |

### ReturnValue

Wert der Variablen beim Start der Operation, unabhängig davon, ob sie geändert wurde oder nicht.

## Siehe auch

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
