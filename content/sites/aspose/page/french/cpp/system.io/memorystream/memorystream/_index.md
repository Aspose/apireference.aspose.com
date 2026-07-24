---
title: "System::IO::MemoryStream::MemoryStream constructeur"
linktitle: "MemoryStream"
second_title: "Aspose.Page pour C++"
description: "System::IO::MemoryStream::MemoryStream constructeur. Crée une nouvelle instance de la classe MemoryStream avec une capacité initiale égale à 0 en C++."
type: docs
weight: 100
url: /fr/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


Construit une nouvelle instance de la classe [MemoryStream](../) avec une capacité initiale égale à 0.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## Voir aussi

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


Construit une nouvelle instance de la classe [MemoryStream](../) qui représente un flux mémoire connecté au tampon mémoire spécifié. Un paramètre indique si le flux est accessible en écriture.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| contenu | const ArrayPtr\<uint8_t\>\& | Un tableau d'octets à utiliser comme tampon mémoire sur lequel le flux représenté par l'objet en cours de création sera basé |
| modifiable | bool | Spécifie si le flux doit être modifiable |

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


Construit une nouvelle instance de la classe [MemoryStream](../) qui représente un flux mémoire connecté à un segment du tampon mémoire spécifié, commençant à l'index spécifié et incluant le nombre d'éléments spécifié. Les paramètres indiquent si le flux est modifiable et si la méthode GetBytes() peut être appelée.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| contenu | const ArrayPtr\<uint8_t\>\& | Un tableau d'octets dont un segment sera utilisé comme tampon mémoire sur lequel le flux représenté par l'objet en cours de création sera basé |
| indice | int | Un index basé sur 0 de l'élément dans **content** où le segment commence |
| count | int | Le nombre d'éléments de **content** inclus dans le segment |
| modifiable | bool | Spécifie si le flux doit être modifiable |
| publiclyVisible | bool | Spécifie si le tampon mémoire sous-jacent doit être rendu disponible à l'appelant de la méthode GetByte() |

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


Construit une nouvelle instance de la classe [MemoryStream](../) qui représente un flux basé sur un tampon mémoire de la taille spécifiée.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| capacity_ | int | La taille en octets d'un tampon mémoire associé au flux représenté par l'objet en cours de création |

## Voir aussi

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
