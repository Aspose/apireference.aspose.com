---
title: "System::Security::Cryptography::RSA クラス"
linktitle: "RSA"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSA クラス。RSA アルゴリズムの実装のための基底クラス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 3400
url: /ja/cpp/system.security.cryptography/rsa/
---
## RSA class


RSA アルゴリズムの実装のための基底クラス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Create](./create/)() | デフォルトの [RSA](./) アルゴリズム実装を作成します。 |
| static [Create](./create/)(const String\&) | デフォルトの [RSA](./) アルゴリズム実装を作成します。 |
| static [Create](./create/)(int32_t) | 指定されたキーサイズでデフォルトの [RSA](./) アルゴリズム実装を作成します。 |
| static [Create](./create/)(const RSAParameters\&) | 指定されたパラメーターでデフォルトの [RSA](./) アルゴリズム実装を作成します。 |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | 指定された XML エンコードパラメータでデフォルトの [RSA](./) アルゴリズム実装を作成します。 |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | 指定されたパディングモードを使用して入力データを復号化します。 |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | プライベートキーを使用して値を復号化します。 |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | 指定されたパディングモードを使用して入力データを暗号化します。 |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | プライベートキーを使用して値を暗号化します。 |
| virtual [ExportParameters](./exportparameters/)(bool) | すべてのパラメータをエクスポートします。 |
| [FromXmlString](./fromxmlstring/)(String) override | XML エンコードパラメータを使用してオブジェクトを初期化します。 |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI 情報。 |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | CSP オブジェクトに関連付けられた署名アルゴリズムを取得します。 |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | データ構造からすべてのパラメータをインポートします。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 指定されたハッシュアルゴリズムとパディングを使用して、指定されたデータ配列のハッシュ値を計算し、結果に署名します。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 指定されたハッシュアルゴリズムとパディングを使用して、指定されたデータ配列のハッシュ値を計算し、結果に署名します。 |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 指定されたハッシュアルゴリズムとパディングを使用して、指定されたバイナリストリームのハッシュ値を計算し、結果に署名します。 |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | 指定されたハッシュ値の署名を計算します。 |
| [ToXmlString](./toxmlstring/)(bool) override | XML 形式ですべてのパラメータをエクスポートします。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 指定されたバイナリストリームの署名が有効であることを検証します。 |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | 指定されたハッシュの署名が有効であることを検証します。 |
## 参照

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
