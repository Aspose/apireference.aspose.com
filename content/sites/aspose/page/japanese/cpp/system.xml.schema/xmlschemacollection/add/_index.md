---
title: "System::Xml::Schema::XmlSchemaCollection::Add メソッド"
linktitle: "Add"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaCollection::Add メソッド。C++ で XmlSchema をコレクションに追加します。"
type: docs
weight: 200
url: /ja/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


[XmlSchema](../../xmlschema/) をコレクションに追加します。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | コレクションに追加する [XmlSchema](../../xmlschema/)。 |

### ReturnValue

[XmlSchema](../../xmlschema/) オブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


[XmlSchema](../../xmlschema/) をコレクションに追加します。指定された [XmlResolver](../../../system.xml/xmlresolver/) が外部参照の解決に使用されます。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | コレクションに追加する [XmlSchema](../../xmlschema/)。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | **include** と **import** 要素で参照される名前空間を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、外部参照は解決されません。 |

### ReturnValue

スキーマコレクションに追加された [XmlSchema](../../xmlschema/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


指定されたコレクションで定義されたすべての名前空間（関連付けられたスキーマを含む）をこのコレクションに追加します。

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | このコレクションに追加したい [XmlSchemaCollection](../)。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) に含まれるスキーマをスキーマコレクションに追加します。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ns | const String\& | スキーマに関連付けられた名前空間 URI。XML スキーマの場合、通常は **targetNamespace** です。 |
| reader | const SharedPtr\<XmlReader\>\& | 追加するスキーマを含む [XmlReader](../../../system.xml/xmlreader/)。 |

### ReturnValue

スキーマコレクションに追加された [XmlSchema](../../xmlschema/)。追加されるスキーマが XDR スキーマである場合や、スキーマにコンパイルエラーがある場合は **nullptr** になります。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


スキーマコレクションに、[XmlReader](../../../system.xml/xmlreader/) に含まれるスキーマを追加します。指定された [XmlResolver](../../../system.xml/xmlresolver/) は外部リソースの解決に使用されます。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ns | const String\& | スキーマに関連付けられた名前空間 URI。XML スキーマの場合、通常は **targetNamespace** です。 |
| reader | const SharedPtr\<XmlReader\>\& | 追加するスキーマを含む [XmlReader](../../../system.xml/xmlreader/)。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) は、**include** および **import** 要素、または **x-schema** 属性で参照される名前空間を解決するために使用されます。これが **nullptr** の場合、外部参照は解決されません。 |

### ReturnValue

スキーマコレクションに追加された [XmlSchema](../../xmlschema/)。追加されるスキーマが XDR スキーマである場合や、スキーマにコンパイルエラーがある場合は **nullptr** になります。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


指定された URL で位置付けられたスキーマをスキーマコレクションに追加します。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ns | const String\& | スキーマに関連付けられた名前空間 URI。XML スキーマの場合、通常は **targetNamespace** です。 |
| uri | const String\& | ロードするスキーマを指定する URL。 |

### ReturnValue

スキーマコレクションに追加された [XmlSchema](../../xmlschema/)。追加されるスキーマが XDR スキーマである場合や、スキーマにコンパイルエラーがある場合は **nullptr** になります。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
