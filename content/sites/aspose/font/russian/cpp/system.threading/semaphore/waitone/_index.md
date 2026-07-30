---
title: "System::Threading::Semaphore::WaitOne метод"
linktitle: "WaitOne"
second_title: "Aspose.Font для C++"
description: "System::Threading::Semaphore::WaitOne метод. Блокирует семафор. Выполняет неограниченное ожидание, если необходимо, в C++."
type: docs
weight: 500
url: /ru/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


Блокирует семафор. Выполняет неограниченное ожидание, если необходимо.

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

Всегда возвращает true, так как не возвращается, пока семафор не будет заблокирован.

## См. также

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Semaphore::WaitOne(int) method


Блокирует семафор. Выполняет ожидание, если необходимо.

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| millisecondsTimeout | int | Тайм‑аут ожидания в миллисекундах. |

### ReturnValue

Возвращает true, если семафор был заблокирован, или false, если тайм‑аут превышен.

## См. также

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
