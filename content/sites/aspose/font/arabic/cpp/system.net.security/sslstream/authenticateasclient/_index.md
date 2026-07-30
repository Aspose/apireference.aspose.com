---
title: "System::Net::Security::SslStream::AuthenticateAsClient method"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Security::SslStream::AuthenticateAsClient method. يُصادق على جانب العميل من الاتصال في C++."
type: docs
weight: 200
url: /ar/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


يقوم بالمصادقة على جانب العميل من الاتصال.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| targetHost | String | اسم الخادم الذي يشارك النسخة الحالية. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


يقوم بالمصادقة على جانب العميل من الاتصال.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| targetHost | String | اسم الخادم الذي يشارك النسخة الحالية. |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | شهادات العميل. |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | بروتوكولات SSL المستخدمة للمصادقة. |
| checkCertificateRevocation | bool | قيمة تشير إلى ما إذا كان يجب فحص قائمة إبطال الشهادة أثناء المصادقة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
