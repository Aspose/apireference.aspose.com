---
title: StatementTransaction
second_title: Referencia de API de Aspose.Finance para .NET
description: Esta clase describe una sola transacción. Identifica el tipo de transacción y la fecha en que se registró. La clase también puede proporcionar información adicional para ayudar al cliente a reconocer la transacción número de cheque nombre del beneficiario y nota. La transacción puede tener un Código Industrial Estándar que un cliente puede usar para categorizar la transacción.
type: docs
weight: 5700
url: /es/net/aspose.finance.ofx/statementtransaction/
---
## StatementTransaction class

Esta clase describe una sola transacción. Identifica el tipo de transacción y la fecha en que se registró. La clase también puede proporcionar información adicional para ayudar al cliente a reconocer la transacción: número de cheque, nombre del beneficiario y nota. La transacción puede tener un Código Industrial Estándar que un cliente puede usar para categorizar la transacción.

```csharp
public class StatementTransaction
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [StatementTransaction](statementtransaction)() | Inicializa una nueva instancia de[`StatementTransaction`](../statementtransaction) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx/statementtransaction/accountto) { get; set; } | Obtiene o establece la cuenta a,[`BankAccount`](../bankaccount) o[`CreditCardAccount`](../creditcardaccount) . |
| [AvailableDate](../../aspose.finance.ofx/statementtransaction/availabledate) { get; set; } | Obtiene o establece la fecha en que los fondos están disponibles (fecha valor). |
| [CheckNumber](../../aspose.finance.ofx/statementtransaction/checknumber) { get; set; } | Obtiene o establece el número de cheque. |
| [CorrectFinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/correctfinancialinstitutiontransactionid) { get; set; } | Obtiene o establece el ID de transacción corregido. Si está presente, el FinancialInstitutionTransactionId de una transacción enviada anteriormente que se corrige con este registro. |
| [CorrectiveAction](../../aspose.finance.ofx/statementtransaction/correctiveaction) { get; set; } | Obtiene o establece la acción correctiva. |
| [Currency](../../aspose.finance.ofx/statementtransaction/currency) { get; set; } | Obtiene o establece el[`Currency`](./currency) . |
| [ExtendedName](../../aspose.finance.ofx/statementtransaction/extendedname) { get; set; } | Obtiene o establece el nombre completo del beneficiario o la descripción de la transacción. |
| [FinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/financialinstitutiontransactionid) { get; set; } | Obtiene o establece el ID de transacción emitido por la institución financiera. |
| [ImageDatas](../../aspose.finance.ofx/statementtransaction/imagedatas) { get; set; } | Obtiene o establece la colección de[`ImageData`](../imagedata) . |
| [Investment401kSource](../../aspose.finance.ofx/statementtransaction/investment401ksource) { get; set; } | Obtiene o establece la fuente de efectivo para esta transacción. |
| [Memo](../../aspose.finance.ofx/statementtransaction/memo) { get; set; } | Obtiene o establece la información adicional. |
| [Name](../../aspose.finance.ofx/statementtransaction/name) { get; set; } | Obtiene o establece el nombre del beneficiario o la descripción de la transacción. |
| [OriginCurrency](../../aspose.finance.ofx/statementtransaction/origincurrency) { get; set; } | Obtiene o establece el Origen[`Currency`](./currency) . |
| [Payee](../../aspose.finance.ofx/statementtransaction/payee) { get; set; } | Obtiene o establece el[`Payee`](./payee) . |
| [PayeeId](../../aspose.finance.ofx/statementtransaction/payeeid) { get; set; } | Obtiene o establece el identificador del beneficiario si está disponible. |
| [PostedDate](../../aspose.finance.ofx/statementtransaction/posteddate) { get; set; } | Obtiene o establece la fecha en que se registró la transacción en la cuenta. |
| [ReferenceNumber](../../aspose.finance.ofx/statementtransaction/referencenumber) { get; set; } | Obtiene o establece el número de referencia que identifica de forma única la transacción. |
| [ServerTransactionId](../../aspose.finance.ofx/statementtransaction/servertransactionid) { get; set; } | Obtiene o establece el ID de transacción asignado por el servidor. |
| [StandardIndustrialCode](../../aspose.finance.ofx/statementtransaction/standardindustrialcode) { get; set; } | Obtiene o establece el Código industrial estándar. |
| [TransactionAmount](../../aspose.finance.ofx/statementtransaction/transactionamount) { get; set; } | Obtiene o establece el monto de la transacción. |
| [TransactionType](../../aspose.finance.ofx/statementtransaction/transactiontype) { get; set; } | Obtiene o establece el tipo de transacción. |
| [UserDate](../../aspose.finance.ofx/statementtransaction/userdate) { get; set; } | Obtiene o establece la fecha en que el usuario inició la transacción, si se conoce. |

### Ver también

* espacio de nombres [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* asamblea [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
