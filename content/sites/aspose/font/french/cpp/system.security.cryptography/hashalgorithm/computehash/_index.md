---
title: "Méthode System::Security::Cryptography::HashAlgorithm::ComputeHash"
linktitle: "ComputeHash"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Security::Cryptography::HashAlgorithm::ComputeHash. Hache le tampon en C++."
type: docs
weight: 200
url: /fr/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


Calcule le hachage du tampon.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Tampon source. |

### ReturnValue

Valeur de hachage calculée.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


Calcule le hachage d'une tranche du tampon.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Tampon source. |
| décalage | int | Décalage dans le tampon source. |
| count | int | Nombre d'octets à utiliser du tampon source. |

### ReturnValue

Valeur de hachage calculée.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


Lit le flux jusqu'à la fin et calcule le hachage des données lues.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | Flux à partir duquel lire les données. |

### ReturnValue

Valeur de hachage calculée pour l'ensemble des données du flux.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
