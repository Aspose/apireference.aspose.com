---
title: "Aspose.Font.CffDataProviders"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.CffDataProviders 命名空间提供用于检索和更新各种 CFF 结构数据的类。"
type: docs
weight: 30
url: /zh/net/aspose.font.cffdataproviders/
---
**Aspose.Font.CffDataProviders** 命名空间提供用于从各种 CFF 结构检索和更新数据的类。

## 类

| 类 | 描述 |
| --- | --- |
| [NameIndexDataProvider](./nameindexdataprovider/) | 声明用于访问 CFF Name INDEX 结构的功能。 |
| [PrivateDictDataProvider](./privatedictdataprovider/) | 声明用于读取/更新 CFF Private DICT 结构的功能。 |
| [StringIndexDataProvider](./stringindexdataprovider/) | 声明用于访问 CFF String INDEX 结构的功能。 |
| [TopDictDataProvider](./topdictdataprovider/) | 声明用于读取/更新 CFF Top DICT 结构的功能。 |
## 接口

| 接口 | 描述 |
| --- | --- |
| [ICffIndexDataProvider](./icffindexdataprovider/) | 用于访问 CFF 字体的 INDEX 结构的基本接口。 |
## 枚举

| 枚举 | 描述 |
| --- | --- |
| [CffIndexProviderType](./cffindexprovidertype/) | 指定索引提供程序接口系列支持的 INDEX 结构。 |
| [CffUpdateStringIndexStrategy](./cffupdatestringindexstrategy/) | 指定如何向 CFF String INDEX 存储添加字符串。当我们尝试向 CFF String INDEX 添加某个字符串时，可能出现该字符串已在 String INDEX 中存在的情况。使用 SearchForDuplicates 选项可以强制在 String INDEX 中搜索，以检测该字符串是否已存在。此方法可节省 String INDEX 结构的空间，但会增加添加字符串的时间。 |


