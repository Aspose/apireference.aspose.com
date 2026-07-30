---
title: "类 StringIndexDataProvider"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.CffDataProviders.StringIndexDataProvider 类。声明用于访问 CFF String INDEX 结构的功能"
type: docs
weight: 110
url: /zh/net/aspose.font.cffdataproviders/stringindexdataprovider/
---
## StringIndexDataProvider class

声明用于访问 CFF String INDEX 结构的功能。

```csharp
public abstract class StringIndexDataProvider : ICffIndexDataProvider
```

## 属性

| 名称 | 描述 |
| --- | --- |
| abstract [Count](../../aspose.font.cffdataproviders/stringindexdataprovider/count/) { get; } | CFF INDEX 结构中的对象数量。 |
| abstract [Item](../../aspose.font.cffdataproviders/stringindexdataprovider/item/) { get; set; } | 获取/设置 指定索引处的字符串。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| abstract [AddString](../../aspose.font.cffdataproviders/stringindexdataprovider/addstring/)(string) | 向 CFF String INDEX 结构添加字符串。 |
| abstract [GetRawBytes](../../aspose.font.cffdataproviders/stringindexdataprovider/getrawbytes/)() | 获取 CFF INDEX 结构的所有字节。 |
| abstract [GetString](../../aspose.font.cffdataproviders/stringindexdataprovider/getstring/)(int) | 从 CFF String INDEX 结构获取指定索引处的字符串。 |
| abstract [RemoveString](../../aspose.font.cffdataproviders/stringindexdataprovider/removestring/)(int) | 在指定索引处从 CFF String Index 结构中删除字符串。 |
| abstract [SetString](../../aspose.font.cffdataproviders/stringindexdataprovider/setstring/)(string, int) | 在指定索引处设置 CFF String Index 结构中的字符串。 |

### 另见

* interface [ICffIndexDataProvider](../icffindexdataprovider/)
* namespace [Aspose.Font.CffDataProviders](../../aspose.font.cffdataproviders/)
* assembly [Aspose.Font](../../)


