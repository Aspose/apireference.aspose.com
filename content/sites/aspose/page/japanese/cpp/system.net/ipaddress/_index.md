---
title: "System::Net::IPAddress クラス"
linktitle: "IPAddress"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::IPAddress クラス。IP アドレスを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 2400
url: /ja/cpp/system.net/ipaddress/
---
## IPAddress class


IP アドレスを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
class IPAddress : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_AddressFamily](./get_addressfamily/)() | アドレス ファミリを返します。 |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | アドレスが IPv4 アドレスであり、IPv6 アドレスにマッピングされているかどうかを示す値を返します。 |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | アドレスが IPv6 リンクローカルアドレスかどうかを示す値を返します。 |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | アドレスがグローバル IPv6 マルチキャストアドレスかどうかを示す値を返します。 |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | アドレスが IPv6 サイトローカルアドレスかどうかを示す値を返します。 |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | アドレスが IPv6 Teredo アドレスかどうかを示す値を返します。 |
| [get_ScopeId](./get_scopeid/)() | IPv6 アドレスのスコープ識別子を取得します。 |
| [GetAddressBytes](./getaddressbytes/)() | IP アドレスのバイト配列を返します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| [GetImpl](./getimpl/)() const | 実装へのポインタを返します。 |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | 指定されたホストバイトオーダーを対応するネットワークバイトオーダーに変換します。 |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | 指定されたホストバイトオーダーを対応するネットワークバイトオーダーに変換します。 |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | 指定されたホストバイトオーダーを対応するネットワークバイトオーダーに変換します。 |
| [IPAddress](./ipaddress/)(int64_t) | 新しいインスタンスを構築します。 |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | 新しいインスタンスを構築します。 |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | 新しいインスタンスを構築します。 |
| [IPAddress](./ipaddress/)() | 新しいインスタンスを構築します。 |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | 指定されたアドレスがループバックアドレスかどうかを示す値を返します。 |
| [MapToIPv4](./maptoipv4/)() | アドレスを IPv4 アドレスにマッピングします。 |
| [MapToIPv6](./maptoipv6/)() | アドレスを IPv6 アドレスにマッピングします。 |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | 指定されたネットワークバイトオーダーを対応するホストバイトオーダーに変換します。 |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | 指定されたネットワークバイトオーダーを対応するホストバイトオーダーに変換します。 |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | 指定されたネットワークバイトオーダーを対応するホストバイトオーダーに変換します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [IPAddress](./) クラスのインスタンスに変換します。 |
| [set_ScopeId](./set_scopeid/)(int64_t) | IPv6 アドレスのスコープ識別子を設定します。 |
| [SetImpl](./setimpl/)(ImplPtr) | 実装へのポインタを設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | 渡された文字列を [IPAddress](./) クラスのインスタンスに変換しようとします。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Any](./any/) | RTTI 情報。 |
| static [Broadcast](./broadcast/) | IPv4 ブロードキャストアドレスです。 |
| static [IPv6Any](./ipv6any/) | サーバーがすべてのネットワークインターフェイスをリッスンすべきかを示す IPv6 アドレスです。 |
| static [IPv6Loopback](./ipv6loopback/) | IPv6 ループバックアドレスです。 |
| static [IPv6None](./ipv6none/) | サーバーがいかなるネットワークインターフェイスもリッスンすべきでないことを示す IPv6 アドレスです。 |
| static [Loopback](./loopback/) | IPv4 ループバックアドレスです。 |
| static [None](./none/) | サーバーがいかなるネットワークインターフェイスもリッスンすべきでないことを示す IPv4 アドレスです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ImplPtr](./implptr/) | 実装型へのポインタです。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
