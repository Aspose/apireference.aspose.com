---
title: "Aspose::Font::CffDataProviders::NameIndexDataProvider 类"
linktitle: "NameIndexDataProvider"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::CffDataProviders::NameIndexDataProvider 类。声明用于在 C++ 中访问 CFF Name INDEX 结构的功能。"
type: docs
weight: 500
url: /zh/cpp/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class


声明用于访问 CFF Name INDEX 结构的功能。

```cpp
class NameIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [AddName](./addname/)(System::String) | 向 Name INDEX 结构添加字体名称。请谨慎使用此方法，因为根据 CFF 规范，CFF Name INDEX 结构中的每个字体名称必须在 Top DICT 索引中拥有对应的 DICT 结构。 |
| virtual [get_Count](./get_count/)() | CFF INDEX 结构中的对象数量。 |
| virtual [GetName](./getname/)(int32_t) | 获取指定索引处的字体名称。 |
| virtual [GetRawBytes](./getrawbytes/)() | 获取 CFF INDEX 结构的所有字节。 |
| virtual [idx_get](./idx_get/)(int32_t) | 获取/设置指定索引处的字体名称。 |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | 获取/设置指定索引处的字体名称。 |
| virtual [RemoveName](./removename/)(int32_t) | 删除指定索引处的名称。请谨慎使用此方法，因为根据 CFF 规范，CFF Name INDEX 结构中的每个字体名称必须在 Top DICT 索引中拥有对应的 DICT 结构。 |
| virtual [SetName](./setname/)(System::String, int32_t) | 在指定索引处设置字体名称。 |
## 另见

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
