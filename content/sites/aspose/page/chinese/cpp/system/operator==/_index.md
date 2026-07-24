---
title: "System::operator== 方法"
linktitle: "operator=="
second_title: "Aspose.Page 适用于 C++"
description: "如何在 C++ 中使用 operator== 方法的 类。"
type: docs
weight: 32400
url: /zh/cpp/system/operator==/
---
## System::operator==(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator==(ArraySegment<T> a, ArraySegment<T> b)
```

## 另见

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator==(Chars &left, const String &right)
```


| Parameter | 描述 |
| --- | --- |
| Chars | [String](../string/) 字面量类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| left | Chars\& | [String](../string/) 用于比较的字面量。 |
| right | const String\& | [String](../string/) 用于比较。 |

### ReturnValue

如果字符串匹配则为 true，否则为 false。

## 另见

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator==(const SharedPtr<Object> &left, const String &right)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/) 用于转换为字符串并比较。 |
| right | const String\& | [String](../string/) 用于比较。 |

### ReturnValue

如果对象的字符串表示等于该字符串则为 true，否则为 false。

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


确定当前对象和指定对象所表示的 URI 是否相等。

```cpp
bool System::operator==(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | 要比较的第一个 [Uri](../uri/) 对象 |
| uri2 | const SharedPtr\<Uri\>\& | 要比较的第二个 [Uri](../uri/) 对象 |

### ReturnValue

如果 URI 相等则为 true，否则为 false

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


比较两个智能指针是否相等。

```cpp
template<class X,class Y> bool System::operator==(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| Parameter | 描述 |
| --- | --- |
| X | 第一个指针的被指对象类型。 |
| Y | 第二个指针的被指对象类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | 要比较的第一个指针。 |
| y | const SmartPtr\<Y\>\& | 要比较的第二个指针。 |

### ReturnValue

如果指针匹配则为 true，否则为 false。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const SmartPtr\<X\>\&, const Y *) method


智能指针与普通 (C) 指针的相等性比较。

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator==(const SmartPtr<X> &x, const Y *y)
```


| Parameter | 描述 |
| --- | --- |
| X | 智能指针的类型。 |
| Y | 普通指针的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | 用于比较的智能指针（左）。 |
| y | const Y * | 指向要比较的指针（右）。 |

### ReturnValue

如果指针匹配则为 true，否则为 false。

## 另见

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const T1\&, const Nullable\<T2\>\&) method


确定通过对这些值应用 [operator==()](./) 来判断指定值是否等于指定的 [Nullable](../nullable/) 对象所表示的值。

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator==(const T1 &some, const Nullable<T2> &other)
```


| Parameter | 描述 |
| --- | --- |
| T1 | 第一个比较值的类型 |
| T2 | 表示第二个比较值的 [Nullable](../nullable/) 对象的底层类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 某些 | const T1\& | 对将用作第一个比较值的值的常量引用 |
| other | const Nullable\<T2\>\& | 对 [Nullable](../nullable/) 对象的常量引用，其表示的值将用作第二个比较值 |

### ReturnValue

如果比较的两个值相等则为 true，否则为 false

## 另见

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const X *, const SmartPtr\<Y\>\&) method


智能指针与普通 (C) 指针的相等性比较。

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator==(const X *x, const SmartPtr<Y> &y)
```


| Parameter | 描述 |
| --- | --- |
| X | 普通指针的类型。 |
| Y | 智能指针的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | const X * | 指向要比较的指针（右）。 |
| y | const SmartPtr\<Y\>\& | 用于比较的智能指针（左）。 |

### ReturnValue

如果指针匹配则为 true，否则为 false。

## 另见

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator==(std::nullptr_t, const DateTimeOffset &)
```

## 另见

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, const Nullable\<T\>\&) method


确定指定的 [Nullable](../nullable/) 对象是否表示等于 null 的值。

```cpp
template<typename T> bool System::operator==(std::nullptr_t, const Nullable<T> &other)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| other | std::nullptr_t | 对要测试的 [Nullable](../nullable/) 对象的常量引用 |

### ReturnValue

如果指定的对象表示 null 值则为 true，否则为 false

## 另见

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, const String\&) method


检查字符串是否为 null。

```cpp
bool System::operator==(std::nullptr_t, const String &str)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | std::nullptr_t | [String](../string/) 待检查。 |

### ReturnValue

如果字符串为 null 则为 true，否则为 false。

## 另见

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, DateTime) method




```cpp
bool System::operator==(std::nullptr_t, DateTime)
```

## 另见

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, SmartPtr\<X\> const\&) method


检查智能指针是否为 null。

```cpp
template<class X> bool System::operator==(std::nullptr_t, SmartPtr<X> const &x)
```


| Parameter | 描述 |
| --- | --- |
| X | 指针所指向的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | std::nullptr_t | 要检查的指针。 |

### ReturnValue

如果指针为 null 则为 true，否则为 false。

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, T const\&) method


检查值类型对象（翻译后的 C# 结构体等）是否为 null。

```cpp
template<class T> std::enable_if<!std::is_scalar<T>::value &&!std::is_pointer<T>::value &&!std::is_array<T>::value &&detail::has_method_is_null<T>::value, bool>::type System::operator==(std::nullptr_t, T const &x)
```


| Parameter | 描述 |
| --- | --- |
| T | 值类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | std::nullptr_t | [Object](../object/) 用于检查。 |

### ReturnValue

如果对象为 null 则为 true，否则为 false。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator==(std::nullptr_t, TimeSpan)
```

## 另见

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator==(T &left, const String &right)
```


| Parameter | 描述 |
| --- | --- |
| T | [String](../string/) 指针类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| left | T\& | [String](../string/) 用于比较的指针。 |
| right | const String\& | [String](../string/) 用于比较。 |

### ReturnValue

如果字符串匹配则为 true，否则为 false。

## 另见

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(T const\&, std::nullptr_t) method


检查值类型对象（翻译后的 C# 结构体等）是否为 null。

```cpp
template<class T> std::enable_if<!std::is_scalar<T>::value &&!std::is_pointer<T>::value &&!std::is_array<T>::value &&detail::has_method_is_null<T>::value, bool>::type System::operator==(T const &x, std::nullptr_t)
```


| Parameter | 描述 |
| --- | --- |
| T | 值类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| x | T const\& | [Object](../object/) 用于检查。 |

### ReturnValue

如果对象为 null 则为 true，否则为 false。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
