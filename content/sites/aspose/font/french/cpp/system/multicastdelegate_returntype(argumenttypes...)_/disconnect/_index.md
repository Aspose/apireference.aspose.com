---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect méthode"
linktitle: "disconnect"
second_title: "Aspose.Font pour C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect méthode. Supprime le délégué spécifié de la collection de délégués en C++."
type: docs
weight: 500
url: /fr/cpp/system/multicastdelegate_returntype(argumenttypes...)_/disconnect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(Callback) method


Supprime le délégué spécifié de la collection de délégués.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(Callback callback)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rappel | Callback | Le délégué à supprimer de la collection |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, ClassType *) method


Supprime la méthode non statique spécifiée de l'objet spécifié de la collection de délégués.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, ClassType *obj)
```


| Paramètre | Description |
| --- | --- |
| MemberType | Le type de la méthode non statique qui doit être supprimée de la collection de délégués |
| ClassType | Le type de la méthode d'objet qui doit être supprimée de la collection de délégués |

| Paramètre | Type | Description |
| --- | --- | --- |
| membre | MemberType ClassType::* | Un pointeur vers la méthode non statique de l'objet spécifié |
| obj | ClassType * | Un pointeur vers une méthode membre d'objet qui doit être supprimée de la collection de délégués |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Supprime la méthode non statique spécifiée de l'objet spécifié de la collection de délégués.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Paramètre | Description |
| --- | --- |
| MemberType | Le type de la méthode non statique qui doit être supprimée de la collection de délégués |
| ClassType | Le type de la méthode d'objet qui doit être supprimée de la collection de délégués |

| Paramètre | Type | Description |
| --- | --- | --- |
| membre | MemberType ClassType::* | Un pointeur vers la méthode non statique de l'objet spécifié |
| obj | const SharedPtr\<ClassType\>\& | Un pointeur partagé vers une méthode membre d'objet qui doit être supprimée de la collection de délégués |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate\&) method


Supprime l'objet MulticastDelegate spécifié de la collection de délégués.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate &other)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| autre | MulticastDelegate\& | Une instance de la classe MulticastDelegate à supprimer de la collection de délégués |

### ReturnValue

Une référence à l'objet lui-même

## Voir aussi

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
