---
title: "System::Net::Http::Headers::ObjectCollection class"
linktitle: "ObjectCollection"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::ObjectCollection class. Représente la collection des objets en C++."
type: docs
weight: 1600
url: /fr/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


Représente la collection des objets.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Paramètre | Description |
| --- | --- |
| T | Le type d’objet. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | Informations RTTI. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | Construit une nouvelle instance. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définir le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |

## Voir aussi

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
