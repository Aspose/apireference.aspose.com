---
title: "Méthode System::Ref"
linktitle: "Ref"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Ref. Wrapper pour s'assurer que Ref(std::ref(DynamicWeakPtr)) fonctionne en C++."
type: docs
weight: 36700
url: /fr/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Wrapper pour s'assurer que Ref(std::ref(DynamicWeakPtr)) fonctionne.

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Paramètre | Description |
| --- | --- |
| T | Type référencé. |

| Paramètre | Type | Description |
| --- | --- | --- |
| enveloppe | const std::reference_wrapper\<T\>\& | wrapper std pour désenvelopper. |

### ReturnValue

Type de référence défini dans [System](../):: plutôt que dans std.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


Crée une référence à l'objet [DynamicWeakPtr](../dynamicweakptr/). Utilisé par le traducteur lors du passage d'arguments de fonction par référence.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Paramètre | Description |
| --- | --- |
| T | Type pointeur. |
| trunkMode | Mode du pointeur intelligent lui-même. |
| weakLeafs | Indices des arguments de modèle pour lesquels la méthode SetTemplateWeakPtr doit être appelée. |

| Paramètre | Type | Description |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | Pointeur intelligent pour créer une référence à. |

### ReturnValue

Référence du pointeur intelligent.

## Voir aussi

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(T\&) method


Fonction d'aide pour acquérir des références aux objets. Utilisée pour garantir que [System::DynamicWeakPtr](../dynamicweakptr/) met à jour l'objet référencé après les affectations.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Paramètre | Description |
| --- | --- |
| T | Type pour créer une référence à. |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | T\& | Valeur pour créer une référence à. |

### ReturnValue

Référence à la valeur passée à cette fonction.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
