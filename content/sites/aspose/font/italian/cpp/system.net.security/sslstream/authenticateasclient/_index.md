---
title: "System::Net::Security::SslStream::AuthenticateAsClient method"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Font per C++"
description: "System::Net::Security::SslStream::AuthenticateAsClient method. Autentica il lato client della connessione in C++."
type: docs
weight: 200
url: /it/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


Autentica il lato client della connessione.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| targetHost | Stringa | Il nome del server che condivide l'istanza corrente. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


Autentica il lato client della connessione.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| targetHost | Stringa | Il nome del server che condivide l'istanza corrente. |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | I certificati client. |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | I protocolli SSL utilizzati per l'autenticazione. |
| checkCertificateRevocation | bool | Un valore che indica se la lista di revoca dei certificati deve essere controllata durante l'autenticazione. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
