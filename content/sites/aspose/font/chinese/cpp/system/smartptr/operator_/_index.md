---
title: "System::SmartPtr::operator* 方法"
linktitle: "operator*"
second_title: "Aspose.Font 适用于 C++"
description: "System::SmartPtr::operator* 方法。获取指向对象的引用。断言指针在 C++ 中不为 null。"
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
* Library [Aspose.Font for C++](../../../)
---
title: System::SmartPtr::operator< 方法
linktitle: operator<
次标题: Aspose.Font for C++
description: 'System::SmartPtr::operator< 方法。为 SmartPtr 类在 C++ 中提供小于比较语义。'
类型: 文档
weight: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


为 [SmartPtr](../) 类提供 less-compare 语义。

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| 参数 | 描述 |
| --- | --- |
| Y | 用于比较当前指针的指针类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | 用于比较当前指针的指针。 |

### ReturnValue

如果 [SmartPtr](../) 引用的对象小于 x 则为 true，否则为 false。

## 另见

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator<(Y *) const method


为 [SmartPtr](../) 类提供 less-compare 语义。

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| 参数 | 描述 |
| --- | --- |
| Y | 用于比较当前指针的指针类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| p | Y * | 用于比较当前指针的指针。 |

### ReturnValue

如果 [SmartPtr](../) 引用的对象小于 p 则为 true，否则为 false。

## 另见

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
