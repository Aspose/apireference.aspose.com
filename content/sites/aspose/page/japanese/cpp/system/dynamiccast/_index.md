---
title: "System::DynamicCast メソッド"
linktitle: "DynamicCast"
second_title: "C++ 用 Aspose.Page"
description: "System::DynamicCast メソッド。C++ の Exception オブジェクトに対して動的キャストを実行します。"
type: docs
weight: 16900
url: /ja/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


[Exception](../exception/) オブジェクトに対して動的キャストを実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


[SmartPtr](../smartptr/) オブジェクトに対して動的キャストを実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\>) method


キャストを使用してボックス化された列挙体のアンボックスを行います。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象の列挙体型。 |
| TFrom | ソースのポインティー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | データをアンボックスする対象オブジェクトへのポインタ。 |

### ReturnValue

アンボックスされた列挙体の値。

## Deprecated
下位互換性のために残されています。代わりに ExplicitCast を使用してください。

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


オブジェクトを [Exception](../exception/) オブジェクトに動的キャストします。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
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
## System::DynamicCast(std::nullptr_t) method


null オブジェクトの動的キャストを実行します。

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
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
## System::DynamicCast(TFrom\&) method


ポインタでないオブジェクトに対して動的キャストを実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象型。 |
| TFrom | ソース型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | TFrom\& | ソースオブジェクト。 |

### ReturnValue

キャスト結果。

## Deprecated
下位互換性のために残されています。代わりに ExplicitCast を使用してください。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom) method


IntPtr からポインタへの動的キャストを実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象型。 |
| TFrom | ソース型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | TFrom | 元の IntPtr 値。 |

### ReturnValue

キャスト結果。

## Deprecated
下位互換性のために残されています。代わりに ExplicitCast を使用してください。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
