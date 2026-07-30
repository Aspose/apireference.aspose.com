---
title: "System::StaticCastArray 方法"
linktitle: "StaticCastArray"
second_title: "Aspose.Font 适用于 C++"
description: "System::StaticCastArray 方法。执行对指定数组元素的类型转换。针对 From 为 C++ 中 SmartPtr 对象的情况进行重写。"
type: docs
weight: 39900
url: /zh/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


执行对指定数组元素的类型转换。针对 From 为 [SmartPtr](../smartptr/) 对象的情况进行重写。

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| 参数 | 描述 |
| --- | --- |
| To | 要将指定数组的元素转换成的类型 |
| From | 要进行转换的数组元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | 指向包含待转换元素的数组的共享指针 |

### ReturnValue

指向新数组的指针，该数组包含类型为 **To** 的元素，这些元素等价于 **from** 的元素。

## Deprecated
为向后兼容而添加。请改用 ExplicitCast。

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


执行对指定数组元素的类型转换。针对 From 为 Boxable 且 To 为 [Object](../object/)[]. 的情况进行重写。

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| 参数 | 描述 |
| --- | --- |
| To | 要将指定数组的元素转换成的类型 |
| From | 要进行转换的数组元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | 指向包含待转换元素的数组的共享指针 |

### ReturnValue

指向新数组的指针，该数组包含类型为 **To** 的元素，这些元素等价于 **from** 的元素。

## Deprecated
为向后兼容而添加。请改用 ExplicitCast。

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
