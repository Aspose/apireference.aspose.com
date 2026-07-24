---
title: "System::Xml::Schema::XmlSchemaSet::Add メソッド"
linktitle: "Add"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet::Add メソッド。C++ で指定された XmlSchema を XmlSchemaSet に追加します。"
type: docs
weight: 200
url: /ja/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


指定された [XmlSchema](../../xmlschema/) を [XmlSchemaSet](../) に追加します。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchemaSet](../) に追加する [XmlSchema](../../xmlschema/) オブジェクトです。 |

### ReturnValue

スキーマが有効な場合は [XmlSchema](../../xmlschema/) オブジェクトが返されます。スキーマが無効で、かつ [ValidationEventHandler](../../validationeventhandler/) が指定されている場合は **nullptr** が返され、適切な検証イベントが発生します。それ以外の場合は [XmlSchemaException](../../xmlschemaexception/) がスローされます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


指定された [XmlSchemaSet](../) に含まれるすべての XML [Schema](../../) 定義言語 (XSD) スキーマを [XmlSchemaSet](../) に追加します。

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | [XmlSchemaSet](../) オブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) に含まれる XML [Schema](../../) 定義言語 (XSD) スキーマを [XmlSchemaSet](../) に追加します。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| targetNamespace | String | スキーマの **targetNamespace** 値、またはスキーマで指定された **targetNamespace** を使用する場合は **nullptr** を指定します。 |
| schemaDocument | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) オブジェクトです。 |

### ReturnValue

スキーマが有効な場合は [XmlSchema](../../xmlschema/) オブジェクトが返されます。スキーマが無効で、かつ [ValidationEventHandler](../../validationeventhandler/) が指定されている場合は **nullptr** が返され、適切な検証イベントが発生します。それ以外の場合は [XmlSchemaException](../../xmlschemaexception/) がスローされます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


指定された URL の XML [Schema](../../) 定義言語 (XSD) スキーマを [XmlSchemaSet](../) に追加します。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| targetNamespace | String | スキーマの **targetNamespace** 値、またはスキーマで指定された **targetNamespace** を使用する場合は **nullptr** を指定します。 |
| schemaUri | const String\& | ロードするスキーマを指定する URL。 |

### ReturnValue

スキーマが有効な場合は [XmlSchema](../../xmlschema/) オブジェクトが返されます。スキーマが無効で、かつ [ValidationEventHandler](../../validationeventhandler/) が指定されている場合は **nullptr** が返され、適切な検証イベントが発生します。それ以外の場合は [XmlSchemaException](../../xmlschemaexception/) がスローされます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
