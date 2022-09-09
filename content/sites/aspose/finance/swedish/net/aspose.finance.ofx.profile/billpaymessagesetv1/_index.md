---
title: BillPayMessageSetV1
second_title: Aspose.Finance för .NET API-referens
description: Version 1 av faktureringsmeddelandeuppsättning.
type: docs
weight: 4400
url: /sv/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

Version 1 av faktureringsmeddelandeuppsättning.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1)() | Initierar en ny instans av[`BillPayMessageSetV1`](../billpaymessagesetv1) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext) { get; set; } | Hämtar eller ställer in om betalningsleverantören stöder kontextinformation för fakturapresentation i betalningsoperationer. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee) { get; set; } | Hämtar eller ställer in om användaren kan lägga till betalningsmottagare. Om det är falskt är användaren begränsad till betalningsmottagare som läggs till i användarens betalningsmottagarelista av betalningssystemet. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels) { get; set; } | Hämtar eller ställer in om modifieringar av modeller tillåts. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments) { get; set; } | Hämtar eller ställer in om det tillåts ändringar av betalningar. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal) { get; set; } | Hämtar eller ställer in offset till uttagsdatum. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay) { get; set; } | Hämtar eller ställer in standardantal dagar att betala med check (förutom genom överföring). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment) { get; set; } | Hämtar eller ställer in om stöd för att ange ett annat belopp för den första betalningen som genereras av en model |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment) { get; set; } | Hämtar eller ställer in om stöd för att ange ett annat belopp för den senaste betalningen som genererades av en model |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment) { get; set; } | Hämtar eller ställer in om stöder!:ExtendedPayment företagsbetalning. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore) { get; set; } | Hämtar eller ställer in[`MessageSetCore`](../abstractmessagesetversion/messagesetcore) . |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow) { get; set; } | Hämtar eller ställer in modellfönstret; antalet dagar innan en återkommande transaktion planeras att behandlas som den instansieras i systemet. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress) { get; set; } | Hämtar eller ställer in om stöder betalningar till betalningsmottagare identifierade av faktureringsadress, det vill säga[`Payee`](../../aspose.finance.ofx/payee) . |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid) { get; set; } | Hämtar eller ställer in om stöder betalningar till betalningsmottagare identifierade av ett serverlevererat betalningsmottagare-ID. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer) { get; set; } | Hämtar eller ställer in om betalningar till betalningsmottagare identifierade av destinationskonto |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow) { get; set; } | Hämtar eller ställer in antalet dagar efter att en transaktion har bearbetats som den är tillgänglig för statusförfrågningar. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs) { get; set; } | Hämtar eller ställer in veckodagar som ingen bearbetning sker. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime) { get; set; } | Hämtar eller ställer in tiden på dagen då dagens bearbetning slutar. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods) { get; set; } | Om sant, stöder servern kommunikation av serverinitierade betalningsstatusändringar med hjälp av!:PaymentModResponse meddelande. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw) { get; set; } | Hämtar eller ställer in antalet dagar före behandlingsdatum som pengar dras ut för betalning genom överföring. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay) { get; set; } | Hämtar eller ställer in standardantal dagar att betala med överföring. |

### Se även

* class [AbstractMessageSetVersion](../abstractmessagesetversion)
* namnutrymme [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile)
* hopsättning [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
