---
title: "System::IO::FileInfo classe"
linktitle: "FileInfo"
second_title: "Aspose.Font pour C++"
description: "System::IO::FileInfo classe. Représente un chemin vers un fichier et le fichier auquel ce chemin fait référence, et fournit des méthodes pour le manipuler. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1400
url: /fr/cpp/system.io/fileinfo/
---
## FileInfo class


Représente un chemin vers un fichier et le fichier référencé par ce chemin et fournit des méthodes pour le manipuler. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class FileInfo : public System::IO::FileSystemInfo
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AppendText](./appendtext/)() | Ouvre un fichier représenté par l'objet actuel pour écrire du texte en utilisant l'encodage UTF-8, en mode 'Append' sans partage. |
| [CopyTo](./copyto/)(const String\&) | Copie le fichier représenté par l'objet actuel vers l'emplacement spécifié. Si le fichier de destination existe déjà, la copie échoue. |
| [CopyTo](./copyto/)(const String\&, bool) | Copie le fichier représenté par l'objet actuel vers l'emplacement spécifié. Un paramètre indique si le fichier de destination existant doit être écrasé. |
| [Create](./create/)() | Crée un fichier à l'emplacement spécifié par le chemin représenté par l'objet actuel et l'ouvre en lecture et écriture, en mode troncature et sans partage. |
| [CreateText](./createtext/)() | Crée un fichier à l'emplacement spécifié par le chemin représenté par l'objet actuel et l'ouvre pour écrire du texte en utilisant l'encodage UTF-8 sans partage. |
| [Decrypt](./decrypt/)() | NON IMPLEMENTÉ. |
| [Delete](./delete/)() override | Supprime le fichier représenté par l'objet actuel. |
| [Encrypt](./encrypt/)() | NON IMPLEMENTÉ. |
| [FileInfo](./fileinfo/)(const String\&) | Construit une nouvelle instance de la classe [FileInfo](./) qui représente le fichier spécifié. |
| [get_Directory](./get_directory/)() | Renvoie un objet [DirectoryInfo](../directoryinfo/) qui représente le répertoire dans lequel se trouve le fichier représenté par l'objet actuel. |
| [get_DirectoryName](./get_directoryname/)() | Renvoie le nom complet du répertoire dans lequel le fichier représenté par l'objet actuel est situé. |
| [get_Exists](./get_exists/)() override | Renvoie une valeur indiquant si le fichier existe. |
| [get_IsReadOnly](./get_isreadonly/)() | Renvoie une valeur indiquant si l'attribut ReadOnly est défini. |
| [get_Length](./get_length/)() | Renvoie la taille du fichier en octets. |
| [get_Name](./get_name/)() override | Renvoie le nom du fichier. |
| [MoveTo](./moveto/)(const String\&) | Déplace le fichier représenté par l'objet actuel vers l'emplacement spécifié. |
| [Open](./open/)(FileMode) | Ouvre le fichier représenté par l'objet actuel dans le mode spécifié pour la lecture et l'écriture, sans partage. |
| [Open](./open/)(FileMode, FileAccess) | Ouvre le fichier représenté par l'objet actuel dans le mode spécifié, avec le type d'accès spécifié, sans partage. |
| [Open](./open/)(FileMode, FileAccess, FileShare) | Ouvre le fichier représenté par l'objet actuel dans le mode spécifié, avec le type d'accès spécifié et l'option de partage. |
| [OpenRead](./openread/)() | Ouvre un fichier représenté par l'objet actuel en lecture seule, en mode 'Open' avec un accès partagé en lecture. |
| [OpenText](./opentext/)() | Ouvre le fichier existant à l'emplacement spécifié par le chemin représenté par l'objet actuel pour lire du texte en utilisant l'encodage UTF-8 sans partage. |
| [OpenWrite](./openwrite/)() | Ouvre un fichier représenté par l'objet actuel en écriture seule, en mode 'OpenOrCreate' sans partage. |
| [Replace](./replace/)(const String\&, const String\&) | Remplace le contenu d'un fichier de destination spécifié par le fichier représenté par l'objet [FileInfo](./) actuel et crée une sauvegarde du fichier remplacé. |
| [Replace](./replace/)(const String\&, const String\&, bool) | Remplace le contenu d'un fichier de destination spécifié par le fichier représenté par l'objet [FileInfo](./) actuel et crée une sauvegarde du fichier remplacé. |
| [set_IsReadOnly](./set_isreadonly/)(bool) | Définit ou supprime l'attribut ReadOnly sur le fichier. |
| [ToString](./tostring/)() const override | Renvoie un chemin représenté par l'objet actuel. |
## Voir aussi

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
