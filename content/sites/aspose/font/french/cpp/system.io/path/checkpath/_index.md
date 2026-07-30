---
title: "System::IO::Path::CheckPath méthode"
linktitle: "CheckPath"
second_title: "Aspose.Font pour C++"
description: "Méthode System::IO::Path::CheckPath. Détermine si le chemin spécifié est valide en vérifiant s'il contient des caractères invalides. Une exception est levée si le chemin contient des caractères invalides en C++."
type: docs
weight: 200
url: /fr/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


Détermine si le chemin spécifié est valide en vérifiant s'il contient des caractères invalides. Une exception est levée si le chemin contient des caractères invalides.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin à vérifier |
| msg | const String\& | Le message à transmettre au constructeur de l'objet d'exception |
| allow_empty | bool | Spécifie si une chaîne vide ou nulle doit être considérée comme un chemin correct (true) ou non (false) ; si ce paramètre est false et que **path** est vide, une ArgumentException est levée ; si ce paramètre est false et que **path** est null, une ArgumentNullException est levée |

## Voir aussi

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
