---
title: "System::StaticCast メソッド"
linktitle: "StaticCast"
second_title: "C++ 用 Aspose.Page"
description: "System::StaticCast メソッド。C++ でポインタでないオブジェクトに対して static cast を実行します。"
type: docs
weight: 38500
url: /ja/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


ポインタでないオブジェクトに対して static cast を実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象型。 |
| TFrom | ソース型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const TFrom\& | ソースオブジェクト。 |

### ReturnValue

キャストが許可されている場合のキャスト結果。

## Deprecated
下位互換性のために残されています。代わりに ExplicitCast を使用してください。

## 参照

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom\&) method


[Exception](../exception/) オブジェクトに対して static cast を実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象の [Exception](../exception/) 型。 |
| TFrom | ソースの [Exception](../exception/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const TFrom\& | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合のキャスト結果。

## Deprecated
下位互換性のために残されています。代わりに ExplicitCast を使用してください。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom *) method


算術型に対する特殊化。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


[SmartPtr](../smartptr/) オブジェクトに対して static cast を実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象のポインティー型。 |
| TFrom | ソースのポインティー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合のキャスト結果。

## Deprecated
下位互換性のために残されています。代わりに ExplicitCast を使用してください。

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\>) method


Objects を [Exception](../exception/) オブジェクトに static cast します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象の [Exception](../exception/) 型。 |
| TFrom | [Object](../object/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合のキャスト結果。

## Deprecated
下位互換性のために残されています。代わりに ExplicitCast を使用してください。

## 参照

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(std::nullptr_t) method


null オブジェクトの static cast を実行します。

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象のポインティー型。 |

### ReturnValue

nullptr。

## Deprecated
下位互換性のために残されています。代わりに ExplicitCast を使用してください。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TFrom) method


算術型に対する特殊化。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TTo) method


[String](../string/) から [String](../string/) へのキャストを処理します。

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## 参照

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


[WeakPtr](../weakptr/) オブジェクトに対して static cast を実行します。

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象のポインティー型。 |
| TFrom | ソースのポインティー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合のキャスト結果。

## Deprecated
下位互換性のために残されています。代わりに ExplicitCast を使用してください。

## 参照

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
