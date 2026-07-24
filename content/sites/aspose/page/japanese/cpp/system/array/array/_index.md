---
title: "System::Array::Array コンストラクタ"
linktitle: "配列"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::Array コンストラクタ。C++ で空の配列を構築します。"
type: docs
weight: 100
url: /ja/cpp/system/array/array/
---
## Array::Array() constructor


空の配列を構築します。

```cpp
System::Array<T>::Array()
```

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


[Array](../) オブジェクトを構築し、要素が **[UnderlyingType](../underlyingtype/)** 型である指定された配列から値で埋めます。

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| パラメーター | 説明 |
| --- | --- |
| InitArraySize | **init** 配列の要素数。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | 構築中の配列にコピーするための [Array](../)。 |

## 参照

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


[Array](../) オブジェクトを構築し、値の型が **T** と同じで **[UnderlyingType](../underlyingtype/)** とは異なる std::vector オブジェクトからコピーした値で埋めます。

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| パラメーター | 説明 |
| --- | --- |
| Q | コピー元の std::vector オブジェクトの要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const std::vector\<Q\>\& | 値をコピーする std::vector |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const vector_t\&) constructor


コピーコンストラクタ。

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| assgn | const vector_t\& | 値をコピーする std::vector |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T\&) constructor


初期化コンストラクタ。

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| count | int | 配列の初期サイズ |
| init | const T\& | 配列を埋めるために使用される初期値 |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T) constructor


初期化コンストラクタ。

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| count | int | 配列の初期サイズ |
| 初期化 | const T | 配列を埋めるための値 |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


指定された bool 型要素を含むイニシャライザリストから値を取得し、[Array](../) オブジェクトを構築してそれらで埋めます。

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | 配列を埋める要素を含むイニシャライザリスト |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


指定された **[UnderlyingType](../underlyingtype/)** 型要素を含むイニシャライザリストから値を取得し、[Array](../) オブジェクトを構築してそれらで埋めます。

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | 配列を埋める要素を含むイニシャライザリスト |

## 参照

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


値の型が **T** と同じで **[UnderlyingType](../underlyingtype/)** とは異なる std::vector オブジェクトからムーブされた値で、[Array](../) オブジェクトを構築し、埋めます。

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| パラメーター | 説明 |
| --- | --- |
| Q | 要素をムーブする元となる std::vector オブジェクトの要素型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | std::vector\<Q\>\&& | 値をコピーする std::vector |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


初期化コンストラクタ。

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| パラメーター | 説明 |
| --- | --- |
| ValueType | 初期値の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | 配列の初期サイズ |
| init | ValueType | 配列を埋めるために使用される初期値 |

## 参照

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(vector_t\&&) constructor


ムーブコンストラクタ。

```cpp
System::Array<T>::Array(vector_t &&value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | vector_t\&& | 配列が取得する要素を持つ std::vector |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
