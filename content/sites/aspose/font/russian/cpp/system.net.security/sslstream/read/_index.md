---
title: "System::Net::Security::SslStream::Read метод"
linktitle: "Read"
second_title: "Aspose.Font для C++"
description: "System::Net::Security::SslStream::Read метод. Считывает указанное количество байтов из потока и записывает их в указанный массив байтов в C++."
type: docs
weight: 3200
url: /ru/cpp/system.net.security/sslstream/read/
---
## SslStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Считывает указанное количество байтов из потока и записывает их в указанный массив байтов.

```cpp
int32_t System::Net::Security::SslStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Считывает указанное количество байтов из потока и записывает их в указанный массив байтов.

```cpp
int32_t System::Net::Security::SslStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Массив байтов, в который записываются считанные байты |
| смещение | int32_t | Нулевая позиция в **buffer**, с которой начинать запись |
| count | int32_t | Количество байтов для чтения |

### ReturnValue

Количество прочитанных байтов

## См. также

* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
