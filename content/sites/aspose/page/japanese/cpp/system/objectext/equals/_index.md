---
title: "System::ObjectExt::Equals メソッド"
linktitle: "等しい"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::Equals メソッド。C# Object.Equals 呼び出しの置き換えで、C++ で任意の型に対して機能します。文字列リテラルに対する文字列比較のオーバーロード。"
type: docs
weight: 700
url: /ja/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


C# の [Object.Equals](../../object/equals/) 呼び出しの置き換えで、C++ で任意の型に対して機能します。文字列リテラルに対する文字列比較のオーバーロード。

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| パラメーター | 説明 |
| --- | --- |
| N | [String](../../string/) リテラルのサイズ。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) リテラル。 |
| another | String | [String](../../string/)。 |

### ReturnValue

文字列が一致すれば true、そうでなければ false。

## 参照

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


IEC 60559:1989 によれば NaN は任意の値（NaN を含む）と等しくないにもかかわらず、C# スタイルの浮動小数点比較をエミュレートし、2 つの NaN を等しいとみなします。

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const double\& | 左辺の浮動小数点値。 |
| 別の | const double\& | 右辺の浮動小数点値。 |

### ReturnValue

**obj** と **another** がどちらも NaN であるか等しい場合は true、そうでなければ false。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


IEC 60559:1989 によれば NaN は任意の値（NaN を含む）と等しくないにもかかわらず、C# スタイルの浮動小数点比較をエミュレートし、2 つの NaN を等しいとみなします。

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const float\& | 左辺の浮動小数点値。 |
| 別の | const float\& | 右辺の浮動小数点値。 |

### ReturnValue

**obj** と **another** がどちらも NaN であるか等しい場合は true、そうでなければ false。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


C# の [Object.Equals](../../object/equals/) 呼び出しの代替で、C++ の任意の型で動作します。スマートポインタ型用のオーバーロード。

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| パラメーター | 説明 |
| --- | --- |
| T | 最初のオブジェクト型。 |
| T2 | 2 番目のオブジェクト型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | 最初のオブジェクト。 |
| 別の | const T2\& | 2 番目のオブジェクト。 |

### ReturnValue

オブジェクトが等しいとみなされれば true、そうでなければ false。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


C# の [Object.Equals](../../object/equals/) 呼び出しの代替で、C++ の任意の型で動作します。スカラー型用のオーバーロード。

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| パラメーター | 説明 |
| --- | --- |
| T | 最初のオブジェクト型。 |
| T2 | 2 番目のオブジェクト型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | 最初のオブジェクト。 |
| 別の | const T2\& | 2 番目のオブジェクト。 |

### ReturnValue

オブジェクトが等しいとみなされれば true、そうでなければ false。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


C# の [Object.Equals](../../object/equals/) 呼び出しの代替で、C++ の任意の型で動作します。構造体型用のオーバーロード。

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| パラメーター | 説明 |
| --- | --- |
| T | 最初のオブジェクト型。 |
| T2 | 2 番目のオブジェクト型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | T | 最初のオブジェクト。 |
| 別の | const T2\& | 2 番目のオブジェクト。 |

### ReturnValue

オブジェクトが等しいとみなされれば true、そうでなければ false。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
