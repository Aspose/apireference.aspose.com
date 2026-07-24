---
title: "System::Net::Dns クラス"
linktitle: "Dns"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Dns クラス。C++でDNSを操作するためのメソッドを提供します。"
type: docs
weight: 700
url: /ja/cpp/system.net/dns/
---
## Dns class


DNS を操作するためのメソッドを提供します。

```cpp
class Dns : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 指定されたホスト名またはIPアドレスを含む文字列を使用して、新しい IPHostEntry-class インスタンスを作成する非同期操作を開始します。 |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 指定されたホスト名を使用して、新しい IPHostEntry-class インスタンスを作成する非同期操作を開始します。 |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 指定されたホスト名またはIPアドレスを含む文字列を使用して、新しい IPHostEntry-class インスタンスを作成する非同期操作を開始します。 |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | 指定されたIPアドレスを使用して、新しい IPHostEntry-class インスタンスを作成する非同期操作を開始します。 |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 指定されたホスト名を使用して、新しい IPHostEntry-class インスタンスを作成する非同期操作を開始します。 |
| [Dns](./dns/)() | 削除されたデフォルトコンストラクタです。 |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | 指定された新しい IPHostEntry-class インスタンスを作成する非同期操作が完了するまで待機します。 |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | 指定された新しい IPHostEntry-class インスタンスを作成する非同期操作が完了するまで待機します。 |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | 指定された新しい IPHostEntry-class インスタンスを作成する非同期操作が完了するまで待機します。 |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | 指定された新しい IPHostEntry-class インスタンスを作成する非同期操作が完了するまで待機します。 |
| static [GetHostAddresses](./gethostaddresses/)(String) | 指定されたホスト名またはIPアドレスのIPアドレスコレクションを返します。 |
| static [GetHostByAddress](./gethostbyaddress/)(String) | 指定されたIPアドレスの文字列表現を使用して、新しい IPHostEntry-class インスタンスを作成します。 |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | 指定されたIPアドレスを使用して、新しい IPHostEntry-class インスタンスを作成します。 |
| static [GetHostByName](./gethostbyname/)(String) | RTTI 情報。 |
| static [GetHostEntry](./gethostentry/)(String) | 指定されたホスト名またはIPアドレスを含む文字列を使用して、新しい IPHostEntry-class インスタンスを作成します。 |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | 指定されたIPアドレスを使用して、新しい IPHostEntry-class インスタンスを作成します。 |
| static [GetHostName](./gethostname/)() | ローカルマシンのホスト名を返します。 |
| static [Resolve](./resolve/)(String) | 指定されたホスト名を使用して、新しい IPHostEntry-class インスタンスを作成します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
