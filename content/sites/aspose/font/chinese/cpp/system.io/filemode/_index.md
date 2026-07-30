---
title: "System::IO::FileMode enum"
linktitle: "FileMode"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::FileMode enum。指定在 C++ 中文件的打开方式。"
type: docs
weight: 3100
url: /zh/cpp/system.io/filemode/
---
## FileMode enum


指定文件的打开方式。

```cpp
enum class FileMode
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| CreateNew | 1 | 创建一个新文件。如果文件已存在，将抛出异常。 |
| Create | 2 | 创建一个新文件。如果文件已存在，则会被覆盖。 |
| Open | 3 | 打开一个已存在的文件。如果文件不存在，则会抛出异常。 |
| OpenOrCreate | 4 | 打开已存在的文件，或在文件不存在时创建一个新文件。 |
| 截断 | 5 | 打开已存在的文件并将其截断，使其为空。如果文件不存在，则会抛出异常。 |
| 追加 | 6 | 打开已存在的文件并定位到文件末尾，或在文件不存在时创建一个新文件。 |

## 另见

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
