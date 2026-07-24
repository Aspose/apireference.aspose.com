---
title: "System::Version クラス"
linktitle: "バージョン"
second_title: "C++ 用 Aspose.Page"
description: "System::Version クラス。バージョン番号を表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ では System::SmartPtr クラスを使用してこの型のオブジェクトを管理しないでください。"
type: docs
weight: 7300
url: /ja/cpp/system/version/
---
## Version class


バージョン番号を表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。[System::SmartPtr](../smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class Version
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CompareTo](./compareto/)(const Version\&) const | 現在のオブジェクトと指定されたオブジェクトが表すバージョンを比較します。 |
| [Equals](./equals/)(const Version\&) const | 現在のオブジェクトと指定されたオブジェクトが表すバージョン番号が等しいかどうかを判定します。 |
| [get_Build](./get_build/)() const | ビルド番号を返します。 |
| [get_Major](./get_major/)() const | メジャーバージョンを返します。 |
| [get_MajorRevision](./get_majorrevision/)() const | リビジョン番号の上位 16 ビットの値を返します。 |
| [get_Minor](./get_minor/)() const | マイナーバージョンを返します。 |
| [get_MinorRevision](./get_minorrevision/)() const | リビジョン番号の下位 16 ビットの値を返します。 |
| [get_Revision](./get_revision/)() const | リビジョン番号を返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| static [Parse](./parse/)(const String\&) | [Version](./) クラスの等価インスタンスに、バージョン番号の文字列表現を変換します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表すバージョン番号の文字列表現を返します。 |
| [ToString](./tostring/)(int) const | 現在のオブジェクトが表すバージョン番号の、指定されたセクション数の文字列表現を返します。 |
| [Version](./version/)(int, int, int, int) | 指定されたメジャー、マイナー、ビルド、リビジョンの値を表すインスタンスを構築します。 |
| [Version](./version/)(int, int, int) | 指定されたメジャー、マイナー、ビルドの値を表すインスタンスを構築します。 |
| [Version](./version/)(int, int) | 指定されたメジャーと値を表すインスタンスを構築します。 |
| [Version](./version/)(const String\&) | 文字列として表されたバージョン番号を表すインスタンスを構築します。 |
| [Version](./version/)() | バージョン番号 0.0.-1.-1 を表すインスタンスを構築します。 |
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
