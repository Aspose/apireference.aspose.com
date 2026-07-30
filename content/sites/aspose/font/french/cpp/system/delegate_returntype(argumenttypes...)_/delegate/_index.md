---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate méthode"
linktitle: "Délégué"
second_title: "Aspose.Font pour C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate méthode. Constructeur par défaut. Construit l'objet délégué qui ne pointe vers rien en C++."
type: docs
weight: 100
url: /fr/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


Constructeur par défaut. Construit l'objet delegate qui ne pointe vers rien.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## Voir aussi

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## Voir aussi

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


Constructeur de copie en déplacement. Prend la possession d'une entité pointée par le delegate spécifié.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Paramètre | Type | Description |
| --- | --- | --- |
| o | Delegate\&& | L'objet Delegate dont il faut déplacer l'entité pointée |

## Voir aussi

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


Constructeur. Construit un delegate à partir de l'objet fonction spécifié.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Paramètre | Description |
| --- | --- |
| T | Le type de l'objet fonction accepté par le constructeur comme argument |

| Paramètre | Type | Description |
| --- | --- | --- |
| functor_tag | int | Une valeur entière factice ; cet argument est utilisé pour résoudre l'ambiguïté |
| functor | T\& | Un objet fonction vers lequel le délégué nouvellement construit pointera |

## Voir aussi

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


Constructeur en déplacement. Construit un delegate à partir de l'objet fonction spécifié.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Paramètre | Description |
| --- | --- |
| T | Le type de l'objet fonction accepté par le constructeur comme argument |

| Paramètre | Type | Description |
| --- | --- | --- |
| functor_tag | long | Une valeur entière factice ; cet argument est utilisé pour résoudre l'ambiguïté |
| functor | T\\&& | Un objet fonction vers lequel le délégué nouvellement construit pointera |

## Voir aussi

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


Constructeur. Construit un delegate qui pointe vers la méthode non statique spécifiée de l'objet spécifié.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Paramètre | Description |
| --- | --- |
| MemberType | Le type de la méthode non statique que le constructeur accepte comme argument |
| ClassType | Le type de l'objet accepté par le constructeur comme argument |

| Paramètre | Type | Description |
| --- | --- | --- |
| membre | MemberType ClassType::* | Un pointeur vers la méthode non statique que le délégué nouvellement créé pointera |
| obj | ClassType * | Un pointeur vers une méthode membre d'objet qui sera pointée par le délégué nouvellement créé |

## Voir aussi

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


Constructeur. Construit un delegate qui pointe vers la méthode non statique spécifiée de l'objet spécifié.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Paramètre | Description |
| --- | --- |
| MemberType | Le type de la méthode non statique que le constructeur accepte comme argument |
| ClassType | Le type de l'objet accepté par le constructeur comme argument |

| Paramètre | Type | Description |
| --- | --- | --- |
| membre | MemberType MemberClass::* | Un pointeur vers la méthode non statique que le délégué nouvellement créé pointera |
| obj | const SharedPtr\<ClassType\>\& | Un pointeur fragmenté vers une méthode membre d'objet qui sera pointé par le délégué nouvellement créé |

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


Construit un objet delegate qui pointe vers un objet fonction std::function.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Paramètre | Description |
| --- | --- |
| R | Le type de retour de l'objet fonction accepté par le constructeur comme argument |
| Args | La liste d'arguments de l'objet fonction accepté par le constructeur comme argument |

| Paramètre | Type | Description |
| --- | --- | --- |
| f | std::function\<R(Args...)> | Un objet fonction qui sera pointé par le nouvel objet délégué |

## Voir aussi

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


Constructeur. Construit un delegate à partir du pointeur spécifié vers l'objet fonction généré par std::bind().

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Paramètre | Description |
| --- | --- |
| Le | type de l'objet fonction généré par std::bind() accepté par le constructeur comme argument |

| Paramètre | Type | Description |
| --- | --- | --- |
| fonction | T | Pointeur vers une \"bind expression\" - un pointeur de fonction généré par std::bind() - qui sera pointé par l'instance Delegate nouvellement créée |

## Voir aussi

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


Constructeur. Construit un objet delegate à partir du pointeur spécifié vers une fonction libre ou une méthode statique.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Paramètre | Description |
| --- | --- |
| Le | type du pointeur de fonction ou de méthode statique accepté par le constructeur comme argument |

| Paramètre | Type | Description |
| --- | --- | --- |
| fonction | T | Pointeur vers une fonction ou une méthode statique qui sera pointé par l'instance Delegate nouvellement créée |

## Voir aussi

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
