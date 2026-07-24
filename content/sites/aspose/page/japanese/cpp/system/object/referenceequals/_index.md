---
title: "System::Object::ReferenceEquals メソッド"
linktitle: "ReferenceEquals"
second_title: "C++ 用 Aspose.Page"
description: "System::Object::ReferenceEquals メソッド。C++ における文字列と nullptr の場合の Object::ReferenceEquals の特殊化です。"
type: docs
weight: 1200
url: /ja/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


文字列と nullptr の場合の [Object::ReferenceEquals](./) の特殊化。

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | String const\& | nullptr と比較するための [String](../../string/)。 |

### ReturnValue

文字列がnullの場合はtrue、そうでない場合はfalseです。

## 参照

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


文字列の場合の [Object::ReferenceEquals](./) の特殊化。

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str1 | String const\& | 比較対象の最初の文字列。 |
| str2 | String const\& | 比較対象の2番目の文字列。 |

### ReturnValue

文字列が一致すれば true、そうでなければ false。

## 参照

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


参照によってオブジェクトを比較します。

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| objA | ptr const\\& | 比較する最初のポインタ。 |
| objB | ptr const\\& | 比較する2番目のポインタ。 |

### ReturnValue

ポインタが一致すれば true、そうでなければ false。

## 参照

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Reference-は値型オブジェクトを nullptr と比較します。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| パラメーター | 説明 |
| --- | --- |
| T | 比較対象のオブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| objA | T const\\& | 比較する最初のオブジェクト。 |

### ReturnValue

値型は null にできないため、常に false を返します。

## 参照

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


参照によってオブジェクトを比較します。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| パラメーター | 説明 |
| --- | --- |
| T | 比較対象のオブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| objA | T const\\& | 比較する最初のオブジェクト。 |
| objB | T const\\& | 比較する2番目のオブジェクト。 |

### ReturnValue

オブジェクトのアドレスが一致すれば true、そうでなければ false。

## 参照

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
