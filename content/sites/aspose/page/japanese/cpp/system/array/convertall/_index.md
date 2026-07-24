---
title: "System::Array::ConvertAll メソッド"
linktitle: "ConvertAll"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::ConvertAll メソッド。指定された配列の要素を **OutputType** 型に変換するコンバータデリゲートを使用して、新しい Array オブジェクトを作成し、要素で埋めます（C++）。"
type: docs
weight: 4800
url: /ja/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


指定された配列の要素を **OutputType** 型に変換するコンバータデリゲートを使用して、新しい [Array](../) オブジェクトを作成し、要素で埋めます。

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| パラメーター | 説明 |
| --- | --- |
| InputType | 入力配列の要素の型 |
| OutputType | 結果配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | [Array](../) オブジェクト |
| converter | Converter\<InputType, OutputType\> | 入力配列の各要素を **OutputType** 型の同等値に変換するために使用される [Converter](../../converter/) オブジェクト |

### ReturnValue

**input_array** の値に相当する **OutputType** 型の値を含む新しい配列

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


指定された配列の要素を **OutputType** 型に変換するコンバータ関数オブジェクトを使用して、新しい [Array](../) オブジェクトを作成し、要素で埋めます。

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| パラメーター | 説明 |
| --- | --- |
| InputType | 入力配列の要素の型 |
| OutputType | 結果配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | [Array](../) オブジェクト |
| コンバータ | std::function\<OutputType(InputType)> | 入力配列の各要素を **OutputType** 型の同等値に変換するために使用される関数オブジェクト |

### ReturnValue

**input_array** の値に相当する **OutputType** 型の値を含む新しい配列

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
