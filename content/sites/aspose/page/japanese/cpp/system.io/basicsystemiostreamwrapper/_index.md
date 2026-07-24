---
title: "System::IO::BasicSystemIOStreamWrapper クラス"
linktitle: "BasicSystemIOStreamWrapper"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BasicSystemIOStreamWrapper クラス。C++ で内部バッファとして BasicSystemIOStreamBuf を使用した std::iostream ライクなラッパーを表します。"
type: docs
weight: 500
url: /ja/cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


内部バッファとして [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) を使用した std::iostream ライクなラッパーを表します。

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | ポインタをリセットし、[swap()](./swap/) を呼び出すために、ムーブコンストラクタおよびムーブ代入演算子で使用されます。 |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | [BasicSystemIOStreamWrapper](./) の新しいインスタンスを構築します。 |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | コピーコンストラクタ。削除されています。 |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | ムーブコンストラクタ。 |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | コピー代入演算子。削除されています。 |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | ムーブ代入演算子。 |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | 等しくない場合に、*this と **right** を入れ替える呼び出しです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## 参照

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
