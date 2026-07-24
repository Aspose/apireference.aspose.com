---
title: "Méthode System::DynamicCast"
linktitle: "DynamicCast"
second_title: "Aspose.Page pour C++"
description: "Méthode System::DynamicCast. Effectue un cast dynamique sur les objets Exception en C++."
type: docs
weight: 16900
url: /fr/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


Effectue un cast dynamique sur les objets [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type cible [Exception](../exception/). |
| TFrom | Type source [Exception](../exception/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const TFrom\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


Effectue un cast dynamique sur les objets [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type pointeur cible. |
| TFrom | Type pointeur source. |

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
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Décompacte l'énumération encapsulée via un cast.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type d'énumération cible. |
| TFrom | Type pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Pointeur vers l'objet dont les données doivent être décompactées. |

### ReturnValue

Valeur d'énumération décompactée.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Effectue un cast dynamique d'objets vers les objets [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type cible [Exception](../exception/). |
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
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(std::nullptr_t) method


Effectue un cast dynamique d'objets nuls.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
```


| Paramètre | Description |
| --- | --- |
| TTo | Type pointeur cible. |

### ReturnValue

nullptr.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom\&) method


Effectue un cast dynamique sur des objets non pointeurs.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type cible. |
| TFrom | Type source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | TFrom\& | Objet source. |

### ReturnValue

Résultat du cast.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom) method


Effectue un cast dynamique de IntPtr vers un pointeur.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| Paramètre | Description |
| --- | --- |
| TTo | Type cible. |
| TFrom | Type source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | TFrom | Valeur IntPtr source. |

### ReturnValue

Résultat du cast.

## Deprecated
Conservé pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
