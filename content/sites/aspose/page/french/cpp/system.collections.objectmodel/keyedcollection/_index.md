---
title: "classe System::Collections::ObjectModel::KeyedCollection"
linktitle: "KeyedCollection"
second_title: "Aspose.Page pour C++"
description: "Classe System::Collections::ObjectModel::KeyedCollection. Collection abstraite d'éléments avec des clés intégrées. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


Collection abstraite d'éléments avec des clés intégrées. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| Paramètre | Description |
| --- | --- |
| TKey | Type de clé. |
| TItem | type de valeur. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const TItem\&) override | Ajouter un élément à la fin du conteneur. |
| [Contains](./contains/)(TKey) | Vérifie si la clé est présente dans le conteneur. |
| [get_Comparer](./get_comparer/)() | Obtient le comparateur. |
| [idx_get](./idx_get/)(TKey) | Obtient l'élément à un indice spécifique. |
| [Remove](./remove/)(TKey) | Supprime la clé du conteneur. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Force un argument de modèle spécifique à être traité comme pointeur faible au lieu de pointeur partagé (le cas échéant). |
## Champs

| Champ | Description |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Seuil de création du dictionnaire de recherche, par défaut. |

## Voir aussi

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
