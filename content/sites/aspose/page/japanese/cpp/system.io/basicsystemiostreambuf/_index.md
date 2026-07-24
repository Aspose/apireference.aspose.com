---
title: "System::IO::BasicSystemIOStreamBuf class"
linktitle: "BasicSystemIOStreamBuf"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BasicSystemIOStreamBuf class。System::IO::Stream のようなストリームをラップし、C++ で std::iostream のようなストリーム内部バッファとして使用できるバッファを表します。"
type: docs
weight: 400
url: /ja/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


[System::IO::Stream](../stream/) のようなストリームをラップし、std::iostream のようなストリーム内部バッファとして使用できるバッファを表します。

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | ポインタをリセットし、[swap()](./swap/) を呼び出すために、ムーブコンストラクタおよびムーブ代入演算子で使用されます。 |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | [BasicSystemIOStreamBuf](./) の新しいインスタンスを構築します。 |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | [BasicSystemIOStreamBuf](./) の新しいインスタンスを構築します。 |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | コピーコンストラクタ。削除されています。 |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | ムーブコンストラクタ。 |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | コピー代入演算子。削除されています。 |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | ムーブ代入演算子。 |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | 等しくない場合に、*this と right を入れ替える呼び出しです。 |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | デストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## 参照

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
