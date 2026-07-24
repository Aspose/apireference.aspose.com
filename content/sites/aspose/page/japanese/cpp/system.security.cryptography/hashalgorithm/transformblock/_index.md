---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock method"
linktitle: "TransformBlock"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock method. データブロックを処理し、C++ でデータを出力配列にコピーします。"
type: docs
weight: 800
url: /ja/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


データブロックを処理し、データを出力配列にコピーします。

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) からデータを読み取ります。 |
| inputOffset | int | 入力バッファのオフセット。 |
| inputCount | int | 処理するバイト数。 |
| outputBuffer | ArrayPtr\<uint8_t\> | データをコピーする出力バッファ；nullptr を使用してコピーしません。 |
| outputOffset | int | 出力バッファのオフセット。 |

### ReturnValue

書き込まれたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
