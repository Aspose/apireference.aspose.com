---
title: "Méthode System::Net::Security::SslStream::Read"
linktitle: "Read"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Net::Security::SslStream::Read. Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié en C++."
type: docs
weight: 3200
url: /fr/cpp/system.net.security/sslstream/read/
---
## SslStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Security::SslStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau d'octets où écrire les octets lus |
| décalage | int32_t | Une position basée sur 0 dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Security::SslStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | Le tableau d'octets où écrire les octets lus |
| décalage | int32_t | Une position basée sur 0 dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
