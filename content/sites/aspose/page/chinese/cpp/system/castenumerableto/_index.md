---
title: "System::CastEnumerableTo 方法"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page 适用于 C++"
description: "System::CastEnumerableTo 方法。对指定可枚举对象的元素执行显式转换为不同类型的操作（C++）。"
type: docs
weight: 15500
url: /zh/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


对指定可枚举对象的元素执行显式转换为不同类型的操作。

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | 描述 |
| --- | --- |
| 至 | 要将可枚举对象的元素静态转换成的类型 |
| From | 可枚举对象的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 可枚举 | const From\& | 包含待转换元素的可枚举对象 |

### ReturnValue

指向新集合的指针，该集合包含类型为 **To** 的元素，这些元素等价于 **enumerable** 的元素

## 另见

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


对指定可枚举对象的元素执行显式转换为不同类型的操作。

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | 描述 |
| --- | --- |
| 至 | 要将可枚举对象的元素静态转换成的类型 |
| From | 可枚举对象的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 可枚举 | const From\& | 是具有已定义 get_Count 方法并包含待转换元素的 Enumerable 对象的继承者 |

### ReturnValue

指向新集合的指针，该集合包含类型为 **To** 的元素，这些元素等价于 **enumerable** 的元素

## 另见

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
