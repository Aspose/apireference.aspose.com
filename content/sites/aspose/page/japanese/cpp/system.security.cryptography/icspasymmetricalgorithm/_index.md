---
title: "System::Security::Cryptography::ICspAsymmetricAlgorithm クラス"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ICspAsymmetricAlgorithm クラス。非対称アルゴリズムの基底クラス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 2100
url: /ja/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


非対称アルゴリズムの基底クラス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | キー情報を含むブロブをエクスポートします。 |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | RTTI 情報。 |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | データブロブからキー情報をインポートします。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
