---
title: "System::IO::BufferedStream::Read метод"
linktitle: "Read"
second_title: "Aspose.Font для C++"
description: "System::IO::BufferedStream::Read метод. Считывает указанное количество байтов из внутреннего потока и записывает их в указанный массив байтов в C++."
type: docs
weight: 900
url: /ru/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Считывает указанное количество байтов из базового потока и записывает их в указанный массив байтов.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Считывает указанное количество байтов из базового потока и записывает их в указанный массив байтов.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Массив байтов, в который записываются считанные байты |
| смещение | int32_t | Нулевая позиция в **buffer**, с которой начинать запись |
| count | int32_t | Количество байтов для чтения |

### ReturnValue

Количество прочитанных байтов

## См. также

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
