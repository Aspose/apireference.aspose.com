---
title: "System::Net::Security::SslStream::AuthenticateAsClient Methode"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Font für C++"
description: "System::Net::Security::SslStream::AuthenticateAsClient Methode. Authentifiziert die Client-Seite der Verbindung in C++."
type: docs
weight: 200
url: /de/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


Authentifiziert die Client‑Seite der Verbindung.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| targetHost | String | Der Name des Servers, der die aktuelle Instanz freigibt. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


Authentifiziert die Client‑Seite der Verbindung.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| targetHost | String | Der Name des Servers, der die aktuelle Instanz freigibt. |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | Die Client-Zertifikate. |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | Die SSL-Protokolle, die für die Authentifizierung verwendet werden. |
| checkCertificateRevocation | bool | Ein Wert, der angibt, ob die Zertifikatswiderrufsliste während der Authentifizierung geprüft werden muss. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
