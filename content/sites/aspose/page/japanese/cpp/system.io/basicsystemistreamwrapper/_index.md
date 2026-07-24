---
title: "System::IO::BasicSystemIStreamWrapper クラス"
linktitle: "BasicSystemIStreamWrapper"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BasicSystemIStreamWrapper クラス。C++ で内部バッファとして BasicSystemIOStreamBuf を使用した std::istream ライクなラッパーを表します。"
type: docs
weight: 600
url: /ja/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


内部バッファとして [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) を使用した std::istream ライクなラッパーを表します。

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | ポインタをリセットし、[swap()](./swap/) を呼び出すために、ムーブコンストラクタおよびムーブ代入演算子で使用されます。 |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | 新しい [BasicSystemIStreamWrapper](./) のインスタンスを構築します。 |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | コピーコンストラクタ。削除されています。 |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | ムーブコンストラクタ。 |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | コピー代入演算子。削除されています。 |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | ムーブ代入演算子。 |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | 等しくない場合に、*this と **right** を入れ替える呼び出しです。 |
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
