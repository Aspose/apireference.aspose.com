---
title: "System::Net::ServicePoint クラス"
linktitle: "ServicePoint"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::ServicePoint クラス。HTTP 接続管理を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 3100
url: /ja/cpp/system.net/servicepoint/
---
## ServicePoint class


HTTP 接続管理を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class ServicePoint : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | 指定された接続グループに属する接続を閉じて削除します。 |
| [get_Address](./get_address/)() | 現在のインスタンスが接続するサーバー URI を返します。 |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | RTTI 情報。 |
| [get_Certificate](./get_certificate/)() | 現在のインスタンスで使用される証明書を返します。 |
| [get_ClientCertificate](./get_clientcertificate/)() | 最後のクライアント証明書を返します。 |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | アクティブな [ServicePoint](./) が閉じられるまでのタイムアウト（ミリ秒）を取得します。 |
| [get_ConnectionLimit](./get_connectionlimit/)() | 現在のインスタンスで許可される最大接続数を取得します。 |
| [get_ConnectionName](./get_connectionname/)() | 接続名を返します。 |
| [get_CurrentConnections](./get_currentconnections/)() | 開かれている接続数を返します。 |
| [get_Expect100Continue](./get_expect100continue/)() | 100-Continue 動作が使用されているかどうかを示す値を取得します。 |
| [get_IdleSince](./get_idlesince/)() | ホストへの最新接続の日時を返します。 |
| [get_MaxIdleTime](./get_maxidletime/)() | アイドル接続が閉じられるまでの時間（ミリ秒）を取得します。 |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | HTTP バージョンを返します。 |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | 受信バッファのサイズを取得します。 |
| [get_SupportsPipelining](./get_supportspipelining/)() | 現在のインスタンスがパイプライン接続をサポートしているかどうかを示す値を返します。 |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | 現在のインスタンスが管理する接続で Nagle アルゴリズムが使用されているかどうかを示す値を取得します。 |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | ローカル [IPEndPoint](../ipendpoint/) を現在のインスタンスに関連付けるために使用されるデリゲートを設定します。 |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | アクティブな [ServicePoint](./) が閉じられるまでのタイムアウト（ミリ秒）を設定します。 |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | 現在のインスタンスで許可される接続の最大数を設定します。 |
| [set_Expect100Continue](./set_expect100continue/)(bool) | 100-Continue 動作が使用されているかどうかを示す値を設定します。 |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | アイドル接続が閉じられるまでの時間（ミリ秒）を設定します。 |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | 受信バッファのサイズを設定します。 |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | 現在のインスタンスが管理する接続で Nagle アルゴリズムが使用されているかどうかを示す値を設定します。 |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | 'Keep-Alive' オプションが有効かどうかを示す値を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
