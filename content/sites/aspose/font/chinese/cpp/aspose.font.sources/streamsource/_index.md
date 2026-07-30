---
title: "Aspose::Font::Sources::StreamSource 类"
linktitle: "StreamSource"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Sources::StreamSource 类。定义了一种在 C++ 中需要时获取文件流的方法。"
type: docs
weight: 500
url: /zh/cpp/aspose.font.sources/streamsource/
---
## StreamSource class


定义在需要时获取文件流的方式。

```cpp
class StreamSource : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Clone](./clone/)() | 克隆流源对象。 |
| [get_Offset](./get_offset/)() const | 获取源内部的偏移量。 |
| virtual [GetFontStream](./getfontstream/)() | 返回 [Font](../../aspose.font/font/) 流。 |
| virtual [MustCloseAfterUse](./mustcloseafteruse/)() | 子类可能会阻止流关闭。如果流源希望在使用后关闭流，则返回 true；否则返回 false。 |
| [set_Offset](./set_offset/)(int64_t) | 设置源内部的偏移量。 |
| [StreamSource](./streamsource/)() | 初始化流源实例。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Sources](../)
* Library [Aspose.Font for C++](../../)
