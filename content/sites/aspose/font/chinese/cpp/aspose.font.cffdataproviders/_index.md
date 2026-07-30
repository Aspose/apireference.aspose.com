---
title: "Aspose::Font::CffDataProviders 命名空间"
linktitle: "Aspose::Font::CffDataProviders"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 Aspose::Font::CffDataProviders 命名空间。"
type: docs
weight: 300
url: /zh/cpp/aspose.font.cffdataproviders/
---



## 类

| 类 | 描述 |
| --- | --- |
| [CffPrivateDictDataProvider](./cffprivatedictdataprovider/) |  |
| [CffTopDictDataProvider](./cfftopdictdataprovider/) |  |
| [ICffIndexDataProvider](./icffindexdataprovider/) | 用于访问 CFF 字体的 INDEX 结构的基本接口。 |
| [IStringIndexAdapter](./istringindexadapter/) |  |
| [NameIndexDataProvider](./nameindexdataprovider/) | 声明用于访问 CFF Name INDEX 结构的功能。 |
| [PrivateDictDataProvider](./privatedictdataprovider/) | 声明用于读取/更新 CFF Private DICT 结构的功能。 |
| [StringIndexDataProvider](./stringindexdataprovider/) | 声明用于访问 CFF String INDEX 结构的功能。 |
| [TopDictDataProvider](./topdictdataprovider/) | 声明用于读取/更新 CFF Top DICT 结构的功能。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [CffIndexProviderType](./cffindexprovidertype/) | 指定索引提供程序接口族支持的 INDEX 结构。 |
| [CffUpdateStringIndexStrategy](./cffupdatestringindexstrategy/) | 指定如何向 CFF String INDEX 存储添加字符串。当我们尝试向 CFF String INDEX 添加某个字符串时，可能会出现该字符串已经存在于 String INDEX 中的情况。使用选项 [SearchForDuplicates](./cffupdatestringindexstrategy/) 可以强制在 String INDEX 中搜索，以检测该字符串是否已存在。此方法可以节省 String INDEX 结构的空间，但会增加添加字符串的时间。 |
