---
title: "System::Xml::Schema::XmlSchemaSet クラス"
linktitle: "XmlSchemaSet"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet クラス。C++ における XML スキーマ定義言語 (XSD) スキーマのキャッシュを保持します。"
type: docs
weight: 5800
url: /ja/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


XML [Schema](../) 定義言語 (XSD) スキーマのキャッシュを保持します。

```cpp
class XmlSchemaSet : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(String, const String\&) | 指定された URL の XML [Schema](../) 定義言語 (XSD) スキーマを [XmlSchemaSet](./) に追加します。 |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/) に含まれる XML [Schema](../) 定義言語 (XSD) スキーマを [XmlSchemaSet](./) に追加します。 |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | 指定された [XmlSchemaSet](./) に含まれるすべての XML [Schema](../) 定義言語 (XSD) スキーマを [XmlSchemaSet](./) に追加します。 |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | 指定された [XmlSchema](../xmlschema/) を [XmlSchemaSet](./) に追加します。 |
| [Compile](./compile/)() | [XmlSchemaSet](./) に追加された XML [Schema](../) 定義言語 (XSD) スキーマを 1 つの論理スキーマにコンパイルします。 |
| [Contains](./contains/)(String) | 指定されたターゲット名前空間 URI を持つ XML [Schema](../) 定義言語 (XSD) スキーマが [XmlSchemaSet](./) に存在するかどうかを示します。 |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | 指定された XML [Schema](../) 定義言語 (XSD) [XmlSchema](../xmlschema/) オブジェクトが [XmlSchemaSet](./) に存在するかどうかを示します。 |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | [XmlSchemaSet](./) からすべての [XmlSchema](../xmlschema/) オブジェクトを、指定されたインデックスから開始して、指定された配列にコピーします。 |
| [get_CompilationSettings](./get_compilationsettings/)() | [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) を [XmlSchemaSet](./) 用に返します。 |
| [get_Count](./get_count/)() | [XmlSchemaSet](./) に含まれる論理的な XML [Schema](../) 定義言語 (XSD) スキーマの数を返します。 |
| [get_GlobalAttributes](./get_globalattributes/)() | [XmlSchemaSet](./) のすべての XML [Schema](../) 定義言語 (XSD) スキーマに含まれるすべてのグローバル属性を返します。 |
| [get_GlobalElements](./get_globalelements/)() | [XmlSchemaSet](./) のすべての XML [Schema](../) 定義言語 (XSD) スキーマに含まれるすべてのグローバル要素を返します。 |
| [get_GlobalTypes](./get_globaltypes/)() | [XmlSchemaSet](./) のすべての XML [Schema](../) 定義言語 (XSD) スキーマに含まれるすべてのグローバルな単純型と複合型を返します。 |
| [get_IsCompiled](./get_iscompiled/)() | [XmlSchemaSet](./) の XML [Schema](../) 定義言語 (XSD) スキーマがコンパイル済みかどうかを示す値を返します。 |
| [get_NameTable](./get_nametable/)() | 新しい XML [Schema](../) 定義言語 (XSD) スキーマを読み込む際に [XmlSchemaSet](./) が使用するデフォルトの [XmlNameTable](../../system.xml/xmlnametable/) を返します。 |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | 指定された XML [Schema](../) 定義言語 (XSD) スキーマを [XmlSchemaSet](./) から削除します。 |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | 指定された XML [Schema](../) 定義言語 (XSD) スキーマと、そのインポートするすべてのスキーマを [XmlSchemaSet](./) から削除します。 |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | [XmlSchemaSet](./) に既に存在する XML [Schema](../) 定義言語 (XSD) スキーマを再処理します。 |
| [Schemas](./schemas/)() | [XmlSchemaSet](./) に含まれるすべての XML [Schema](../) 定義言語 (XSD) スキーマのコレクションを返します。 |
| [Schemas](./schemas/)(String) | 指定された名前空間に属する、[XmlSchemaSet](./) に含まれるすべての XML [Schema](../) 定義言語 (XSD) スキーマのコレクションを返します。 |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | [XmlSchemaSet](./) の [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) を設定します。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | スキーマの include および import 要素で参照される名前空間や場所を解決するために使用される [XmlResolver](../../system.xml/xmlresolver/) を設定します。 |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | XML [Schema](../) 定義言語 (XSD) スキーマの検証エラーに関する情報を受け取るためのイベントハンドラを追加します。 |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | XML [Schema](../) 定義言語 (XSD) スキーマの検証エラーに関する情報を受け取るためのイベントハンドラを削除します。 |
| [XmlSchemaSet](./xmlschemaset/)() | [XmlSchemaSet](./) クラスの新しいインスタンスを初期化します。 |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | 指定された [XmlNameTable](../../system.xml/xmlnametable/) を使用して、[XmlSchemaSet](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
