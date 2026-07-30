---
title: "System::Xml::XmlImplementation::HasFeature 方法"
linktitle: "HasFeature"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlImplementation::HasFeature 方法。测试 C++ 中的文档对象模型 (DOM) 实现是否实现了特定功能。"
type: docs
weight: 300
url: /zh/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


测试文档 [Object](../../../system/object/) 模型 (DOM) 实现是否实现了特定功能。

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| strFeature | const String\& | 要测试的功能的包名称。此名称不区分大小写。 |
| strVersion | const String\& | 这是要测试的包名称的版本号。如果未指定版本（**nullptr**），则支持该功能的任何版本会导致方法返回 **true**。 |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## 备注



下表显示了导致 **HasFeature** 返回 **true** 的组合。 |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
