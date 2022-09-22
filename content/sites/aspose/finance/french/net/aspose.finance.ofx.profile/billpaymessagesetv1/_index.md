---
title: BillPayMessageSetV1
second_title: Référence de l'API Aspose.Finance pour .NET
description: Version 1 de lensemble de messages de paiement de facture.
type: docs
weight: 4400
url: /fr/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

Version 1 de l'ensemble de messages de paiement de facture.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1)() | Initialise une nouvelle instance de[`BillPayMessageSetV1`](../billpaymessagesetv1) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext) { get; set; } | Obtient ou définit si le fournisseur de paiement prend en charge les informations de contexte de présentation de facture dans les opérations de paiement. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee) { get; set; } | Obtient ou définit si l'utilisateur peut ajouter des bénéficiaires. Si false, l'utilisateur est limité aux bénéficiaires ajoutés à la liste des bénéficiaires de l'utilisateur par le système de paiement. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels) { get; set; } | Obtient ou définit si les modifications des modèles sont autorisées. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments) { get; set; } | Obtient ou définit si les modifications des paiements sont autorisées. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal) { get; set; } | Obtient ou définit le décalage de la date de retrait. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay) { get; set; } | Obtient ou définit le nombre de jours par défaut pour payer par chèque (sauf par virement). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment) { get; set; } | Obtient ou définit si la prise en charge de la spécification d'un montant différent pour le premier paiement généré par un modèle |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment) { get; set; } | Obtient ou définit si la prise en charge de la spécification d'un montant différent pour le dernier paiement généré par un modèle |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment) { get; set; } | Obtient ou définit si prend en charge le!:ExtendedPayment paiement professionnel. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore) { get; set; } | Obtient ou définit le[`MessageSetCore`](../abstractmessagesetversion/messagesetcore) . |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow) { get; set; } | Obtient ou définit la fenêtre du modèle ; le nombre de jours avant qu'une transaction récurrente ne soit planifiée pour être traitée qu'elle soit instanciée sur le système. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress) { get; set; } | Obtient ou définit si prend en charge les paiements aux bénéficiaires identifiés par l'adresse de facturation, c'est-à-dire le[`Payee`](../../aspose.finance.ofx/payee) . |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid) { get; set; } | Obtient ou définit si la prise en charge des paiements aux bénéficiaires identifiés par un ID de bénéficiaire fourni par le serveur. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer) { get; set; } | Obtient ou définit si les paiements aux bénéficiaires identifiés par le compte de destination |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow) { get; set; } | Obtient ou définit le nombre de jours après le traitement d'une transaction pendant laquelle elle est accessible pour les demandes d'état. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs) { get; set; } | Obtient ou définit les jours de la semaine où aucun traitement n'a lieu. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime) { get; set; } | Obtient ou définit l'heure à laquelle le traitement de la journée se termine. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods) { get; set; } | Si vrai, le serveur prend en charge la communication des changements de statut de paiement initiés par le serveur au moyen du!:PaymentModResponse message. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw) { get; set; } | Obtient ou définit le nombre de jours avant la date de traitement pendant lesquels les fonds sont retirés pour paiement par virement. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay) { get; set; } | Obtient ou définit le nombre de jours par défaut pour payer par virement. |

### Voir également

* class [AbstractMessageSetVersion](../abstractmessagesetversion)
* espace de noms [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile)
* Assemblée [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
