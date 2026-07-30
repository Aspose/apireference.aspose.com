---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect méthode"
linktitle: "connecter"
second_title: "Aspose.Font pour C++"
description: "Méthode System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect. Ajoute le délégué spécifié à la collection en C++."
type: docs
weight: 400
url: /fr/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


Ajoute le délégué spécifié à la collection.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rappel | Callback | Le délégué à ajouter à la collection |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


Ajoute la méthode non statique spécifiée de l'objet spécifié à la collection de délégués.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| Paramètre | Description |
| --- | --- |
| MemberType | Le type de la méthode non statique qui doit être ajoutée à la collection de délégués |
| ClassType | Le type de la méthode d'objet qui doit être ajoutée au délégué |

| Paramètre | Type | Description |
| --- | --- | --- |
| membre | MemberType ClassType::* | Un pointeur vers la méthode non statique de l'objet spécifié |
| obj | ClassType * | Un pointeur vers une méthode membre d'objet qui doit être ajoutée à la collection de délégués |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Ajoute la méthode non statique spécifiée de l'objet spécifié à la collection de délégués.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Paramètre | Description |
| --- | --- |
| MemberType | Le type de la méthode non statique qui doit être ajoutée à la collection de délégués |
| ClassType | Le type de la méthode d'objet qui doit être ajoutée à la collection de délégués |

| Paramètre | Type | Description |
| --- | --- | --- |
| membre | MemberType ClassType::* | Un pointeur vers la méthode non statique de l'objet spécifié |
| obj | const SharedPtr\<ClassType\>\& | Un pointeur partagé vers une méthode membre d'objet qui doit être ajoutée à la collection de délégués |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


Ajoute l'objet MulticastDelegate spécifié à la collection de délégués.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| autre | MulticastDelegate\& | Une instance de la classe MulticastDelegate à ajouter à la collection de délégués |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


Ajoute l'objet fonction spécifié à la collection de délégués. L'objet fonction est converti en type de délégué [Callback](../callback/) avant d'être ajouté à la collection.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| Paramètre | Description |
| --- | --- |
| R | Le type de retour de l'objet fonction à ajouter à la collection |
| Args | La liste d'arguments de l'objet fonction à ajouter à la collection |

| Paramètre | Type | Description |
| --- | --- | --- |
| f | std::function\<R(Args...)> | L'objet fonction à ajouter à la collection |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
