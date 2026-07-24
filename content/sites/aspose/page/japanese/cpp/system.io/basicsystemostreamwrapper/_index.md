---
title: "System::IO::BasicSystemOStreamWrapper クラス"
linktitle: "BasicSystemOStreamWrapper"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BasicSystemOStreamWrapper クラス。C++ で内部バッファとして BasicSystemIOStreamBuf を使用する std::ostream ライクなラッパーを表します。"
type: docs
weight: 700
url: /ja/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


内部バッファとして [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) を使用する std::ostream ライクなラッパーを表します。

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | ポインタをリセットし、[swap()](./swap/) を呼び出すために、ムーブコンストラクタおよびムーブ代入演算子で使用されます。 |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | [BasicSystemOStreamWrapper](./) の新しいインスタンスを構築します。 |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | コピーコンストラクタ。削除されています。 |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | ムーブコンストラクタ。 |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | コピー代入演算子。削除されています。 |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | ムーブ代入演算子。 |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | 等しくない場合に、*this と **right** を入れ替える呼び出しです。 |
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
