---
title: BillPayMessageSetV1
second_title: Referencia de API de Aspose.Finance para .NET
description: Versión 1 del conjunto de mensajes de pago de facturas.
type: docs
weight: 4400
url: /es/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

Versión 1 del conjunto de mensajes de pago de facturas.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1)() | Inicializa una nueva instancia de[`BillPayMessageSetV1`](../billpaymessagesetv1) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext) { get; set; } | Obtiene o establece si el proveedor de pagos admite información de contexto de presentación de facturas en las operaciones de pago. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee) { get; set; } | Obtiene o establece si el usuario puede agregar beneficiarios. Si es falso, el sistema de pago restringe al usuario a los beneficiarios agregados a la lista de beneficiarios del usuario. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels) { get; set; } | Obtiene o establece si permite modificaciones a los modelos. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments) { get; set; } | Obtiene o establece si permite modificar pagos. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal) { get; set; } | Obtiene o establece la compensación para la fecha de retiro. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay) { get; set; } | Obtiene o establece el número de días predeterminado para pagar con cheque (excepto mediante transferencia). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment) { get; set; } | Obtiene o establece si se admite especificar un monto diferente para el primer pago generado por un modelo |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment) { get; set; } | Obtiene o establece si se admite especificar un monto diferente para el último pago generado por un modelo |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment) { get; set; } | Obtiene o establece si admite el!:ExtendedPayment pago comercial. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore) { get; set; } | Obtiene o establece el[`MessageSetCore`](../abstractmessagesetversion/messagesetcore) . |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow) { get; set; } | Obtiene o establece la ventana del modelo; el número de días antes de que se programe el procesamiento de una transacción recurrente que se instancia en el sistema. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress) { get; set; } | Obtiene o establece si admite pagos a beneficiarios identificados por dirección de facturación, es decir, el[`Payee`](../../aspose.finance.ofx/payee) . |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid) { get; set; } | Obtiene o establece si admite pagos a beneficiarios identificados por un ID de beneficiario proporcionado por el servidor. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer) { get; set; } | Obtiene o establece si los pagos a los beneficiarios identificados por la cuenta de destino |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow) { get; set; } | Obtiene o establece el número de días después de que se procesa una transacción que es accesible para consultas de estado. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs) { get; set; } | Obtiene o establece los días de la semana en los que no se realiza ningún procesamiento. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime) { get; set; } | Obtiene o establece la hora del día en que finaliza el procesamiento del día. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods) { get; set; } | Si es verdadero, el servidor admite la comunicación de los cambios de estado de pago iniciados por el servidor mediante el!:PaymentModResponse mensaje. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw) { get; set; } | Obtiene o establece el número de días antes de la fecha de procesamiento en que se retiran los fondos para el pago por transferencia. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay) { get; set; } | Obtiene o establece el número de días por defecto para pagar por transferencia. |

### Ver también

* class [AbstractMessageSetVersion](../abstractmessagesetversion)
* espacio de nombres [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile)
* asamblea [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
