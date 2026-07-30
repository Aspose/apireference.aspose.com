---
title: "System::Net::Security::SslStream::AuthenticateAsClient méthode"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Font pour C++"
description: "System::Net::Security::SslStream::AuthenticateAsClient method. Authentifie le côté client de la connexion en C++."
type: docs
weight: 200
url: /fr/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


Authentifie le côté client de la connexion.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| targetHost | String | Le nom du serveur qui partage l'instance actuelle. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


Authentifie le côté client de la connexion.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| targetHost | String | Le nom du serveur qui partage l'instance actuelle. |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | Les certificats client. |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | Les protocoles SSL qui sont utilisés pour l'authentification. |
| checkCertificateRevocation | bool | Une valeur qui indique si la liste de révocation des certificats doit être vérifiée pendant l'authentification. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
