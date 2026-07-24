---
title: "System::Security::SecurityElement クラス"
linktitle: "SecurityElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::SecurityElement クラス。セキュリティオブジェクトをエンコードするための XML オブジェクトモデルです。実装されていません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.security/securityelement/
---
## SecurityElement class


セキュリティオブジェクトをエンコードするための XML オブジェクトモデルです。実装されていません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class SecurityElement : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | タグに属性を追加します。 |
| [AddChild](./addchild/)(SecurityElement) | 子タグを追加します。 |
| [Attribute](./attribute/)(const String\&) | 属性値を取得します。 |
| [Copy](./copy/)() | タグをクローンします。 |
| [Equal](./equal/)(SecurityElement) | パラメーターの等価性をチェックします。 |
| static [Escape](./escape/)(const String\&) | XML 文字列内の文字をエスケープします。 |
| static [FromString](./fromstring/)(const String\&) | XML コードから要素を作成します。 |
| [get_Attributes](./get_attributes/)() | タグの属性を取得します。 |
| [get_Children](./get_children/)() | タグの子オブジェクトを取得します。 |
| [get_Tag](./get_tag/)() | タグ名を取得します。 |
| [get_Text](./get_text/)() | タグの内部テキストを取得します。 |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | 属性名が有効かどうかをチェックします。 |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | 属性値が有効かどうかをチェックします。 |
| static [IsValidTag](./isvalidtag/)(const String\&) | タグが有効かどうかをチェックします。 |
| static [IsValidText](./isvalidtext/)(const String\&) | テキストが有効かどうかをチェックします。 |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | 名前で子タグを取得します。 |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | タグ名で子タグの内部テキストを取得します。 |
| [SecurityElement](./securityelement/)(const String\&) | コンストラクタ。 |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | コンストラクタ。 |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | タグ属性を設定します。 |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | タグの子オブジェクトを設定します。 |
| [set_Tag](./set_tag/)(const String\&) | タグ名を設定します。 |
| [set_Text](./set_text/)(const String\&) | タグの内部テキストを設定します。 |
| [ToString](./tostring/)() const override | タグを文字列に変換します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
