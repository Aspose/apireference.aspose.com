---
title: "System::Net::ServicePointManager クラス"
linktitle: "ServicePointManager"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::ServicePointManager クラス。ServicePoint クラスのインスタンスのライフサイクル段階（作成、維持、削除）を管理します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてそのポインタを使用してください。"
type: docs
weight: 3200
url: /ja/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


[ServicePoint](../servicepoint/) クラスのインスタンスのライフサイクル段階（作成、維持、削除）を管理します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。

```cpp
class ServicePointManager : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | 証明書ポリシーを取得します。 |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | 証明書を認証局の失効リストと照合する必要があるかどうかを示す値を取得します。 |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | ServicePoint クラスのインスタンスが許可する同時接続の最大数を取得します。 |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | DNS 解決が有効とみなされる期間（ミリ秒）のタイムアウトを取得します。 |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | DNS 解決が適用可能な IP アドレス間でローテーションするかどうかを示す値を取得します。 |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | 現在のインスタンスで使用される暗号化ポリシーを返します。 |
| static [get_Expect100Continue](./get_expect100continue/)() | ServicePoint クラスのインスタンスが 100-Continue 動作を使用するかどうかを示す値を取得します。 |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | ServicePoint クラスのインスタンスの最大アイドル時間を取得します。 |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | 現在のインスタンスが管理できる ServicePoint クラスのインスタンスの最大数を取得します。 |
| static [get_ReusePort](./get_reuseport/)() | 出力接続ソケットが 'SO_REUSE_UNICASTPORT' オプションを使用するかどうかを示す値を取得します。 |
| static [get_SecurityProtocol](./get_securityprotocol/)() | 現在のインスタンスが管理する ServicePoint クラスのインスタンスで使用されるセキュリティプロトコルのタイプを取得します。 |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | サーバー証明書の検証に使用されるコールバックを取得します。 |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | ServicePoint クラスのインスタンスが Nagle アルゴリズムを使用するかどうかを示す値を取得します。 |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | 証明書ポリシーを設定します。 |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | 証明書を認証局の失効リストと照合する必要があるかどうかを示す値を設定します。 |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | ServicePoint クラスのインスタンスが許可する同時接続の最大数を設定します。 |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | DNS 解決が有効とみなされる期間（ミリ秒）のタイムアウトを設定します。 |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | DNS 解決が適用可能な IP アドレス間でローテーションするかどうかを示す値を設定します。 |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | ServicePoint クラスのインスタンスが 100-Continue 動作を使用するかどうかを示す値を設定します。 |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | ServicePoint クラスのインスタンスの最大アイドル時間を設定します。 |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | 現在のインスタンスが管理できる ServicePoint クラスのインスタンスの最大数を設定します。 |
| static [set_ReusePort](./set_reuseport/)(bool) | 出力接続ソケットが 'SO_REUSE_UNICASTPORT' オプションを使用するかどうかを示す値を設定します。 |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | 現在のインスタンスが管理する ServicePoint クラスのインスタンスで使用されるセキュリティプロトコルのタイプを設定します。 |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | サーバー証明書の検証に使用されるコールバックを設定します。 |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | ServicePoint クラスのインスタンスが Nagle アルゴリズムを使用するかどうかを示す値を設定します。 |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | 'Keep-Alive' オプションが有効かどうかを示す値を設定します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | RTTI 情報。 |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | 永続的接続のデフォルト数です。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
