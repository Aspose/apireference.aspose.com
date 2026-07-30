---
title: "Classe System::IO::File"
linktitle: "Fichier"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::File. Fournit des méthodes pour manipuler les fichiers. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci par quelque moyen que ce soit en C++."
type: docs
weight: 1300
url: /fr/cpp/system.io/file/
---
## File class


Fournit des méthodes pour manipuler les fichiers. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci, quel que soit le moyen.

```cpp
class File
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Ajoute des chaînes provenant de la collection de chaînes spécifiée au fichier spécifié en utilisant l'encodage spécifié en écrivant chaque chaîne sur une nouvelle ligne. Si le fichier spécifié n'existe pas, il est créé. Le fichier est fermé après l'écriture de toutes les chaînes. |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | Ajoute la chaîne spécifiée au fichier spécifié en utilisant l'encodage spécifié. |
| static [AppendText](./appendtext/)(const String\&) | Crée un objet [StreamWriter](../streamwriter/) qui ajoute du texte au fichier spécifié en utilisant l'encodage UTF-8. Si le fichier spécifié n'existe pas, il est créé. |
| static [Copy](./copy/)(const String\&, const String\&, bool) | Copie le fichier spécifié vers l'emplacement spécifié. Si le fichier de destination existe déjà, un paramètre indique s'il doit être écrasé. |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | Crée un nouveau fichier (ou écrase l'existant) et l'ouvre en accès lecture/écriture en utilisant la taille de tampon et les options spécifiées. |
| static [CreateText](./createtext/)(const String\&) | Crée un nouveau fichier ou ouvre un fichier existant pour écrire du texte encodé en UTF-8. |
| static [Decrypt](./decrypt/)(const String\&) | NON IMPLEMENTÉ. |
| static [Delete](./delete/)(const String\&) | Supprime le fichier ou le répertoire spécifié. |
| static [Encrypt](./encrypt/)(const String\&) | NON IMPLEMENTÉ. |
| static [Exists](./exists/)(const String\&) | Détermine si le chemin spécifié fait référence à un fichier existant. |
| static [GetAttributes](./getattributes/)(const String\&) | Renvoie les attributs de l'entité spécifiée. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Renvoie la date de création de l'entité spécifiée en heure locale. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Renvoie la date de création de l'entité spécifiée en temps UTC. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Renvoie la dernière heure d'accès de l'entité spécifiée en heure locale. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Renvoie la dernière heure d'accès de l'entité spécifiée en temps UTC. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Renvoie la dernière heure d'écriture de l'entité spécifiée en heure locale. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Renvoie la dernière heure d'écriture de l'entité spécifiée en temps UTC. |
| static [Move](./move/)(const String\&, const String\&) | Déplace le fichier spécifié vers le nouvel emplacement. |
| static [Open](./open/)(const String\&, FileMode) | Ouvre le fichier spécifié dans le mode spécifié pour la lecture et l'écriture sans partage. |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | Ouvre le fichier spécifié dans le mode spécifié, avec le type d'accès et l'option de partage spécifiés. |
| static [OpenRead](./openread/)(const String\&) | Ouvre le fichier spécifié en lecture seule, en mode 'Open' avec un accès partagé en lecture. |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | Ouvre le fichier existant spécifié pour lire du texte en utilisant l'encodage UTF-8 sans partage. |
| static [OpenWrite](./openwrite/)(const String\&) | Ouvre le fichier spécifié en écriture seule, en mode 'OpenOrCreate' sans partage. |
| static [ReadAllBytes](./readallbytes/)(const String\&) | Lit le contenu du fichier binaire spécifié dans un tableau d'octets. |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | Lit le contenu du fichier texte spécifié ligne par ligne dans un tableau de chaînes en utilisant l'encodage de caractères spécifié. |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | Lit le contenu du fichier texte spécifié dans un seul objet [String](../../system/string/) en utilisant l'encodage de caractères spécifié. |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | Lit le contenu du fichier texte spécifié ligne par ligne en utilisant l'encodage de caractères spécifié et renvoie une collection énumérable de chaînes, chacune représentant une ligne du contenu du fichier. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | Remplace le contenu d'un fichier par un autre et crée une sauvegarde du fichier remplacé. |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | Définit les attributs spécifiés sur le fichier spécifié. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | NON IMPLEMENTÉ. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | NON IMPLEMENTÉ. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | NON IMPLEMENTÉ. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | NON IMPLEMENTÉ. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Définit la date et l'heure de dernière écriture de l'entité spécifiée en heure locale. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Définit la date et l'heure de dernière écriture de l'entité spécifiée en temps UTC. |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | Écrase le fichier binaire spécifié et y écrit les octets spécifiés. |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Crée un nouveau fichier texte ou écrase l'existant et écrit toutes les chaînes de la collection énumérable de chaînes spécifiée dans celui‑ci, chaque chaîne sur une nouvelle ligne, en utilisant l'encodage spécifié. |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | Crée un nouveau fichier texte ou écrase l'existant et écrit toutes les chaînes du tableau de chaînes spécifié dans celui‑ci, chaque chaîne sur une nouvelle ligne, en utilisant l'encodage spécifié. |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | Crée un nouveau fichier texte ou écrase l'existant et écrit le contenu de la chaîne spécifiée dans celui‑ci en utilisant l'encodage spécifié. |
## Champs

| Champ | Description |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | Valeur par défaut du nombre d'octets mis en mémoire tampon lors de la lecture et de l'écriture d'un fichier. |
## Voir aussi

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
