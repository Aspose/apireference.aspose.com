---
title: "Метод System::IO::MemoryStream::Read"
linktitle: "Read"
second_title: "Aspose.Font для C++"
description: "Метод System::IO::MemoryStream::Read. Считывает указанное количество байтов из потока и записывает их в заданный массив байтов в C++."
type: docs
weight: 1100
url: /ru/cpp/system.io/memorystream/read/
---
## MemoryStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Считывает указанное количество байтов из потока и записывает их в указанный массив байтов.

```cpp
int32_t System::IO::MemoryStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Массив байтов, в который записываются считанные байты |
| смещение | int32_t | Нулевая позиция в **buffer**, с которой начинать запись |
| count | int32_t | Количество байтов для чтения |

### ReturnValue

Количество прочитанных байтов

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Считывает указанное количество байтов из потока и записывает их в указанный массив байтов.

```cpp
int32_t System::IO::MemoryStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Представление массива байтов, в которое записываются считанные байты |
| смещение | int32_t | Нулевая позиция в **buffer**, с которой начинать запись |
| count | int32_t | Количество байтов для чтения |

### ReturnValue

Количество прочитанных байтов

## См. также

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
