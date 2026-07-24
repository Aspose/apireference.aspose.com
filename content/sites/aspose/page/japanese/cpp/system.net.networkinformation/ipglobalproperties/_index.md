---
title: "System::Net::NetworkInformation::IPGlobalProperties クラス"
linktitle: "IPGlobalProperties"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::NetworkInformation::IPGlobalProperties クラス。ローカルコンピュータのネットワーク接続に関する情報を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンス化すると、ランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 200
url: /ja/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


ローカルコンピュータのネットワーク接続に関する情報を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class IPGlobalProperties : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | ローカルコンピュータが登録されているドメインを返します。 |
| virtual [get_HostName](./get_hostname/)() | ローカルコンピュータのホスト名を返します。 |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | RTTI 情報。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Page for C++](../../)
