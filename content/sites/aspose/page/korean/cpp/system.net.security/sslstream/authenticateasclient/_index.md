---
title: "System::Net::Security::SslStream::AuthenticateAsClient 메서드"
linktitle: "AuthenticateAsClient"
second_title: "C++용 Aspose.Page"
description: "System::Net::Security::SslStream::AuthenticateAsClient 메서드. C++에서 연결의 클라이언트 측을 인증합니다."
type: docs
weight: 200
url: /ko/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


연결의 클라이언트 측을 인증합니다.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| targetHost | String | 현재 인스턴스를 공유하는 서버의 이름입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


연결의 클라이언트 측을 인증합니다.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| targetHost | String | 현재 인스턴스를 공유하는 서버의 이름입니다. |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | 클라이언트 인증서입니다. |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | 인증에 사용되는 SSL 프로토콜입니다. |
| checkCertificateRevocation | bool | 인증 중에 인증서 폐기 목록을 확인해야 하는지를 나타내는 값입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
