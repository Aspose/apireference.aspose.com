---
title: "System::Xml::XmlNodeList 类"
linktitle: "XmlNodeList"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeList 类。表示 C++ 中有序的节点集合。"
type: docs
weight: 2700
url: /zh/cpp/system.xml/xmlnodelist/
---
## XmlNodeList class


表示有序的节点集合。

```cpp
class XmlNodeList : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                    public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_Count](./get_count/)() | 返回 [XmlNodeList](./) 中的节点数量。 |
| virtual [GetEnumerator](./getenumerator/)() | 提供对 [XmlNodeList](./) 节点集合进行迭代的支持。 |
| virtual [idx_get](./idx_get/)(int32_t) | 返回给定索引处的节点。 |
| virtual [Item](./item/)(int32_t) | 检索给定索引处的节点。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
