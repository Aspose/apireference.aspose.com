---
title: "System::Threading::Interlocked::CompareExchange Methode"
linktitle: "CompareExchange"
second_title: "Aspose.Font für C++"
description: "System::Threading::Interlocked::CompareExchange Methode. Vergleicht und tauscht den Wert einer Variable aus: prüft, ob die Variable einem bestimmten Wert entspricht, und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten entspricht in C++."
type: docs
weight: 200
url: /de/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Compare-exchanges-Wert einer Variablen: prüft, ob die Variable einem bestimmten Wert entspricht und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten entspricht.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location1 | int32_t\& | Variablenreferenz zum Ändern. |
| Wert | int32_t | Wert zum Speichern. |
| comparand | int32_t | Wert, mit dem der Wert der Variable vor dem Austausch verglichen wird. |
| erfolgreich | bool\& | Referenz auf eine Variable, die auf true gesetzt wird, wenn der Austausch stattgefunden hat, und sonst auf false. |

### ReturnValue

Wert der Variable zu Beginn der Operation, unabhängig davon, ob sie geändert wurde oder nicht.

## Siehe auch

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Compare-exchanges-Wert einer Variablen: prüft, ob die Variable einem bestimmten Wert entspricht und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten entspricht.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Variablentyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location1 | T\& | Variablenreferenz zum Ändern. |
| Wert | T | Wert zum Speichern. |
| comparand | T | Wert, mit dem der Wert der Variable vor dem Austausch verglichen wird. |

### ReturnValue

Wert der Variable zu Beginn der Operation, unabhängig davon, ob sie geändert wurde oder nicht.

## Siehe auch

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Compare-exchanges-Wert einer Variablen: prüft, ob die Variable einem bestimmten Wert entspricht und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten entspricht. Nicht implementiert.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Variablentyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location1 | T\& | Variablenreferenz zum Ändern. |
| Wert | T | Wert zum Speichern. |
| comparand | T | Wert, mit dem der Wert der Variable vor dem Austausch verglichen wird. |

### ReturnValue

Wert der Variable zu Beginn der Operation, unabhängig davon, ob sie geändert wurde oder nicht.

## Siehe auch

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
