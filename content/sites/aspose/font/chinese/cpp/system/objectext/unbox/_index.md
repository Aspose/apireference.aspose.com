---
title: "System::ObjectExt::Unbox 方法"
linktitle: "解箱"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectExt::Unbox 方法。将值类型在转换为 Object 后解箱。C++ 中对枚举类型的实现。"
type: docs
weight: 1500
url: /zh/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


在转换为 [Object](../../object/) 后解箱值类型。对枚举类型的实现。

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | [Enum](../../enum/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 用于解箱。 |

### ReturnValue

[Enum](../../enum/) value.

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


在转换为 [Object](../../object/) 后解箱值类型。对非枚举且非可空类型的实现。

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 值类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 用于解箱。 |

### ReturnValue

已解箱的值。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


在转换为 [Object](../../object/) 后解箱值类型。对非枚举且非可空类型的实现。

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 值类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 用于解箱。 |

### ReturnValue

已解箱的值。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


解箱字符串值。

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 用于解箱 |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## 另见

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


将枚举类型解箱为整数。

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标整数类型。 |
| E | 源枚举类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| e | E | 待解箱的值。 |

### ReturnValue

枚举的整数表示。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


转换枚举类型。

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标枚举类型。 |
| E | 源枚举类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| e | E | 待解箱的值。 |

### ReturnValue

已转换的枚举值。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
