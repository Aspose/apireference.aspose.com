---
title: "méthode System::StaticCastArray"
linktitle: "StaticCastArray"
second_title: "Aspose.Font pour C++"
description: "méthode System::StaticCastArray. Effectue le transtypage des éléments du tableau spécifié vers un type différent. Surcharge pour les cas où From est un objet SmartPtr en C++."
type: docs
weight: 39900
url: /fr/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Effectue le transtypage des éléments du tableau spécifié vers un type différent. Surcharge pour les cas où From est un objet [SmartPtr](../smartptr/).

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Paramètre | Description |
| --- | --- |
| To | Le type vers lequel caster les éléments du tableau spécifié |
| From | Le type des éléments du tableau dont les éléments doivent être castés |

| Paramètre | Type | Description |
| --- | --- | --- |
| de | const System::SharedPtr\<System::Array\<From\>\>\& | Pointeur partagé vers le tableau contenant les éléments à caster |

### ReturnValue

Un pointeur vers un nouveau tableau contenant des éléments de type **To** équivalents aux éléments de **from**

## Deprecated
Ajouté pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Effectue le cast des éléments du tableau spécifié vers un type différent. Surcharge pour les cas où From est Boxable et To est [Object](../object/)[].

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Paramètre | Description |
| --- | --- |
| To | Le type vers lequel caster les éléments du tableau spécifié |
| From | Le type des éléments du tableau dont les éléments doivent être castés |

| Paramètre | Type | Description |
| --- | --- | --- |
| de | const System::SharedPtr\<System::Array\<From\>\>\& | Pointeur partagé vers le tableau contenant les éléments à caster |

### ReturnValue

Un pointeur vers un nouveau tableau contenant des éléments de type **To** équivalents aux éléments de **from**

## Deprecated
Ajouté pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
