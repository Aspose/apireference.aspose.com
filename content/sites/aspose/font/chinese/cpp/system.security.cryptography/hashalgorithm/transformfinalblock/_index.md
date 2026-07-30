---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock 方法"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock 方法。处理最后一块数据并在 C++ 中计算哈希。"
type: docs
weight: 900
url: /zh/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


处理最后一个数据块并计算哈希。

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 用于读取数据。 |
| inputOffset | int | 输入缓冲区偏移量。 |
| inputCount | int | 要处理的字节数。 |

### ReturnValue

对整个数据序列计算的哈希。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
