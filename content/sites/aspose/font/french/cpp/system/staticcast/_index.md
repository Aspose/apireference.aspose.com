---
title: "Méthode System::StaticCast"
linktitle: "StaticCast"
second_title: "Aspose.Font pour C++"
description: "Méthode System::StaticCast. Effectue un cast statique sur des objets non pointeurs en C++."
type: docs
weight: 38600
url: /fr/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


Effectue un cast statique sur des objets non pointeurs.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type cible. |
| TFrom | Type source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const TFrom\& | Objet source. |

### ReturnValue

Résultat du cast si le cast est autorisé.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(const TFrom\&) method


Effectue un cast statique sur les objets [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type [Exception](../exception/) cible. |
| TFrom | Type [Exception](../exception/) source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const TFrom\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(const TFrom *) method


Spécialisation pour les types arithmétiques.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


Effectue un cast statique sur les objets [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type du pointeur cible. |
| TFrom | Type du pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\>) method


Effectue un cast statique sur les Objets vers des objets [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
```


| Paramètre | Description |
| --- | --- |
| TTo | Type [Exception](../exception/) cible. |
| TFrom | type [Object](../object/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(std::nullptr_t) method


Effectue un cast statique d'objets null.

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type du pointeur cible. |

### ReturnValue

nullptr.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(TFrom) method


Spécialisation pour les types arithmétiques.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(TTo) method


Effectuer le cast de [String](../string/) vers [String](../string/).

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## Voir aussi

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


Effectue un cast statique sur les objets [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type du pointeur cible. |
| TFrom | Type du pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
