---
title: "classe System::IO::FileSystemInfo"
linktitle: "FileSystemInfo"
second_title: "Aspose.Font pour C++"
description: "classe System::IO::FileSystemInfo. La classe de base pour FileInfo et DirectoryInfo. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1600
url: /fr/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


La classe de base pour [FileInfo](../fileinfo/) et [DirectoryInfo](../directoryinfo/). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class FileSystemInfo : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Delete](./delete/)() | Supprime l'entité représentée par l'objet actuel. |
| virtual [Finalize](./finalize/)() | Ne fait rien. |
| [get_Attributes](./get_attributes/)() | Renvoie les attributs de l'entité représentée par l'objet actuel. |
| [get_CreationTime](./get_creationtime/)() | Renvoie la date de création de l'entité représentée par l'objet actuel en heure locale. |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | Renvoie la date de création de l'entité représentée par l'objet actuel en heure UTC. |
| virtual [get_Exists](./get_exists/)() | Détermine si l'entité référencée par le chemin représenté par l'objet actuel existe. |
| [get_Extension](./get_extension/)() | Renvoie l'extension du fichier représenté par l'objet actuel. |
| virtual [get_FullName](./get_fullname/)() | Renvoie le nom complet (y compris le chemin) de l'entité représentée par l'objet actuel. |
| [get_LastAccessTime](./get_lastaccesstime/)() | Renvoie la dernière heure d'accès de l'entité représentée par l'objet actuel en heure locale. |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | Renvoie la dernière heure d'accès de l'entité représentée par l'objet actuel en heure UTC. |
| [get_LastWriteTime](./get_lastwritetime/)() | Renvoie la dernière heure d'écriture de l'entité représentée par l'objet actuel en heure locale. |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | Renvoie la dernière heure d'écriture de l'entité représentée par l'objet actuel en heure UTC. |
| virtual [get_Name](./get_name/)() | Renvoie un nom de l'entité représentée par l'objet actuel. |
| [Refresh](./refresh/)() | Actualise l'état de l'objet actuel. |
| [set_Attributes](./set_attributes/)(FileAttributes) | Définit les attributs spécifiés sur l'entité représentée par l'objet actuel. |
| [set_CreationTime](./set_creationtime/)(DateTime) | Définit la date de création de l'entité représentée par l'objet actuel en heure locale. |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | Définit la date de création de l'entité représentée par l'objet actuel en heure UTC. |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | Définit la dernière heure d'accès de l'entité représentée par l'objet actuel en heure locale. |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | Définit la dernière heure d'accès de l'entité représentée par l'objet actuel en heure UTC. |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | Définit la dernière heure d'écriture de l'entité représentée par l'objet actuel en heure locale. |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | Définit la dernière heure d'écriture de l'entité représentée par l'objet actuel en heure UTC. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
