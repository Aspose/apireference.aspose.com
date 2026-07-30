---
title: "System::IO::FileStream::Read méthode"
linktitle: "Read"
second_title: "Aspose.Font pour C++"
description: "System::IO::FileStream::Read méthode. Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié en C++."
type: docs
weight: 1300
url: /fr/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau d’octets dans lequel écrire les octets lus. |
| décalage | int32_t | Une position à base zéro dans **buffer** où commencer l'écriture. |
| count | int32_t | Le nombre d'octets à lire. |

### ReturnValue

Le nombre d'octets lus.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | La vue du tableau d'octets où écrire les octets lus. |
| décalage | int32_t | Une position à base zéro dans **buffer** où commencer l'écriture. |
| count | int32_t | Le nombre d'octets à lire. |

### ReturnValue

Le nombre d'octets lus.

## Voir aussi

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
