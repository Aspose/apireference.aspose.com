---
title: "System::Collections::Generic::BaseKVCollection classe"
linktitle: "BaseKVCollection"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::BaseKVCollection classe. Contient le code commun pour les collections de clés ou de valeurs. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


Contient le code commun pour les collections de clés ou de valeurs. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++.

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| Paramètre | Description |
| --- | --- |
| Dict | [Dictionary](../dictionary/) type. |
| KV | Type de clé ou de valeur, selon l'interface utilisée. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | Crée une collection. |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | Copie les données dans les éléments existants du tableau. |
| [get_Count](./get_count/)() const override | Obtient le nombre d'éléments. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Permet la compilation, mais ne fait rien réellement car cette structure ne possède pas de données. |

## Voir aussi

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
