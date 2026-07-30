---
title: "System::Xml::WriteState 枚举"
linktitle: "WriteState"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::WriteState 枚举。指定 C++ 中 XmlWriter 的状态。"
type: docs
weight: 5700
url: /zh/cpp/system.xml/writestate/
---
## WriteState enum


指定 [XmlWriter](../xmlwriter/) 的状态。

```cpp
enum class WriteState
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Start | 0 | 指示 XmlWriter::Write 方法尚未被调用。 |
| Prolog | 1 | 指示正在写入 prolog。 |
| Element | 2 | 指示正在写入元素的开始标签。 |
| Attribute | 3 | 指示正在写入属性值。 |
| Content | 4 | 指示正在写入元素内容。 |
| Closed | 5 | 指示已调用 [XmlWriter::Close](../xmlwriter/close/) 方法。 |
| Error | 6 | 抛出了异常，导致 [XmlWriter](../xmlwriter/) 处于无效状态。您可以调用 [XmlWriter::Close](../xmlwriter/close/) 方法将 [XmlWriter](../xmlwriter/) 设置为 [WriteState::Closed](./) 状态。对其他任何 [XmlWriter](../xmlwriter/) 方法的调用都会导致 InvalidOperationException。 |

## 另见

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
