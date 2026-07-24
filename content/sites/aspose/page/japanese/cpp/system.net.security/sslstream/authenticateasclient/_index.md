---
title: "System::Net::Security::SslStream::AuthenticateAsClient メソッド"
linktitle: "AuthenticateAsClient"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::SslStream::AuthenticateAsClient メソッド。C++ で接続のクライアント側を認証します。"
type: docs
weight: 200
url: /ja/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


接続のクライアント側を認証します。

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| targetHost | String | 現在のインスタンスを共有するサーバーの名前です。 |

## 参照

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


接続のクライアント側を認証します。

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| targetHost | String | 現在のインスタンスを共有するサーバーの名前です。 |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | クライアント証明書です。 |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | 認証に使用される SSL プロトコルです。 |
| checkCertificateRevocation | bool | 認証中に証明書失効リストをチェックすべきかを示す値です。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
