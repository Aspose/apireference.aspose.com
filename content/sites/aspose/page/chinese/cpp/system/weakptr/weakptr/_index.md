---
title: "System::WeakPtr::WeakPtr 构造函数"
linktitle: "WeakPtr"
second_title: "Aspose.Page 适用于 C++"
description: "System::WeakPtr::WeakPtr 构造函数。创建引用相同指针 x 所指向的弱指针，在 C++ 中。"
type: docs
weight: 100
url: /zh/cpp/system/weakptr/weakptr/
---
## WeakPtr::WeakPtr(const SmartPtr\<Q\>\&) constructor


创建引用 x 所指向的相同指针的弱指针。

```cpp
template<class Q,typename> System::WeakPtr<T>::WeakPtr(const SmartPtr<Q> &x)
```


| Parameter | 描述 |
| --- | --- |
| Q | 源指针的指向类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | 指向要复制的被指对象值的指针。 |

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(const SmartPtr_\&) constructor


创建引用 ptr 所指向的相同指针的弱指针。

```cpp
System::WeakPtr<T>::WeakPtr(const SmartPtr_ &ptr)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| ptr | const SmartPtr_\& | 指向要复制的被指对象值的指针。 |

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(const WeakPtr\<Q\>\&) constructor


拷贝构造弱指针。

```cpp
template<class Q,typename> System::WeakPtr<T>::WeakPtr(const WeakPtr<Q> &x)
```


| Parameter | 描述 |
| --- | --- |
| Q | 源指向类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | const WeakPtr\<Q\>\& | 指向要复制的被指对象值的指针。 |

## 另见

* Class [WeakPtr](../)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(const WeakPtr_\&) constructor


拷贝构造弱指针。

```cpp
System::WeakPtr<T>::WeakPtr(const WeakPtr_ &ptr)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| ptr | const WeakPtr_\& | 指向要复制的被指对象值的指针。 |

## 另见

* Typedef [WeakPtr_](../weakptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(Pointee_ *) constructor


创建指向给定对象的弱指针。

```cpp
System::WeakPtr<T>::WeakPtr(Pointee_ *object)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| object | Pointee_ * | 用于创建弱指针的 [Object](../../object/)。 |

## 另见

* Typedef [Pointee_](../pointee_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(SmartPtr_\&&) constructor


移动构造弱指针。

```cpp
System::WeakPtr<T>::WeakPtr(SmartPtr_ &&x)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| x | SmartPtr_\&& | 指向要移动的被指对象值的指针。 |

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(std::nullptr_t) constructor


创建 null 指针。

```cpp
System::WeakPtr<T>::WeakPtr(std::nullptr_t=nullptr)
```

## 另见

* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
