---
title: "System::MakeObject 方法"
linktitle: "MakeObject"
second_title: "Aspose.Font 适用于 C++"
description: "System::MakeObject 方法。 在堆上创建对象并在 C++ 中返回指向它的共享指针。"
type: docs
weight: 24600
url: /zh/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


在堆上创建对象并返回指向它的共享指针。

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| 参数 | 描述 |
| --- | --- |
| T | 要实例化的类。 |
| 参数 | 构造函数参数的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| args | Args\\&&... | 构造函数参数。 |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeObject(Args\&&...) method


在堆上创建对象并返回指向它的共享指针。

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| 参数 | 描述 |
| --- | --- |
| T | [SmartPtr](../smartptr/) 到要实例化的类。 |
| 参数 | 构造函数参数的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| args | Args\\&&... | 构造函数参数。 |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
