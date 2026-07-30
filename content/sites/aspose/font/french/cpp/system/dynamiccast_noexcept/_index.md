---
title: "Méthode System::DynamicCast_noexcept"
linktitle: "DynamicCast_noexcept"
second_title: "Aspose.Font pour C++"
description: "Méthode System::DynamicCast_noexcept. Anciennes conversions obsolètes. Sera supprimée dans les futures versions en C++."
type: docs
weight: 17700
url: /fr/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


Anciennes conversions obsolètes. Sera supprimées dans les futures versions.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| Paramètre | Description |
| --- | --- |
| TTo | Type [Exception](../exception/) cible. |
| TFrom | Type [Exception](../exception/) source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const TFrom\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé, sinon nullptr.
## Remarques


Effectue un cast dynamique sur les objets [Exception](../exception/). ## Déprécié
Conservé pour la compatibilité ascendante. Utilisez AsCast à la place.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


Effectue un cast dynamique sur les objets [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
```


| Paramètre | Description |
| --- | --- |
| TTo | Type du pointeur cible. |
| TFrom | Type du pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé, sinon nullptr.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez AsCast à la place.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


Effectue un cast dynamique d'objets vers des objets [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Paramètre | Description |
| --- | --- |
| TTo | Type [Exception](../exception/) cible. |
| TFrom | type [Object](../object/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé, sinon nullptr.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez AsCast à la place.

## Voir aussi

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
