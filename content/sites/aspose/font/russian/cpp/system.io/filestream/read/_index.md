---
title: "System::IO::FileStream::Read метод"
linktitle: "Read"
second_title: "Aspose.Font для C++"
description: "System::IO::FileStream::Read метод. Считывает указанное количество байтов из потока и записывает их в указанный массив байтов в C++."
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
| buffer | const ArrayPtr\<uint8_t\>\& | Массив байтов, в который записываются прочитанные байты. |
| смещение | int32_t | Позиция, начинающаяся с 0, в **buffer**, с которой начинать запись. |
| count | int32_t | Количество байтов для чтения. |

### ReturnValue

Количество считанных байтов.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Считывает указанное количество байтов из потока и записывает их в указанный массив байтов.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Представление массива байтов, в которое записываются считанные байты. |
| смещение | int32_t | Позиция, начинающаяся с 0, в **buffer**, с которой начинать запись. |
| count | int32_t | Количество байтов для чтения. |

### ReturnValue

Количество считанных байтов.

## См. также

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
