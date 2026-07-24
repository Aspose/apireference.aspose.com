---
title: "System::Security::Cryptography::RSACryptoServiceProvider クラス"
linktitle: "RSACryptoServiceProvider"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider クラス。CSP 形式の RSA アルゴリズムです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上でインスタンスを作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 3500
url: /ja/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | メッセージを復号します。未実装です。 |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | 指定されたパディングモードを使用して入力データを復号化します。 |
| [Dispose](./dispose/)() override | オブジェクトに関連付けられたデータを解放します。 |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | メッセージを暗号化します。未実装です。 |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | 指定されたパディングモードを使用して入力データを暗号化します。 |
| [ExportCspBlob](./exportcspblob/)(bool) override | キーに関する情報を含むブロブをエクスポートします。未実装です。 |
| [ExportParameters](./exportparameters/)(bool) override | CSP パラメータをエクスポートします。 |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | [CspKeyContainerInfo](../cspkeycontainerinfo/) オブジェクトを取得します。 |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | オブジェクトに関連付けられた鍵交換アルゴリズムを確認します。 |
| [get_KeySize](./get_keysize/)() override | アルゴリズムで使用されるキーサイズを取得します。 |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | 鍵が CSP オブジェクトに永続化されているか確認します。 |
| [get_PublicOnly](./get_publiconly/)() const | CSP オブジェクトに公開鍵のみが存在するか確認します。 |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | CSP オブジェクトに関連付けられた署名アルゴリズムを取得します。 |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | 鍵がユーザーストアではなくマシンストアに永続化されているか確認します。 |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | キーに関する情報を含むブロブをインポートします。未実装です。 |
| [ImportParameters](./importparameters/)(RSAParameters) override | CSP パラメータをインポートします。 |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | RTTI 情報。 |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | コンストラクタ。未実装です。 |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | コンストラクタ。 |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | コンストラクタ。 |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | コンストラクタ。未実装です。 |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | 鍵が CSP オブジェクトに永続化されるかどうかを定義します。 |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | 鍵がユーザーストアではなくマシンストアに永続化されるかどうかを定義します。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | 指定された入力値の署名を計算します。 |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | 指定された入力値の署名を計算します。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | 指定された入力値の署名を計算します。 |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | 指定されたハッシュ値の署名を計算します。 |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | 指定された入力値の署名を計算します。未実装です。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | データ署名をチェックします。 |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | データ署名をチェックします。 |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | 指定されたハッシュの署名が有効であることを検証します。 |
## 参照

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
