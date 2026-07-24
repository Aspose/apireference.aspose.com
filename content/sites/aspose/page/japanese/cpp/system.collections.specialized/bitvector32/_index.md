---
title: "System::Collections::Specialized::BitVector32 class"
linktitle: "BitVector32"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Specialized::BitVector32 class. C++ において、整数または Boolean に簡単にアクセスできるシンプルで軽量なビットベクタを 32 ビットのストレージに提供します。"
type: docs
weight: 100
url: /ja/cpp/system.collections.specialized/bitvector32/
---
## BitVector32 class


シンプルで軽量なビットベクタを、整数または [Boolean](../../system/boolean/) に簡単にアクセスできる形で 32 ビットのストレージに提供します。

```cpp
class BitVector32
```

## Nested classes

* Class [Section](./section/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [BitVector32](./bitvector32/)() | 新しい空の [BitVector32](./) インスタンスを初期化します。 |
| [BitVector32](./bitvector32/)(int32_t) | 指定された内部データを使用して、[BitVector32](./) 構造体の新しいインスタンスを初期化します。 |
| [BitVector32](./bitvector32/)(const BitVector32\&) | 指定された値に含まれる情報を使用して、[BitVector32](./) 構造体の新しいインスタンスを初期化します。 |
| static [CreateMask](./createmask/)() | シリーズ内の最初のマスクを作成します。 |
| static [CreateMask](./createmask/)(int32_t) | シリーズ内の次のマスクを作成します。 |
| static [CreateSection](./createsection/)(int16_t) | 指定された最大値で、シリーズ内の最初のセクションを作成します。 |
| static [CreateSection](./createsection/)(int16_t, BitVector32::Section) | 指定された最大値で、シリーズ内の次のセクションを作成します。 |
| [Equals](./equals/)(const BitVector32\&) | 指定されたオブジェクトが現在のオブジェクトと同じかどうかを判断します。 |
| [get_Data](./get_data/)() | このビットベクタに格納されている生データを返します... |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [idx_get](./idx_get/)(int32_t) | すべての指定されたビットが設定されているかどうかを示す値を取得します。 |
| [idx_get](./idx_get/)(BitVector32::Section) | 指定されたセクションの値を取得します。 |
| [idx_set](./idx_set/)(int32_t, bool) | すべての指定されたビットが設定されているかどうかを示す値を設定します。 |
| [idx_set](./idx_set/)(BitVector32::Section, int32_t) | 指定されたセクションの値を設定します。 |
| static [ToString](./tostring/)(const BitVector32\&) | value パラメーターで表される値を文字列に変換します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトで表される値を文字列に変換します。 |
## 参照

* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
