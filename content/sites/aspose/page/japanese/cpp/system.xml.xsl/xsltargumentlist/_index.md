---
title: "System::Xml::Xsl::XsltArgumentList クラス"
linktitle: "XsltArgumentList"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XsltArgumentList クラス。C++ で XSLT パラメータまたは拡張オブジェクトのいずれかである可変数の引数を含みます。"
type: docs
weight: 400
url: /ja/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


XSLT パラメータまたは拡張オブジェクトのいずれかである可変数の引数を含みます。

```cpp
class XsltArgumentList : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | [XsltArgumentList](./) に新しいオブジェクトを追加し、名前空間 URI と関連付けます。 |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | [XsltArgumentList](./) にパラメータを追加し、名前空間修飾名と関連付けます。 |
| [Clear](./clear/)() | [XsltArgumentList](./) からすべてのパラメータと拡張オブジェクトを削除します。 |
| [GetExtensionObject](./getextensionobject/)(const String\&) | 指定された名前空間に関連付けられたオブジェクトを返します。 |
| [GetParam](./getparam/)(const String\&, const String\&) | 名前空間修飾名に関連付けられたパラメータを返します。 |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | 名前空間 URI を持つオブジェクトを [XsltArgumentList](./) から削除します。 |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | パラメータを [XsltArgumentList](./) から削除します。 |
| [XsltArgumentList](./xsltargumentlist/)() | 新しい [XsltArgumentList](./) のインスタンスを作成します。 |
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
