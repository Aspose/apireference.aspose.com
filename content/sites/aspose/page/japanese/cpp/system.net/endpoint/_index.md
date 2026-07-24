---
title: "System::Net::EndPoint クラス"
linktitle: "EndPoint"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::EndPoint クラス。抽象クラスでネットワークアドレスを保持します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 900
url: /ja/cpp/system.net/endpoint/
---
## EndPoint class


抽象クラスでネットワークアドレスを保持します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class EndPoint : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | 指定されたソケットアドレスを使用して [EndPoint](./) クラスの新しいインスタンスを作成します。 |
| virtual [get_AddressFamily](./get_addressfamily/)() | RTTI 情報。 |
| virtual [GetImpl](./getimpl/)() const | 実装へのポインタを返します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ImplPtr](./implptr/) | 実装へのポインタです。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
