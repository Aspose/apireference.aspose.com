---
title: BillPayMessageSetV1
second_title: Aspose.Finance per .NET API Reference
description: Versione 1 del set di messaggi di pagamento delle bollette.
type: docs
weight: 4400
url: /it/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

Versione 1 del set di messaggi di pagamento delle bollette.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1)() | Inizializza una nuova istanza di[`BillPayMessageSetV1`](../billpaymessagesetv1) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext) { get; set; } | Ottiene o imposta se il fornitore di servizi di pagamento supporta le informazioni sul contesto della presentazione della fattura nelle operazioni di pagamento. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee) { get; set; } | Ottiene o imposta se l'utente può aggiungere beneficiari. Se false, l'utente è limitato ai beneficiari aggiunti all'elenco dei beneficiari dal sistema di pagamento. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels) { get; set; } | Ottiene o imposta se consente modifiche ai modelli. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments) { get; set; } | Ottiene o imposta se consente modifiche ai pagamenti. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal) { get; set; } | Ottiene o imposta l'offset sulla data di prelievo. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay) { get; set; } | Ottiene o imposta il numero predefinito di giorni per pagare tramite assegno (tranne tramite bonifico). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment) { get; set; } | Ottiene o imposta se il supporto per specificare un importo diverso per il primo pagamento generato da un modello |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment) { get; set; } | Ottiene o imposta se il supporto per specificare un importo diverso per l'ultimo pagamento generato da un modello |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment) { get; set; } | Ottiene o imposta se supporta il!:ExtendedPayment pagamento aziendale. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore) { get; set; } | Ottiene o imposta il[`MessageSetCore`](../abstractmessagesetversion/messagesetcore) . |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow) { get; set; } | Ottiene o imposta la finestra del modello; il numero di giorni prima che venga pianificata l'elaborazione di una transazione ricorrente in cui viene istanziata sul sistema. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress) { get; set; } | Ottiene o imposta se supporta i pagamenti ai beneficiari identificati dall'indirizzo di fatturazione, ovvero il[`Payee`](../../aspose.finance.ofx/payee) . |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid) { get; set; } | Ottiene o imposta se supporta i pagamenti ai beneficiari identificati da un ID beneficiario fornito dal server. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer) { get; set; } | Ottiene o imposta se i pagamenti ai beneficiari identificati dall'account di destinazione |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow) { get; set; } | Ottiene o imposta il numero di giorni dopo l'elaborazione di una transazione in cui è accessibile per le richieste di stato. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs) { get; set; } | Ottiene o imposta i giorni della settimana in cui non si verifica alcuna elaborazione. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime) { get; set; } | Ottiene o imposta l'ora del giorno in cui termina l'elaborazione di quel giorno. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods) { get; set; } | Se true, il server supporta la comunicazione delle modifiche allo stato di pagamento avviate dal server tramite il!:PaymentModResponse messaggio. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw) { get; set; } | Ottiene o imposta il numero di giorni prima della data di elaborazione in cui i fondi vengono prelevati per il pagamento tramite bonifico. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay) { get; set; } | Ottiene o imposta il numero predefinito di giorni per pagare tramite bonifico. |

### Guarda anche

* class [AbstractMessageSetVersion](../abstractmessagesetversion)
* spazio dei nomi [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile)
* assemblea [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
