---
title: "System::Collections::Specialized::StringCollection classe"
linktitle: "StringCollection"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Specialized::StringCollection. Liste indexée de chaînes. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() fonction. Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


Liste indexée de chaînes. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const System::String\&) | Ajoute la valeur à la fin de la liste. |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | Ajoute des éléments dans le conteneur. |
| [begin](./begin/)() | Renvoie un itérateur vers le premier élément du conteneur. Si le conteneur est vide, l'itérateur renvoyé sera égal à [end()](./end/). |
| [begin](./begin/)() const | Renvoie un itérateur vers le premier élément du conteneur const-qualifié. Si le conteneur est vide, l'itérateur renvoyé sera égal à [end()](./end/). |
| [cbegin](./cbegin/)() const | Renvoie un itérateur vers le premier élément const-qualifié du conteneur. Si le conteneur est vide, l'itérateur renvoyé sera égal à [cend()](./cend/). |
| [cend](./cend/)() const | Renvoie un itérateur vers l'élément suivant le dernier élément du conteneur. Cet élément sert de repère ; tenter d'y accéder entraîne un comportement indéfini. |
| [Clear](./clear/)() | Supprime tous les éléments. |
| [Contains](./contains/)(const System::String\&) const | Vérifie si une chaîne spécifique est présente dans le conteneur. |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | Copie les éléments vers les éléments existants du tableau. |
| [crbegin](./crbegin/)() const | Renvoie un itérateur inverse vers le premier élément du conteneur inversé. Il correspond au dernier élément du conteneur non inversé. Si le conteneur est vide, l'itérateur renvoyé est égal à [crend()](./crend/). |
| [crend](./crend/)() const | Renvoie un itérateur inverse vers l'élément suivant le dernier élément du conteneur inversé. Il correspond à l'élément précédant le premier élément du conteneur non inversé. Cet élément sert de repère, tenter d'y accéder entraîne un comportement indéfini. |
| [data](./data/)() | Accesseur de la structure de données interne. |
| [data](./data/)() const | Accesseur de la structure de données interne. |
| [end](./end/)() | Renvoie un itérateur vers l'élément suivant le dernier élément du conteneur. Cet élément sert de repère ; tenter d'y accéder entraîne un comportement indéfini. |
| [end](./end/)() const | Renvoie un itérateur vers l'élément suivant le dernier élément du conteneur const-qualifié. Cet élément sert de repère ; tenter d'y accéder entraîne un comportement indéfini. |
| [get_Count](./get_count/)() const | Obtient le nombre d'éléments dans la collection. |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur parcourant la collection actuelle. |
| [idx_get](./idx_get/)(int) const | Obtient la valeur à la position spécifiée. |
| [idx_set](./idx_set/)(int, const System::String\&) | Définit la valeur à la position spécifiée. |
| [IndexOf](./indexof/)(const System::String\&) const | Recherche une chaîne spécifique dans le conteneur. |
| [Insert](./insert/)(int, const System::String\&) | Insère une valeur spécifique dans le conteneur. |
| [operator[]](./operator[]/)(int) | Fonction d'accès. |
| [rbegin](./rbegin/)() | Renvoie un itérateur inverse vers le premier élément du conteneur inversé. Il correspond au dernier élément du conteneur non inversé. Si le conteneur est vide, l'itérateur retourné est égal à [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Renvoie un itérateur inverse vers le premier élément du conteneur inversé. Il correspond au dernier élément du conteneur non inversé. Si le conteneur est vide, l'itérateur retourné est égal à [rend()](./rend/). |
| [Remove](./remove/)(const System::String\&) | Supprime la première occurrence de la chaîne spécifiée. |
| [RemoveAt](./removeat/)(int) | Supprime l'élément à la position spécifiée. |
| [rend](./rend/)() | Renvoie un itérateur inverse vers l'élément suivant le dernier élément du conteneur inversé. Il correspond à l'élément précédant le premier élément du conteneur non inversé. Cet élément sert de repère, tenter d'y accéder entraîne un comportement indéfini. |
| [rend](./rend/)() const | Renvoie un itérateur inverse vers l'élément suivant le dernier élément du conteneur inversé. Il correspond à l'élément précédant le premier élément du conteneur non inversé. Cet élément sert de repère, tenter d'y accéder entraîne un comportement indéfini. |
| [StringCollection](./stringcollection/)() | Construit une collection de chaînes vide. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [const_iterator](./const_iterator/) | Type d'itérateur const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Type d'itérateur inverse const. |
| [iterator](./iterator/) | Type d'itérateur. |
| [reverse_iterator](./reverse_iterator/) | Type d'itérateur inverse. |
## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
