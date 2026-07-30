---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock 方法"
linktitle: "TransformBlock"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock 方法。C++ 中的 RTTI 信息。"
type: docs
weight: 300
url: /zh/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


RTTI 信息。

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 用于读取数据。 |
| inputOffset | int | 输入缓冲区偏移量。 |
| inputCount | int | 要处理的字节数。 |
| outputBuffer | ArrayPtr\<uint8_t\> | 用于复制数据的输出缓冲区；若为 nullptr 则不进行复制。 |
| outputOffset | int | 输出缓冲区偏移量。 |

### ReturnValue

已写入的字节数。
## 备注


处理数据块并将数据复制到输出数组。
## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
