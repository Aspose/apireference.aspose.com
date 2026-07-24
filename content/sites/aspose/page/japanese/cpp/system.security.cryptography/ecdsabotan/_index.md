---
title: "System::Security::Cryptography::ECDsaBotan クラス"
linktitle: "ECDsaBotan"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ECDsaBotan クラス。Botan 形式の ECDsa アルゴリズム。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1400
url: /ja/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | コンストラクタ。デフォルトパラメータを使用します。 |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | コンストラクタ。 |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | コンストラクタ。 |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | コンストラクタ。 |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | コンストラクタ。 |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | コンストラクタ。 |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | 明示的なパラメータをエクスポートします。 |
| [ExportParameters](./exportparameters/)(bool) override | 名前付きまたは明示的なパラメータをエクスポートします。 |
| [FromXmlString](./fromxmlstring/)(String) override | XML エンコードされたパラメータを使用してオブジェクトを初期化します。未実装です。 |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | XML エンコードされたパラメータを使用してオブジェクトを初期化します。未実装です。 |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | 指定された曲線の新しい公開/秘密キー ペアを生成します。 |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | ハッシュアルゴリズムを取得します。 |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | 指定されたハッシュアルゴリズムを使用して、指定されたデータ配列のハッシュ値を計算します。 |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | 指定されたハッシュアルゴリズムを使用して、指定されたバイナリストリームのハッシュ値を計算します。 |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | データ構造からすべてのパラメータをインポートします。 |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | ハッシュアルゴリズムを設定します。 |
| [set_KeySize](./set_keysize/)(int32_t) override | 鍵サイズを設定します。 |
| [SignData](./signdata/)(const ByteArrayPtr\&) | 指定されたデータ配列のハッシュ値を計算し、結果に署名します。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | 指定されたデータ配列のハッシュ値を計算し、結果に署名します。 |
| [SignData](./signdata/)(const StreamPtr\&) | 指定されたバイナリストリームのハッシュ値を計算し、結果に署名します。 |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI 情報。 |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI 情報。 |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI 情報。 |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | 指定された入力値の署名を計算します。 |
| [ToXmlString](./toxmlstring/)(bool) override | すべてのパラメータを XML 形式でエクスポートします。未実装です。 |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | XML 形式ですべてのパラメータをエクスポートします。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | 指定されたバイナリストリームの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたデータの署名が有効であることを検証します。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 指定されたバイナリストリームの署名が有効であることを検証します。 |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | データ署名をチェックします。 |
## 参照

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
