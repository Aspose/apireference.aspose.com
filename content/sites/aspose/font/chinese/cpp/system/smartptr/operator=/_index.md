---
title: "System::SmartPtr::operator= 方法"
linktitle: "operator="
second_title: "Aspose.Font 适用于 C++"
description: "System::SmartPtr::operator= 方法。对 SmartPtr 对象进行复制赋值。执行所需的类型转换（在 C++ 中）。"
type: docs
weight: 2800
url: /zh/cpp/system/smartptr/operator=/
---
## SmartPtr::operator=(const SmartPtr\<Q\>\&) method


复制赋值 [SmartPtr](../) 对象。执行所需的类型转换。

```cpp
template<typename Q> SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr<Q> &x)
```


| 参数 | 描述 |
| --- | --- |
| Q | x 所指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | 指向复制赋值的指针。 |

### ReturnValue

对该对象的引用。

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator=(const SmartPtr_\&) method


复制赋值 [SmartPtr](../) 对象。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr_ &x)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | const SmartPtr_\& | 指向复制赋值的指针。 |

### ReturnValue

对该对象的引用。

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator=(Pointee_ *) method


将原始指针赋给 [SmartPtr](../) 对象。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(Pointee_ *p)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| p | Pointee_ * | 要赋值的指针值。 |

### ReturnValue

对该对象的引用。

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator=(SmartPtr_\&&) method


移动赋值 [SmartPtr](../) 对象。x 将变得不可用。

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(SmartPtr_ &&x) noexcept
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | SmartPtr_\&& | 指向移动赋值的指针。 |

### ReturnValue

对该对象的引用。

## 另见

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
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
* Library [Aspose.Font for C++](../../../)
