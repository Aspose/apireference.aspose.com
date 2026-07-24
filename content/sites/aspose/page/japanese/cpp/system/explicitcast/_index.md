---
title: "System::ExplicitCast メソッド"
linktitle: "明示的キャスト"
second_title: "C++ 用 Aspose.Page"
description: "System::ExplicitCast メソッド。明示的キャストを使用してソース型を結果型に変換します。C++ でソース型と結果型が同じ場合に使用されます。"
type: docs
weight: 18500
url: /ja/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。ソース型と結果型が同じ場合に使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。シンプルなコンストラクタ風キャストが必要な場合に使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。例外ラッパーに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。オブジェクトを例外にキャストするために使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。ソースと結果の両方がスマートポインタで、結果型に明示的な [SmartPtr<...>](../smartptr/) が含まれない場合に使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。ソースと結果の両方がスマートポインタで、結果型に明示的な [SmartPtr<...>](../smartptr/) が含まれる場合に使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。オブジェクトを nullable にアンボックスするために使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。nullable をボックスするために使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。nullable オブジェクトをアンボックスするために使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。列挙型のボクシングに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。値型をヒープにコピーし、スマートポインタとして参照すべき場合（インターフェイス型で制約されたジェネリックで、構造体がそのインターフェイスを実装している場合）に使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。値型からインターフェイスを取得するために使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。一般的なボクシングに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。 [System::String](../string/) のボクシングに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。インターフェイスのアンボックスに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。一般的なアンボックスに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。nullptr のキャストに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


明示的キャストを使用してソース型を結果型に変換します。配列間のキャストに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(Source) method


明示的キャストを使用してソース型を結果型に変換します。生ポインタをスマートポインタにキャストする場合に使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | Source | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
