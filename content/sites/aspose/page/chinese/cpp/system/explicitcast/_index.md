---
title: "System::ExplicitCast 方法"
linktitle: "显式转换"
second_title: "Aspose.Page 适用于 C++"
description: "System::ExplicitCast 方法。使用显式转换将源类型转换为结果类型。当源类型和结果类型在 C++ 中相同时使用。"
type: docs
weight: 18500
url: /zh/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。当源类型和结果类型相同时使用。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。当需要简单的类似构造函数的转换时使用。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于异常包装器。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于将对象转换为异常。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。当源和结果都是智能指针且结果类型中没有显式的 [SmartPtr<...>](../smartptr/) 时使用。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。当源和结果都是智能指针且结果类型中包含显式的 [SmartPtr<...>](../smartptr/) 时使用。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于将对象拆箱为可空类型。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于将可空类型装箱。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于拆箱可空对象。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于枚举装箱。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。当需要将值类型复制到堆上，并且值类型应作为智能指针引用时使用（在受接口类型约束的泛型中，但使用实现该接口的结构体进行特化）。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于从值类型获取接口。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于常规装箱。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于 [System::String](../string/) 装箱。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于接口拆箱。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于常规拆箱。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于 nullptr 转换。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


使用显式转换将源类型转换为结果类型。用于数组之间的转换。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(Source) method


使用显式转换将源类型转换为结果类型。当将原始指针转换为智能指针时使用。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parameter | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | Source | [Object](../object/) 要转换。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
