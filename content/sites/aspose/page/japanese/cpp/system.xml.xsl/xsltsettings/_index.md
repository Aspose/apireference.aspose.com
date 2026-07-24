---
title: "System::Xml::Xsl::XsltSettings class"
linktitle: "XsltSettings"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XsltSettings クラス。C++ で XSLT スタイルシートの実行中にサポートする XSLT 機能を指定します。"
type: docs
weight: 800
url: /ja/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


XSLTスタイルシートの実行中にサポートするXSLT機能を指定します。

```cpp
class XsltSettings : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [get_Default](./get_default/)() | デフォルト設定の [XsltSettings](./) オブジェクトを返します。XSLT **document()** 関数と埋め込みスクリプトブロックのサポートは無効になっています。 |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | XSLT **document()** 関数のサポートを有効にするかどうかを示す値を返します。 |
| [get_EnableScript](./get_enablescript/)() | 埋め込みスクリプトブロックのサポートを有効にするかどうかを示す値を返します。 |
| static [get_TrustedXslt](./get_trustedxslt/)() | [XsltSettings](./) オブジェクトを返します。このオブジェクトは XSLT **document()** 関数と埋め込みスクリプトブロックのサポートを有効にします。 |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | XSLT **document()** 関数のサポートを有効にするかどうかを示す値を設定します。 |
| [set_EnableScript](./set_enablescript/)(bool) | 埋め込みスクリプトブロックのサポートを有効にするかどうかを示す値を設定します。 |
| [XsltSettings](./xsltsettings/)() | デフォルト設定で [XsltSettings](./) クラスの新しいインスタンスを初期化します。 |
| [XsltSettings](./xsltsettings/)(bool, bool) | 指定された設定で [XsltSettings](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
