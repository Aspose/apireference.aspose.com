---
title: "System::IO::FileStream::Write метод"
linktitle: "Write"
second_title: "Aspose.Font для C++"
description: "System::IO::FileStream::Write метод. Записывает указанный поддиапазон байтов из заданного массива байтов в поток в C++."
type: docs
weight: 1900
url: /ru/cpp/system.io/filestream/write/
---
## FileStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Записывает указанный поддиапазон байтов из указанного массива байтов в поток.

```cpp
void System::IO::FileStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Массив, содержащий байты для записи. |
| смещение | int32_t | Индекс, начинающийся с 0, элемента в **buffer**, с которого начинается поддиапазон для записи. |
| count | int32_t | Количество элементов в поддиапазоне для записи. |

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Записывает указанный поддиапазон байтов из указанного массива байтов в поток.

```cpp
void System::IO::FileStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Представление массива, содержащее байты для записи. |
| смещение | int32_t | Индекс, начинающийся с 0, элемента в **buffer**, с которого начинается поддиапазон для записи. |
| count | int32_t | Количество элементов в поддиапазоне для записи. |

## См. также

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
