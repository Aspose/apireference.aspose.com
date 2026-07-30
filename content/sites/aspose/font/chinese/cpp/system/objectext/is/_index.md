---
title: "System::ObjectExt::Is 方法"
linktitle: "是"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectExt::Is 方法。实现了 ''is'' 运算符的翻译。针对 C++ 中字符串字面量的特化。"
type: docs
weight: 1100
url: /zh/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


实现 'is' 运算符的翻译。针对字符串字面量的特化。

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) 字面量。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


实现 'is' 运算符的翻译。针对异常包装类型的特化。

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


实现了 'is' 运算符的翻译。针对 [Nullable](../../nullable/) 类型的特化。

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const Nullable\<U\>\& | [Nullable](../../nullable/) 类型。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


实现 'is' 运算符的翻译。针对值类型的特化。

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


实现 'is' 运算符的翻译。针对不可转换类型的特化。

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

始终返回 false，因为类型不可转换。

## 另见

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


实现 'is' 运算符的翻译。针对可空类型的特化。

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


实现 'is' 运算符的翻译。针对已定义 == 运算符的可装箱类型的特化。

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


实现 'is' 运算符的翻译。针对未定义 == 运算符的可装箱类型的特化。

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


实现 'is' 运算符的翻译。针对指针类型的特化。

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


实现 'is' 运算符的翻译。针对枚举类型的特化。

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |
| U | 指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


实现 'is' 运算符的翻译。针对值类型装箱为接口的特化。

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |
| V | 指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const T\&) method


实现 'is' 运算符的翻译。针对可装箱（值）类型的特化，即它们本身。

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) 用于测试 'is' 运算符。已忽略。 |

### ReturnValue

始终为 true

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


实现 'is' 运算符的翻译。针对指针类型的特化，针对 'final' 类进行优化。

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |
| U | 被测试的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


实现 'is' 运算符的翻译。针对指针类型的特化。

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |
| U | 被测试的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


实现 'is' 运算符的翻译。针对枚举类型与弱指针的特化。

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |
| U | 指向对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) 用于测试 'is' 运算符。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(int32_t) method


实现 'is' 运算符的翻译。针对整数字面量的特化。

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int32_t | 整数字面量。 |

### ReturnValue

如果 'is' 返回 true，则为真；否则为 false。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
