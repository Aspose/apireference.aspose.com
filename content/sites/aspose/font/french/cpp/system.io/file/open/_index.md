---
title: "System::IO::File::Open méthode"
linktitle: "Ouvrir"
second_title: "Aspose.Font pour C++"
description: "System::IO::File::Open méthode. Ouvre le fichier spécifié dans le mode spécifié pour la lecture et l'écriture sans partage en C++."
type: docs
weight: 1900
url: /fr/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


Ouvre le fichier spécifié dans le mode spécifié pour la lecture et l'écriture sans partage.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier à ouvrir |
| mode | FileMode | Spécifie le mode dans lequel ouvrir le fichier |

### ReturnValue

Un objet [FileStream](../../filestream/) associé au fichier ouvert.

## Voir aussi

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


Ouvre le fichier spécifié dans le mode spécifié, avec le type d'accès et l'option de partage spécifiés.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier à ouvrir |
| mode | FileMode | Spécifie le mode dans lequel ouvrir le fichier |
| accès | FileAccess | Le type d'accès demandé |
| share | FileShare | Le type d'accès que d'autres objets [FileStream](../../filestream/) ont sur le fichier ouvert |

### ReturnValue

Un objet [FileStream](../../filestream/) associé au fichier ouvert.

## Voir aussi

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
