---
title: "System::IO::MemoryStream::Write метод"
linktitle: "Write"
second_title: "Aspose.Page для C++"
description: "System::IO::MemoryStream::Write метод. Записывает указанный поддиапазон байтов из заданного массива байтов в поток в C++."
type: docs
weight: 1900
url: /ru/cpp/system.io/memorystream/write/
---
## MemoryStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Записывает указанный поддиапазон байтов из указанного массива байтов в поток.

```cpp
void System::IO::MemoryStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | const ArrayPtr\<uint8_t\>\& | Массив, содержащий байты для записи |
| смещение | int32_t | 0‑базовый индекс элемента в **buffer**, с которого начинается поддиапазон для записи |
| count | int32_t | Количество элементов в поддиапазоне для записи |

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Записывает указанный поддиапазон байтов из указанного массива байтов в поток.

```cpp
void System::IO::MemoryStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | const System::Details::ArrayView\<uint8_t\>\& | Представление массива, содержащего байты для записи |
| смещение | int32_t | 0‑базовый индекс элемента в **buffer**, с которого начинается поддиапазон для записи |
| count | int32_t | Количество элементов в поддиапазоне для записи |

## См. также

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
