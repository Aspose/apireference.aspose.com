---
title: "System::Xml::XmlAttribute クラス"
linktitle: "XmlAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlAttribute クラス。属性を表します。属性の有効な値とデフォルト値は、C++ の文書型定義（DTD）またはスキーマで定義されています。"
type: docs
weight: 600
url: /ja/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


属性を表します。属性の有効な値とデフォルト値は文書型定義（DTD）またはスキーマで定義されます。

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | このノードの子ノードリストの末尾に、指定されたノードを追加します。 |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。 |
| [get_BaseURI](./get_baseuri/)() override | ノードの基本 Uniform Resource Identifier（URI）を返します。 |
| [get_LocalName](./get_localname/)() override | ノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | ノードの修飾名を返します。 |
| [get_NamespaceURI](./get_namespaceuri/)() override | このノードの名前空間 URI を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_OwnerDocument](./get_ownerdocument/)() override | このノードが属する [XmlDocument](../xmldocument/) を返します。 |
| virtual [get_OwnerElement](./get_ownerelement/)() | 属性が属する[XmlElement](../xmlelement/)を返します。 |
| [get_Prefix](./get_prefix/)() override | このノードの名前空間プレフィックスを返します。 |
| [get_SchemaInfo](./get_schemainfo/)() override | スキーマ検証の結果としてこのノードに割り当てられた post-schema-validation-infoset を返します。 |
| virtual [get_Specified](./get_specified/)() | 属性値が明示的に設定されたかどうかを示す値を返します。 |
| [get_Value](./get_value/)() override | ノードの値を返します。 |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | 指定されたノードを、指定された参照ノードの直後に挿入します。 |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | 指定されたノードを、指定された参照ノードの直前に挿入します。 |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | 指定されたノードを、このノードの子ノードリストの先頭に追加します。 |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | 指定された子ノードを削除します。 |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | 指定された子ノードを、指定された新しい子ノードに置き換えます。 |
| [set_InnerText](./set_innertext/)(String) override | ノードとそのすべての子ノードの連結された値を設定します。 |
| [set_InnerXml](./set_innerxml/)(String) override | 属性の値を設定します。 |
| [set_Prefix](./set_prefix/)(String) override | このノードの名前空間プレフィックスを設定します。 |
| [set_Value](./set_value/)(String) override | ノードの値を設定します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | ノードのすべての子ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
