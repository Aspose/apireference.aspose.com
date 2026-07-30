---
title: "System::IO::FileOptions 枚举"
linktitle: "FileOptions"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::FileOptions 枚举。表示在 C++ 中创建 FileStream 对象的高级选项。"
type: docs
weight: 3200
url: /zh/cpp/system.io/fileoptions/
---
## FileOptions enum


表示创建 [FileStream](../filestream/) 对象的高级选项。

```cpp
enum class FileOptions
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无 | 0 | 没有其他选项。 |
| 已加密 | 16384 | 文件已加密。未实现。 |
| DeleteOnClose | 67108864 | 当文件不再使用时，应自动删除该文件。 |
| SequentialScan | 134217728 | 文件应按顺序访问。 |
| RandomAccess | 268435456 | 文件被随机访问。 |
| Asynchronous | 1073741824 | 该文件可用于异步 I/O 操作。 |
| WriteThrough | n/a | 所有写入应直接写入磁盘，绕过任何中间缓存。 |

## 另见

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
