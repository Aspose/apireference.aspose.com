---
title: "System::IO::FileMode enum"
linktitle: "FileMode"
second_title: "Aspose.Font pour C++"
description: "System::IO::FileMode enum. Spécifie comment un fichier doit être ouvert en C++."
type: docs
weight: 3100
url: /fr/cpp/system.io/filemode/
---
## FileMode enum


Spécifie comment un fichier doit être ouvert.

```cpp
enum class FileMode
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| CreateNew | 1 | Créer un nouveau fichier. Si le fichier existe déjà, une exception est levée. |
| Créer | 2 | Créer un nouveau fichier. Si le fichier existe déjà, il est écrasé. |
| Ouvrir | 3 | Ouvrir un fichier existant. Si le fichier n'existe pas, une exception est levée. |
| OpenOrCreate | 4 | Ouvrir un fichier existant ou en créer un nouveau s'il n'existe pas. |
| Tronquer | 5 | Ouvrir un fichier existant et le tronquer afin qu'il soit vide. Si le fichier n'existe pas, une exception est levée. |
| Ajouter | 6 | Ouvrir un fichier existant et se positionner à la fin de celui-ci ou en créer un nouveau s'il n'existe pas. |

## Voir aussi

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
