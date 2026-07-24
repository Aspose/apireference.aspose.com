---
title: "System::Security::Cryptography::FromBase64Transform クラス"
linktitle: "FromBase64Transform"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::FromBase64Transform クラス。CryptoStream クラスのインスタンスを base 64 から変換します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1500
url: /ja/cpp/system.security.cryptography/frombase64transform/
---
## FromBase64Transform class


base 64 から [CryptoStream](../cryptostream/) クラスのインスタンスを変換します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class FromBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clear](./clear/)() | すべてのリソースを解放します。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したオペレーティングシステムのリソースを解放します。 |
| [FromBase64Transform](./frombase64transform/)() | コンストラクタ。 |
| [FromBase64Transform](./frombase64transform/)(FromBase64TransformMode) | コンストラクタ。 |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | 現在の変換が再利用可能かどうかを示す値を取得します。 |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | 複数のブロックを変換できるかどうかを示す値を取得します。 |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | 入力ブロックサイズ。 |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | 出力ブロックサイズ。 |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) |  |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) |  |
| virtual [~FromBase64Transform](./~frombase64transform/)() | デストラクタ。 |
## 参照

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
