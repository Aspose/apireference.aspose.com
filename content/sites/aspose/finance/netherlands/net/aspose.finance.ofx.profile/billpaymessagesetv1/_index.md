---
title: Class BillPayMessageSetV1
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.Profile.BillPayMessageSetV1 klas. Versie 1 van berichtenset voor het betalen van rekeningen.
type: docs
weight: 4420
url: /nl/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

Versie 1 van berichtenset voor het betalen van rekeningen.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1/)() | Initialiseert een nieuw exemplaar van`BillPayMessageSetV1` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext/) { get; set; } | Krijgt of stelt in of de betalingsprovider contextinformatie over factuurpresentatie ondersteunt bij betalingsoperaties. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee/) { get; set; } | Krijgt of stelt in of de gebruiker begunstigden kan toevoegen. Als dit onwaar is, is de gebruiker beperkt tot begunstigden die door het betalingssysteem aan de lijst met begunstigden van de gebruiker zijn toegevoegd. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels/) { get; set; } | Krijgt of stelt in of wijzigingen aan modellen zijn toegestaan. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments/) { get; set; } | Krijgt of stelt in of wijzigingen aan betalingen zijn toegestaan. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal/) { get; set; } | Haalt of stelt de compensatie in op opnamedatum. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay/) { get; set; } | Ontvangt of stelt het standaard aantal dagen in om per cheque te betalen (behalve bij overschrijving). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment/) { get; set; } | Krijgt of stelt in of ondersteuning voor het specificeren van een ander bedrag voor de eerste betaling gegenereerd door een model |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment/) { get; set; } | Krijgt of stelt in of ondersteuning voor het specificeren van een ander bedrag voor de laatste betaling gegenereerd door een model |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment/) { get; set; } | Krijgt of stelt in of de ExtendedPayment zakelijke betaling wordt ondersteund. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore/) { get; set; } | Haalt of stelt de[`MessageSetCore`](../abstractmessagesetversion/messagesetcore/) . |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow/) { get; set; } | Haalt of stelt het modelvenster in; het aantal dagen voordat een terugkerende transactie moet worden verwerkt, dat deze op het systeem wordt geïnstantieerd. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress/) { get; set; } | Ontvangt of stelt in of betalingen worden ondersteund aan begunstigden geïdentificeerd door factuuradres, dat wil zeggen de[`Payee`](../../aspose.finance.ofx/payee/) . |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid/) { get; set; } | Ontvangt of stelt in of betalingen aan begunstigden worden ondersteund die worden geïdentificeerd door een door de server geleverde ID van de begunstigde. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer/) { get; set; } | Ontvangt of stelt in of betalingen aan begunstigden geïdentificeerd door bestemmingsrekening |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow/) { get; set; } | Haalt of stelt het aantal dagen in nadat een transactie is verwerkt dat deze toegankelijk is voor statusvragen. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs/) { get; set; } | Haalt of stelt de dagen van de week in waarop geen verwerking plaatsvindt. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime/) { get; set; } | Haalt of stelt de tijd van de dag in waarop de verwerking van de dag eindigt. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods/) { get; set; } | Indien waar, ondersteunt de server de communicatie van door de server geïnitieerde betalingsstatuswijzigingen door middel van het PaymentModResponse-bericht. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw/) { get; set; } | Hiermee wordt het aantal dagen vóór de verwerkingsdatum opgehaald of ingesteld dat geld wordt opgenomen voor betaling via overschrijving. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay/) { get; set; } | Ontvangt of stelt het standaard aantal dagen in om te betalen via overschrijving. |

### Zie ook

* class [AbstractMessageSetVersion](../abstractmessagesetversion/)
* naamruimte [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile/)
* montage [Aspose.Finance](../../)


