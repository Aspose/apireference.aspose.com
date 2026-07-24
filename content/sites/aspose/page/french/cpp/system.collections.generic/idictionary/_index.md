---
title: "classe System::Collections::Generic::IDictionary"
linktitle: "IDictionary"
second_title: "Aspose.Page pour C++"
description: "classe System::Collections::Generic::IDictionary. Interface pour les conteneurs de type dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2100
url: /fr/cpp/system.collections.generic/idictionary/
---
## IDictionary class


Interface pour les conteneurs de type dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| Paramètre | Description |
| --- | --- |
| TKey | Type de clé. |
| TValue | Type valeur. |
## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | Ajoute une paire clé-valeur dans le conteneur. |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | Vérifie si le conteneur contient la clé. |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | Copie le contenu du dictionnaire dans les éléments existants du tableau. |
| virtual [get_Count](./get_count/)() const | Dévoile la fonction membre get_Count. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Vérifie si la taille de la collection est fixe. |
| [get_IsSynchronized](./get_issynchronized/)() const | Vérifie si le conteneur est thread-safe. |
| virtual [get_Keys](./get_keys/)() const | Accède à la collection de clés. |
| virtual [get_Values](./get_values/)() const | Accède à la collection de valeurs. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | Renvoie la valeur si trouvée ; ou **Value()** sinon. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | Renvoie la valeur si trouvée ; ou **defaultValue** sinon. |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | Renvoie la valeur si trouvée ; ou **null** sinon, n’a de sens que pour les types de référence. |
| virtual [idx_get](./idx_get/)(const TKey\&) const | Fonction d'accès. |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | Fonction de modification. |
| virtual [Remove](./remove/)(const TKey\&) | Supprime la clé du conteneur. |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | Recherche la valeur et la récupère si elle est trouvée. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Informations RTTI. |
| [KeyValuePairType](./keyvaluepairtype/) | Type de paire clé‑valeur. |

## Voir aussi

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
