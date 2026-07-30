---
title: "System::Collections::Generic::KeyValuePair classe"
linktitle: "KeyValuePair"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::KeyValuePair. Paire de clé et de valeur. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 2900
url: /fr/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


Paire de clé et de valeur. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../../system/smartptr/) pour gérer les objets de ce type.

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Key](./get_key/)() const | Obtient la clé. |
| [get_Value](./get_value/)() const | Obtient la valeur. |
| [GetHashCode](./gethashcode/)() const | Calcule le hachage de la paire clé-valeur en appliquant un XOR aux hachages de la clé et de la valeur. |
| [IsNull](./isnull/)() const | Retourne toujours false. |
| [KeyValuePair](./keyvaluepair/)() | Initialiseur de paire clé-valeur nulle. |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | Constructeur. |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | Constructeur de conversion de type. |
| [operator<](./operator_/)(const KeyValuePair\&) const | Correctif pour les classes héritées de [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/), ne compare rien. |
| [ToString](./tostring/)() const | Convertit la paire clé-valeur en chaîne. |

## Voir aussi

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
