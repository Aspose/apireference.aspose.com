---
title: "System::ObjectExt::ToString メソッド"
linktitle: "ToString"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::ToString メソッド。C# の ToString メソッドの代替で、C++ の任意の型で動作します。"
type: docs
weight: 1300
url: /ja/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) リテラルを文字列に変換します。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 参照

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Nullable](../../nullable/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) オブジェクトを文字列に変換します。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 参照

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Enum](../../enum/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) 値を文字列に変換します。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 参照

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | スマートポインタ型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) 値を文字列に変換します。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 参照

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 構造体型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | 構造体の値を文字列に変換します。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 参照

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | スカラー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | T\&& | スカラー値を文字列に変換します。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 参照

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | スカラー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | T\&& | スカラー値を文字列に変換します。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 参照

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | スマートポインタ型または [ExceptionWrapper](../../exceptionwrapper/)。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | T\& | スマートポインタまたは [ExceptionWrapper](../../exceptionwrapper/) を文字列に変換します。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 参照

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | スカラー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | T\& | スカラー値を文字列に変換します。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 参照

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 構造体型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | T\& | 構造体の値を文字列に変換します。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 参照

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
