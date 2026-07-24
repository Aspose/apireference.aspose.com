---
title: "System::Xml::Schema::XmlSchemaObjectCollection::Contains メソッド"
linktitle: "Contains"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaObjectCollection::Contains メソッド。指定された XmlSchemaObject が XmlSchemaObjectCollection に含まれているかどうかを C++ で示します。"
type: docs
weight: 300
url: /ja/cpp/system.xml.schema/xmlschemaobjectcollection/contains/
---
## XmlSchemaObjectCollection::Contains method


指定された [XmlSchemaObject](../../xmlschemaobject/) が [XmlSchemaObjectCollection](../) に含まれているかどうかを示します。

```cpp
bool System::Xml::Schema::XmlSchemaObjectCollection::Contains(const SharedPtr<XmlSchemaObject> &item)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| item | const SharedPtr\<XmlSchemaObject\>\& | [XmlSchemaObject](../../xmlschemaobject/)。 |

### ReturnValue

**true** if the specified qualified name is in the collection; otherwise, returns **false**. If **nullptr** is supplied, **false** is returned because there is no qualified name with a null name.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaObject](../../xmlschemaobject/)
* Class [XmlSchemaObjectCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
