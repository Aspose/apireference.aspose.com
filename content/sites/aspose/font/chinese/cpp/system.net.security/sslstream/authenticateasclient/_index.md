---
title: "System::Net::Security::SslStream::AuthenticateAsClient 方法"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Security::SslStream::AuthenticateAsClient 方法。对 C++ 中的连接客户端进行身份验证。"
type: docs
weight: 200
url: /zh/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


对连接的客户端侧进行身份验证。

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| targetHost | String | 共享当前实例的服务器名称。 |

## 另见

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


对连接的客户端侧进行身份验证。

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| targetHost | String | 共享当前实例的服务器名称。 |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | 客户端证书。 |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | 用于身份验证的 SSL 协议。 |
| checkCertificateRevocation | bool | 指示在身份验证期间是否必须检查证书吊销列表的值。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
