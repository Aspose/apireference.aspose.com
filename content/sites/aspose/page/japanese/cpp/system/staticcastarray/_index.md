---
title: "System::StaticCastArray メソッド"
linktitle: "StaticCastArray"
second_title: "C++ 用 Aspose.Page"
description: "System::StaticCastArray メソッド。指定された配列の要素を別の型にキャストします。From が C++ の SmartPtr オブジェクトである場合のオーバーライドです。"
type: docs
weight: 39800
url: /ja/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


指定された配列の要素を別の型にキャストします。From が [SmartPtr](../smartptr/) オブジェクトである場合のオーバーライドです。

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| パラメーター | 説明 |
| --- | --- |
| へ | 指定された配列の要素をキャストする型 |
| From | キャスト対象の配列要素の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | キャスト対象の要素を含む配列への共有ポインタ |

### ReturnValue

**from** の要素に相当する **To** 型の要素を含む新しい配列へのポインタ

## Deprecated
下位互換性のために追加されました。代わりに ExplicitCast を使用してください。

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


指定された配列の要素を別の型にキャストします。From が Boxable で To が [Object](../object/)[]. の場合のオーバーライドです。

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| パラメーター | 説明 |
| --- | --- |
| へ | 指定された配列の要素をキャストする型 |
| From | キャスト対象の配列要素の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | キャスト対象の要素を含む配列への共有ポインタ |

### ReturnValue

**from** の要素に相当する **To** 型の要素を含む新しい配列へのポインタ

## Deprecated
下位互換性のために追加されました。代わりに ExplicitCast を使用してください。

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
