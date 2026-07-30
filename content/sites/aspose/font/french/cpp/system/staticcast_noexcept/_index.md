---
title: "méthode System::StaticCast_noexcept"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Font pour C++"
description: "méthode System::StaticCast_noexcept. Effectue un cast statique sur les objets Exception en C++."
type: docs
weight: 39500
url: /fr/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


Effectue un cast statique sur les objets [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
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

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez AsCast à la place.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


Effectue un cast statique sur les objets [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
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
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Effectue un cast statique sur les Objets vers des objets [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


Effectue un cast statique sur les objets [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type du pointeur cible. |
| TFrom | Type du pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé, sinon nullptr.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez AsCast à la place.

## Voir aussi

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
