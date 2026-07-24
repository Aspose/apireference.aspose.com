---
title: "System::WeakPtr::WeakPtr コンストラクタ"
linktitle: "WeakPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::WeakPtr::WeakPtr コンストラクタ。C++ で x が指す同じポインタを参照する弱ポインタを作成します。"
type: docs
weight: 100
url: /ja/cpp/system/weakptr/weakptr/
---
## WeakPtr::WeakPtr(const SmartPtr\<Q\>\&) constructor


x が指す同じポインタを参照する弱ポインタを作成します。

```cpp
template<class Q,typename> System::WeakPtr<T>::WeakPtr(const SmartPtr<Q> &x)
```


| パラメーター | 説明 |
| --- | --- |
| Q | ソースポインタの指し示す型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | ポインティーの値をコピーする元のポインタです。 |

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(const SmartPtr_\&) constructor


ptr が指す同じポインタを参照する弱ポインタを作成します。

```cpp
System::WeakPtr<T>::WeakPtr(const SmartPtr_ &ptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ptr | const SmartPtr_\& | ポインティーの値をコピーする元のポインタです。 |

## 参照

* Typedef [SmartPtr_](../smartptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(const WeakPtr\<Q\>\&) constructor


弱ポインタをコピー構築します。

```cpp
template<class Q,typename> System::WeakPtr<T>::WeakPtr(const WeakPtr<Q> &x)
```


| パラメーター | 説明 |
| --- | --- |
| Q | ソースのポインティー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const WeakPtr\<Q\>\& | ポインティーの値をコピーする元のポインタです。 |

## 参照

* Class [WeakPtr](../)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(const WeakPtr_\&) constructor


弱ポインタをコピー構築します。

```cpp
System::WeakPtr<T>::WeakPtr(const WeakPtr_ &ptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ptr | const WeakPtr_\& | ポインティーの値をコピーする元のポインタです。 |

## 参照

* Typedef [WeakPtr_](../weakptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(Pointee_ *) constructor


指定されたオブジェクトへの弱ポインタを作成します。

```cpp
System::WeakPtr<T>::WeakPtr(Pointee_ *object)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| object | Pointee_ * | 弱ポインタを作成する対象の [Object](../../object/)です。 |

## 参照

* Typedef [Pointee_](../pointee_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(SmartPtr_\&&) constructor


弱ポインタをムーブ構築します。

```cpp
System::WeakPtr<T>::WeakPtr(SmartPtr_ &&x)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | SmartPtr_\&& | ポインティーの値をムーブする元のポインタです。 |

## 参照

* Typedef [SmartPtr_](../smartptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(std::nullptr_t) constructor


null ポインタを作成します。

```cpp
System::WeakPtr<T>::WeakPtr(std::nullptr_t=nullptr)
```

## 参照

* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
