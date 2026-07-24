---
title: "System::Xml::XmlReader::get_SchemaInfo メソッド"
linktitle: "get_SchemaInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::get_SchemaInfo メソッド。C++ におけるスキーマ検証の結果、現在のノードに割り当てられたスキーマ情報を返します。"
type: docs
weight: 2200
url: /ja/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


スキーマ検証の結果、現在のノードに割り当てられたスキーマ情報を返します。

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

現在のノードのスキーマ情報を含む IXmlSchemaInfo オブジェクトです。[Schema](../../../system.xml.schema/) 情報は要素、属性、または非 null の [XmlReader::get_ValueType](../get_valuetype/) 値を持つテキスト ノードに設定できます。現在のノードが上記のいずれのノードタイプでもない場合、または [XmlReader](../) インスタンスがスキーマ情報を報告しない場合、このメソッドは **nullptr** を返します。このメソッドが [XmlTextReader](../../xmltextreader/) または [XmlValidatingReader](../../xmlvalidatingreader/) オブジェクトから呼び出された場合、常に **nullptr** を返します。これらの [XmlReader](../) 実装は get_SchemaInfo メソッドを通じてスキーマ情報を公開しません。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
