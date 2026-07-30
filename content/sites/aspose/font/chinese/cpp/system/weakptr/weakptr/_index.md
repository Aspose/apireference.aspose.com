---
title: "System::WeakPtr::WeakPtr 构造函数"
linktitle: "WeakPtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::WeakPtr::WeakPtr 构造函数。创建引用相同指针 x 所指向的弱指针（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system/weakptr/weakptr/
---
## WeakPtr::WeakPtr(const SmartPtr\<Q\>\&) constructor


创建引用与 x 指向的相同指针的弱指针。

```cpp
template<class Q,typename> System::WeakPtr<T>::WeakPtr(const SmartPtr<Q> &x)
```


| 参数 | 描述 |
| --- | --- |
| Q | 源指针的被指类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | 指向要复制被指对象值的指针。 |

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## WeakPtr::WeakPtr(const SmartPtr_\&) constructor


创建引用与 ptr 指向的相同指针的弱指针。

```cpp
System::WeakPtr<T>::WeakPtr(const SmartPtr_ &ptr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ptr | const SmartPtr_\& | 指向要复制被指对象值的指针。 |

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## WeakPtr::WeakPtr(const WeakPtr\<Q\>\&) constructor


复制构造弱指针。

```cpp
template<class Q,typename> System::WeakPtr<T>::WeakPtr(const WeakPtr<Q> &x)
```


| 参数 | 描述 |
| --- | --- |
| Q | 源指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | const WeakPtr\<Q\>\& | 指向要复制被指对象值的指针。 |

## 另见

* Class [WeakPtr](../)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## WeakPtr::WeakPtr(const WeakPtr_\&) constructor


复制构造弱指针。

```cpp
System::WeakPtr<T>::WeakPtr(const WeakPtr_ &ptr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ptr | const WeakPtr_\& | 指向要复制被指对象值的指针。 |

## 另见

* Typedef [WeakPtr_](../weakptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## WeakPtr::WeakPtr(Pointee_ *) constructor


创建指向给定对象的弱指针。

```cpp
System::WeakPtr<T>::WeakPtr(Pointee_ *object)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| object | Pointee_ * | 用于创建弱指针的 [Object](../../object/)。 |

## 另见

* Typedef [Pointee_](../pointee_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## WeakPtr::WeakPtr(SmartPtr_\&&) constructor


移动构造弱指针。

```cpp
System::WeakPtr<T>::WeakPtr(SmartPtr_ &&x)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | SmartPtr_\&& | 用于移动被指对象值的指针。 |

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## WeakPtr::WeakPtr(std::nullptr_t) constructor


创建 null 指针。

```cpp
System::WeakPtr<T>::WeakPtr(std::nullptr_t=nullptr)
```

## 另见

* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
