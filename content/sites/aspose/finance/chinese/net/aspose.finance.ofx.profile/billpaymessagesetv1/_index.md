---
title: BillPayMessageSetV1
second_title: Aspose.Finance 适用于 .NET API 参考
description: 账单支付消息集版本1。
type: docs
weight: 4420
url: /zh/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

账单支付消息集版本1。

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1)() | 初始化 [`BillPayMessageSetV1`](../billpaymessagesetv1) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext) { get; set; } | 获取或设置是否支付提供商在支付操作中支持账单呈现上下文信息。 |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee) { get; set; } | 获取或设置用户是否可以添加收款人。如果为 false，用户将被限制只能使用支付系统添加到用户的收款人列表中的收款人。 |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels) { get; set; } | 获取或设置是否允许对模型进行修改。 |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments) { get; set; } | 获取或设置是否允许对付款进行修改。 |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal) { get; set; } | 获取或设置提款日期的偏移量。 |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay) { get; set; } | 获取或设置支票付款（转账除外）的默认天数。 |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment) { get; set; } | 获取或设置是否支持为模型生成的首次付款指定不同的金额。 |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment) { get; set; } | 获取或设置是否支持为模型生成的最后一次付款指定不同的金额。 |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment) { get; set; } | 获取或设置是否支持 !:ExtendedPayment 业务付款。 |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore) { get; set; } | 获取或设置 [`MessageSetCore`](../abstractmessagesetversion/messagesetcore)。 |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow) { get; set; } | 获取或设置模型窗口；即在计划处理的循环交易之前的天数，在系统中实例化该交易。 |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress) { get; set; } | 获取或设置是否支持向通过账单地址识别的收款人付款，即 [`Payee`](../../aspose.finance.ofx/payee)。 |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid) { get; set; } | 获取或设置是否支持向通过服务器提供的收款人 ID 识别的收款人付款。 |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer) { get; set; } | 获取或设置是否向通过目标账户识别的收款人付款。 |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow) { get; set; } | 获取或设置交易处理后可进行状态查询的天数。 |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs) { get; set; } | 获取或设置一周中不进行处理的天数。 |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime) { get; set; } | 获取或设置当天处理结束的时间。 |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods) { get; set; } | 如果为 true，服务器支持通过 !:PaymentModResponse 消息进行服务器发起的付款状态更改的通信。 |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw) { get; set; } | 获取或设置在处理日期之前从转账付款中提取资金的天数。 |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay) { get; set; } | 获取或设置通过转账支付的默认天数。 |

### 另请参阅

* class [AbstractMessageSetVersion](../abstractmessagesetversion)
* namespace [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
