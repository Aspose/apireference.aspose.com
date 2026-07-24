---
title: "System::DynamicCast_noexcept メソッド"
linktitle: "DynamicCast_noexcept"
second_title: "C++ 用 Aspose.Page"
description: "System::DynamicCast_noexcept メソッド。古い廃止予定のキャストです。将来のC++バージョンで削除される予定です。"
type: docs
weight: 17600
url: /ja/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


古い廃止されたキャストです。将来のバージョンで削除されます。

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
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
## 備考


[Exception](../exception/) オブジェクトに対して動的キャストを実行します。 ## 非推奨
下位互換性のために残されています。代わりに AsCast を使用してください。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


[SmartPtr](../smartptr/) オブジェクトに対して動的キャストを実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
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
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


オブジェクトを [Exception](../exception/) オブジェクトに動的キャストします。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
