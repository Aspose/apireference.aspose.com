---
title: "System::DynamicCast_noexcept 方法"
linktitle: "动态转换_无异常"
second_title: "Aspose.Font 适用于 C++"
description: "System::DynamicCast_noexcept 方法。旧的已废弃的转换。将在未来的 C++ 版本中移除。"
type: docs
weight: 17700
url: /zh/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


旧的过时强制转换。将在未来版本中移除。

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标 [Exception](../exception/) 类型。 |
| TFrom | 源 [Exception](../exception/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const TFrom\& | 源指针。 |

### ReturnValue

如果允许转换则返回转换结果，否则返回 nullptr。
## 备注


对 [Exception](../exception/) 对象执行动态强制转换。## 已弃用
为向后兼容保留。请改用 AsCast。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


对 [SmartPtr](../smartptr/) 对象执行动态强制转换。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标指向对象的类型。 |
| TFrom | 源指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | 源指针。 |

### ReturnValue

如果允许转换则返回转换结果，否则返回 nullptr。

## Deprecated
为向后兼容保留。请改用 AsCast。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


将对象动态强制转换为 [Exception](../exception/) 对象。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标 [Exception](../exception/) 类型。 |
| TFrom | [Object](../object/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | 源指针。 |

### ReturnValue

如果允许转换则返回转换结果，否则返回 nullptr。

## Deprecated
为向后兼容保留。请改用 AsCast。

## 另见

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
