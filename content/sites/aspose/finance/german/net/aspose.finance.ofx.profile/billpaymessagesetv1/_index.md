---
title: BillPayMessageSetV1
second_title: Aspose.Finance für .NET-API-Referenz
description: Version 1 des Rechnungszahlungsnachrichtensatzes.
type: docs
weight: 4400
url: /de/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

Version 1 des Rechnungszahlungsnachrichtensatzes.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1)() | Initialisiert eine neue Instanz von[`BillPayMessageSetV1`](../billpaymessagesetv1) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext) { get; set; } | Ruft ab oder legt fest, ob der Zahlungsanbieter Kontextinformationen zur Rechnungsdarstellung bei Zahlungsvorgängen unterstützt. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee) { get; set; } | Ruft ab oder legt fest, ob Benutzer Zahlungsempfänger hinzufügen können. Wenn falsch, ist der Benutzer auf Zahlungsempfänger beschränkt, die vom Zahlungssystem zur Zahlungsempfängerliste des Benutzers hinzugefügt wurden. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels) { get; set; } | Ruft ab oder legt fest, ob Änderungen an Modellen zulässig sind. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments) { get; set; } | Ruft ab oder legt fest, ob Änderungen an Zahlungen zulässig sind. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal) { get; set; } | Holt oder setzt den Offset zum Auszahlungsdatum. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay) { get; set; } | Ruft die Standardzahl der Tage für die Zahlung per Scheck (außer per Überweisung) ab oder legt sie fest. |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment) { get; set; } | Ruft ab oder legt fest, ob Unterstützung für die Angabe eines anderen Betrags für die erste von einem Modell generierte Zahlung unterstützt wird |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment) { get; set; } | Ruft ab oder legt fest, ob Unterstützung für die Angabe eines anderen Betrags für die letzte von einem Modell generierte Zahlung unterstützt wird |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment) { get; set; } | Ermittelt oder setzt, ob das unterstützt wird!:ExtendedPayment geschäftliche Zahlung. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore) { get; set; } | Ruft ab oder setzt die[`MessageSetCore`](../abstractmessagesetversion/messagesetcore) . |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow) { get; set; } | Ruft das Modellfenster ab oder setzt es; die Anzahl der Tage, bevor eine wiederkehrende Transaktion verarbeitet werden soll, bevor sie auf dem System instanziiert wird. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress) { get; set; } | Ruft ab oder legt fest, ob Zahlungen an Zahlungsempfänger unterstützt werden, die durch die Rechnungsadresse identifiziert werden, d. h[`Payee`](../../aspose.finance.ofx/payee) . |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid) { get; set; } | Ruft ab oder legt fest, ob Zahlungen an Zahlungsempfänger unterstützt werden, die durch eine vom Server bereitgestellte Zahlungsempfänger-ID identifiziert werden. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer) { get; set; } | Ruft ab oder legt fest, ob Zahlungen an Zahlungsempfänger, identifiziert durch Zielkonto |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow) { get; set; } | Ruft ab oder legt fest, wie viele Tage nach der Verarbeitung einer Transaktion für Statusabfragen auf sie zugegriffen werden kann. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs) { get; set; } | Ruft die Wochentage ab oder legt sie fest, an denen keine Verarbeitung stattfindet. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime) { get; set; } | Ruft die Tageszeit ab, zu der die Verarbeitung an diesem Tag endet, oder legt diese fest. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods) { get; set; } | Wenn wahr, unterstützt der Server die Kommunikation von serverinitiierten Zahlungsstatusänderungen mittels des!:PaymentModResponse Nachricht. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw) { get; set; } | Ruft die Anzahl der Tage vor dem Verarbeitungsdatum ab oder legt sie fest, an denen Gelder zur Zahlung per Überweisung abgebucht werden. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay) { get; set; } | Ruft die Standardzahl der Tage für die Zahlung per Überweisung ab oder legt sie fest. |

### Siehe auch

* class [AbstractMessageSetVersion](../abstractmessagesetversion)
* namensraum [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile)
* Montage [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
