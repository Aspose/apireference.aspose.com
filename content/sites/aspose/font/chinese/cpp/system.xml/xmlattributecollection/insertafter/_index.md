---
title: "System::Xml::XmlAttributeCollection::InsertAfter 方法"
linktitle: "InsertAfter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlAttributeCollection::InsertAfter 方法。在 C++ 中将指定的属性紧随指定的参考属性之后插入。"
type: docs
weight: 400
url: /zh/cpp/system.xml/xmlattributecollection/insertafter/
---
## XmlAttributeCollection::InsertAfter method


在指定的参考属性之后立即插入指定的属性。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::InsertAfter(const SharedPtr<XmlAttribute> &newNode, const SharedPtr<XmlAttribute> &refNode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| newNode | const SharedPtr\<XmlAttribute\>\& | 要插入的属性。 |
| refNode | const SharedPtr\<XmlAttribute\>\& | 参考属性。**newNode** 放置在 **refNode** 之后。 |

### ReturnValue

要插入到集合中的[XmlAttribute](../../xmlattribute/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
