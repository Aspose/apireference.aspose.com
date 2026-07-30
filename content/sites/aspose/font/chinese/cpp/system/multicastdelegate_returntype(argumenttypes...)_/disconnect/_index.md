---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect 方法"
linktitle: "disconnect"
second_title: "Aspose.Font 适用于 C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect 方法。在 C++ 中从委托集合中移除指定的委托。"
type: docs
weight: 500
url: /zh/cpp/system/multicastdelegate_returntype(argumenttypes...)_/disconnect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(Callback) method


从委托集合中移除指定的委托。

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(Callback callback)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 回调 | Callback | 要从集合中删除的委托 |

### ReturnValue

对自身的引用

## 另见

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, ClassType *) method


从委托集合中移除指定对象的指定非静态方法。

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, ClassType *obj)
```


| 参数 | 描述 |
| --- | --- |
| MemberType | 要从委托集合中移除的非静态方法的类型 |
| ClassType | 要从委托集合中移除的对象方法的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 成员 | MemberType ClassType::* | 指向指定对象的非静态方法的指针 |
| obj | ClassType * | 指向要从委托集合中移除的对象成员方法的指针 |

### ReturnValue

对自身的引用

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


从委托集合中移除指定对象的指定非静态方法。

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| 参数 | 描述 |
| --- | --- |
| MemberType | 要从委托集合中移除的非静态方法的类型 |
| ClassType | 要从委托集合中移除的对象方法的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 成员 | MemberType ClassType::* | 指向指定对象的非静态方法的指针 |
| obj | const SharedPtr\<ClassType\>\& | 指向要从委托集合中移除的对象成员方法的共享指针 |

### ReturnValue

对自身的引用

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate\&) method


从委托集合中移除指定的 MulticastDelegate 对象。

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate &other)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 其他 | MulticastDelegate\\& | 要从委托集合中移除的 MulticastDelegate 类的实例 |

### ReturnValue

对自身的引用

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
