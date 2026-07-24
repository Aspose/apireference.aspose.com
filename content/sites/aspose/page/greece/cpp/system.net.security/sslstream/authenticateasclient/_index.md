---
title: "System::Net::Security::SslStream::AuthenticateAsClient method"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Page για C++"
description: "System::Net::Security::SslStream::AuthenticateAsClient method. Πραγματοποιεί αυθεντικοποίηση της πλευράς του πελάτη της σύνδεσης σε C++."
type: docs
weight: 200
url: /el/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


Πιστοποιεί την πλευρά του πελάτη της σύνδεσης.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| targetHost | String | Το όνομα του διακομιστή που μοιράζεται την τρέχουσα παρουσία. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


Πιστοποιεί την πλευρά του πελάτη της σύνδεσης.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| targetHost | String | Το όνομα του διακομιστή που μοιράζεται την τρέχουσα παρουσία. |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | Τα πιστοποιητικά του πελάτη. |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | Τα πρωτόκολλα SSL που χρησιμοποιούνται για την αυθεντικοποίηση. |
| checkCertificateRevocation | bool | Μια τιμή που υποδεικνύει εάν πρέπει να ελεγχθεί η λίστα ανάκλησης πιστοποιητικών κατά την αυθεντικοποίηση. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
