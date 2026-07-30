---
title: "System::String::String 构造函数"
linktitle: "String"
second_title: "Aspose.Font 适用于 C++"
description: "System::String::String 构造函数。默认构造函数。创建在 C++ 中被视为 null 的 string 对象。"
type: docs
weight: 100
url: /zh/cpp/system/string/string/
---
## String::String() constructor


默认构造函数。创建被视为 null 的字符串对象。

```cpp
System::String::String()
```

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


移动构造函数。

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString 包装为 [String](../)。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


将整个字符数组转换为字符串。

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/) 转换为字符串。 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


将字符数组子范围转换为字符串。如果参数超出数组边界，则构造空字符串。

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | 字符数组。 |
| offset | int | 子数组的起始索引。 |
| len | int | 子数组长度。 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char *, int) constructor


从字符字符串指针和显式长度构造字符串。

```cpp
System::String::String(const char *str, int length)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const char * | [String](../) 指向 UTF8 数据的指针，可为文字或数组。 |
| 长度 | int | 显式字符串长度 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t *, int) constructor


从字符字符串指针和显式长度构造字符串。

```cpp
System::String::String(const char16_t *str, int length)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const char16_t * | [String](../) 指针，可为文字或数组。 |
| 长度 | int | 显式字符串长度 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t *, int, int) constructor


从起始位置的字符字符串指针使用长度构造字符串。

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const char16_t * | [String](../) 指针，可为文字或数组。 |
| start | int | 起始位置。 |
| length | int | [String](../) 长度。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t, int) constructor


填充构造函数。

```cpp
System::String::String(const char16_t ch, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ch | const char16_t | 填充字符。 |
| count | int | 目标长度。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


将 UnicodeString 包装为 [String](../)。

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString 包装为 [String](../)。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::string\&) constructor


从以 UTF-8 格式呈现的 std::string 字符串创建 [String](../)。

```cpp
System::String::String(const std::string &utf8str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| utf8str | const std::string\& | 要转换为 [String](../) 的 std::string 字符串。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::u16string\&) constructor


从 utf16 字符串创建 [String](../)。

```cpp
System::String::String(const std::u16string &str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const std::u16string\& | 要转换为 [String](../) 的 Utf16 字符串。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::u32string\&) constructor


从 std::u32string 字符串创建 [String](../)。

```cpp
System::String::String(const std::u32string &u32str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| u32str | const std::u32string\& | 要转换为 [String](../) 的 std::u32string 字符串。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::wstring\&) constructor


从宽字符串创建 [String](../)。

```cpp
System::String::String(const std::wstring &str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const std::wstring\& | 要转换为 [String](../) 的宽字符串。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const String\&) constructor


拷贝构造函数。

```cpp
System::String::String(const String &str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const String\& | [String](../) 用于复制。 |

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


基于字符字符串指针构造字符串。将指向的字符串视为 UTF8 编码的以 null 结尾，依据 null 字符计算目标字符串长度。

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const T\& | 字符字符串指针。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


基于字符字符串指针构造字符串。将指向的字符串视为以 null 结尾，依据 null 字符计算目标字符串长度。

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const T\& | 字符字符串指针。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


基于宽字符字符串指针构造字符串。将指向的字符串视为以 null 结尾，依据 null 字符计算目标字符串长度。某些平台上 wchar_t 的转换耗时较长，因此不允许隐式转换。

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const T\& | 字符字符串指针。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


nullptr 构造函数。声明为模板以解决与其他模板构造函数的优先级冲突。

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| 参数 | 描述 |
| --- | --- |
| T | 应为 nullptr_t |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const T\& | nullptr |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const wchar_t *, int) constructor


从宽字符字符串指针和显式长度构造字符串。某些平台上 wchar_t 的转换耗时较长，因此不允许隐式转换。

```cpp
System::String::String(const wchar_t *str, int length)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const wchar_t * | [String](../) 指针，可为文字或数组。 |
| 长度 | int | 显式字符串长度 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const wchar_t, int) constructor


填充构造函数。某些平台上 wchar_t 的转换耗时较长，因此不允许隐式转换。

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ch | const wchar_t | 填充字符。 |
| count | int | 目标长度。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(String\&&) constructor


移动构造函数。

```cpp
System::String::String(String &&str) noexcept
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | String\&& | [String](../) 用于移动数据。 |

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


基于字符串字面量构造字符串。将字面量视为 UTF8 编码的以 null 结尾的字符串，依据字面量大小计算目标字符串长度。

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | T\& | [String](../) 文字指针。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


基于字符串字面量构造字符串。将字面量视为以 null 结尾的字符串，依据字面量大小计算目标字符串长度。

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | T\& | [String](../) 文字指针。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


基于宽字符串字面量构造字符串。将字面量视为以 null 结尾的字符串，依据字面量大小计算目标字符串长度。某些平台上 wchar_t 的转换耗时较长，因此不允许隐式转换。

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | T\& | [String](../) 文字指针。 |

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
