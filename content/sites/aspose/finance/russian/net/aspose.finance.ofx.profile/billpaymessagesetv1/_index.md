---
title: BillPayMessageSetV1
second_title: Справочник по API Aspose.Finance для .NET
description: Версия 1 набора сообщений об оплате счетов.
type: docs
weight: 4400
url: /ru/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

Версия 1 набора сообщений об оплате счетов.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1)() | Инициализирует новый экземпляр класса[`BillPayMessageSetV1`](../billpaymessagesetv1). |

## Характеристики

| Имя | Описание |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext) { get; set; } | Получает или задает, поддерживает ли платежный провайдер информацию контекста представления счета в платежных операциях. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee) { get; set; } | Получает или устанавливает, может ли пользователь добавлять получателей платежей. Если false, пользователь ограничен получателями платежей, добавленными платежной системой в список получателей платежей пользователя. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels) { get; set; } | Получает или задает разрешение на изменение моделей. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments) { get; set; } | Получает или задает разрешение на изменение платежей. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal) { get; set; } | Получает или задает смещение до даты отзыва. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay) { get; set; } | Получает или задает количество дней по умолчанию для оплаты чеком (кроме перевода). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment) { get; set; } | Возвращает или задает поддержку указания другой суммы для первого платежа, сгенерированного моделью |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment) { get; set; } | Возвращает или задает поддержку указания другой суммы для последнего платежа, сгенерированного моделью |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment) { get; set; } | Получает или задает, поддерживает ли бизнес-платеж!:ExtendedPayment. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore) { get; set; } | Получает или задает[`MessageSetCore`](../abstractmessagesetversion/messagesetcore). |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow) { get; set; } | Получает или задает окно модели; количество дней до запланированной обработки повторяющейся транзакции, когда она создается в системе. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress) { get; set; } | Получает или задает, поддерживает ли платежи получателям, идентифицированным платежным адресом, то есть[`Payee`](../../aspose.finance.ofx/payee). |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid) { get; set; } | Получает или задает, поддерживает ли платежи получателям, идентифицированным идентификатором получателя, предоставленным сервером. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer) { get; set; } | Получает или задает, будут ли платежи получателям, идентифицированным целевым счетом |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow) { get; set; } | Получает или задает количество дней после обработки транзакции, в течение которых она доступна для запросов о состоянии. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs) { get; set; } | Получает или задает дни недели, в которые не выполняется обработка. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime) { get; set; } | Получает или задает время окончания обработки дня. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods) { get; set; } | При значении true сервер поддерживает передачу инициированных сервером изменений статуса платежа посредством сообщения!:PaymentModResponse. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw) { get; set; } | Получает или задает количество дней до даты обработки, за которое средства снимаются для оплаты переводом. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay) { get; set; } | Получает или задает количество дней по умолчанию для оплаты переводом. |

### Смотрите также

* class [AbstractMessageSetVersion](../abstractmessagesetversion)
* пространство имен [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile)
* сборка [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
