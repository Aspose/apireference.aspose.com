---
title: "System::Xml::NameTable クラス"
linktitle: "NameTable"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::NameTable クラス。C++ でシングルスレッドの XmlNameTable を実装します。"
type: docs
weight: 500
url: /ja/cpp/system.xml/nametable/
---
## NameTable class


シングルスレッドの [XmlNameTable](../xmlnametable/) を実装します。

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const String\&) override | 指定された文字列をアトミック化し、[NameTable](./) に追加します。 |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | 指定された文字列をアトミック化し、[NameTable](./) に追加します。 |
| [Get](./get/)(const String\&) override | 指定された値のアトミック化された文字列を返します。 |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | 指定された配列の指定範囲の文字と同じ文字を含むアトム化された文字列を返します。 |
| [NameTable](./nametable/)() | [NameTable](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
