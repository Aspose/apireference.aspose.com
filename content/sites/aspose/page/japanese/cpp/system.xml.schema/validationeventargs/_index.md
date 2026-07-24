---
title: "System::Xml::Schema::ValidationEventArgs クラス"
linktitle: "ValidationEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::ValidationEventArgs クラス。C++ の ValidationEventHandler に関連する詳細情報を返します。"
type: docs
weight: 200
url: /ja/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


[ValidationEventHandler](../validationeventhandler/) に関連する詳細情報を返します。

```cpp
class ValidationEventArgs : public System::EventArgs
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Exception](./get_exception/)() | 検証イベントに関連付けられた [XmlSchemaException](../xmlschemaexception/) を返します。 |
| [get_Message](./get_message/)() | 検証イベントに対応するテキスト説明を返します。 |
| [get_Severity](./get_severity/)() | 検証イベントの重大度を返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | \"empty\" の [EventArgs](../../system/eventargs/) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
