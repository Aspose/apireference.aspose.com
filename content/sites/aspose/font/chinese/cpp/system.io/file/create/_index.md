---
title: "System::IO::File::Create 方法"
linktitle: "Create"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::File::Create 方法。创建一个新文件（或覆盖已有文件），并使用指定的缓冲区大小和选项在 C++ 中以读写访问方式打开它。"
type: docs
weight: 500
url: /zh/cpp/system.io/file/create/
---
## File::Create method


创建一个新文件（或覆盖已有文件），并使用指定的缓冲区大小和选项以读写方式打开它。

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要创建或覆盖的文件的路径 |
| bufferSize | int32_t | 从文件读取和写入时缓冲的字节数 |
| 选项 | FileOptions | 指定如何创建或覆盖文件 |

### ReturnValue

指向与指定文件关联的 [FileStream](../../filestream/) 对象的共享指针

## 另见

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
