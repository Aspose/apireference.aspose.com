---
title: "System::Threading::Mutex::WaitOne метод"
linktitle: "WaitOne"
second_title: "Aspose.Page для C++"
description: "System::Threading::Mutex::WaitOne метод. Блокирует мьютекс. Выполняет неограниченное ожидание при необходимости в C++."
type: docs
weight: 500
url: /ru/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Блокирует мьютекс. Выполняет неограниченное ожидание, если необходимо.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

Всегда возвращает true, так как не возвращается, пока мьютекс не будет заблокирован.

## См. также

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


Блокирует мьютекс. Выполняет ожидание, если необходимо.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| millisecondsTimeout | int | Тайм‑аут ожидания в миллисекундах. |

### ReturnValue

Возвращает true, если мьютекс был заблокирован, или false, если время ожидания превысило лимит.

## См. также

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Блокирует мьютекс. Выполняет ожидание, если необходимо.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| timeout | TimeSpan | Объект [System::TimeSpan](../../../system/timespan/) представляет количество миллисекунд для ожидания, или объект [System::TimeSpan](../../../system/timespan/) представляет -1 миллисекунду для бесконечного ожидания. |

### ReturnValue

Возвращает true, если мьютекс был заблокирован, или false, если время ожидания превысило лимит.

## См. также

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
