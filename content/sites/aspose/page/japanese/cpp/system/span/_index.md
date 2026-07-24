---
title: "System::Span クラス"
linktitle: "Span"
second_title: "C++ 用 Aspose.Page"
description: "System::Span クラス。任意のメモリの連続領域を表し、C++ の C++20 の std::span に似ています。"
type: docs
weight: 5700
url: /ja/cpp/system/span/
---
## Span class


C++20 の std::span に似た、任意のメモリの連続領域を表します。

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| パラメーター | 説明 |
| --- | --- |
| T | スパン内の要素の型。このクラスはオブジェクトの連続シーケンスを型安全に扱う方法を提供します。配列、スタック配列、または生ポインタをラップし、境界チェックを維持するために使用できます。[Span](./) は指すメモリを所有しません—既存のメモリへのビューにすぎません。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clear](./clear/)() const | すべての要素をデフォルト値に設定して、スパンの内容をクリアします。 |
| [Fill](./fill/)(const T\&) const | 指定された値でスパンを埋めます。 |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | 配列を [Span](./) に変換します。 |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
