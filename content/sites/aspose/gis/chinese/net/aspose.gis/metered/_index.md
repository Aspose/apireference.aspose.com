---
title: Class Metered
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Metered 班级. 提供设置计量密钥的方法
type: docs
weight: 1280
url: /zh/net/aspose.gis/metered/
---
## Metered class

提供设置计量密钥的方法。

```csharp
public class Metered
```

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [GetConsumptionCredit](../../aspose.gis/metered/getconsumptioncredit/)() | 获得消费积分 |
| static [GetConsumptionQuantity](../../aspose.gis/metered/getconsumptionquantity/)() | 获取消费文件大小 |
| static [ResetMeteredKey](../../aspose.gis/metered/resetmeteredkey/)() | 删除之前设置的 license |
| static [SetMeteredKey](../../aspose.gis/metered/setmeteredkey/)(string, string) | 设置计量公钥和私钥 |

### 例子

在此示例中，将尝试设置计量公钥和私钥

```csharp
[C#]

Metered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Metered.SetMeteredKey("PublicKey", "PrivateKey")
```

### 也可以看看

* 命名空间 [Aspose.Gis](../../aspose.gis/)
* 部件 [Aspose.GIS](../../)


