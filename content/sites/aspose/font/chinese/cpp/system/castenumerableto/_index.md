---
title: "System::CastEnumerableTo 方法"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Font 适用于 C++"
description: "System::CastEnumerableTo 方法。在 C++ 中将指定 enumerable 对象的元素显式转换为不同的类型。"
type: docs
weight: 15600
url: /zh/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


对指定 enumerable 对象的元素执行显式类型转换为不同的类型。

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| 参数 | 描述 |
| --- | --- |
| To | 要将 enumerable 对象的元素静态转换到的类型 |
| From | enumerable 对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| enumerable | const From\& | 包含待转换元素的 Enumerable 对象 |

### ReturnValue

指向新集合的指针，该集合包含类型为 **To** 的元素，这些元素等价于 **enumerable** 的元素

## 另见

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::CastEnumerableTo(const From\&) method


对指定 enumerable 对象的元素执行显式类型转换为不同的类型。

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| 参数 | 描述 |
| --- | --- |
| To | 要将 enumerable 对象的元素静态转换到的类型 |
| From | enumerable 对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| enumerable | const From\& | 是具有已定义 get_Count 方法的 Enumerable 对象的继承者，并包含要转换的元素 |

### ReturnValue

指向新集合的指针，该集合包含类型为 **To** 的元素，这些元素等价于 **enumerable** 的元素

## 另见

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
