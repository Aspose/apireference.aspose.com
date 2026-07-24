---
title: "System::ObjectExt::Is メソッド"
linktitle: "は"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::Is メソッド。''is'' 演算子の翻訳を実装。C++ における文字列リテラルの特殊化。"
type: docs
weight: 1000
url: /ja/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


「is」演算子の実装変換。文字列リテラルの特殊化。

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) リテラル。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


「is」演算子の実装変換。例外ラッパー型の特殊化。

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


'is' 演算子の翻訳を実装。[Nullable](../../nullable/) 型の特殊化。

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Nullable\<U\>\& | [Nullable](../../nullable/) 型。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


'is' 演算子の変換を実装します。値型向けの特殊化です。

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


「is」演算子の実装変換。変換不可能な型の特殊化。

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

型が変換不可能なため、常に false を返します。

## 参照

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


「is」演算子の実装変換。nullable 型の特殊化。

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


「is」演算子の実装変換。== 演算子が定義されたボックス可能型の特殊化。

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


「is」演算子の実装変換。== が定義されていないボックス可能型の特殊化。

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


'is' 演算子の変換を実装します。ポインタ型向けの特殊化です。

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


「is」演算子の実装変換。列挙型の特殊化。

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |
| U | 指し示すオブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


「is」演算子の実装変換。インターフェイスにボックスされた値型の特殊化。

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |
| V | 指し示すオブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const T\&) method


'is' 演算子の変換を実装します。ボックス可能（値）型向けの特殊化で、正確にはそれらの型です。

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) を使用して 'is' 演算子をテストする。無視されます。 |

### ReturnValue

常に true

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


'is' 演算子の変換を実装します。'final' クラスに最適化されたポインタ型向けの特殊化です。

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |
| U | テスト対象の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


'is' 演算子の変換を実装します。ポインタ型向けの特殊化です。

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |
| U | テスト対象の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


「is」演算子の実装変換。列挙型と弱ポインタの比較の特殊化。

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |
| U | 指し示すオブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) を使用して 'is' 演算子をテストする。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(int32_t) method


「is」演算子の実装変換。整数リテラルの特殊化。

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int32_t | 整数リテラル。 |

### ReturnValue

'is' が true を返す場合は true、そうでない場合は false。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
