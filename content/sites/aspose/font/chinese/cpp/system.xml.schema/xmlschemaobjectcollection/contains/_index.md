---
title: "System::Xml::Schema::XmlSchemaObjectCollection::Contains 方法"
linktitle: "Contains"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaObjectCollection::Contains 方法。指示指定的 XmlSchemaObject 是否在 C++ 中的 XmlSchemaObjectCollection 中。"
type: docs
weight: 300
url: /zh/cpp/system.xml.schema/xmlschemaobjectcollection/contains/
---
## XmlSchemaObjectCollection::Contains method


指示指定的 [XmlSchemaObject](../../xmlschemaobject/) 是否在 [XmlSchemaObjectCollection](../) 中。

```cpp
bool System::Xml::Schema::XmlSchemaObjectCollection::Contains(const SharedPtr<XmlSchemaObject> &item)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| item | const SharedPtr\<XmlSchemaObject\>\& | [XmlSchemaObject](../../xmlschemaobject/)。 |

### ReturnValue

**true** if the specified qualified name is in the collection; otherwise, returns **false**. If **nullptr** is supplied, **false** is returned because there is no qualified name with a null name.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaObject](../../xmlschemaobject/)
* Class [XmlSchemaObjectCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
