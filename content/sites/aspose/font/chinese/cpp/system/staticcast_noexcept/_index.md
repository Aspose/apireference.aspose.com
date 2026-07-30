---
title: "System::StaticCast_noexcept 方法"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Font 适用于 C++"
description: "System::StaticCast_noexcept 方法。对 C++ 中的 Exception 对象执行 static cast。"
type: docs
weight: 39500
url: /zh/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


对 [Exception](../exception/) 对象执行 static cast。

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
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

## Deprecated
为向后兼容保留。请改用 AsCast。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


对 [SmartPtr](../smartptr/) 对象执行 static cast。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
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
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


对对象执行 static cast，以转换为 [Exception](../exception/) 对象。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


对 [WeakPtr](../weakptr/) 对象执行 static cast。

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标指向对象的类型。 |
| TFrom | 源指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | 源指针。 |

### ReturnValue

如果允许转换则返回转换结果，否则返回 nullptr。

## Deprecated
为向后兼容保留。请改用 AsCast。

## 另见

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
