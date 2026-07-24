---
title: "System::Xml::XmlProcessingInstruction クラス"
linktitle: "XmlProcessingInstruction"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlProcessingInstruction クラス。C++で、XMLがドキュメントのテキスト内にプロセッサ固有の情報を保持するために定義する処理命令を表します。"
type: docs
weight: 3100
url: /ja/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


XML が文書のテキスト内にプロセッサ固有の情報を保持するために定義する処理指示を表します。

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。 |
| [get_Data](./get_data/)() | ターゲットを除いた処理命令の内容を返します。 |
| [get_InnerText](./get_innertext/)() override | ノードとそのすべての子の連結された値を返します。 |
| [get_LocalName](./get_localname/)() override | ノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | ノードの修飾名を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_Target](./get_target/)() | 処理命令のターゲットを返します。 |
| [get_Value](./get_value/)() override | ノードの値を返します。 |
| [set_Data](./set_data/)(const String\&) | ターゲットを除いた処理命令の内容を設定します。 |
| [set_InnerText](./set_innertext/)(String) override | ノードとそのすべての子ノードの連結された値を設定します。 |
| [set_Value](./set_value/)(String) override | ノードの値を設定します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 指定された[XmlWriter](../xmlwriter/)にノードのすべての子を保存します。ProcessingInstruction ノードには子がないため、このメソッドは効果がありません。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
