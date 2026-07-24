---
title: "System::Xml::XmlReaderSettings クラス"
linktitle: "XmlReaderSettings"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReaderSettings クラス。C++ の XmlReader::Create メソッドで作成された XmlReader オブジェクトでサポートする機能のセットを指定します。"
type: docs
weight: 3400
url: /ja/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


作成された [XmlReader](../xmlreader/) オブジェクトで、[XmlReader::Create](../xmlreader/create/) メソッドによって作成されたものに対してサポートする機能のセットを指定します。

```cpp
class XmlReaderSettings : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | [XmlReaderSettings](./) インスタンスのコピーを作成します。 |
| [get_CheckCharacters](./get_checkcharacters/)() | 文字チェックを行うかどうかを示す値を返します。 |
| [get_CloseInput](./get_closeinput/)() | リーダーが閉じられたときに、基になるストリームまたは TextReader を閉じるべきかどうかを示す値を返します。 |
| [get_ConformanceLevel](./get_conformancelevel/)() | [XmlReader](../xmlreader/) が従う準拠レベルを返します。 |
| [get_DtdProcessing](./get_dtdprocessing/)() | DTD の処理方法を決定する値を返します。 |
| [get_IgnoreComments](./get_ignorecomments/)() | コメントを無視するかどうかを示す値を返します。 |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | 処理指示を無視するかどうかを示す値を返します。 |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | 重要でない空白を無視するかどうかを示す値を返します。 |
| [get_LineNumberOffset](./get_linenumberoffset/)() | [XmlReader](../xmlreader/) オブジェクトの行番号オフセットを返します。 |
| [get_LinePositionOffset](./get_linepositionoffset/)() | [XmlReader](../xmlreader/) オブジェクトの行位置オフセットを返します。 |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | エンティティの展開により生成されるドキュメント内の文字数の最大許容数を示す値を返します。 |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | XML ドキュメントで許容される最大文字数を示す値を返します。0 の値は XML ドキュメントのサイズに制限がないことを意味します。0 以外の値は文字数で最大サイズを指定します。 |
| [get_NameTable](./get_nametable/)() | アトミック文字列比較に使用される [XmlNameTable](../xmlnametable/) を返します。 |
| [get_ProhibitDtd](./get_prohibitdtd/)() | 文書型定義 (DTD) の処理を禁止するかどうかを示す値を返します。 |
| [get_Schemas](./get_schemas/)() | スキーマ検証を実行する際に使用する XmlSchemaSet を返します。 |
| [get_ValidationFlags](./get_validationflags/)() | スキーマ検証設定を示す値を返します。この設定はスキーマを検証する [XmlReader](../xmlreader/) オブジェクトに適用されます（[XmlReaderSettings::get_ValidationType](./get_validationtype/) の値が [ValidationType::Schema](../validationtype/) の場合）。 |
| [get_ValidationType](./get_validationtype/)() | [XmlReader](../xmlreader/) が読み取り時に検証または型割り当てを実行するかどうかを示す値を返します。 |
| [Reset](./reset/)() | 設定クラスのメンバーをデフォルト値にリセットします。 |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | 文字チェックを行うかどうかを示す値を設定します。 |
| [set_CloseInput](./set_closeinput/)(bool) | リーダーが閉じられたときに基底ストリームまたは TextReader を閉じるかどうかを示す値を設定します。 |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | [XmlReader](../xmlreader/) が従う準拠レベルを設定します。 |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | DTD の処理方法を決定する値を設定します。 |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | コメントを無視するかどうかを示す値を設定します。 |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | 処理命令を無視するかどうかを示す値を設定します。 |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | 重要でない空白を無視するかどうかを示す値を設定します。 |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) | [XmlReader](../xmlreader/) オブジェクトの行番号オフセットを設定します。 |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) | [XmlReader](../xmlreader/) オブジェクトの行位置オフセットを設定します。 |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | エンティティ展開により生成されるドキュメントの最大許容文字数を示す値を設定します。 |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | XML ドキュメントの最大許容文字数を示す値を設定します。0 の値は XML ドキュメントのサイズに制限がないことを意味します。0 以外の値は文字数で最大サイズを指定します。 |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | アトミック文字列比較に使用される [XmlNameTable](../xmlnametable/) を設定します。 |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | 文書型定義 (DTD) の処理を禁止するかどうかを示す値を設定します。 |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | スキーマ検証を実行する際に使用する XmlSchemaSet を設定します。 |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | スキーマ検証設定を示す値を設定します。この設定はスキーマを検証する [XmlReader](../xmlreader/) オブジェクトに適用されます（[XmlReaderSettings::get_ValidationType](./get_validationtype/) の値が [ValidationType::Schema](../validationtype/) の場合）。 |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | [XmlReader](../xmlreader/) が読み取り時に検証または型割り当てを実行するかどうかを示す値を設定します。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | 外部ドキュメントにアクセスするために使用される [XmlResolver](../xmlresolver/) を設定します。 |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | リーダーが検証エラーに遭遇したときに発生するイベントハンドラーを追加します。 |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | リーダーが検証エラーに遭遇したときに発生するイベントハンドラーを削除します。 |
| [XmlReaderSettings](./xmlreadersettings/)() | 新しい [XmlReaderSettings](./) クラスのインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
