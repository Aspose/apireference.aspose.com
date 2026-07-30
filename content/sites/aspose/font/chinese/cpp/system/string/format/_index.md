---
title: "System::String::Format 方法"
linktitle: "格式"
second_title: "Aspose.Font 适用于 C++"
description: "System::String::Format 方法。以 C# 风格在 C++ 中格式化字符串。"
type: docs
weight: 6600
url: /zh/cpp/system/string/format/
---
## String::Format(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) method


以 C# 风格格式化字符串。

```cpp
template<class...> String System::String::Format(const SharedPtr<IFormatProvider> &fp, const String &format, const Args &... args)
```


| 参数 | 描述 |
| --- | --- |
| 参数 | 用于格式化字符串的参数。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fp | const SharedPtr\<IFormatProvider\>\& | 用于将参数转换为字符串的格式提供程序。 |
| 格式 | const String\& | 格式字符串。 |
| args | const Args\&... | 用于格式化字符串的参数。 |

## 另见

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Format(const String\&, const Args\&...) method


以 C# 风格格式化字符串。

```cpp
template<class...> String System::String::Format(const String &format, const Args &... args)
```


| 参数 | 描述 |
| --- | --- |
| 参数 | 用于格式化字符串的参数。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 格式 | const String\& | 格式字符串。 |
| args | const Args\&... | 用于格式化字符串的参数。 |

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Format(const String\&, const System::ArrayPtr\<T\>\&) method


以 C# 风格格式化字符串。

```cpp
template<class T> String System::String::Format(const String &format, const System::ArrayPtr<T> &args)
```


| 参数 | 描述 |
| --- | --- |
| T | 用于格式化字符串的参数。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 格式 | const String\& | 格式字符串。 |
| args | const System::ArrayPtr\<T\>\& | 用于格式化字符串的参数。 |

## 另见

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Format(std::nullptr_t, const char16_t(&), const Args\&...) method


以 C# 风格格式化字符串。

```cpp
template<std::size_t,class...> String System::String::Format(std::nullptr_t, const char16_t(&format)[N], const Args &... args)
```


| 参数 | 描述 |
| --- | --- |
| 参数 | 用于格式化字符串的参数。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 格式 | std::nullptr_t | 格式字符串。 |
| args | const char16_t(&) | 用于格式化字符串的参数。 |

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Format(std::nullptr_t, const String\&, const Args\&...) method


以 C# 风格格式化字符串。

```cpp
template<class...> String System::String::Format(std::nullptr_t, const String &format, const Args &... args)
```


| 参数 | 描述 |
| --- | --- |
| 参数 | 用于格式化字符串的参数。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 格式 | std::nullptr_t | 格式字符串。 |
| args | const String\& | 用于格式化字符串的参数。 |

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
