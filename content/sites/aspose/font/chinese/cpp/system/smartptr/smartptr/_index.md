---
title: "System::SmartPtr::SmartPtr 构造函数"
linktitle: "SmartPtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::SmartPtr::SmartPtr 构造函数。通过创建不同类型的新数组来转换引用数组的类型。如果在 C# 中存在 C++ 不支持的数组类型转换，则此功能很有用。"
type: docs
weight: 100
url: /zh/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


通过创建不同类型的新数组来转换被引用数组的类型。如果在 C# 中存在 C++ 不支持的数组类型转换，这将非常有用。

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 参数 | 描述 |
| --- | --- |
| Y | 源数组的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | 指向要创建副本的数组指针，但元素类型不同。 |
| mode | SmartPtrMode | 指针模式。 |

## 另见

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


构造一个 [SmartPtr](../)，它与 ptr 的初始值共享所有权信息，但持有一个不相关且未受管理的指针 p。

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | 另一个智能指针，用于共享该指针的所有权。 |
| p | Pointee_ * | 指向要管理的对象的指针。 |
| mode | SmartPtrMode | 指针模式。 |

## 另见

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


复制构造 [SmartPtr](../) 对象。两个指针随后指向同一对象。如果允许，则执行类型转换。

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 参数 | 描述 |
| --- | --- |
| Q | x 所指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | 要复制的指针。 |
| mode | SmartPtrMode | 指针模式。 |

## 另见

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


复制构造 [SmartPtr](../) 对象。两个指针随后指向同一对象。

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ptr | const SmartPtr_\& | 要复制的指针。 |
| mode | SmartPtrMode | 指针模式。 |

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


初始化空数组。用于翻译某些 C# 代码结构。

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| 参数 | 描述 |
| --- | --- |
| Y | EmptyArrayInitializer 类型的占位符。 |

## 另见

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


创建指向指定对象的 [SmartPtr](../)，或将原始指针转换为 [SmartPtr](../)。

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 对象 | Pointee_ * | Pointee. |
| mode | SmartPtrMode | 指针模式。 |

## 另见

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


移动构造 [SmartPtr](../) 对象。实际上，如果两个指针模式相同，则交换它们。调用后 x 可能不可用。

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | SmartPtr_\&& | 要移动的指针。 |
| mode | SmartPtrMode | 指针模式。 |

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


创建所需模式的 [SmartPtr](../) 对象。

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| mode | SmartPtrMode | 指针模式。 |

## 另见

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


创建所需模式的空指针 [SmartPtr](../) 对象。

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| mode | std::nullptr_t | 指针模式。 |

## 另见

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
