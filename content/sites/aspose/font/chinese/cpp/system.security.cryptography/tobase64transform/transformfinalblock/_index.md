---
title: "System::Security::Cryptography::ToBase64Transform::TransformFinalBlock 方法"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ToBase64Transform::TransformFinalBlock 方法。处理最后一个数据块并在 C++ 中计算输出值。"
type: docs
weight: 900
url: /zh/cpp/system.security.cryptography/tobase64transform/transformfinalblock/
---
## ToBase64Transform::TransformFinalBlock method


处理最后一个数据块并计算输出值。

```cpp
System::ArrayPtr<uint8_t> System::Security::Cryptography::ToBase64Transform::TransformFinalBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 用于读取数据。 |
| inputOffset | int32_t | 输入缓冲区偏移量。 |
| inputCount | int32_t | 要处理的字节数。 |

### ReturnValue

已为整个输入序列计算输出。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
