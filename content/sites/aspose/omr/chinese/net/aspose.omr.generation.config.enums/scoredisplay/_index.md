---
title: Enum ScoreDisplay
second_title: Aspose.OMR for .NET API 参考
description: Aspose.OMR.Generation.Config.Enums.ScoreDisplay 枚举. 控制分值显示
type: docs
weight: 530
url: /zh/net/aspose.omr.generation.config.enums/scoredisplay/
---
## ScoreDisplay enumeration

控制分值显示。

```csharp
public enum ScoreDisplay
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| DontDisplay | `0` | 分值将对用户隐藏。 分值仍参与识别和总分金额。 Amount将被忽略。 |
| DisplayAsExtraColumn | `1` | 分值将显示为额外的列，用户可见。 分值参与识别和总分金额。 Amount将在其他列中标记得分列位置。 请仅使用一个这样的标题 |
| DisplayInsideCell | `2` | 分数值将显示在每个单元格内。 分数值将放置在每个气泡内。在当前版本中 - 每个气泡或异常将被抛出一个数字。 Amount将被忽略。 |

### 也可以看看

* 命名空间 [Aspose.OMR.Generation.Config.Enums](../../aspose.omr.generation.config.enums/)
* 部件 [Aspose.OMR](../../)


