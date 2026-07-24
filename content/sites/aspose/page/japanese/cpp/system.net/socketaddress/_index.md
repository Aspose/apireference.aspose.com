---
title: "System::Net::SocketAddress class"
linktitle: "SocketAddress"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::SocketAddress class. EndPoint クラスのインスタンスに関するシリアライズされた情報を格納するために使用されます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にはそのポインタを使用してください。"
type: docs
weight: 3300
url: /ja/cpp/system.net/socketaddress/
---
## SocketAddress class


このクラスは [EndPoint](../endpoint/) クラスのインスタンスに関するシリアライズされた情報を格納するために使用されます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。

```cpp
class SocketAddress : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Family](./get_family/)() | RTTI 情報。 |
| [get_Size](./get_size/)() | 基礎バッファのサイズを返します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| [idx_get](./idx_get/)(int32_t) | 指定されたインデックスの基礎バッファの値を取得します。 |
| [idx_set](./idx_set/)(int32_t, uint8_t) | 指定されたインデックスの基礎バッファに値を設定します。 |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | 新しいインスタンスを構築します。 |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | 新しいインスタンスを構築します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
