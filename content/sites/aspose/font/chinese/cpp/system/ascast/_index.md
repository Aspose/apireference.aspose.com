---
title: "System::AsCast 方法"
linktitle: "AsCast"
second_title: "Aspose.Font 适用于 C++"
description: "System::AsCast 方法。使用 ''as'' 运算符将源类型转换为结果类型。在 C++ 中需要简单的类似构造函数的转换时使用。"
type: docs
weight: 13600
url: /zh/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


使用 'as' 运算符将源类型转换为结果类型。在需要简单的类似构造函数的转换时使用。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符将源类型转换为结果类型。当源类型和结果类型相同时使用。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。

## 另见

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符将源类型转换为结果类型。用于异常包装器。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。如果没有可用的转换，则返回 nullptr。

## 另见

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。用于将对象转换为异常。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。如果没有可用的转换，则返回 nullptr。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。当源和结果都是智能指针时使用。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。如果没有可用的转换，则返回 nullptr。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。当源和结果都是智能指针时使用（在结果类型中显式包含 [SmartPtr<...>](../smartptr/)）。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。如果没有可用的转换，则返回 nullptr。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。用于将对象拆箱为可空类型。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。如果没有可用的转换，则返回空的可空类型。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。无效的拆箱到非对象类型。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

始终返回 null。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


无效的拆箱到非对象类型。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

始终返回 null。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。用于将可空对象装箱。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。用于将普通对象装箱。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。用于将普通对象装箱。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。用于字符串拆箱。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。用于 nullptr 转换。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


使用 'as' 运算符进行转换，将源类型转换为结果类型。用于在数组之间进行转换。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| 参数 | 描述 |
| --- | --- |
| 源 | 源类型。 |
| Result | 结果类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Source\& | 要转换的 [Object](../object/)。 |

### ReturnValue

转换结果。如果没有任何数组成员的可用转换，则返回 nullptr。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
