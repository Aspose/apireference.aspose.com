---
title: "System::IO::FileStream::Read method"
linktitle: "Read"
second_title: "Aspose.Page для C++"
description: "System::IO::FileStream::Read method. Читает указанное количество байтов из потока и записывает их в указанный массив байтов в C++."
type: docs
weight: 1300
url: /ru/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Считывает указанное количество байтов из потока и записывает их в указанный массив байтов.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | const ArrayPtr\<uint8_t\>\& | Массив байтов, в который записываются прочитанные байты. |
| смещение | int32_t | 0‑базовая позиция в **buffer**, с которой начинать запись. |
| count | int32_t | Количество байтов для чтения. |

### ReturnValue

Количество прочитанных байтов.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Считывает указанное количество байтов из потока и записывает их в указанный массив байтов.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | const System::Details::ArrayView\<uint8_t\>\& | Представление массива байтов, в которое записываются прочитанные байты. |
| смещение | int32_t | 0‑базовая позиция в **buffer**, с которой начинать запись. |
| count | int32_t | Количество байтов для чтения. |

### ReturnValue

Количество прочитанных байтов.

## См. также

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
