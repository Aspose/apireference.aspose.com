---
title: "System::operator+ 方法"
linktitle: "operator+"
second_title: "Aspose.Font 适用于 C++"
description: "System::operator+ 方法。C++ 中的字符串连接。"
type: docs
weight: 27600
url: /zh/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 左 | const char_t | 要连接到字符串的字符。 |
| right | const String\& | [String](../string/) 用于连接。 |

### ReturnValue

连接后的字符串。

## 另见

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


返回一个新的 [Decimal](../decimal/) 类实例，该实例表示指定值与指定的 [Decimal](../decimal/) 对象所表示的值之和。

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | const T\& | 第一个加数 |
| d | const Decimal\& | 对表示第二个加数的 [Decimal](../decimal/) 对象的常量引用 |

### ReturnValue

一个新的 [Decimal](../decimal/) 类实例，表示 **x** 与 **d** 所表示的值之和。

## 另见

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


对非空和可空值进行求和。

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 左操作数类型。 |
| T2 | 右操作数类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 一些 | const T1\& | 左操作数。 |
| 其他 | const Nullable\<T2\>\& | 右操作数。 |

### ReturnValue

求和结果。

## 另见

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


将右侧委托的所有回调连接到左侧委托回调列表的末尾。

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | 添加回调的委托。 |
| rhv | MulticastDelegate\<T\> | 正在添加回调的委托。 |

### ReturnValue

返回一个委托，其中包含左侧值的回调，然后是右侧的回调。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| 参数 | 描述 |
| --- | --- |
| T | [String](../string/) 字面量类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 左 | T\& | 用于连接到字符串的文字。 |
| right | const String\& | [String](../string/) 用于连接。 |

### ReturnValue

连接后的字符串。

## 另见

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| 参数 | 描述 |
| --- | --- |
| T | [String](../string/) 指针类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| left | T\& | [String](../string/) 指针，用于连接到字符串。 |
| right | const String\& | [String](../string/) 用于连接。 |

### ReturnValue

连接后的字符串。

## 另见

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
