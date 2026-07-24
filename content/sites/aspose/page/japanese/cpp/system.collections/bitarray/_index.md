---
title: "System::Collections::BitArray クラス"
linktitle: "BitArray"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::BitArray クラス。インデックスでアクセスできるビットの配列です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.collections/bitarray/
---
## BitArray class


[Array](../../system/array/) of bits which can be addressed by index. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class BitArray : public virtual System::Object,
                 public System::Collections::Generic::ICollection<bool>
```

## Nested classes

* Class [Enumerator](./enumerator/)
* Class [Reference](./reference/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const bool\&) override | コンテナの末尾に値を追加します。 |
| [And](./and/)(const BitArrayPtr\&) | 2 つの BitSet のビット単位の AND を計算します。 |
| [BitArray](./bitarray/)(const bitset\&) | コピーコンストラクタ。 |
| [BitArray](./bitarray/)(const BitArray\&) | コピーコンストラクタ。 |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | コピーコンストラクタ。 |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | コピーコンストラクタ。 |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | コピーコンストラクタ。 |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | コピーコンストラクタ。 |
| [BitArray](./bitarray/)(int, bool) | フィルコンストラクタ。 |
| [Clear](./clear/)() override | すべての要素を削除します。 |
| [Contains](./contains/)(const bool\&) const override | コンテナに特定の値が存在するかチェックします。未実装です。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | 既存の配列要素にデータをコピーします。 |
| [data](./data/)() | 基礎となるデータ構造へのアクセス。 |
| [data](./data/)() const | 基礎となるデータ構造へのアクセス。 |
| [Get](./get/)(int) const | [BitArray](./) 要素を取得します。 |
| [get_Count](./get_count/)() const override | コンテナのサイズを取得します。 |
| [get_Length](./get_length/)() const | コンテナのサイズを取得します。 |
| [GetEnumerator](./getenumerator/)() override | 列挙子オブジェクトを作成します。 |
| [idx_get](./idx_get/)(int) const | ゲッタ関数。 |
| [idx_set](./idx_set/)(int, bool) | セッタ関数。 |
| [Not](./not/)() | BitSet を否定します。 |
| [operator!=](./operator!=/)(const BitArray\&) const | ビット単位の比較演算子。 |
| [operator==](./operator==/)(const BitArray\&) const | ビット単位の比較演算子。 |
| [operator[]](./operator[]/)(int) | アクセサ関数。 |
| [Or](./or/)(const BitArrayPtr\&) | 2つの BitSet のビット単位の 'or' を計算します。 |
| [Remove](./remove/)(const bool\&) override | 指定された値の最初の出現を返します。実装されていません。 |
| [Set](./set/)(int, bool) | [BitArray](./) の要素を設定します。 |
| [SetAll](./setall/)(bool) | すべての要素を特定の値に設定します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 弱いテンプレート引数メカニズムの正式な実装です；このクラスには適用できません。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
| [Xor](./xor/)(const BitArrayPtr\&) | 2つの BitSet のビット単位の 'xor' を計算します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [bitset](./bitset/) | RTTI 情報。 |
## 備考



```cpp
#include <system/collections/bitarray.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void Print(const System::SmartPtr<System::Collections::Generic::IEnumerable<bool>> &bitArray)
{
  for (const auto item: bitArray)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // BitArray クラスの新しいインスタンスを構築します。
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // 値を出力します。
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## 参照

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
