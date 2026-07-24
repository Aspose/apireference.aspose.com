---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock メソッド"
linktitle: "TransformBlock"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock メソッド。C++ でデータブロックを処理し、データを出力配列にコピーします。"
type: docs
weight: 800
url: /ja/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


データブロックを処理し、データを出力配列にコピーします。

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) からデータを読み取ります。 |
| inputOffset | int32_t | 入力バッファのオフセット。 |
| inputCount | int32_t | 処理するバイト数。 |
| outputBuffer | System::ArrayPtr\<uint8_t\> | データをコピーする出力バッファ；nullptr を使用してコピーしません。 |
| outputOffset | int32_t | 出力バッファのオフセット。 |

### ReturnValue

書き込まれたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
