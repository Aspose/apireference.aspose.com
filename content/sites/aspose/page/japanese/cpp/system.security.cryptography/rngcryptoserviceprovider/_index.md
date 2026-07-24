---
title: "System::Security::Cryptography::RNGCryptoServiceProvider クラス"
linktitle: "RNGCryptoServiceProvider"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RNGCryptoServiceProvider クラス。CSP の概念に従う乱数生成器。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 3300
url: /ja/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


乱数生成器は CSP の概念に従います。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | 既存の配列要素をランダムバイトで埋めます。 |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | 既存の配列ビュー要素をランダムバイトで埋めます。 |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | 既存の配列要素をランダムな非ゼロバイトで埋めます。 |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | 既存の配列ビュー要素をランダムな非ゼロバイトで埋めます。 |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | コンストラクタ。 |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | デストラクタ。 |
## 参照

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
