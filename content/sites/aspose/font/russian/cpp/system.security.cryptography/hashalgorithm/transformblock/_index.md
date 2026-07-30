---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock метод"
linktitle: "TransformBlock"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock метод. Обрабатывает блок данных и копирует данные в выходной массив в C++."
type: docs
weight: 800
url: /ru/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Обрабатывает блок данных и копирует данные в выходной массив.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) для чтения данных. |
| inputOffset | int | Смещение входного буфера. |
| inputCount | int | Количество байтов для обработки. |
| outputBuffer | The number of attributes on the current node. This number includes default attributes. | Выходной буфер для копирования данных; nullptr, чтобы не копировать. |
| outputOffset | int | Смещение в выходном буфере. |

### ReturnValue

Количество записанных байтов.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
