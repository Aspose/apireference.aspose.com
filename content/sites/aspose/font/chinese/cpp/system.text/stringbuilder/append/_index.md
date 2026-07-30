---
title: "System::Text::StringBuilder::Append 方法"
linktitle: "追加"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::StringBuilder::Append 方法。将字符添加到 C++ 中的构建器。"
type: docs
weight: 300
url: /zh/cpp/system.text/stringbuilder/append/
---
## StringBuilder::Append(char_t) method


向构建器添加字符。

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| c | char_t | 字符值。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(char_t, int) method


向构建器添加字符序列。

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| c | char_t | 字符值。 |
| count | int | 要重复插入字符的次数。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&) method


向构建器添加字符数组。

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | 要添加的字符。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&, int, int) method


向构建器添加字符数组切片。

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr, int startIndex, int charCount)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | 要添加的字符。 |
| startIndex | int | 切片起始索引。 |
| charCount | int | 切片长度。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const SharedPtr\<StringBuilder\>\&) method


向构建器添加构建器的内容。

```cpp
StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<StringBuilder> &builder)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 构建器 | const SharedPtr\\<StringBuilder\\>\\& | 要从中添加内容的构建器。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const SharedPtr\<T\>\&) method


向构建器添加对象的字符串表示。

```cpp
template<class T> StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<T> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | [Object](../../../system/object/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SharedPtr\<T\>\& | 要序列化并添加的[Object](../../../system/object/)。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const String\&) method


向构建器添加字符串。

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const String\& | 要添加的[String](../../../system/string/)。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const String\&, int, int) method


向构建器添加字符串切片。

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str, int startIndex, int charCount)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const String\& | 要添加的[String](../../../system/string/)。 |
| startIndex | int | 切片起始索引。 |
| charCount | int | 切片长度。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(double) method


向构建器添加浮点值。

```cpp
StringBuilder * System::Text::StringBuilder::Append(double df)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| df | double | 要序列化并添加的值。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(E) method


向构建器添加枚举值的字符串表示。

```cpp
template<class E> std::enable_if<std::is_enum<E>::value, StringBuilder *>::type System::Text::StringBuilder::Append(E e)
```


| 参数 | 描述 |
| --- | --- |
| E | [Enum](../../../system/enum/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| e | E | 要序列化并添加的值。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(float) method


向构建器添加浮点值。

```cpp
StringBuilder * System::Text::StringBuilder::Append(float f)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| f | float | 要序列化并添加的值。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(int) method


向构建器添加整数值。

```cpp
StringBuilder * System::Text::StringBuilder::Append(int i)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int | 要序列化并添加的值。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(T) method


向构建器添加算术值。

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Append(T value)
```


| 参数 | 描述 |
| --- | --- |
| T | 算术类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | T | 要序列化并添加的值。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
