---
title: "System::Security::Cryptography::DSA クラス"
linktitle: "DSA"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::DSA クラス。DSA アルゴリズムの実装のための基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 900
url: /ja/cpp/system.security.cryptography/dsa/
---
## DSA class


[DSA](./) アルゴリズムの実装のための基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Create](./create/)() | デフォルトの [DSA](./) アルゴリズム実装を作成します。 |
| static [Create](./create/)(const String\&) | デフォルトの [DSA](./) アルゴリズム実装を作成します。 |
| static [Create](./create/)(int32_t) | 指定されたキーサイズでデフォルトの [DSA](./) アルゴリズム実装を作成します。 |
| static [Create](./create/)(const DSAParameters\&) | 指定されたパラメータでデフォルトの [DSA](./) アルゴリズム実装を作成します。 |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | 指定された XML エンコードパラメータを使用して、デフォルトの [DSA](./) アルゴリズム実装を作成します。 |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | RTTI 情報。 |
| virtual [ExportParameters](./exportparameters/)(bool) | すべてのパラメータをエクスポートします。 |
| [FromXmlString](./fromxmlstring/)(String) override | XML エンコードパラメータを使用してオブジェクトを初期化します。 |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | データ構造からすべてのパラメータをインポートします。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたハッシュアルゴリズムを使用して、指定されたデータ配列のハッシュ値を計算し、結果に署名します。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | 指定されたハッシュアルゴリズムを使用して、指定されたデータ配列のハッシュ値を計算し、結果に署名します。 |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | 指定されたハッシュアルゴリズムを使用して、指定されたバイナリストリームのハッシュ値を計算し、結果に署名します。 |
| [ToXmlString](./toxmlstring/)(bool) override | XML 形式ですべてのパラメータをエクスポートします。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたバイナリストリームの署名が有効であることを検証します。 |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | 指定されたデータに対して [DSA](./) 署名を検証します。 |
## 参照

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
