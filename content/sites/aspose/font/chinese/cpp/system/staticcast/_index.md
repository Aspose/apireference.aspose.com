---
title: "System::StaticCast 方法"
linktitle: "StaticCast"
second_title: "Aspose.Font 适用于 C++"
description: "System::StaticCast 方法。对 C++ 中的非指针对象执行静态转换。"
type: docs
weight: 38600
url: /zh/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


对非指针对象执行静态转换。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标类型。 |
| TFrom | 源类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const TFrom\& | 源对象。 |

### ReturnValue

如果允许转换，则返回转换结果。

## Deprecated
保留用于向后兼容。请改用 ExplicitCast。

## 另见

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(const TFrom\&) method


对 [Exception](../exception/) 对象执行 static cast。

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
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
## System::StaticCast(const TFrom *) method


针对算术类型的特化。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


对 [SmartPtr](../smartptr/) 对象执行 static cast。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
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
## System::StaticCast(SmartPtr\<TFrom\>) method


对对象执行 static cast，以转换为 [Exception](../exception/) 对象。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
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
## System::StaticCast(std::nullptr_t) method


对空对象执行静态转换。

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
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
## System::StaticCast(TFrom) method


针对算术类型的特化。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(TTo) method


处理从 [String](../string/) 到 [String](../string/) 的转换。

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## 另见

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


对 [WeakPtr](../weakptr/) 对象执行 static cast。

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| 参数 | 描述 |
| --- | --- |
| TTo | 目标指向对象的类型。 |
| TFrom | 源指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | 源指针。 |

### ReturnValue

如果允许转换，则返回转换结果。

## Deprecated
保留用于向后兼容。请改用 ExplicitCast。

## 另见

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
