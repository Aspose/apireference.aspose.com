---
title: SecurityId
second_title: Aspose.Finance 适用于 .NET API 参考
description: 必须始终一致地标识证券，以便客户端应用程序能够在多个金融机构（FIs）中为所有用户的投资账户准备准确的投资报告。目前，证券名称或其代码尚未标准化。因此，OFX 使用 CUSIP 编号——一种唯一的 9 位字母数字标识符——来标识证券。CUSIP 编号可用于当今交易的绝大多数证券，包括那些没有代码的证券，如债券。对于没有 CUSIP 的证券，金融机构必须遵循标准程序，以自身作为发行人分配 CUSIP，以避免与其他 CUSIP 冲突。
type: docs
weight: 5230
url: /zh/net/aspose.finance.ofx/securityid/
---
## SecurityId class

必须始终如一地标识证券，以便客户端应用程序能够在所有用户投资账户（即使跨多个金融机构）中准备准确的投资报告。目前，证券名称或其代码均未标准化。因此，OFX 使用 CUSIP 编号（唯一的 9 位字母数字标识符）来标识证券。CUSIP 编号适用于当今交易的绝大多数证券，包括没有代码的债券等。对于没有 CUSIP 的证券，金融机构必须遵循标准程序，以自身作为发行人分配 CUSIP，以避免与其他 CUSIP 冲突。

```csharp
public class SecurityId
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [SecurityId](securityid)() | 初始化 [`SecurityId`](../securityid) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [UniqueId](../../aspose.finance.ofx/securityid/uniqueid) { get; set; } | 获取或设置证券的唯一标识符。美国金融机构的 CUSIP。 |
| [UniqueIdType](../../aspose.finance.ofx/securityid/uniqueidtype) { get; set; } | 获取或设置用于标识证券的标准名称，例如美国金融机构使用的 “CUSIP”。 |

### 另请参阅

* namespace [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
