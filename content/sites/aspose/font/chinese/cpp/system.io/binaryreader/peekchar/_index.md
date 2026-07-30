---
title: "System::IO::BinaryReader::PeekChar 方法"
linktitle: "PeekChar"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BinaryReader::PeekChar 方法。读取输入流中的单个字符而不更改流的读取光标（C++）。"
type: docs
weight: 600
url: /zh/cpp/system.io/binaryreader/peekchar/
---
## BinaryReader::PeekChar method


从输入流读取单个字符且不移动流的读取光标。

```cpp
virtual int System::IO::BinaryReader::PeekChar()
```


### ReturnValue

读取使用 UTF-16 编码的字符；如果读取的字符在 UTF-16 编码中由两个代码点表示，则仅返回高位代理项；如果未读取到字符，则返回 -1。

## 另见

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
