---
title: "System::String::operator+ 方法"
linktitle: "operator+"
second_title: "Aspose.Page 适用于 C++"
description: "System::String::operator+ 方法。在 C++ 中向字符串末尾添加字符。"
type: docs
weight: 2800
url: /zh/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


在字符串末尾添加字符。

```cpp
String System::String::operator+(char_t x) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| x | char_t | 要添加的字符。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | const String\& | 要添加到当前字符串末尾的 [String](../)。 |

### ReturnValue

连接后的字符串。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parameter | 描述 |
| --- | --- |
| T | 字符串字面量或字符指针形式之一。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| arg | const T\& | 与当前字符串连接的实体。 |

### ReturnValue

连接后的字符串。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


在字符串末尾添加引用类型对象的字符串表示。

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | 描述 |
| --- | --- |
| T | 指针类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) 用于通过调用 [ToString()](../tostring/) 将其转换为字符串并添加到当前字符串。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


在字符串末尾添加值类型对象的字符串表示。

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | 描述 |
| --- | --- |
| T | 要调用 [ToString()](../tostring/) 的值类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) 用于通过调用 [ToString()](../tostring/) 将其转换为字符串并添加到当前字符串。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


在字符串末尾添加浮点值的字符串表示。

```cpp
String System::String::operator+(double d) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| d | double | 要转换为字符串并添加的值。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


在字符串末尾添加整数值的字符串表示。

```cpp
String System::String::operator+(int i) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| i | int | 要转换为字符串并添加的整数值。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


在字符串末尾添加整数值的字符串表示。

```cpp
String System::String::operator+(int64_t v) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| v | int64_t | 要转换为字符串并再次添加的值。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


在字符串末尾添加布尔值的字符串表示。

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parameter | 描述 |
| --- | --- |
| T | 用于与字符串连接的值类型。必须是 bool。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) 值转换为字符串并添加。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


在字符串末尾添加无符号整数值的字符串表示。

```cpp
String System::String::operator+(uint32_t i) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| i | uint32_t | 要转换为字符串并添加的值。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
