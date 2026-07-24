---
title: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock メソッド"
linktitle: "TransformFinalBlock"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock メソッド。C++ でデータの最後のブロックを処理し、出力値を計算します。"
type: docs
weight: 400
url: /ja/cpp/system.security.cryptography/icryptotransform/transformfinalblock/
---
## ICryptoTransform::TransformFinalBlock method


最後のデータブロックを処理し、出力値を計算します。

```cpp
virtual ArrayPtr<uint8_t> System::Security::Cryptography::ICryptoTransform::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) からデータを読み取ります。 |
| inputOffset | int | 入力バッファのオフセット。 |
| inputCount | int | 処理するバイト数。 |

### ReturnValue

全入力シーケンスに対して出力が計算されました。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
