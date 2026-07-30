---
title: "Méthode System::ExplicitCast"
linktitle: "ExplicitCast"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ExplicitCast. Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé lorsque le type source et le type résultat sont identiques en C++."
type: docs
weight: 18600
url: /fr/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé lorsque le type source et le type résultat sont identiques.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé lorsqu'une conversion simple de type constructeur est nécessaire.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé pour les enveloppes d'exception.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé pour convertir un objet en exception.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé lorsque la source et le résultat sont tous deux des pointeurs intelligents (sans [SmartPtr<...>](../smartptr/) explicite dans le type résultat).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé lorsque la source et le résultat sont tous deux des pointeurs intelligents (avec [SmartPtr<...>](../smartptr/) explicite dans le type résultat).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé pour désencapsuler un objet en nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé pour encapsuler un nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé pour désencapsuler un objet nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé pour l'encapsulation d'énumération.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé pour copier des types valeur sur le tas lorsque le type valeur doit être référencé comme pointeur intelligent (dans les génériques contraints par un type d'interface mais spécialisés avec une structure implémentant cette interface).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé pour obtenir des interfaces à partir de types valeur.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant une conversion explicite. Utilisé pour l'encapsulation courante.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant un cast explicite. Utilisé pour le boxing de [System::String](../string/).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant un cast explicite. Utilisé pour le déboxing des interfaces.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant un cast explicite. Utilisé pour le déboxing commun.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant un cast explicite. Utilisé pour le cast de nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Convertit le type source en type résultat en utilisant un cast explicite. Utilisé pour le cast entre tableaux.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(Source) method


Convertit le type source en type résultat en utilisant un cast explicite. Utilisé lors du cast d'un pointeur brut vers un pointeur intelligent.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | Source | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
