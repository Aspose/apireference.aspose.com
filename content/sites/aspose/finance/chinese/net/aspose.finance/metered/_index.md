---
title: 计量
second_title: Aspose.Finance 适用于 .NET API 参考
description: 提供设置计量密钥的方法。
type: docs
weight: 20
url: /zh/net/aspose.finance/metered/
---
## Metered class

提供设置计量密钥的方法。

```csharp
public class Metered
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [Metered](metered)() | 初始化此类的新实例。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [SetMeteredKey](../../aspose.finance/metered/setmeteredkey)(string, string) | 设置计量的公钥和私钥 |
| static [GetConsumptionCredit](../../aspose.finance/metered/getconsumptioncredit)() | 获取消耗信用 |
| static [GetConsumptionQuantity](../../aspose.finance/metered/getconsumptionquantity)() | 获取消耗文件大小 |

### 示例

在此示例中，将尝试设置计量的公钥和私钥

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

### 另请参阅

* namespace [Aspose.Finance](../../aspose.finance)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
