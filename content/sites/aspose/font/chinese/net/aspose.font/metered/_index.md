---
title: "类 Metered"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Metered 类。提供设置计量密钥的方法"
type: docs
weight: 540
url: /zh/net/aspose.font/metered/
---
## Metered class

提供设置计量密钥的方法。

```csharp
public class Metered
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [Metered](metered/)() | 初始化此类的新实例。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [SetMeteredKey](../../aspose.font/metered/setmeteredkey/)(string, string) | 设置计量公钥和私钥 |
| static [GetConsumptionCredit](../../aspose.font/metered/getconsumptioncredit/)() | 获取消耗积分 |
| static [GetConsumptionQuantity](../../aspose.font/metered/getconsumptionquantity/)() | 获取消耗文件大小 |

## 示例

在此示例中，将尝试设置计量公钥和私钥

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

组件 jar 文件：

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### 另见

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


