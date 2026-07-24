---
title: "System::AsCast メソッド"
linktitle: "AsCast"
second_title: "C++ 用 Aspose.Page"
description: "System::AsCast メソッド。''as'' 演算子キャストを使用してソース型を結果型にキャストします。C++ でシンプルなコンストラクタ風キャストが必要なときに使用します。"
type: docs
weight: 13500
url: /ja/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


'as' 演算子キャストを使用してソース型を結果型にキャストします。シンプルなコンストラクタ風キャストが必要なときに使用します。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。ソース型と結果型が同じ場合に使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。例外ラッパーに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。変換が利用できない場合は nullptr を返します。

## 参照

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。オブジェクトを例外にキャストするために使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。変換が利用できない場合は nullptr を返します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。ソースと結果が両方ともスマートポインタである場合に使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。変換が利用できない場合は nullptr を返します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。ソースと結果が両方ともスマートポインタである場合に使用されます（結果型に明示的な[SmartPtr<...>](../smartptr/) が含まれる場合）。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。変換が利用できない場合は nullptr を返します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。オブジェクトを nullable にアンボックスするために使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。変換が利用できない場合は空の nullable を返します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。オブジェクト以外の型へのアンボックスは無効です。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

常に null を返します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


オブジェクト以外の型へのアンボックスは無効です。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

常に null を返します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。nullable オブジェクトをボックスするために使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。一般的なオブジェクトをボックスするために使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。一般的なオブジェクトをボックスするために使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。文字列のアンボックスに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。nullptr のキャスティングに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


ソース型を結果型に 'as' 演算子キャストで変換します。配列間のキャストに使用されます。

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| パラメーター | 説明 |
| --- | --- |
| ソース | ソース型。 |
| Result | 結果型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) をキャスト。 |

### ReturnValue

キャスト結果。配列の任意の要素に変換が利用できない場合は nullptr を返します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
