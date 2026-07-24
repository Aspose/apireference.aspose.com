---
title: "System::ReadOnlySpan クラス"
linktitle: "ReadOnlySpan"
second_title: "C++ 用 Aspose.Page"
description: "System::ReadOnlySpan クラス。C++ の Span クラス内で使用するためのフォワードです。"
type: docs
weight: 5300
url: /ja/cpp/system/readonlyspan/
---
## ReadOnlySpan class


[Span](../span/) クラス内で使用するためのフォワードです。

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| パラメーター | 説明 |
| --- | --- |
| T | スパン内の要素の型です。このクラスは、オブジェクトの連続シーケンスを読み取り専用で安全に扱う方法を提供します。配列、スタック配列、または生ポインタをラップし、境界チェックを維持しながら使用できます。[ReadOnlySpan](./) は指すメモリを所有しません—既存のメモリへのビューにすぎません。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | 通常のスパンから読み取り専用スパンを構築します。 |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | 配列を [ReadOnlySpan](./) に変換します。 |
## 備考


任意のメモリの読み取り専用連続領域を表します。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
