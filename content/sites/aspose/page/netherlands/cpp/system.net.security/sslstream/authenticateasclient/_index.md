---
title: "System::Net::Security::SslStream::AuthenticateAsClient method"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Page voor C++"
description: "System::Net::Security::SslStream::AuthenticateAsClient method. Authenticeert de clientzijde van de verbinding in C++."
type: docs
weight: 200
url: /nl/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


Authenticeert de client‑kant van de verbinding.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| targetHost | String | De naam van de server die de huidige instantie deelt. |

## Zie ook

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


Authenticeert de client‑kant van de verbinding.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| targetHost | String | De naam van de server die de huidige instantie deelt. |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | De clientcertificaten. |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | De SSL-protocollen die worden gebruikt voor authenticatie. |
| checkCertificateRevocation | bool | Een waarde die aangeeft of de certificaatintrekkingslijst moet worden gecontroleerd tijdens authenticatie. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
