---
title: "System::GetHashCode メソッド"
linktitle: "GetHashCode"
second_title: "C++ 用 Aspose.Page"
description: "System::GetHashCode メソッド。std::thread::id の特殊化; C++ で指定されたスレッドオブジェクトのハッシュコードを返します。"
type: docs
weight: 21200
url: /ja/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


std::thread::id の特殊化; 指定されたスレッドオブジェクトのハッシュコードを返します。

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


指定されたスカラー値のハッシュコードを返します。

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 関数がハッシュコードを生成する対象となる値の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | ハッシュコードを生成する対象の値 |

### ReturnValue

指定された値に対して生成されたハッシュコード

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


指定されたオブジェクトのハッシュコードを返します。

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 関数がハッシュコードを生成するオブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | ハッシュコードを生成するオブジェクトを指す[SmartPtr](../smartptr/) |

### ReturnValue

指定されたオブジェクトのために生成されたハッシュコード

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


例外である指定されたオブジェクトのハッシュコードを返します。

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 関数がハッシュコードを生成するオブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | ハッシュコードを生成するオブジェクトを含む[Exception](../exception/)ラッパー |

### ReturnValue

指定されたオブジェクトのために生成されたハッシュコード

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


スマートポインタでも例外でもない指定されたオブジェクトのハッシュコードを返します。

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 関数がハッシュコードを生成するオブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | ハッシュコードを生成するオブジェクトへのconst参照 |

### ReturnValue

指定されたオブジェクトのために生成されたハッシュコード

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
