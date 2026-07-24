---
title: "System::Collections::BitArray::Enumerator クラス"
linktitle: "列挙子"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::BitArray::Enumerator クラス。C++ で反復処理に使用される列挙子タイプです。"
type: docs
weight: 2900
url: /ja/cpp/system.collections/bitarray/enumerator/
---
## Enumerator class


[Enumerator](./) type for iteration purposes.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<bool>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<BitArray\>\&) | 列挙子を作成します。 |
| [get_Current](./get_current/)() const override | 対象ビットをブール形式で取得します。 |
| [MoveNext](./movenext/)() override | 次のビットへ移動します。 |
| [Reset](./reset/)() override | 列挙子を最初の要素の前の位置にリセットします。 |
## 参照

* Class [Object](../../../system/object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [BitArray](../)
* Namespace [System::Collections](../../)
* Library [Aspose.Page for C++](../../../)
