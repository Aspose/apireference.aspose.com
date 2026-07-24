---
title: "System::Net::Sockets::NetworkStream::Read méthode"
linktitle: "Lire"
second_title: "Aspose.Page pour C++"
description: "System::Net::Sockets::NetworkStream::Read méthode. Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié en C++."
type: docs
weight: 1900
url: /fr/cpp/system.net.sockets/networkstream/read/
---
## NetworkStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau d'octets où les octets lus seront écrits. |
| offset | int32_t | Le décalage en octets dans le tableau spécifié. |
| size | int32_t | Le nombre d'octets à lire. |

### ReturnValue

Le nombre d'octets lus.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | La vue du tableau d'octets dans laquelle écrire les octets lus |
| offset | int32_t | Une position à base zéro dans **buffer** où commencer l'écriture |
| size | int32_t | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
