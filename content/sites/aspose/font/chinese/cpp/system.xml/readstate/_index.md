---
title: "System::Xml::ReadState 枚举"
linktitle: "ReadState"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::ReadState 枚举。指定读取器在 C++ 中的状态。"
type: docs
weight: 5300
url: /zh/cpp/system.xml/readstate/
---
## ReadState enum


指定读取器的状态。

```cpp
enum class ReadState
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Initial | 0 | 尚未调用 [XmlReader::Read](../xmlreader/read/) 方法。 |
| Interactive | 1 | 已调用 [XmlReader::Read](../xmlreader/read/) 方法。可以在读取器上调用其他方法。 |
| 错误 | 2 | 发生错误，导致读取操作无法继续。 |
| EndOfFile | 3 | 已成功到达文件末尾。 |
| Closed | 4 | 已调用 [XmlReader::Close](../xmlreader/close/) 方法。 |

## 另见

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
