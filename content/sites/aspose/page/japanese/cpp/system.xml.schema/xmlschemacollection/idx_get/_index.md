---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get メソッド"
linktitle: "idx_get"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get メソッド。C++ で指定された名前空間 URI に関連付けられた XmlSchema を返します。"
type: docs
weight: 800
url: /ja/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


指定された名前空間 URI に関連付けられた [XmlSchema](../../xmlschema/) を返します。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ns | const String\& | 取得したいスキーマに関連付けられた名前空間 URI。通常はスキーマの **targetNamespace** になります。 |

### ReturnValue

名前空間 URI に関連付けられた [XmlSchema](../../xmlschema/)；指定された名前空間にロードされたスキーマが存在しない場合、またはその名前空間が XDR スキーマに関連付けられている場合は **nullptr** です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
