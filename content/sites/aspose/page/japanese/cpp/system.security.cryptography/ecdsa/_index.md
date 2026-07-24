---
title: "System::Security::Cryptography::ECDsa クラス"
linktitle: "ECDsa"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ECDsa クラス。ECDsa アルゴリズムの実装のための基底クラス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 1300
url: /ja/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


[ECDsa](./) アルゴリズムの実装のための基底クラス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Create](./create/)() | デフォルトの ECDSA アルゴリズム実装を作成します。 |
| static [Create](./create/)(const ECCurve\&) | 指定された曲線上に新しく作成したキーを使用して、デフォルトの ECDSA アルゴリズム実装を作成します。 |
| static [Create](./create/)(const ECParameters\&) | 指定されたパラメータを使用して、デフォルトの ECDSA アルゴリズム実装を作成します。 |
| static [Create](./create/)(const String\&) | 指定された ECDSA アルゴリズム実装を作成します。 |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | 明示的なパラメータをエクスポートします。 |
| virtual [ExportParameters](./exportparameters/)(bool) | 名前付きまたは明示的なパラメータをエクスポートします。 |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | 指定された曲線の新しい公開/秘密キー ペアを生成します。 |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI 情報。 |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | 使用する署名アルゴリズムを取得します。 |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | データ構造からすべてのパラメータをインポートします。 |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたハッシュアルゴリズムを使用して、指定されたデータ配列のハッシュ値を計算し、結果に署名します。 |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | 指定されたハッシュアルゴリズムを使用して、指定されたデータ配列のハッシュ値を計算し、結果に署名します。 |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | 指定されたハッシュアルゴリズムを使用して、指定されたバイナリストリームのハッシュ値を計算し、結果に署名します。 |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | 指定された入力値の署名を計算します。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたバイナリストリームの署名が有効であることを検証します。 |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | データ署名をチェックします。 |
## 参照

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
