---
title: "System::SmartPtr::Cast メソッド"
linktitle: "Cast"
second_title: "C++ 用 Aspose.Page"
description: "System::SmartPtr::Cast メソッド。C++ でポインタをその型自身にキャストします。"
type: docs
weight: 400
url: /ja/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


ポインタをその型自身にキャストします。

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| パラメーター | 説明 |
| --- | --- |
| Y | 指し示すオブジェクトのターゲット型。 |
| Check | キャストが利用できない場合に例外をスローするフラグ。 |

### ReturnValue

常に共有モードである、型が変更されたポインタ。

## 参照

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


static_cast を使用してポインタを基底型にキャストします。

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| パラメーター | 説明 |
| --- | --- |
| Y | 指し示すオブジェクトのターゲット型。 |
| Check | キャストが利用できない場合に例外をスローするフラグ。 |

### ReturnValue

常に共有モードである、型が変更されたポインタ。

## 参照

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


dynamic_cast を使用してポインタを派生型にキャストします。

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| パラメーター | 説明 |
| --- | --- |
| Y | 指し示すオブジェクトのターゲット型。 |
| Check | キャストが利用できない場合に例外をスローするフラグ。 |

### ReturnValue

常に共有モードである、型が変更されたポインタ。変換が利用できない場合は InvalidCastException をスローします。

## 参照

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


dynamic_cast を使用してポインタを派生型にキャストします。

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| パラメーター | 説明 |
| --- | --- |
| Y | 指し示すオブジェクトのターゲット型。 |
| Check | キャストが利用できない場合に例外をスローするフラグ。 |

### ReturnValue

常に共有モードである、型が変更されたポインタ。変換が利用できない場合は nullptr を返します。

## 参照

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
