---
title: "System::Collections::Generic::operator== méthode"
linktitle: "operator=="
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::operator== méthode. Compare deux paires clé-valeur en utilisant la sémantique ''equals''. Utilise l'opérateur == ou la méthode EqualsTo pour les clés et les valeurs, selon ce qui est défini en C++."
type: docs
weight: 5600
url: /fr/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


Compare deux paires clé-valeur en utilisant la sémantique 'equals'. Utilise l'opérateur == ou la méthode EqualsTo pour les clés et les valeurs, selon ce qui est défini.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| Paramètre | Description |
| --- | --- |
| TKey | Type de clé. |
| TValue | Type valeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| gauche | const KeyValuePair\<TKey, TValue\>\& | Opérande LHS. |
| droite | const KeyValuePair\<TKey, TValue\>\& | Opérande RHS. |

### ReturnValue

Vrai si les deux clés et valeurs correspondent, faux sinon.

## Voir aussi

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
