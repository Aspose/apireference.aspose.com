---
title: "System::Security::Cryptography::ToBase64Transform::TransformFinalBlock メソッド"
linktitle: "TransformFinalBlock"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ToBase64Transform::TransformFinalBlock メソッド。C++ でデータの最後のブロックを処理し、出力値を計算します。"
type: docs
weight: 900
url: /ja/cpp/system.security.cryptography/tobase64transform/transformfinalblock/
---
## ToBase64Transform::TransformFinalBlock method


最後のデータブロックを処理し、出力値を計算します。

```cpp
System::ArrayPtr<uint8_t> System::Security::Cryptography::ToBase64Transform::TransformFinalBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) からデータを読み取ります。 |
| inputOffset | int32_t | 入力バッファのオフセット。 |
| inputCount | int32_t | 処理するバイト数。 |

### ReturnValue

全入力シーケンスに対して出力が計算されました。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
