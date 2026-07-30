---
title: "System::Threading::Mutex::WaitOne метод"
linktitle: "WaitOne"
second_title: "Aspose.Font для C++"
description: "Метод System::Threading::Mutex::WaitOne. Блокирует мьютекс. Выполняет неограниченное ожидание, если необходимо, в C++."
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

Всегда возвращает true, так как не возвращает управление, пока мьютекс не будет заблокирован.

## См. также

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(int) method


Блокирует мьютекс. Выполняет ожидание, если необходимо.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| millisecondsTimeout | int | Тайм‑аут ожидания в миллисекундах. |

### ReturnValue

Возвращает true, если мьютекс был заблокирован, или false, если время ожидания превышено.

## См. также

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Блокирует мьютекс. Выполняет ожидание, если необходимо.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| timeout | TimeSpan | [System::TimeSpan](../../../system/timespan/) представляющий количество миллисекунд для ожидания, или [System::TimeSpan](../../../system/timespan/) представляющий -1 миллисекунд для бесконечного ожидания. |

### ReturnValue

Возвращает true, если мьютекс был заблокирован, или false, если время ожидания превышено.

## См. также

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
