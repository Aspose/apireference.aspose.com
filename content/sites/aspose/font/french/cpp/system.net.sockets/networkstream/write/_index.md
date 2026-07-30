---
title: "System::Net::Sockets::NetworkStream::Write méthode"
linktitle: "Write"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::NetworkStream::Write méthode. Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux en C++."
type: docs
weight: 2500
url: /fr/cpp/system.net.sockets/networkstream/write/
---
## NetworkStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux.

```cpp
void System::Net::Sockets::NetworkStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau contenant les octets à écrire. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'éléments dans la sous-plage à écrire. |

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## NetworkStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux.

```cpp
void System::Net::Sockets::NetworkStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | La vue du tableau contenant les octets à écrire |
| décalage | int32_t | Un indice basé sur 0 de l'élément dans **buffer** à partir duquel commence la sous-plage à écrire |
| taille | int32_t | Le nombre d'éléments dans la sous-plage à écrire |

## Voir aussi

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
