---
title: "System::Security::Cryptography::HashAlgorithm::ComputeHash méthode"
linktitle: "ComputeHash"
second_title: "Aspose.Page pour C++"
description: "System::Security::Cryptography::HashAlgorithm::ComputeHash méthode. Hache le tampon en C++."
type: docs
weight: 200
url: /fr/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


Hache le tampon.

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
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


Hache la tranche du tampon.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Tampon source. |
| offset | int | Décalage dans le tampon source. |
| count | int | Nombre d'octets à utiliser depuis le tampon source. |

### ReturnValue

Valeur de hachage calculée.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
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
* Library [Aspose.Page for C++](../../../)
