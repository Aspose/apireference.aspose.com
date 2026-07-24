---
title: "metode System::Net::CredentialCache::GetCredential"
linktitle: "GetCredential"
second_title: "Aspose.Page untuk C++"
description: "metode System::Net::CredentialCache::GetCredential. Mengembalikan kredensial untuk nama host, port, dan tipe autentikasi yang ditentukan dalam C++."
type: docs
weight: 500
url: /id/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


Mengembalikan kredensial untuk nama host, port, dan tipe otentikasi yang ditentukan.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| host | String | Nama host yang terkait dengan kredensial. |
| port | int32_t | Nomor port. |
| authenticationType | String | Tipe autentikasi. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


Mengembalikan kredensial untuk awalan URI dan tipe autentikasi yang ditentukan.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | Awalan URI. |
| authenticationType | String | Tipe autentikasi. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
