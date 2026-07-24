---
title: "Метод System::Net::Security::SslStream::AuthenticateAsClient"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Page для C++"
description: "Метод System::Net::Security::SslStream::AuthenticateAsClient. Аутентифицирует клиентскую сторону соединения на C++."
type: docs
weight: 200
url: /ru/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


Аутентифицирует клиентскую сторону соединения.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| targetHost | String | Имя сервера, который предоставляет текущий экземпляр. |

## См. также

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


Аутентифицирует клиентскую сторону соединения.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| targetHost | String | Имя сервера, который предоставляет текущий экземпляр. |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | Клиентские сертификаты. |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | Протоколы SSL, используемые для аутентификации. |
| checkCertificateRevocation | bool | Значение, указывающее, нужно ли проверять список отзыва сертификатов во время аутентификации. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
