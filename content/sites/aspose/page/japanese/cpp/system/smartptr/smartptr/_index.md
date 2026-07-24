---
title: "System::SmartPtr::SmartPtr コンストラクタ"
linktitle: "SmartPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::SmartPtr::SmartPtr コンストラクタ。参照された配列の型を、異なる型の新しい配列を作成することで変換します。C# で配列の型キャストが行われているが、C++ ではサポートされていない場合に便利です。"
type: docs
weight: 100
url: /ja/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


参照された配列の型を、異なる型の新しい配列を作成して変換します。C# で配列の型キャストが可能だが C++ ではサポートされていない場合に便利です。

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| パラメーター | 説明 |
| --- | --- |
| Y | 元配列の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | 要素の型が異なるコピーを作成するための配列へのポインタ。 |
| mode | SmartPtrMode | ポインターモード。 |

## 参照

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


ptr の初期値と所有権情報を共有する [SmartPtr](../) を構築しますが、無関係で管理されていないポインタ p を保持します。

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | 所有権を共有する別のスマートポインタ。 |
| p | Pointee_ * | 管理対象オブジェクトへのポインタ。 |
| mode | SmartPtrMode | ポインターモード。 |

## 参照

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


[SmartPtr](../) オブジェクトをコピー構築します。両方のポインタはその後同じオブジェクトを指します。許可されていれば型変換を行います。

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| パラメーター | 説明 |
| --- | --- |
| Q | x が指すオブジェクトの型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | コピー先のポインタ。 |
| mode | SmartPtrMode | ポインターモード。 |

## 参照

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


[SmartPtr](../) オブジェクトをコピー構築します。両方のポインタはその後同じオブジェクトを指します。

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ptr | const SmartPtr_\& | コピー先のポインタ。 |
| mode | SmartPtrMode | ポインターモード。 |

## 参照

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


空の配列を初期化します。いくつかの C# コード構文を変換するために使用されます。

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| パラメーター | 説明 |
| --- | --- |
| Y | EmptyArrayInitializer 型のプレースホルダー。 |

## 参照

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


指定されたオブジェクトを指す [SmartPtr](../) を作成するか、生ポインタを [SmartPtr](../) に変換します。

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| オブジェクト | Pointee_ * | ポインティー。 |
| mode | SmartPtrMode | ポインターモード。 |

## 参照

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


[SmartPtr](../) オブジェクトをムーブ構築します。実質的に、両方が同じモードであれば二つのポインタを入れ替えます。呼び出し後、x は使用できなくなる可能性があります。

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| x | SmartPtr_\&& | ムーブ先のポインタ。 |
| mode | SmartPtrMode | ポインターモード。 |

## 参照

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


必要なモードの [SmartPtr](../) オブジェクトを作成します。

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| mode | SmartPtrMode | ポインターモード。 |

## 参照

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


必要なモードの null ポインタ [SmartPtr](../) オブジェクトを作成します。

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| mode | std::nullptr_t | ポインターモード。 |

## 参照

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
