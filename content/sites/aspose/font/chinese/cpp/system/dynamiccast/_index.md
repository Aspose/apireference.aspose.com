---
title: "System::DynamicCast 方法"
linktitle: "动态转换"
second_title: "Aspose.Font 适用于 C++"
description: "System::DynamicCast 方法。在 C++ 中对 Exception 对象执行动态转换。"
type: docs
weight: 17000
url: /zh/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


对 [Exception](../exception/) 对象执行动态转换。

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标 [Exception](../exception/) 类型。 |
| TFrom | 源 [Exception](../exception/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const TFrom\& | 源指针。 |

### ReturnValue

如果允许转换，则返回转换结果。

## Deprecated
保留用于向后兼容。请改用 ExplicitCast。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


对 [SmartPtr](../smartptr/) 对象执行动态强制转换。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标指向对象的类型。 |
| TFrom | 源指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | 源指针。 |

### ReturnValue

如果允许转换，则返回转换结果。

## Deprecated
保留用于向后兼容。请改用 ExplicitCast。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


通过转换解箱装箱的枚举。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标枚举类型。 |
| TFrom | 源指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | 指向要从中解箱数据的对象的指针。 |

### ReturnValue

已解箱的枚举值。

## Deprecated
保留用于向后兼容。请改用 ExplicitCast。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


将对象动态强制转换为 [Exception](../exception/) 对象。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标 [Exception](../exception/) 类型。 |
| TFrom | [Object](../object/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | 源指针。 |

### ReturnValue

如果允许转换，则返回转换结果。

## Deprecated
保留用于向后兼容。请改用 ExplicitCast。

## 另见

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(std::nullptr_t) method


对空对象执行动态转换。

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标指向对象的类型。 |

### ReturnValue

nullptr。

## Deprecated
保留用于向后兼容。请改用 ExplicitCast。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(TFrom\&) method


对非指针对象执行动态转换。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标类型。 |
| TFrom | 源类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | TFrom\& | 源对象。 |

### ReturnValue

转换结果。

## Deprecated
保留用于向后兼容。请改用 ExplicitCast。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(TFrom) method


将 IntPtr 动态转换为指针。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标类型。 |
| TFrom | 源类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | TFrom | 源 IntPtr 值。 |

### ReturnValue

转换结果。

## Deprecated
保留用于向后兼容。请改用 ExplicitCast。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
