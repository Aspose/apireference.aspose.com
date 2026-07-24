---
title: "System::SmartPtr::operator= 方法"
linktitle: "operator="
second_title: "Aspose.Page 适用于 C++"
description: "System::SmartPtr::operator= 方法。对 SmartPtr 对象进行复制赋值。在 C++ 中执行所需的类型转换。"
type: docs
weight: 2800
url: /zh/cpp/system/smartptr/operator=/
---
## SmartPtr::operator=(const SmartPtr\<Q\>\&) method


对 [SmartPtr](../) 对象进行复制赋值。执行所需的类型转换。

```cpp
template<typename Q> SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr<Q> &x)
```


| Parameter | 描述 |
| --- | --- |
| Q | x 所指向对象的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | 用于复制赋值的指针。 |

### ReturnValue

对该对象的引用。

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(const SmartPtr_\&) method


对 [SmartPtr](../) 对象进行复制赋值。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr_ &x)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| x | const SmartPtr_\& | 用于复制赋值的指针。 |

### ReturnValue

对该对象的引用。

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(Pointee_ *) method


将原始指针赋给 [SmartPtr](../) 对象。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(Pointee_ *p)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| p | Pointee_ * | 要赋值的指针值。 |

### ReturnValue

对该对象的引用。

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(SmartPtr_\&&) method


对 [SmartPtr](../) 对象进行移动赋值。x 将变得不可用。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(SmartPtr_ &&x) noexcept
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| x | SmartPtr_\&& | 用于移动赋值的指针。 |

### ReturnValue

对该对象的引用。

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(std::nullptr_t) method


将指针值设为 nullptr。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(std::nullptr_t)
```


### ReturnValue

对该对象的引用。

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
