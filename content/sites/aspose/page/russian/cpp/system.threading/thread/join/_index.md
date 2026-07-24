---
title: "System::Threading::Thread::Join метод"
linktitle: "Join"
second_title: "Aspose.Page для C++"
description: "System::Threading::Thread::Join метод. Присоединяет управляемый поток. Выполняет неограниченное ожидание, если требуется, в C++."
type: docs
weight: 1400
url: /ru/cpp/system.threading/thread/join/
---
## Thread::Join() method


Ожидает завершения управляемого потока. Выполняет неограниченное ожидание при необходимости.

```cpp
void System::Threading::Thread::Join()
```

## См. также

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(int) method


Ожидает завершения управляемого потока. Выполняет ограниченное ожидание.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| millisecondsTimeout | int | Тайм‑аут ожидания в миллисекундах. |

### ReturnValue

True, если поток был успешно присоединён, false, если превышено время ожидания.

## См. также

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(TimeSpan) method


Ожидает завершения управляемого потока. Выполняет ограниченное ожидание.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| timeout | TimeSpan | Объект [TimeSpan](../../../system/timespan/) установленный в количество времени, которое необходимо ждать завершения потока. |

### ReturnValue

True, если поток был успешно присоединён, false, если превышено время ожидания.

## См. также

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
