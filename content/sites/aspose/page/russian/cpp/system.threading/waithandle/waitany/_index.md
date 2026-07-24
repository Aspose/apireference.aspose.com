---
title: "Метод System::Threading::WaitHandle::WaitAny"
linktitle: "WaitAny"
second_title: "Aspose.Page для C++"
description: "Метод System::Threading::WaitHandle::WaitAny. Ожидает, пока любой из дескрипторов не сработает в C++."
type: docs
weight: 200
url: /ru/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Ожидает, пока любой из дескрипторов не сработает.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Дескрипторы для ожидания. |

### ReturnValue

Истина, когда каждый элемент в waitHandles получил сигнал; иначе метод никогда не возвращается.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Ожидает, пока любой из дескрипторов не сработает.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Дескрипторы для ожидания. |
| millisecondsTimeout | int | [Timeout](../../timeout/) для ожидания, в миллисекундах; -1 означает бесконечное ожидание, 0 — проверка и возврат, положительные значения — тайм-ауты. |

### ReturnValue

Истина, если какой‑либо дескриптор сработал, ложь, если время ожидания превысило предел.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Ожидает, пока любой из дескрипторов не сработает.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Дескрипторы для ожидания. |
| timeout | TimeSpan | Объект [System::TimeSpan](../../../system/timespan/) представляет количество миллисекунд для ожидания, или объект [System::TimeSpan](../../../system/timespan/) представляет -1 миллисекунду для бесконечного ожидания. |

### ReturnValue

Истина, если какой‑либо дескриптор сработал, ложь, если время ожидания превысило предел.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
