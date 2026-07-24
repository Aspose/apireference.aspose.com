---
title: "System::Object::Equals method"
linktitle: "等しい"
second_title: "C++ 用 Aspose.Page"
description: "System::Object::Equals method。C++ で C# の Object.Equals のセマンティクスを使用してオブジェクトを比較します。"
type: docs
weight: 300
url: /ja/cpp/system/object/equals/
---
## Object::Equals(ptr) method


C# の [Object.Equals](./) セマンティクスを使用してオブジェクトを比較します。

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | ptr | 現在のオブジェクトと比較するための [Object](../)。 |

### ReturnValue

オブジェクトが等しいとみなされる場合は true、そうでない場合は false。

## 参照

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(double const\&, double const\&) method


IEC 60559:1989 によれば NaN は任意の値（NaN を含む）と等しくないにもかかわらず、C# スタイルの浮動小数点比較をエミュレートし、2 つの NaN を等しいとみなします。

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| objA | double const\& | 左辺の浮動小数点値。 |
| objB | double const\& | 右辺の浮動小数点値。 |

### ReturnValue

**objA** と **objB** が両方とも NaN であるか等しい場合は true、そうでない場合は false。

## 参照

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(float const\&, float const\&) method


IEC 60559:1989 によれば NaN は任意の値（NaN を含む）と等しくないにもかかわらず、C# スタイルの浮動小数点比較をエミュレートし、2 つの NaN を等しいとみなします。

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| objA | float const\& | 左辺の浮動小数点値。 |
| objB | float const\& | 右辺の浮動小数点値。 |

### ReturnValue

**objA** と **objB** が両方とも NaN であるか等しい場合は true、そうでない場合は false。

## 参照

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


C# スタイルで参照型オブジェクトを比較します。

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 比較対象の最初のオブジェクトの型。 |
| T2 | 比較対象となる2番目のオブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| objA | T1 const\& | 比較する最初のオブジェクト。 |
| objB | T2 const\& | 比較する2番目のオブジェクト。 |

### ReturnValue

オブジェクトが参照または意味的に（[Object.Equals](./) に似た比較によって）一致する場合は true、そうでない場合は false。

## 参照

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


C# スタイルで値型オブジェクトを比較します。

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| パラメーター | 説明 |
| --- | --- |
| T1 | 比較対象の最初のオブジェクトの型。 |
| T2 | 比較対象となる2番目のオブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| objA | T1 const\& | 比較する最初のオブジェクト。 |
| objB | T2 const\& | 比較する2番目のオブジェクト。 |

### ReturnValue

利用可能な等価演算子でオブジェクトが等しいとみなされる場合は true、そうでない場合は false。

## 参照

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
