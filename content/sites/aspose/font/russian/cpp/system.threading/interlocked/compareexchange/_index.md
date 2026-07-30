---
title: "System::Threading::Interlocked::CompareExchange метод"
linktitle: "CompareExchange"
second_title: "Aspose.Font для C++"
description: "System::Threading::Interlocked::CompareExchange метод. Выполняет сравнение и обмен значением переменной: проверяет, равна ли переменная определённому значению, и сохраняет новое значение только если текущее значение соответствует ожидаемому в C++."
type: docs
weight: 200
url: /ru/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Сравнивает и меняет значение переменной: проверяет, равно ли значение переменной определённому значению, и сохраняет новое значение только если сохранённое значение соответствует ожидаемому.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| location1 | int32_t\& | Ссылка на переменную для изменения. |
| значение | int32_t | Значение для сохранения. |
| comparand | int32_t | Значение, с которым сравнивается значение переменной перед обменом. |
| успешно | bool\& | Ссылка на переменную, которая устанавливается в true, если обмен произошёл, и в false в противном случае. |

### ReturnValue

Значение переменной в начале операции независимо от того, было ли оно изменено.

## См. также

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Сравнивает и меняет значение переменной: проверяет, равно ли значение переменной определённому значению, и сохраняет новое значение только если сохранённое значение соответствует ожидаемому.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Параметр | Описание |
| --- | --- |
| T | Тип переменной. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| location1 | T\& | Ссылка на переменную для изменения. |
| значение | T | Значение для сохранения. |
| comparand | T | Значение, с которым сравнивается значение переменной перед обменом. |

### ReturnValue

Значение переменной в начале операции независимо от того, было ли оно изменено.

## См. также

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Сравнивает и меняет значение переменной: проверяет, равно ли значение переменной определённому значению, и сохраняет новое значение только если сохранённое значение соответствует ожидаемому. Не реализовано.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Параметр | Описание |
| --- | --- |
| T | Тип переменной. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| location1 | T\& | Ссылка на переменную для изменения. |
| значение | T | Значение для сохранения. |
| comparand | T | Значение, с которым сравнивается значение переменной перед обменом. |

### ReturnValue

Значение переменной в начале операции независимо от того, было ли оно изменено.

## См. также

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
