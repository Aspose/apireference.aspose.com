---
title: EmfPlusCompositingQuality
second_title: Aspose.Imaging for .NET API 参考
description: CompositingQuality 枚举定义了创建合成图像的质量级别
type: docs
weight: 4730
url: /zh/net/aspose.imaging.fileformats.emf.emfplus.consts/emfpluscompositingquality/
---
## EmfPlusCompositingQuality enumeration

CompositingQuality 枚举定义了创建合成图像的质量级别

```csharp
public enum EmfPlusCompositingQuality : byte
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| CompositingQualityDefault | `1` | 不执行伽马校正。伽玛校正控制图像的整体亮度和对比度。如果没有伽马校正，合成图像可能会显得太亮或太暗。 |
| CompositingQualityHighSpeed | `2` | 不执行伽马校正。以牺牲质量为代价来追求合成速度。就结果而言，这个值和CompositingQualityDefault. 没有区别 |
| CompositingQualityHighQuality | `3` | 执行 Gamma 校正。合成质量以牺牲速度为代价。 |
| CompositingQualityGammaCorrected | `4` | 启用伽玛校正，以较低速度进行更高质量的合成。就结果而言，这个值和CompositingQualityHighQuality. 没有区别 |
| CompositingQualityAssumeLinear | `5` | 不进行伽马校正；但是，使用线性值会以略低的速度产生比默认值更好的质量。 |

### 也可以看看

* 命名空间 [Aspose.Imaging.FileFormats.Emf.EmfPlus.Consts](../../aspose.imaging.fileformats.emf.emfplus.consts)
* 部件 [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
