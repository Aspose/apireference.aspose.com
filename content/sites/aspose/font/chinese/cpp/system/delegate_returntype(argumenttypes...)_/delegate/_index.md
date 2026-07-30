---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate 方法"
linktitle: "Delegate"
second_title: "Aspose.Font 适用于 C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate 方法。默认构造函数。构造一个在 C++ 中不指向任何对象的委托对象。"
type: docs
weight: 100
url: /zh/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


默认构造函数。构造一个不指向任何对象的委托对象。

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## 另见

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## 另见

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


移动拷贝构造函数。获取指定委托所指向实体的所有权。

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| o | Delegate\\&& | 要从中移动指向实体的 Delegate 对象 |

## 另见

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


构造函数。从指定的函数对象构造委托。

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| 参数 | 描述 |
| --- | --- |
| T | 构造函数接受的函数对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| functor_tag | int | 一个虚拟整数值；此参数用于消除歧义 |
| functor | T\& | 一个函数对象，供新构造的委托指向 |

## 另见

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


移动构造函数。从指定的函数对象构造委托。

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| 参数 | 描述 |
| --- | --- |
| T | 构造函数接受的函数对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| functor_tag | long | 一个虚拟整数值；此参数用于消除歧义 |
| functor | T\&& | 一个函数对象，供新构造的委托指向 |

## 另见

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


构造函数。构造一个指向指定对象的指定非静态方法的委托。

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| 参数 | 描述 |
| --- | --- |
| MemberType | 构造函数接受的非静态方法的类型 |
| ClassType | 构造函数接受的对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 成员 | MemberType ClassType::* | 指向新创建的委托将指向的非静态方法的指针 |
| obj | ClassType * | 指向对象成员方法的指针，该方法将被新创建的委托指向 |

## 另见

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


构造函数。构造一个指向指定对象的指定非静态方法的委托。

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| 参数 | 描述 |
| --- | --- |
| MemberType | 构造函数接受的非静态方法的类型 |
| ClassType | 构造函数接受的对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 成员 | MemberType MemberClass::* | 指向新创建的委托将指向的非静态方法的指针 |
| obj | const SharedPtr\<ClassType\>\& | 一个共享指针，指向对象成员方法，该方法将被新创建的委托指向 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


构造一个指向 std::function 函数对象的委托对象。

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| 参数 | 描述 |
| --- | --- |
| R | 构造函数接受的函数对象的返回类型 |
| 参数 | 构造函数接受的函数对象的参数列表 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | 一个函数对象，将被新创建的委托对象指向 |

## 另见

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


构造函数。从由 std::bind() 生成的函数对象指针构造委托。

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| 参数 | 描述 |
| --- | --- |
| 该 | 构造函数接受的由 std::bind() 生成的函数对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 函数 | T | 指向 "bind expression"（由 std::bind() 生成的函数指针）的指针，该指针将被新创建的 Delegate 实例指向 |

## 另见

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


构造函数。从指定的指向自由函数或静态方法的指针构造委托对象。

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| 参数 | 描述 |
| --- | --- |
| 该 | 构造函数接受的函数或静态方法指针的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 函数 | T | 指向函数或静态方法的指针，该指针将被新创建的 Delegate 实例指向 |

## 另见

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
