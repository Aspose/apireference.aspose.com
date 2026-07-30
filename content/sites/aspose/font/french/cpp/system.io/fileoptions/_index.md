---
title: "System::IO::FileOptions enum"
linktitle: "FileOptions"
second_title: "Aspose.Font pour C++"
description: "System::IO::FileOptions enum. Représente des options avancées pour la création d'un objet FileStream en C++."
type: docs
weight: 3200
url: /fr/cpp/system.io/fileoptions/
---
## FileOptions enum


Représente des options avancées pour la création d'un objet [FileStream](../filestream/).

```cpp
enum class FileOptions
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Aucun | 0 | Aucune option supplémentaire. |
| Encrypted | 16384 | Le fichier est chiffré. NON IMPLEMENTÉ. |
| DeleteOnClose | 67108864 | Le fichier doit être automatiquement supprimé lorsqu'il n'est plus utilisé. |
| SequentialScan | 134217728 | Le fichier doit être accédé séquentiellement. |
| RandomAccess | 268435456 | Le fichier est accédé de manière aléatoire. |
| Asynchrone | 1073741824 | Le fichier peut être utilisé pour des opérations d'E/S asynchrones. |
| WriteThrough | n/a | Toutes les écritures doivent être envoyées directement au disque en contournant tout cache intermédiaire. |

## Voir aussi

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
