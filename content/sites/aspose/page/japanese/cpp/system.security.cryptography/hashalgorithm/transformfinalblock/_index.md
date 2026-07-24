---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock メソッド"
linktitle: "TransformFinalBlock"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock メソッド。C++ でデータの最後のブロックを処理し、ハッシュを計算します。"
type: docs
weight: 900
url: /ja/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


最後のデータブロックを処理し、ハッシュを計算します。

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) からデータを読み取ります。 |
| inputOffset | int | 入力バッファのオフセット。 |
| inputCount | int | 処理するバイト数。 |

### ReturnValue

データ全体シーケンスのハッシュが計算されました。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
