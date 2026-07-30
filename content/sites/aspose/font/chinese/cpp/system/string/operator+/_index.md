---
title: "System::String::operator+ 方法"
linktitle: "operator+"
second_title: "Aspose.Font 适用于 C++"
description: "System::String::operator+ 方法。向字符串末尾添加字符（在 C++ 中）。"
type: docs
weight: 2800
url: /zh/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


在字符串末尾添加字符。

```cpp
String System::String::operator+(char_t x) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | char_t | 要添加的字符。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const String\& | [String](../) 添加到当前字符串的末尾。 |

### ReturnValue

连接后的字符串。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| 参数 | 描述 |
| --- | --- |
| T | 字符串字面量或字符字符串指针形式之一。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg | const T\& | 与当前字符串连接的实体。 |

### ReturnValue

连接后的字符串。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


在字符串末尾添加引用类型对象的字符串表示。

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| 参数 | 描述 |
| --- | --- |
| T | 指针类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) 用于使用 [ToString()](../tostring/) 调用将其转换为字符串并添加到当前字符串。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


将值类型对象的字符串表示添加到字符串的末尾。

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| 参数 | 描述 |
| --- | --- |
| T | 值类型用于调用 [ToString()](../tostring/)。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) 用于使用 [ToString()](../tostring/) 调用将其转换为字符串并添加到当前字符串。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(double) const method


在字符串末尾添加浮点值的字符串表示。

```cpp
String System::String::operator+(double d) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| d | double | 要转换为字符串并添加的值。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int) const method


在字符串末尾添加整数值的字符串表示。

```cpp
String System::String::operator+(int i) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int | 要转换为字符串并添加的整数值。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int64_t) const method


在字符串末尾添加整数值的字符串表示。

```cpp
String System::String::operator+(int64_t v) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| v | int64_t | 要转换为字符串并添加的值。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(T) const method


在字符串末尾添加布尔值的字符串表示。

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| 参数 | 描述 |
| --- | --- |
| T | 用于与字符串连接的值类型。必须是 bool。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) 值用于转换为字符串并添加。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(uint32_t) const method


在字符串末尾添加无符号整数值的字符串表示。

```cpp
String System::String::operator+(uint32_t i) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | uint32_t | 要转换为字符串并添加的值。 |

### ReturnValue

[String](../) concatenation result.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
