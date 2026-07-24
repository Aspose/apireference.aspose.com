---
title: "System::Net::IWebProxy クラス"
linktitle: "IWebProxy"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::IWebProxy クラス。このインターフェイスは WebRequest クラスへのプロキシアクセスの実装に使用されます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2700
url: /ja/cpp/system.net/iwebproxy/
---
## IWebProxy class


このインターフェイスは [WebRequest](../webrequest/) クラスへのプロキシアクセスの実装に使用されます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class IWebProxy : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | RTTI 情報。 |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | プロキシの URI を返します。 |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | 指定されたホストに対してプロキシを使用すべきでないかを示す値を返します。 |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | プロキシサーバーの認証用クレデンシャルを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
