---
title: "System::Net::Security::SslStream::AuthenticateAsClient method"
linktitle: "AuthenticateAsClient"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Security::SslStream::AuthenticateAsClient method. Mengotentikasi sisi klien dari koneksi dalam C++."
type: docs
weight: 200
url: /id/cpp/system.net.security/sslstream/authenticateasclient/
---
## SslStream::AuthenticateAsClient(String) method


Mengautentikasi sisi klien dari koneksi.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| targetHost | String | Nama server yang membagikan instance saat ini. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
## SslStream::AuthenticateAsClient(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) method


Mengautentikasi sisi klien dari koneksi.

```cpp
virtual void System::Net::Security::SslStream::AuthenticateAsClient(String targetHost, System::SharedPtr<System::Security::Cryptography::X509Certificates::X509CertificateCollection> clientCertificates, System::Security::Authentication::SslProtocols enabledSslProtocols, bool checkCertificateRevocation)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| targetHost | String | Nama server yang membagikan instance saat ini. |
| clientCertificates | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\> | Sertifikat klien. |
| enabledSslProtocols | System::Security::Authentication::SslProtocols | Protokol SSL yang digunakan untuk otentikasi. |
| checkCertificateRevocation | bool | Nilai yang menunjukkan apakah daftar pencabutan sertifikat harus diperiksa selama otentikasi. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509CertificateCollection](../../../system.security.cryptography.x509certificates/x509certificatecollection/)
* Enum [SslProtocols](../../../system.security.authentication/sslprotocols/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
