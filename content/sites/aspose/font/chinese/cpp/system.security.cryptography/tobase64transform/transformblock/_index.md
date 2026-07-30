---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock 方法"
linktitle: "TransformBlock"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock 方法。处理数据块并将数据复制到 C++ 中的输出数组。"
type: docs
weight: 800
url: /zh/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


处理数据块并将数据复制到输出数组。

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 用于读取数据。 |
| inputOffset | int32_t | 输入缓冲区偏移量。 |
| inputCount | int32_t | 要处理的字节数。 |
| outputBuffer | System::ArrayPtr\<uint8_t\> | 用于复制数据的输出缓冲区；若为 nullptr 则不进行复制。 |
| outputOffset | int32_t | 输出缓冲区偏移量。 |

### ReturnValue

已写入的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
