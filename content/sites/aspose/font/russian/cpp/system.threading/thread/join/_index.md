---
title: "Метод System::Threading::Thread::Join"
linktitle: "Join"
second_title: "Aspose.Font для C++"
description: "Метод System::Threading::Thread::Join. Присоединяет управляемый поток. Выполняет неограниченное ожидание при необходимости в C++."
type: docs
weight: 1400
url: /ru/cpp/system.threading/thread/join/
---
## Thread::Join() method


Ожидает завершения управляемого потока. При необходимости выполняет неограниченное ожидание.

```cpp
void System::Threading::Thread::Join()
```

## См. также

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(int) method


Ожидает завершения управляемого потока. Выполняет ограниченное ожидание.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| millisecondsTimeout | int | Тайм‑аут ожидания в миллисекундах. |

### ReturnValue

True, если поток был успешно присоединён, false, если тайм-аут превышен.

## См. также

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(TimeSpan) method


Ожидает завершения управляемого потока. Выполняет ограниченное ожидание.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| timeout | TimeSpan | Объект [TimeSpan](../../../system/timespan/) задающий количество времени для ожидания завершения потока. |

### ReturnValue

True, если поток был успешно присоединён, false, если тайм-аут превышен.

## См. также

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
