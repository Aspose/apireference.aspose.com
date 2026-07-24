---
title: "System::Xml::XmlNode::Supports 方法"
linktitle: "Supports"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNode::Supports 方法。测试 DOM 实现是否在 C++ 中实现了特定的特性。"
type: docs
weight: 4400
url: /zh/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


测试 DOM 实现是否实现了特定功能。

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 特性 | 字符串 | 要测试的功能的包名称。此名称不区分大小写。 |
| 版本 | 字符串 | 要测试的包名称的版本号。如果未指定版本（null），则支持该特性的任何版本会导致方法返回 true。 |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## 备注



下表描述了返回 **true** 的组合。 |||
|-|-|
| 特性 | 版本 |
| XML | 1.0 |
| XML | 2.0 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
