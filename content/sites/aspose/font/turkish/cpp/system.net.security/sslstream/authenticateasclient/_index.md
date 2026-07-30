---
title: "System::Net::Security::SslStream::AuthenticateAsClient metodu"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Font için C++"
description: "System::Net::Security::SslStream::AuthenticateAsClient metodu. Bağlantının istemci tarafını C++'ta kimlik doğrular."
type: docs
weight: 200
url: /tr/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


Bağlantının istemci tarafını kimlik doğrular.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| targetHost | Dize | Geçerli örneği paylaşan sunucunun adı. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


Bağlantının istemci tarafını kimlik doğrular.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| targetHost | Dize | Geçerli örneği paylaşan sunucunun adı. |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | İstemci sertifikaları. |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | Kimlik doğrulama için kullanılan SSL protokolleri. |
| checkCertificateRevocation | bool | Kimlik doğrulama sırasında sertifika iptal listesi kontrol edilmesi gerekip gerekmediğini gösteren bir değer. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
