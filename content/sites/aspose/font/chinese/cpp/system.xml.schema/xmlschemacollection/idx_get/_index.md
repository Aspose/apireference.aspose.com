---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get 方法"
linktitle: "idx_get"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get 方法。返回与给定命名空间 URI 关联的 XmlSchema（C++）。"
type: docs
weight: 800
url: /zh/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


返回与给定命名空间 URI 关联的 [XmlSchema](../../xmlschema/)。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ns | const String\& | 要返回的模式关联的命名空间 URI。通常是该模式的 **targetNamespace**。 |

### ReturnValue

与该命名空间 URI 关联的 [XmlSchema](../../xmlschema/)；如果没有加载的模式与给定命名空间关联，或该命名空间关联的是 XDR 模式，则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
