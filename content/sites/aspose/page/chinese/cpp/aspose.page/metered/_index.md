---
title: "Aspose::Page::Metered 类"
linktitle: "计量"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::Metered 类。 在 C++ 中提供设置计量密钥的方法。"
type: docs
weight: 1400
url: /zh/cpp/aspose.page/metered/
---
## Metered class


提供设置计量密钥的方法。

```cpp
class Metered : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [GetConsumptionCredit](./getconsumptioncredit/)() | 获取消费积分。 |
| static [GetConsumptionQuantity](./getconsumptionquantity/)() | 获取消费文件大小。 |
| [Metered](./metered/)() | 初始化此类的新实例。 |
| [SetMeteredKey](./setmeteredkey/)(System::String, System::String) | 设置计量的公钥和私钥。如果您购买了计量许可证，在启动应用程序时应调用此 API，通常这已足够。然而，如果始终上传消费数据失败且超过 24 小时，许可证将被设置为评估状态。为避免这种情况，您应定期检查许可证状态，如果是评估状态，请再次调用此 API。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
