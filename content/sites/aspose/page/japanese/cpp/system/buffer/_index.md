---
title: "System::Buffer クラス"
linktitle: "バッファ"
second_title: "C++ 用 Aspose.Page"
description: "System::Buffer クラス。生バイト配列を操作するメソッドを含みます。これはインスタンスサービスを持たない静的型です。C++ ではいかなる方法でもインスタンスを作成すべきではありません。"
type: docs
weight: 1000
url: /ja/cpp/system/buffer/
---
## Buffer class


生バイト配列を操作するメソッドを含みます。これはインスタンスサービスを持たない静的型です。いかなる手段でもインスタンスを作成してはいけません。

```cpp
class Buffer
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [BlockCopy](./blockcopy/)(const uint8_t *, int, uint8_t *, int, int) | 指定されたバイト数をソースバッファから宛先バッファへコピーします。 |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | 指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。 |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | 指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。 |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | 指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。 |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | 指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。 |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | 指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。 |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | 指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。 |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | 指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。 |
| static [ByteLength](./bytelength/)(const SharedPtr\<Array\<T\>\>\&) | 指定された配列のすべての要素が占めるバイト数を決定します。 |
| static [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | 指定された配列のすべての要素が占めるバイト数を決定します。 |
| static [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | 指定された配列のすべての要素が占めるバイト数を決定します。 |
| static [GetByte](./getbyte/)(const SharedPtr\<Array\<T\>\>\&, int) | 指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置のバイト値を取得します。 |
| static [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | 指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置のバイト値を取得します。 |
| static [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | 指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置のバイト値を取得します。 |
| static [SetByte](./setbyte/)(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) | 指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置に指定されたバイト値を設定します。 |
| static [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, uint8_t) | 指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置に指定されたバイト値を設定します。 |
| static [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, uint8_t) | 指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置に指定されたバイト値を設定します。 |
## 備考



```cpp
#include <system/buffer.h>

using namespace System;

void Print(const SmartPtr<Array<uint8_t>> &source, int size)
{
  for (auto i = 0; i < size; i++)
  {
    std::cout << static_cast<int>(source[i]) << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // 配列を作成し、データを埋めます。
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // 配列の要素を出力します。
  Print(first, SIZE);

  // 最初の配列の一部を含む配列を作成します。
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // 2 番目の配列の要素を出力します。
  Print(second, SIZE / 2);

  // インデックス 0 の要素の値を設定し、配列の要素を出力します。
  Buffer::SetByte(second, 0, 128);
  Print(second, SIZE / 2);

  return 0;
}
/*
This code example produces the following output:
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
16 18 20 22 24 26 28 30
128 18 20 22 24 26 28 30
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
