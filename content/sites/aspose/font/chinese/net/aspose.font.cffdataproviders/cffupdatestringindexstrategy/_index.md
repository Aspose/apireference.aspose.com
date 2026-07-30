---
title: "枚举 CffUpdateStringIndexStrategy"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.CffDataProviders.CffUpdateStringIndexStrategy 枚举。指定如何向 CFF String INDEX 存储添加字符串。当我们尝试向 CFF String INDEX 添加某个字符串时，可能出现该字符串已在 String INDEX 中存在的情况。使用 SearchForDuplicates 选项可以强制在 String INDEX 中搜索，以检测该字符串是否已存在。此方法可节省 String INDEX 结构的空间，但会增加添加字符串的时间。"
type: docs
weight: 70
url: /zh/net/aspose.font.cffdataproviders/cffupdatestringindexstrategy/
---
## CffUpdateStringIndexStrategy enumeration

指定如何向 CFF String INDEX 存储添加字符串。当我们尝试向 CFF String INDEX 添加某个字符串时，可能出现该字符串已在 String INDEX 中存在的情况。使用 SearchForDuplicates 选项可以强制在 String INDEX 中搜索，以检测该字符串是否已存在。此方法可节省 String INDEX 结构的空间，但会增加添加字符串的时间。

```csharp
public enum CffUpdateStringIndexStrategy
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| SearchForDuplicates | `0` | 指定应在 String INDEX 结构中执行要添加的字符串的搜索，以避免添加重复项。 |
| AddStringAsIs | `1` | 指定在添加字符串时不应执行重复检查。此方法更快，但可能导致 String INDEX 的内存使用效率低下。 |

### 另见

* namespace [Aspose.Font.CffDataProviders](../../aspose.font.cffdataproviders/)
* assembly [Aspose.Font](../../)


