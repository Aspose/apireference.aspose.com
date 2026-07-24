---
title: "System::Security::Cryptography::DSACryptoServiceProvider クラス"
linktitle: "DSACryptoServiceProvider"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::DSACryptoServiceProvider クラス。CSP 形式の DSA アルゴリズムです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生する可能性があります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 1000
url: /ja/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | 指定されたデータの [DSA](../dsa/) 署名を作成します。 |
| [Dispose](./dispose/)() override | オブジェクトに関連付けられたデータを解放します。 |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | コンストラクタ。デフォルトパラメータを使用します。 |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | コンストラクタ。 |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | コンストラクタ。未実装です。 |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | コンストラクタ。 |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | コンストラクタ。未実装です。 |
| [ExportCspBlob](./exportcspblob/)(bool) override | キーに関する情報を含むブロブをエクスポートします。未実装です。 |
| [ExportParameters](./exportparameters/)(bool) override | CSP パラメータをエクスポートします。 |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | [CspKeyContainerInfo](../cspkeycontainerinfo/) オブジェクトを取得します。 |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | オブジェクトに関連付けられた鍵交換アルゴリズムを確認します。 |
| [get_KeySize](./get_keysize/)() override | 鍵サイズを取得します。 |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | 鍵が CSP オブジェクトに永続化されているか確認します。 |
| [get_PublicOnly](./get_publiconly/)() const | CSP オブジェクトに公開鍵のみが存在するか確認します。 |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | 使用する署名アルゴリズムを取得します。 |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | 鍵がユーザーストアではなくマシンストアに永続化されているか確認します。 |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | キーに関する情報を含むブロブをインポートします。未実装です。 |
| [ImportParameters](./importparameters/)(DSAParameters) override | データ構造からすべてのパラメータをインポートします。 |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | 鍵が CSP オブジェクトに永続化されるかどうかを定義します。 |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | 鍵がユーザーストアではなくマシンストアに永続化されるかどうかを定義します。 |
| [SignData](./signdata/)(const ByteArrayPtr\&) | 指定された入力値の署名を計算します。 |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | 指定された入力値の署名を計算します。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | 指定された入力値の署名を計算します。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI 情報。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI 情報。 |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI 情報。 |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | 指定された入力値の署名を計算します。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | データ署名をチェックします。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたバイナリストリームの署名が有効であることを検証します。 |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | データ署名をチェックします。 |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | 指定されたデータの [DSA](../dsa/) 署名を検証します。 |
## 参照

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
