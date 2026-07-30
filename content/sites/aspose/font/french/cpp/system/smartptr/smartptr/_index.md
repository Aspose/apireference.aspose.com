---
title: "Constructeur System::SmartPtr::SmartPtr"
linktitle: "SmartPtr"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::SmartPtr::SmartPtr. Convertit le type du tableau référencé en créant un nouveau tableau d’un type différent. Utile si en C# il existe un cast de tableau qui n’est pas supporté en C++."
type: docs
weight: 100
url: /fr/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


Convertit le type du tableau référencé en créant un nouveau tableau d'un type différent. Utile si, en C#, il existe un transtypage de tableau qui n'est pas supporté en C++.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Paramètre | Description |
| --- | --- |
| Y | Type du tableau source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | Pointeur vers le tableau à copier, mais avec un type d’éléments différent. |
| mode | SmartPtrMode | Mode du pointeur. |

## Voir aussi

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


Construit un [SmartPtr](../) qui partage les informations de propriété avec la valeur initiale de ptr, mais détient un pointeur p non lié et non géré.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | Un autre pointeur intelligent pour partager la propriété avec celui d’origine. |
| p | Pointee_ * | Pointeur vers un objet à gérer. |
| mode | SmartPtrMode | Mode du pointeur. |

## Voir aussi

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


La copie construit un objet [SmartPtr](../). Les deux pointeurs pointent vers le même objet par la suite. Effectue la conversion de type si autorisée.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Paramètre | Description |
| --- | --- |
| Q | Type de l’objet pointé par x. |

| Paramètre | Type | Description |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Pointeur à copier. |
| mode | SmartPtrMode | Mode du pointeur. |

## Voir aussi

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


La copie construit un objet [SmartPtr](../). Les deux pointeurs pointent vers le même objet par la suite.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ptr | const SmartPtr_\& | Pointeur à copier. |
| mode | SmartPtrMode | Mode du pointeur. |

## Voir aussi

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


Initialise un tableau vide. Utilisé pour traduire certaines constructions de code C#.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| Paramètre | Description |
| --- | --- |
| Y | Espace réservé du type EmptyArrayInitializer. |

## Voir aussi

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


Crée un [SmartPtr](../) pointant vers l'objet spécifié, ou convertit un pointeur brut en [SmartPtr](../).

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| objet | Pointee_ * | Pointee. |
| mode | SmartPtrMode | Mode du pointeur. |

## Voir aussi

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


Le déplacement construit un objet [SmartPtr](../). En pratique, échange deux pointeurs, s'ils sont tous deux du même mode. x peut devenir inutilisable après l'appel.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| Paramètre | Type | Description |
| --- | --- | --- |
| x | SmartPtr_\&& | Pointeur à déplacer. |
| mode | SmartPtrMode | Mode du pointeur. |

## Voir aussi

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


Crée un objet [SmartPtr](../) du mode requis.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| mode | SmartPtrMode | Mode du pointeur. |

## Voir aussi

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


Crée un objet [SmartPtr](../) nul du mode requis.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| mode | std::nullptr_t | Mode du pointeur. |

## Voir aussi

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
