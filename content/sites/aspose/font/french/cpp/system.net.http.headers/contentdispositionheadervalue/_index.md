---
title: "Classe System::Net::Http::Headers::ContentDispositionHeaderValue"
linktitle: "ContentDispositionHeaderValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::ContentDispositionHeaderValue. Représente une valeur de l'en-tête ''Content-Disposition''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


Représente une valeur de l'en-tête 'Content-Disposition'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | Construit une nouvelle instance. |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | Construit une nouvelle instance. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_CreationDate](./get_creationdate/)() | Obtient la date de création du fichier. |
| [get_DispositionType](./get_dispositiontype/)() | Informations RTTI. |
| [get_FileName](./get_filename/)() | Obtient une valeur qui détermine comment construire un nom de fichier pour stocker la charge utile du message. Elle est utilisée lorsque l'entité est détachée et stockée dans un fichier séparé. |
| [get_FileNameStar](./get_filenamestar/)() | Obtient une valeur qui détermine comment construire les noms de fichiers pour stocker la charge du message. Elle est utilisée lorsque les entités sont détachées et stockées dans des fichiers séparés. |
| [get_ModificationDate](./get_modificationdate/)() | Obtient la date de modification du fichier. |
| [get_Name](./get_name/)() | Obtient un nom pour une partie du corps du contenu. |
| [get_Parameters](./get_parameters/)() | Renvoie une collection de paramètres de l'en-tête 'Content-Disposition'. |
| [get_ReadDate](./get_readdate/)() | Obtient la date à laquelle le fichier a été lu pour la dernière fois. |
| [get_Size](./get_size/)() | Obtient une taille de fichier approximative. |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [ContentDispositionHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [ContentDispositionHeaderValue](./). |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | Définit la date de création du fichier. |
| [set_DispositionType](./set_dispositiontype/)(String) | Définit un type de disposition. |
| [set_FileName](./set_filename/)(String) | Définit une valeur qui détermine comment construire un nom de fichier pour stocker la charge du message. Elle est utilisée lorsque l'entité est détachée et stockée dans un fichier séparé. |
| [set_FileNameStar](./set_filenamestar/)(String) | Définit une valeur qui détermine comment construire les noms de fichiers pour stocker la charge du message. Elle est utilisée lorsque les entités sont détachées et stockées dans des fichiers séparés. |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | Définit la date de modification du fichier. |
| [set_Name](./set_name/)(String) | Définit un nom pour une partie du corps du contenu. |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | Définit la date à laquelle le fichier a été lu pour la dernière fois. |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | Définit une taille de fichier approximative. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | Tente de convertir une chaîne passée en une instance de la classe [ContentDispositionHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
