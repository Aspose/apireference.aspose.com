---
title: "System::IO::File::Create méthode"
linktitle: "Créer"
second_title: "Aspose.Font pour C++"
description: "System::IO::File::Create méthode. Crée un nouveau fichier (ou écrase un existant) et l'ouvre en accès lecture/écriture en utilisant la taille de tampon et les options spécifiées en C++."
type: docs
weight: 500
url: /fr/cpp/system.io/file/create/
---
## File::Create method


Crée un nouveau fichier (ou écrase l'existant) et l'ouvre en accès lecture/écriture en utilisant la taille de tampon et les options spécifiées.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier à créer ou écraser |
| bufferSize | int32_t | Le nombre d'octets mis en mémoire tampon lors de la lecture et de l'écriture du fichier |
| options | FileOptions | Spécifie comment créer ou écraser le fichier |

### ReturnValue

Un pointeur partagé vers l'objet [FileStream](../../filestream/) associé au fichier spécifié

## Voir aussi

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
