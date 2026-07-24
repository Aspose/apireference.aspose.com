---
title: "System::Array クラス"
linktitle: "配列"
second_title: "C++ 用 Aspose.Page"
description: "System::Array クラス。配列データ構造を表すクラスです。このクラスのオブジェクトは System::MakeArray() と System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 200
url: /ja/cpp/system/array/
---
## Array class


配列データ構造を表すクラスです。このクラスのオブジェクトは [System::MakeArray()](../makearray/) と [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、関数の引数として渡す際にそのポインタを使用してください。

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | 配列の要素の型 |
## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const T\&) override | 現在のオブジェクトが表す配列は読み取り専用のため、サポートされていません。 |
| [Array](./array/)() | 空の配列を構築します。 |
| [Array](./array/)(int, const T\&) | 初期化コンストラクタ。 |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | 初期化コンストラクタ。 |
| [Array](./array/)(int, const T) | 初期化コンストラクタ。 |
| [Array](./array/)(vector_t\&&) | ムーブコンストラクタ。 |
| [Array](./array/)(const vector_t\&) | コピーコンストラクタ。 |
| [Array](./array/)(const std::vector\<Q\>\&) | [Array](./) オブジェクトを構築し、値の型が **T** と同じで **[UnderlyingType](./underlyingtype/)** とは異なる std::vector オブジェクトからコピーされた値で埋めます。 |
| [Array](./array/)(std::vector\<Q\>\&&) | [Array](./) オブジェクトを構築し、値の型が **T** と同じで **[UnderlyingType](./underlyingtype/)** とは異なる std::vector オブジェクトからムーブされた値で埋めます。 |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | [Array](./) オブジェクトを構築し、**[UnderlyingType](./underlyingtype/)** 型の要素を含む指定されたイニシャライザリストから値で埋めます。 |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | 指定された配列から **[UnderlyingType](./underlyingtype/)** 型の要素を含む値で、[Array](./) オブジェクトを構築し、埋め込みます。 |
| [Array](./array/)(std::initializer_list\<bool\>, int) | bool 型の要素を含む指定されたイニシャライザリストから値で、[Array](./) オブジェクトを構築し、埋め込みます。 |
| [begin](./begin/)() | コンテナの最初の要素へのイテレータを返します。コンテナが空の場合、返されるイテレータは [end()](./end/) と等しくなります。 |
| [begin](./begin/)() const | const 修飾されたコンテナの最初の要素へのイテレータを返します。コンテナが空の場合、返されるイテレータは [end()](./end/) と等しくなります。 |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | ソート済み配列で二分探索を実行します。 |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | 未実装です。 |
| [cbegin](./cbegin/)() const | コンテナの最初の const 修飾要素へのイテレータを返します。コンテナが空の場合、返されるイテレータは [cend()](./cend/) と等しくなります。 |
| [cend](./cend/)() const | コンテナの最後の要素の次の要素へのイテレータを返します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [Clear](./clear/)() override | 現在のオブジェクトが表す配列は読み取り専用のため、サポートされていません。 |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | 指定された配列の **startIndex** インデックスから始まる **count** 個の値を既定値に置き換えます。 |
| [Clone](./clone/)() | 配列をクローンします。 |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 指定されたソースから開始する [System.Array](./) の要素範囲をコピーします。 |
| [Contains](./contains/)(const T\&) const override | 指定された項目が配列に含まれているかどうかを判定します。 |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | 指定されたコンバータデリゲートを使用して、指定された配列の要素を **OutputType** 型に変換したもので、新しい [Array](./) オブジェクトを構築し、埋め込みます。 |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | 指定されたコンバータ関数オブジェクトを使用して、指定された配列の要素を **OutputType** 型に変換したもので、新しい [Array](./) オブジェクトを構築し、埋め込みます。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | ソース配列からデスティネーション配列へ、指定された数の要素をコピーします。 |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | ソース配列ビューからデスティネーション配列へ、指定された数の要素をコピーします。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | ソース配列からデスティネーション配列ビューへ、指定された数の要素をコピーします。 |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | ソース配列ビューからデスティネーション配列ビューへ、指定された数の要素をコピーします。 |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | スタック上のソース配列からデスティネーション配列へ、指定された数の要素をコピーします。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | ソース配列からスタック上のデスティネーション配列へ、指定された数の要素をコピーします。 |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | スタック上のソース配列からスタック上のデスティネーション配列へ、指定された数の要素をコピーします。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 指定されたインデックスから開始するソース配列の指定された数の要素を、デスティネーション配列の指定された位置へコピーします。 |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 指定されたインデックスから開始するソース配列ビューの指定された数の要素を、デスティネーション配列の指定された位置へコピーします。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | 指定されたインデックスから開始するソース配列の指定された数の要素を、デスティネーション配列ビューの指定された位置へコピーします。 |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | 指定されたインデックスから開始するソース配列ビューの指定された数の要素を、デスティネーション配列ビューの指定された位置へコピーします。 |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | スタック上のソース配列で、指定されたインデックスから開始する指定された数の要素を、デスティネーション配列の指定された位置へコピーします。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | 指定されたインデックスから開始するソース配列の指定された数の要素を、スタック上のデスティネーション配列の指定された位置へコピーします。 |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | スタック上のソース配列で、指定されたインデックスから開始する指定された数の要素を、スタック上のデスティネーション配列の指定された位置へコピーします。 |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | ソース配列ビューで、指定されたインデックスから開始する指定された数の要素を、スタック上のデスティネーション配列の指定された位置へコピーします。 |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | 現在の配列のすべての要素を指定されたデスティネーション配列へコピーします。要素は arrayIndex 引数で指定されたインデックスからデスティネーション配列に挿入されます。 |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | 現在の配列のすべての要素を指定された宛先配列にコピーします。要素は、dstIndex 引数で指定されたインデックスから宛先配列に挿入されます。 |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | 現在の配列のすべての要素を指定された宛先配列ビューにコピーします。要素は、dstIndex 引数で指定されたインデックスから宛先配列ビューに挿入されます。 |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | 現在の配列から指定された位置で開始する指定数の要素を、指定された宛先配列にコピーします。要素は、dstIndex 引数で指定されたインデックスから宛先配列に挿入されます。 |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | 現在の配列から指定された位置で開始する指定数の要素を、指定された宛先配列ビューにコピーします。要素は、dstIndex 引数で指定されたインデックスから宛先配列ビューに挿入されます。 |
| [Count](./count/)() const | 配列のすべての次元における要素の総数を表す数値を返します。 |
| [crbegin](./crbegin/)() const | 逆順コンテナの最初の要素への逆イテレータを返します。これは逆順でないコンテナの最後の要素に対応します。コンテナが空の場合、返されるイテレータは [crend()](./crend/) と等しくなります。 |
| [crend](./crend/)() const | 逆順コンテナの最後の要素の次の要素への逆イテレータを返します。これは逆順でないコンテナの最初の要素の前の要素に対応します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [data](./data/)() | 配列要素を格納するために使用される内部データ構造への参照を返します。 |
| [data](./data/)() const | 配列要素を格納するために使用される内部データ構造への定数参照を返します。 |
| [data_ptr](./data_ptr/)() | 配列要素が格納されているメモリバッファの先頭への生ポインタを返します。 |
| [data_ptr](./data_ptr/)() const | 配列要素が格納されているメモリバッファの先頭への定数生ポインタを返します。 |
| [end](./end/)() | コンテナの最後の要素の次の要素へのイテレータを返します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [end](./end/)() const | const 修飾されたコンテナの最後の要素の次の要素へのイテレータを返します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | 指定された[Array](./)オブジェクトが、指定された述語の要件を満たす要素を含んでいるかどうかを判定します。 |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 指定された配列内で、指定された述語の条件を満たす最初の要素を検索します。 |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 指定された述語で定義された条件に一致するすべての要素を取得します。 |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 指定された配列内で、指定された述語の条件を満たす最初の要素を検索します。 |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | 指定された配列の各要素に対して、指定されたアクションを実行します。 |
| [get_Count](./get_count/)() const override | 配列のサイズを返します。 |
| [get_IsReadOnly](./get_isreadonly/)() const override | 配列が読み取り専用かどうかを示します。 |
| [get_Length](./get_length/)() const | 配列のすべての次元における要素の総数を表す 32 ビット整数を返します。 |
| [get_LongLength](./get_longlength/)() const | 配列のすべての次元における要素の総数を表す 64 ビット整数を返します。 |
| [get_Rank](./get_rank/)() const | 未実装です。 |
| [GetEnumerator](./getenumerator/)() override | 現在のオブジェクトが表す配列の要素に対して IEnumerator インターフェイスを提供する[Enumerator](./enumerator/)オブジェクトへのポインタを返します。 |
| [GetLength](./getlength/)(int) | 指定された次元の要素数を返します。 |
| [GetLongLength](./getlonglength/)(int) | 指定された次元の要素数を 64 ビット整数として返します。 |
| [GetLowerBound](./getlowerbound/)(int) const | 指定された次元の下限を返します。 |
| [GetSizeTLength](./getsizetlength/)() const | 配列のすべての次元における要素の総数を表す std::size_t 変数を返します。 |
| [GetUpperBound](./getupperbound/)(int) | 指定された次元の上限を返します。 |
| [idx_get](./idx_get/)(int) const override | 指定されたインデックスの項目を返します。 |
| [idx_set](./idx_set/)(int, T) override | 指定されたインデックスの配列項目として、指定された値を設定します。 |
| [IndexOf](./indexof/)(const T\&) const override | 配列内で指定された項目が最初に出現するインデックスを決定します。 |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | 配列内で指定された項目が最初に出現するインデックスを決定します。 |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | 指定されたインデックスから開始して、配列内で指定された項目が最初に出現するインデックスを決定します。 |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | 開始インデックスと範囲内の要素数で指定された配列の項目範囲内で、指定された項目が最初に出現するインデックスを決定します。 |
| [Init](./init/)(const T) | 現在のオブジェクトが表す配列を、指定された配列の値で埋めます。 |
| [Initialize](./initialize/)() | **T** 型のデフォルト構築オブジェクトで配列を埋めます。 |
| [Insert](./insert/)(int, const T\&) override | 現在のオブジェクトが表す配列は読み取り専用のため、サポートされていません。 |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | 開始インデックスと範囲内の要素数で指定された配列の項目範囲内で、指定された項目が最後に出現するインデックスを決定します。 |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | 指定されたインデックスから開始して、配列内で指定された項目が最後に出現するインデックスを決定します。 |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | 配列内で指定された項目が最後に出現するインデックスを決定します。 |
| [Max](./max/)() const | 配列内の要素を比較するために [operator<()](../operator_/) を使用して、最大の要素を見つけます。 |
| [Min](./min/)() const | 配列内の要素を比較するために [operator<()](../operator_/) を使用して、最小の要素を見つけます。 |
| [operator[]](./operator[]/)(int) | 指定されたインデックスの項目を返します。 |
| [operator[]](./operator[]/)(int) const | 指定されたインデックスの項目を返します。 |
| [rbegin](./rbegin/)() | 逆順コンテナの最初の要素への逆イテレータを返します。これは、非逆順コンテナの最後の要素に対応します。コンテナが空の場合、返されるイテレータは [rend()](./rend/) と等しくなります。 |
| [rbegin](./rbegin/)() const | 逆順コンテナの最初の要素への逆イテレータを返します。これは、非逆順コンテナの最後の要素に対応します。コンテナが空の場合、返されるイテレータは [rend()](./rend/) と等しくなります。 |
| [Remove](./remove/)(const T\&) override | 現在のオブジェクトが表す配列は読み取り専用のため、サポートされていません。 |
| [RemoveAt](./removeat/)(int) override | 現在のオブジェクトが表す配列は読み取り専用のため、サポートされていません。 |
| [rend](./rend/)() | 逆順コンテナの最後の要素の次の要素への逆イテレータを返します。これは逆順でないコンテナの最初の要素の前の要素に対応します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [rend](./rend/)() const | 逆順コンテナの最後の要素の次の要素への逆イテレータを返します。これは逆順でないコンテナの最初の要素の前の要素に対応します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | 指定された配列のサイズを指定された値に変更するか、指定されたサイズの新しい配列を作成します。 |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | 指定された配列の要素の順序を反転させます。 |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | 指定された配列の要素範囲の順序を反転させます。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 配列が格納されたポインタを弱参照として扱うようにします（該当する場合）。 |
| [SetValue](./setvalue/)(const T\&, int) | 指定されたインデックスの要素の値を設定します。 |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | デフォルトの比較子を使用して、指定された配列の要素をソートします。 |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | デフォルトの比較子を使用して、指定された配列の要素範囲をソートします。 |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | 指定された比較子を使用して、指定された配列の要素をソートします。 |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | 未実装です。 |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | キーを含む配列と対応する項目を含むもう一つの配列の二つを、キー配列の値に基づいてソートします。その要素は operator< を使用して比較されます。 |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | キーを含む配列と対応する項目を含むもう一つの配列の二つを、キー配列の値に基づいてソートします。その要素はデフォルトの比較子を使用して比較されます。 |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 指定された配列のすべての要素が、指定された述語で定義された条件を満たすかどうかを判定します。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [const_iterator](./const_iterator/) | const イテレータ型。 |
| [const_reverse_iterator](./const_reverse_iterator/) | const 逆イテレータ型。 |
| [EnumerablePtr](./enumerableptr/) | **T** 型の要素を含む IEnumerable オブジェクトを指す共有ポインタ型のエイリアスです。 |
| [EnumeratorPtr](./enumeratorptr/) | 型 **T** の要素を含む IEnumerator オブジェクトを指す共有ポインタ型のエイリアスです。 |
| [iterator](./iterator/) | イテレータ型。 |
| [reverse_iterator](./reverse_iterator/) | 逆イテレータ型。 |
| [UnderlyingType](./underlyingtype/) | 配列の各要素を表すために使用される型のエイリアスです。 |
| [ValueType](./valuetype/) | 配列の要素の型のエイリアスです。 |
## 備考



```cpp
#include <system/array.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<Array<int32_t>> &arrayPtr)
{
  for (auto item: arrayPtr)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // 配列を作成し、データを埋めます。
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // 配列の要素を出力します。
  Print(arrayPtr);

  // 配列の項目を昇順にソートします。
  Array<int32_t>::Sort(arrayPtr);

  // 配列の要素を出力します。
  Print(arrayPtr);

  // 配列の項目数を出力します。
  std::cout << arrayPtr->get_Length() << std::endl;

  // 値が 4 と等しい項目のインデックスを出力します。
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // 配列のサイズを変更します。
  Array<int32_t>::Resize(arrayPtr, 3);

  // 配列の要素を出力します。
  Print(arrayPtr);

  return 0;
}
/*
This code example produces the following output:
5 4 3 2 1
1 2 3 4 5
5
3
1 2 3
*/
```

## 参照

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
