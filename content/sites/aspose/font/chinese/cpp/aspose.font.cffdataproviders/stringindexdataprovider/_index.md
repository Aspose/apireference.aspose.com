---
title: "Aspose::Font::CffDataProviders::StringIndexDataProvider 类"
linktitle: "StringIndexDataProvider"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::CffDataProviders::StringIndexDataProvider 类。声明用于在 C++ 中访问 CFF String INDEX 结构的功能。"
type: docs
weight: 700
url: /zh/cpp/aspose.font.cffdataproviders/stringindexdataprovider/
---
## StringIndexDataProvider class


声明用于访问 CFF String INDEX 结构的功能。

```cpp
class StringIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [AddString](./addstring/)(System::String) | 向 CFF String INDEX 结构中添加字符串。 |
| virtual [get_Count](./get_count/)() | CFF INDEX 结构中的对象数量。 |
| virtual [GetRawBytes](./getrawbytes/)() | 获取 CFF INDEX 结构的所有字节。 |
| virtual [GetString](./getstring/)(int32_t) | 从 CFF String INDEX 结构中获取指定索引处的字符串。 |
| virtual [idx_get](./idx_get/)(int32_t) | 获取/设置指定索引处的字符串。 |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | 获取/设置指定索引处的字符串。 |
| virtual [RemoveString](./removestring/)(int32_t) | 在指定索引处从 CFF String Index 结构中移除字符串。 |
| virtual [SetString](./setstring/)(System::String, int32_t) | 在指定索引处设置 CFF String Index 结构中的字符串。 |
## 另见

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
