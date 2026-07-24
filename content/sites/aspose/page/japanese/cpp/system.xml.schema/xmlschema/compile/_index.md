---
title: "System::Xml::Schema::XmlSchema::Compile メソッド"
linktitle: "コンパイル"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchema::Compile メソッド。XML SchemaObject Model（SOM）を検証用のスキーマ情報にコンパイルします。プログラムで構築された SOM の構文および意味構造をチェックするために使用されます。意味的検証は C++ のコンパイル時に実行されます。"
type: docs
weight: 200
url: /ja/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


XML [Schema](../../)[Object](../../../system/object/) Model（SOM）を検証用のスキーマ情報にコンパイルします。プログラムで構築された SOM の構文および意味構造をチェックするために使用されます。意味的検証はコンパイル時に実行されます。

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | XML [Schema](../../) の検証エラーに関する情報を受け取る検証イベントハンドラーです。 |

## 参照

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


XML [Schema](../../)[Object](../../../system/object/) Model（SOM）を検証用のスキーマ情報にコンパイルします。プログラムで構築された SOM の構文および意味構造をチェックするために使用されます。意味的検証はコンパイル時に実行されます。

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | XML [Schema](../../) の検証エラーに関する情報を受け取る検証イベントハンドラーです。 |
| resolver | const SharedPtr\<XmlResolver\>\& | **include** と **import** 要素で参照される名前空間を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/) です。 |

## 参照

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
