---
title: "System::Security::Cryptography::HashAlgorithm クラス"
linktitle: "HashAlgorithm"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::HashAlgorithm クラス。ハッシュアルゴリズムの基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1600
url: /ja/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


ハッシュアルゴリズムの基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | バッファのハッシュを計算します。 |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | バッファスライスのハッシュを計算します。 |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | ストリームを最後まで読み取り、読み取ったデータのハッシュを計算します。 |
| static [Create](./create/)(const String\&) | 名前に基づいてハッシュアルゴリズムを作成します。 |
| virtual [get_Hash](./get_hash/)() | 計算されたハッシュコードの値を取得します。 |
| virtual [get_HashSize](./get_hashsize/)() | 計算されたハッシュ値のサイズ（バイト単位）を取得します。 |
| [get_InputBlockSize](./get_inputblocksize/)() override | 入力ブロックサイズ。 |
| [get_OutputBlockSize](./get_outputblocksize/)() override | 出力ブロックサイズ。 |
| virtual [Initialize](./initialize/)() | ハッシュ生成器を初期状態にリセットします。 |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | データブロックを処理し、データを出力配列にコピーします。 |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | 最後のデータブロックを処理し、ハッシュを計算します。 |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | デストラクタ。 |
## 参照

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
