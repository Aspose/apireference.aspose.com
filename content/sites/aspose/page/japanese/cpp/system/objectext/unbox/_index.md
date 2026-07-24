---
title: "System::ObjectExt::Unbox メソッド"
linktitle: "アンボックス"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::Unbox メソッド。Object に変換した後に値型をアンボックスします。C++ の列挙型向けの実装です。"
type: docs
weight: 1400
url: /ja/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


値型を [Object](../../object/) に変換した後にアンボックスします。列挙型向けの実装です。

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Enum](../../enum/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) をアンボックスします。 |

### ReturnValue

[Enum](../../enum/) value.

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


値型を [Object](../../object/) に変換した後にアンボックスします。列挙型でなく、Nullable でもない型向けの実装です。

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 値型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) をアンボックスします。 |

### ReturnValue

アンボックスされた値。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


値型を [Object](../../object/) に変換した後にアンボックスします。列挙型でなく、Nullable でもない型向けの実装です。

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 値型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) をアンボックスします。 |

### ReturnValue

アンボックスされた値。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


文字列値をアンボックスします。

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) をアンボックス |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## 参照

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


列挙型を整数にアンボックスします。

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| パラメーター | 説明 |
| --- | --- |
| T | 変換先整数型。 |
| E | 変換元列挙型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| e | E | アンボックスする値。 |

### ReturnValue

列挙型の整数表現。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


列挙型を変換します。

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象の列挙型。 |
| E | 変換元列挙型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| e | E | アンボックスする値。 |

### ReturnValue

変換された列挙値。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
