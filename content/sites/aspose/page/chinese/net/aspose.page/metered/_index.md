---
title: Class Metered
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.Metered 班级. 提供设置计量密钥的方法
type: docs
weight: 290
url: /zh/net/aspose.page/metered/
---
## Metered class

提供设置计量密钥的方法。

```csharp
public class Metered
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Metered](metered/)() | 初始化此类的新实例。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [SetMeteredKey](../../aspose.page/metered/setmeteredkey/)(string, string) | 设置计量公钥和私钥 |
| static [GetConsumptionCredit](../../aspose.page/metered/getconsumptioncredit/)() | 获得消费积分 |
| static [GetConsumptionQuantity](../../aspose.page/metered/getconsumptionquantity/)() | 获取消费文件大小 |

### 例子

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

### 也可以看看

* 命名空间 [Aspose.Page](../../aspose.page/)
* 部件 [Aspose.Page](../../)


