---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect method"
linktitle: "连接"
second_title: "Aspose.Font 适用于 C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect 方法。在 C++ 中将指定的委托添加到集合中。"
type: docs
weight: 400
url: /zh/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


将指定的委托添加到集合中。

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 回调 | Callback | 要添加到集合的委托 |

### ReturnValue

对自身的引用

## 另见

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


将指定对象的指定非静态方法添加到委托集合中。

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| 参数 | 描述 |
| --- | --- |
| MemberType | 要添加到委托集合的非静态方法的类型 |
| ClassType | 要添加到委托的对象方法的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 成员 | MemberType ClassType::* | 指向指定对象的非静态方法的指针 |
| obj | ClassType * | 要添加到委托集合的对象成员方法的指针 |

### ReturnValue

对自身的引用

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


将指定对象的指定非静态方法添加到委托集合中。

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| 参数 | 描述 |
| --- | --- |
| MemberType | 要添加到委托集合的非静态方法的类型 |
| ClassType | 要添加到委托集合的对象方法的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 成员 | MemberType ClassType::* | 指向指定对象的非静态方法的指针 |
| obj | const SharedPtr\<ClassType\>\& | 要添加到委托集合的对象成员方法的共享指针 |

### ReturnValue

对自身的引用

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


将指定的 MulticastDelegate 对象添加到委托集合中。

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 其他 | MulticastDelegate\\& | 要添加到委托集合的 MulticastDelegate 类实例 |

### ReturnValue

对自身的引用

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


将指定的函数对象添加到委托集合中。函数对象在添加到集合之前会被转换为 [Callback](../callback/) 委托类型。

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| 参数 | 描述 |
| --- | --- |
| R | 要添加到集合的函数对象的返回类型 |
| 参数 | 要添加到集合的函数对象的参数列表 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | 要添加到集合的函数对象 |

### ReturnValue

对自身的引用

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
