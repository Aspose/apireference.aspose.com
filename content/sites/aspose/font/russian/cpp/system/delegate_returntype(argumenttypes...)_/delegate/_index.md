---
title: "Метод System::Delegate< ReturnType(ArgumentTypes...)>::Delegate"
linktitle: "Delegate"
second_title: "Aspose.Font для C++"
description: "Метод System::Delegate< ReturnType(ArgumentTypes...)>::Delegate. Конструктор по умолчанию. Создаёт объект delegate, который не указывает ни на что в C++."
type: docs
weight: 100
url: /ru/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


Конструктор по умолчанию. Создает объект делегата, который не указывает ни на что.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## См. также

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## См. также

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


Перемещающий копирующий конструктор. Перенимает владение сущностью, на которую указывает указанный делегат.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| o | Delegate\&& | Объект Delegate, из которого перемещается указываемая сущность |

## См. также

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


Конструктор. Создает делегат из указанного функционального объекта.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объект‑функции, принимаемый конструктором в качестве аргумента |

| Параметр | Тип | Описание |
| --- | --- | --- |
| functor_tag | int | Фиктивное целочисленное значение; этот аргумент используется для разрешения неоднозначности |
| functor | T\& | Функциональный объект, на который будет указывать вновь созданный делегат |

## См. также

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


Перемещающий конструктор. Создает делегат из указанного функционального объекта.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объект‑функции, принимаемый конструктором в качестве аргумента |

| Параметр | Тип | Описание |
| --- | --- | --- |
| functor_tag | long | Фиктивное целочисленное значение; этот аргумент используется для разрешения неоднозначности |
| functor | T\&& | Функциональный объект, на который будет указывать вновь созданный делегат |

## См. также

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


Конструктор. Создает делегат, указывающий на указанный нестатический метод указанного объекта.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Параметр | Описание |
| --- | --- |
| MemberType | Тип нестатического метода, который конструктор принимает в качестве аргумента |
| ClassType | Тип объекта, принимаемого конструктором в качестве аргумента |

| Параметр | Тип | Описание |
| --- | --- | --- |
| член | MemberType ClassType::* | Указатель на нестатический метод, на который будет указывать вновь созданный делегат |
| obj | ClassType * | Указатель на метод-член объекта, на который будет указывать вновь созданный делегат |

## См. также

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


Конструктор. Создает делегат, указывающий на указанный нестатический метод указанного объекта.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Параметр | Описание |
| --- | --- |
| MemberType | Тип нестатического метода, который конструктор принимает в качестве аргумента |
| ClassType | Тип объекта, принимаемого конструктором в качестве аргумента |

| Параметр | Тип | Описание |
| --- | --- | --- |
| член | MemberType MemberClass::* | Указатель на нестатический метод, на который будет указывать вновь созданный делегат |
| obj | const SharedPtr\<ClassType\>\& | Указатель shared на метод-член объекта, на который будет указывать вновь созданный делегат |

## См. также

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


Создает объект делегата, указывающий на объект функции std::function.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Параметр | Описание |
| --- | --- |
| R | Тип возвращаемого значения функционального объекта, принимаемого конструктором в качестве аргумента |
| Аргументы | Список аргументов функционального объекта, принимаемого конструктором в качестве аргумента |

| Параметр | Тип | Описание |
| --- | --- | --- |
| f | std::function\<R(Args...)> | Функциональный объект, на который будет указывать вновь созданный объект делегата |

## См. также

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


Конструктор. Создает делегат из указанного указателя на объект функции, сгенерированный std::bind().

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Параметр | Описание |
| --- | --- |
| Эта | Тип функционального объекта, сгенерированного std::bind(), принимаемого конструктором в качестве аргумента |

| Параметр | Тип | Описание |
| --- | --- | --- |
| функция | T | Указатель на "bind expression" — указатель на функцию, сгенерированный std::bind(), на который будет указывать вновь созданный экземпляр Delegate |

## См. также

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


Конструктор. Создает объект делегата из указанного указателя на свободную функцию или статический метод.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Параметр | Описание |
| --- | --- |
| Эта | Тип указателя на функцию или статический метод, принимаемого конструктором в качестве аргумента |

| Параметр | Тип | Описание |
| --- | --- | --- |
| функция | T | Указатель на функцию или статический метод, на который будет указывать вновь созданный экземпляр Delegate |

## См. также

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
