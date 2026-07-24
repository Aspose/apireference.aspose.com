---
title: "System::Security::Cryptography::ToBase64Transform クラス"
linktitle: "ToBase64Transform"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ToBase64Transform クラス。CryptoStream クラスのインスタンスを base 64 に変換します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 5000
url: /ja/cpp/system.security.cryptography/tobase64transform/
---
## ToBase64Transform class


base 64 に [CryptoStream](../cryptostream/) クラスのインスタンスを変換します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class ToBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clear](./clear/)() | すべてのリソースを解放します。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したオペレーティングシステムのリソースを解放します。 |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | 現在の変換が再利用可能かどうかを示す値を取得します。 |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | 複数のブロックを変換できるかどうかを示す値を取得します。 |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | 入力ブロックサイズ。 |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | 出力ブロックサイズ。 |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) | データブロックを処理し、データを出力配列にコピーします。 |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | 最後のデータブロックを処理し、出力値を計算します。 |
| virtual [~ToBase64Transform](./~tobase64transform/)() | デストラクタ。 |
## 参照

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
