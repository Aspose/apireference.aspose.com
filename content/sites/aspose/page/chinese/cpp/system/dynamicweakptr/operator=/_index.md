---
title: "System::DynamicWeakPtr::operator= 方法"
linktitle: "operator="
second_title: "Aspose.Page 适用于 C++"
description: "System::DynamicWeakPtr::operator= 方法。 在 C++ 中复制赋值智能指针。"
type: docs
weight: 200
url: /zh/cpp/system/dynamicweakptr/operator=/
---
## DynamicWeakPtr::operator=(const SmartPtr\<Q\>\&) method


拷贝赋值智能指针。

```cpp
template<typename Q> DynamicWeakPtr_ & System::DynamicWeakPtr<T, trunkMode, weakLeafs>::operator=(const SmartPtr<Q> &x)
```


| Parameter | 描述 |
| --- | --- |
| Q | 源指向类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | 指向复制赋值值的指针。 |

### ReturnValue

自身引用。

## 另见

* Typedef [DynamicWeakPtr_](../dynamicweakptr_/)
* Class [SmartPtr](../../smartptr/)
* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DynamicWeakPtr::operator=(const SmartPtr_\&) method


拷贝赋值智能指针。

```cpp
DynamicWeakPtr_ & System::DynamicWeakPtr<T, trunkMode, weakLeafs>::operator=(const SmartPtr_ &x)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| x | const SmartPtr_\& | 指向复制赋值值的指针。 |

### ReturnValue

自身引用。

## 另见

* Typedef [DynamicWeakPtr_](../dynamicweakptr_/)
* Typedef [SmartPtr_](../smartptr_/)
* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DynamicWeakPtr::operator=(SmartPtr_\&&) method


移动赋值智能指针。

```cpp
DynamicWeakPtr_ & System::DynamicWeakPtr<T, trunkMode, weakLeafs>::operator=(SmartPtr_ &&x)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| x | SmartPtr_\&& | 指向移动赋值值的指针。 |

### ReturnValue

自身引用。

## 另见

* Typedef [DynamicWeakPtr_](../dynamicweakptr_/)
* Typedef [SmartPtr_](../smartptr_/)
* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DynamicWeakPtr::operator=(std::nullptr_t) method


将智能指针设为 null。

```cpp
DynamicWeakPtr_ & System::DynamicWeakPtr<T, trunkMode, weakLeafs>::operator=(std::nullptr_t)
```


### ReturnValue

自身引用。

## 另见

* Typedef [DynamicWeakPtr_](../dynamicweakptr_/)
* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DynamicWeakPtr::operator=(typename SmartPtr_::Pointee_ *) method


赋值智能指针。

```cpp
DynamicWeakPtr_ & System::DynamicWeakPtr<T, trunkMode, weakLeafs>::operator=(typename SmartPtr_::Pointee_ *p)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| p | typename SmartPtr_::Pointee_ * | 指针值。 |

### ReturnValue

自身引用。

## 另见

* Typedef [DynamicWeakPtr_](../dynamicweakptr_/)
* Typedef [Pointee_](../../smartptr/pointee_/)
* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
