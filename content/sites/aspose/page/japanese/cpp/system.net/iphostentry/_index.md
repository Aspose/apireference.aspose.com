---
title: "System::Net::IPHostEntry クラス"
linktitle: "IPHostEntry"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::IPHostEntry クラス。インターネットホストアドレスに関する情報を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2600
url: /ja/cpp/system.net/iphostentry/
---
## IPHostEntry class


インターネットホストアドレスに関する情報を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class IPHostEntry : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | ホストの IP アドレスのコレクションを取得します。 |
| [get_Aliases](./get_aliases/)() | ホストのエイリアスのコレクションを取得します。 |
| [get_HostName](./get_hostname/)() const | RTTI 情報。 |
| [IPHostEntry](./iphostentry/)() | 新しいインスタンスを構築します。 |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | ホストの IP アドレスのコレクションを設定します。 |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | ホストのエイリアスのコレクションを設定します。 |
| [set_HostName](./set_hostname/)(String) | ホスト名を設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
