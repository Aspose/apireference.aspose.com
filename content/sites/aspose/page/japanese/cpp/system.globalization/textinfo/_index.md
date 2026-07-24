---
title: "System::Globalization::TextInfo クラス"
linktitle: "TextInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::TextInfo クラス。ロケール固有のテキストプロパティを定義します。Setter 操作は読み取り専用でないオブジェクトでのみ有効です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際はそのポインタを使用してください。"
type: docs
weight: 2800
url: /ja/cpp/system.globalization/textinfo/
---
## TextInfo class


ロケール固有のテキストプロパティを定義します。Setter 操作は読み取り専用でないオブジェクトでのみ有効です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際はそのポインタを使用してください。

```cpp
class TextInfo : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 情報。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | ANSI コードページを取得します。 |
| [get_CultureName](./get_culturename/)() const | カルチャー名を取得します。 |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | EBCDIC コードページを取得します。 |
| [get_IsReadOnly](./get_isreadonly/)() const | 書式が読み取り専用かどうかを確認します。 |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | テキストが左から右へ書かれているか確認します。 |
| [get_LCID](./get_lcid/)() const | ロケール ID を取得します。 |
| virtual [get_ListSeparator](./get_listseparator/)() const | リスト区切り文字を取得します。 |
| virtual [get_MacCodePage](./get_maccodepage/)() const | Macintosh コードページを取得します。 |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | OEM コードページを取得します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | カルチャーの読み取り専用バージョンを取得します。 |
| virtual [set_ListSeparator](./set_listseparator/)(String) | リスト区切り文字を設定します。 |
| [TextInfo](./textinfo/)(const TextInfo\&) | RTTI 情報。 |
| virtual [ToLower](./tolower/)(char_t) const | 文字を小文字に変換します。 |
| virtual [ToLower](./tolower/)(String) const | 文字列を小文字に変換します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| [ToTitleCase](./totitlecase/)(String) const | 文字列をタイトルケースに変換します（すでに大文字の頭字語は除く）。 |
| virtual [ToUpper](./toupper/)(char_t) const | 文字を大文字に変換します。 |
| virtual [ToUpper](./toupper/)(String) const | 文字列を大文字に変換します。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
