---
title: StatementTransaction
second_title: Справочник по API Aspose.Finance для .NET
description: Этот класс описывает одну транзакцию. Он определяет тип транзакции и дату ее публикации. Класс также может предоставлять дополнительную информацию помогающую клиенту распознать транзакцию номер чека имя получателя платежа и памятку. Транзакция может иметь стандартный промышленный код который клиент может использовать для классификации транзакции.
type: docs
weight: 5700
url: /ru/net/aspose.finance.ofx/statementtransaction/
---
## StatementTransaction class

Этот класс описывает одну транзакцию. Он определяет тип транзакции и дату ее публикации. Класс также может предоставлять дополнительную информацию, помогающую клиенту распознать транзакцию: номер чека, имя получателя платежа и памятку. Транзакция может иметь стандартный промышленный код, который клиент может использовать для классификации транзакции.

```csharp
public class StatementTransaction
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [StatementTransaction](statementtransaction)() | Инициализирует новый экземпляр[`StatementTransaction`](../statementtransaction) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx/statementtransaction/accountto) { get; set; } | Получает или устанавливает учетную запись,[`BankAccount`](../bankaccount) или же[`CreditCardAccount`](../creditcardaccount) . |
| [AvailableDate](../../aspose.finance.ofx/statementtransaction/availabledate) { get; set; } | Получает или задает дату доступности средств (дата валютирования). |
| [CheckNumber](../../aspose.finance.ofx/statementtransaction/checknumber) { get; set; } | Получает или задает контрольный номер. |
| [CorrectFinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/correctfinancialinstitutiontransactionid) { get; set; } | Получает или задает исправленный идентификатор транзакции. Если присутствует, FinancialInstitutionTransactionId ранее отправленной транзакции, исправленной этой записью. |
| [CorrectiveAction](../../aspose.finance.ofx/statementtransaction/correctiveaction) { get; set; } | Получает или задает корректирующее действие. |
| [Currency](../../aspose.finance.ofx/statementtransaction/currency) { get; set; } | Получает или задает[`Currency`](./currency) . |
| [ExtendedName](../../aspose.finance.ofx/statementtransaction/extendedname) { get; set; } | Получает или задает расширенное имя получателя платежа или описание транзакции. |
| [FinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/financialinstitutiontransactionid) { get; set; } | Получает или задает идентификатор транзакции, выданный финансовым учреждением. |
| [ImageDatas](../../aspose.finance.ofx/statementtransaction/imagedatas) { get; set; } | Получает или задает коллекцию[`ImageData`](../imagedata) . |
| [Investment401kSource](../../aspose.finance.ofx/statementtransaction/investment401ksource) { get; set; } | Получает или задает источник денежных средств для этой транзакции. |
| [Memo](../../aspose.finance.ofx/statementtransaction/memo) { get; set; } | Получает или устанавливает дополнительную информацию. |
| [Name](../../aspose.finance.ofx/statementtransaction/name) { get; set; } | Получает или задает имя получателя платежа или описание транзакции. |
| [OriginCurrency](../../aspose.finance.ofx/statementtransaction/origincurrency) { get; set; } | Получает или задает источник[`Currency`](./currency) . |
| [Payee](../../aspose.finance.ofx/statementtransaction/payee) { get; set; } | Получает или задает[`Payee`](./payee) . |
| [PayeeId](../../aspose.finance.ofx/statementtransaction/payeeid) { get; set; } | Получает или устанавливает идентификатор получателя платежа, если он доступен. |
| [PostedDate](../../aspose.finance.ofx/statementtransaction/posteddate) { get; set; } | Получает или задает дату, когда транзакция была разнесена по счету. |
| [ReferenceNumber](../../aspose.finance.ofx/statementtransaction/referencenumber) { get; set; } | Получает или задает ссылочный номер, который однозначно идентифицирует транзакцию. |
| [ServerTransactionId](../../aspose.finance.ofx/statementtransaction/servertransactionid) { get; set; } | Получает или задает идентификатор транзакции, назначенный сервером. |
| [StandardIndustrialCode](../../aspose.finance.ofx/statementtransaction/standardindustrialcode) { get; set; } | Получает или задает стандартный промышленный код. |
| [TransactionAmount](../../aspose.finance.ofx/statementtransaction/transactionamount) { get; set; } | Получает или устанавливает сумму транзакции. |
| [TransactionType](../../aspose.finance.ofx/statementtransaction/transactiontype) { get; set; } | Получает или задает тип транзакции. |
| [UserDate](../../aspose.finance.ofx/statementtransaction/userdate) { get; set; } | Получает или задает дату транзакции, инициированной пользователем, если она известна. |

### Смотрите также

* пространство имен [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* сборка [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
