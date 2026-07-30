---
title: "Méthode System::AsCast"
linktitle: "AsCast"
second_title: "Aspose.Font pour C++"
description: "Méthode System::AsCast. Convertit le type source en type résultat en utilisant le cast d'opérateur ''as''. Utilisé lorsque un cast simple de type constructeur est nécessaire en C++."
type: docs
weight: 13600
url: /fr/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé lorsque un cast simple de type constructeur est nécessaire.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé lorsque le type source et le type résultat sont identiques.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé pour les enveloppes d'exception.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast. Retourne nullptr si aucune conversion n'est disponible.

## Voir aussi

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé pour convertir un objet en exception.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast. Retourne nullptr si aucune conversion n'est disponible.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé lorsque le source et le résultat sont tous deux des pointeurs intelligents.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast. Retourne nullptr si aucune conversion n'est disponible.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé lorsque le source et le résultat sont tous deux des pointeurs intelligents (avec expicit [SmartPtr<...>](../smartptr/) explicite dans le type résultat).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast. Retourne nullptr si aucune conversion n'est disponible.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé pour le déballage d'un objet vers nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast. Retourne un nullable vide si aucune conversion n'est disponible.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Déballage invalide vers un type non-objet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Retourne toujours null.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Déballage invalide vers un type non-objet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Retourne toujours null.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé pour l'encapsulation d'un objet nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé pour l'encapsulation d'un objet commun.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé pour l'encapsulation d'un objet commun.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé pour le déballage d'une chaîne.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Convertit le type source en type résultat en utilisant le cast d'opérateur 'as'. Utilisé pour le cas de nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Convertit le type source en le type résultat en utilisant le cast avec l'opérateur 'as'. Utilisé pour caster entre tableaux.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Paramètre | Description |
| --- | --- |
| Source | Le type source. |
| Résultat | Le type résultat. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) à convertir. |

### ReturnValue

Le résultat du cast. Retourne nullptr si aucune conversion n'est disponible pour un élément du tableau.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
