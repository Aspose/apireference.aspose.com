---
title: "System::Collections::Generic::BaseDictionary classe"
linktitle: "BaseDictionary"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::BaseDictionary classe. Implémente du code commun pour diverses structures de données similaires à des dictionnaires (p. ex. Dictionary, SortedDictionary). Ne doit pas être utilisé directement, sauf par héritage lors de la définition de conteneurs. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


Implémente du code commun pour diverses structures de données similaires à des dictionnaires (p. ex. [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/)). Ne doit pas être utilisé directement, sauf par héritage lors de la définition de conteneurs. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en argument.

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| Paramètre | Description |
| --- | --- |
| Map | Type de map sous-jacent. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | Spécifique à C++. |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | Ajoute une paire clé-valeur dans le dictionnaire. |
| [BaseDictionary](./basedictionary/)() | Crée une structure de données vide. |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | Constructeur de transmission pour transmettre les arguments au constructeur du map sous-jacent. |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | Constructeur de copie. |
| [BaseDictionary](./basedictionary/)(BaseType *) | Constructeur de copie. |
| [begin](./begin/)() const | Renvoie un itérateur vers l'enveloppe KVPair pour l'élément clé-valeur du conteneur. Implémenté dans le style C# - l'itérateur doit renvoyer l'objet KVPair avec les interfaces get_Key() et get_Value(). Si le conteneur est vide, l'itérateur renvoyé sera égal à [end()](../ienumerable/end/). |
| [cbegin](./cbegin/)() const | Renvoie un itérateur vers le premier élément du conteneur. Implémenté dans le style STL. Si le conteneur est vide, l'itérateur renvoyé sera égal à [end()](../ienumerable/end/). |
| [cend](./cend/)() const | Renvoie un itérateur vers l'élément suivant le dernier élément du conteneur. Implémenté dans le style STL. Cet élément sert de repère ; tenter d'y accéder entraîne un comportement indéfini. |
| [Clear](./clear/)() override | Supprime tous les éléments. |
| [ContainsKey](./containskey/)(const key_t\&) const override | Vérifie si la clé est présente dans le dictionnaire. |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | Vérifie si la valeur est présente dans le dictionnaire. Utilise l'opérateur == pour comparer les valeurs. |
| [data](./data/)() | Accesseur du stockage de données sous-jacent. |
| [data](./data/)() const | Accesseur du stockage de données sous-jacent. |
| [end](./end/)() const | Renvoie un itérateur vers l'enveloppe KVPair pour l'élément clé-valeur suivant le dernier élément du conteneur. Implémenté dans le style C# – l'itérateur doit renvoyer l'objet KVPair avec les interfaces get_Key() et get_Value(). Cet élément agit comme un espace réservé ; tenter d'y accéder entraîne un comportement indéfini. |
| [get_Count](./get_count/)() const override | Obtient le nombre d'éléments. |
| virtual [GetEnumerator](./getenumerator/)() | Crée une instance d'énumérateur, doit être implémentée par la sous‑classe. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | Renvoie la valeur si trouvée ; sinon **Value()**. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | Renvoie la valeur si trouvée ; sinon **defaultValue**. |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | Renvoie la valeur si trouvée ; ou **null** sinon. N'a de sens que pour les types de référence. |
| [idx_get](./idx_get/)(const key_t\&) const override | Fonction getter indexée. |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | Fonction setter indexée. Modifie ou crée l'élément. |
| virtual [operator[]](./operator[]/)(const key_t\&) | Fonction d'accès. |
| [Remove](./remove/)(const key_t\&) override | Supprime la clé spécifique du dictionnaire. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | Recherche la valeur associée à la clé et la récupère si elle est trouvée. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Interface implémentée. |
| [const_iterator](./const_iterator/) | Type d'itérateur const. |
| [iterator](./iterator/) | Type d'itérateur. |
| [KeyCollection](./keycollection/) | Assurez‑vous d'utiliser l'allocateur correct avec le type de stockage sous‑jacent. |
| [KVPair](./kvpair/) | Type de paire clé-valeur. |
| [map_t](./map_t/) | Type de carte interne. |
| [ValueCollection](./valuecollection/) | Collection de valeurs. |

## Voir aussi

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
