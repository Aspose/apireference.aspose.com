---
title: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock 方法"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock 方法。处理数据的最后一个块并在 C++ 中计算输出值。"
type: docs
weight: 400
url: /zh/cpp/system.security.cryptography/icryptotransform/transformfinalblock/
---
## ICryptoTransform::TransformFinalBlock method


处理最后一个数据块并计算输出值。

```cpp
virtual ArrayPtr<uint8_t> System::Security::Cryptography::ICryptoTransform::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 用于读取数据。 |
| inputOffset | int | 输入缓冲区偏移量。 |
| inputCount | int | 要处理的字节数。 |

### ReturnValue

已为整个输入序列计算输出。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
