---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock メソッド"
linktitle: "TransformBlock"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock メソッド。C++ の RTTI 情報。"
type: docs
weight: 300
url: /ja/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


RTTI 情報。

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
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
## 備考


データブロックを処理し、データを出力配列にコピーします。
## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
