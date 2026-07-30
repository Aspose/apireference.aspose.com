---
title: "类 NameIndexDataProvider"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.CffDataProviders.NameIndexDataProvider 类。声明用于访问 CFF Name INDEX 结构的功能"
type: docs
weight: 90
url: /zh/net/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class

声明用于访问 CFF Name INDEX 结构的功能。

```csharp
public abstract class NameIndexDataProvider : ICffIndexDataProvider
```

## 属性

| 名称 | 描述 |
| --- | --- |
| abstract [Count](../../aspose.font.cffdataproviders/nameindexdataprovider/count/) { get; } | CFF INDEX 结构中的对象数量。 |
| abstract [Item](../../aspose.font.cffdataproviders/nameindexdataprovider/item/) { get; set; } | 获取/设置 指定索引处的字体名称。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| abstract [AddName](../../aspose.font.cffdataproviders/nameindexdataprovider/addname/)(string) | 向 Name INDEX 结构添加字体名称。请谨慎使用此方法，因为根据 CFF 规范，CFF Name INDEX 结构中的每个字体名称必须在 Top DICT 索引中拥有相应的 DICT 结构。 |
| abstract [GetName](../../aspose.font.cffdataproviders/nameindexdataprovider/getname/)(int) | 获取指定索引处的字体名称。 |
| abstract [GetRawBytes](../../aspose.font.cffdataproviders/nameindexdataprovider/getrawbytes/)() | 获取 CFF INDEX 结构的所有字节。 |
| abstract [RemoveName](../../aspose.font.cffdataproviders/nameindexdataprovider/removename/)(int) | 删除指定索引处的名称。请谨慎使用此方法，因为根据 CFF 规范，CFF Name INDEX 结构中的每个字体名称必须在 Top DICT 索引中拥有相应的 DICT 结构。 |
| abstract [SetName](../../aspose.font.cffdataproviders/nameindexdataprovider/setname/)(string, int) | 设置指定索引处的字体名称。 |

### 另见

* interface [ICffIndexDataProvider](../icffindexdataprovider/)
* namespace [Aspose.Font.CffDataProviders](../../aspose.font.cffdataproviders/)
* assembly [Aspose.Font](../../)


