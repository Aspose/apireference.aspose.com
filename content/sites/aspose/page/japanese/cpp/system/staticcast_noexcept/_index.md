---
title: "System::StaticCast_noexcept メソッド"
linktitle: "StaticCast_noexcept"
second_title: "C++ 用 Aspose.Page"
description: "System::StaticCast_noexcept メソッド。C++ で Exception オブジェクトに対して static cast を実行します。"
type: docs
weight: 39400
url: /ja/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


[Exception](../exception/) オブジェクトに対して static cast を実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象の [Exception](../exception/) 型。 |
| TFrom | ソースの [Exception](../exception/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const TFrom\& | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合はキャスト結果を、そうでない場合は nullptr を返します。

## Deprecated
下位互換性のために残されています。代わりに AsCast を使用してください。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


[SmartPtr](../smartptr/) オブジェクトに対して static cast を実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象のポインティー型。 |
| TFrom | ソースのポインティー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合はキャスト結果を、そうでない場合は nullptr を返します。

## Deprecated
下位互換性のために残されています。代わりに AsCast を使用してください。

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Objects を [Exception](../exception/) オブジェクトに static cast します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象の [Exception](../exception/) 型。 |
| TFrom | [Object](../object/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合はキャスト結果を、そうでない場合は nullptr を返します。

## Deprecated
下位互換性のために残されています。代わりに AsCast を使用してください。

## 参照

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


[WeakPtr](../weakptr/) オブジェクトに対して static cast を実行します。

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象のポインティー型。 |
| TFrom | ソースのポインティー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合はキャスト結果を、そうでない場合は nullptr を返します。

## Deprecated
下位互換性のために残されています。代わりに AsCast を使用してください。

## 参照

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
