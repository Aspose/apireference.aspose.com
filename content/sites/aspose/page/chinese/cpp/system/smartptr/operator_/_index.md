---
title: "System::SmartPtr::operator* 方法"
linktitle: "operator*"
second_title: "Aspose.Page 适用于 C++"
description: "System::SmartPtr::operator* 方法。获取指向对象的引用。在 C++ 中断言指针不为 null。"
type: docs
weight: 2500
url: /zh/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


获取指向对象的引用。断言指针非空。

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

指向对象的引用。

## 另见

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::SmartPtr::operator< 方法
链接标题: operator<
second_title: Aspose.Page for C++
description: 'System::SmartPtr::operator< 方法。为 SmartPtr 类在 C++ 中提供小于比较语义。'
type: docs
权重: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


为 [SmartPtr](../) 类提供小于比较语义。

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| Parameter | 描述 |
| --- | --- |
| Y | 用于与当前指针比较的指针类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | 用于与当前指针比较的指针。 |

### ReturnValue

如果 [SmartPtr](../) 引用的对象小于 x 则为 true，否则为 false。

## 另见

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator<(Y *) const method


为 [SmartPtr](../) 类提供小于比较语义。

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| Parameter | 描述 |
| --- | --- |
| Y | 用于与当前指针比较的指针类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| p | Y * | 用于与当前指针比较的指针。 |

### ReturnValue

如果由 [SmartPtr](../) 引用的对象小于 p 则为 true，否则为 false。

## 另见

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
