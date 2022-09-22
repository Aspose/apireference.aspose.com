---
title: BillPayMessageSetV1
second_title: Aspose.Finance for .NET API Referansı
description: Fatura ödeme mesajı setinin 1. sürümü.
type: docs
weight: 4400
url: /tr/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

Fatura ödeme mesajı setinin 1. sürümü.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1)() | Yeni bir örneğini başlatır[`BillPayMessageSetV1`](../billpaymessagesetv1) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext) { get; set; } | Ödeme sağlayıcısının ödeme işlemlerinde fatura ibraz bağlamı bilgilerini destekleyip desteklemediğini alır veya ayarlar. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee) { get; set; } | Kullanıcının alacaklı ekleyip ekleyemeyeceğini alır veya ayarlar. yanlışsa, kullanıcı ödeme sistemi tarafından kullanıcının alacaklılar listesine eklenen alacaklılarla sınırlıdır. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels) { get; set; } | Modellerde değişikliklere izin verilip verilmediğini alır veya ayarlar. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments) { get; set; } | Ödemelerde değişiklik yapılmasına izin verilip verilmediğini alır veya ayarlar. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal) { get; set; } | Geri çekme tarihine kadar olan ofseti alır veya ayarlar. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay) { get; set; } | Çekle ödeme için varsayılan gün sayısını alır veya ayarlar (havale hariç). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment) { get; set; } | Bir model tarafından oluşturulan ilk ödeme için farklı bir tutar belirleme desteğini alır veya ayarlar |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment) { get; set; } | Bir model tarafından oluşturulan son ödeme için farklı bir tutar belirleme desteğini alır veya ayarlar |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment) { get; set; } | Destekleyip desteklemediğini alır veya ayarlar.!:ExtendedPayment iş ödemesi. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore) { get; set; } | Alır veya ayarlar[`MessageSetCore`](../abstractmessagesetversion/messagesetcore) . |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow) { get; set; } | Model penceresini alır veya ayarlar; yinelenen bir işlemin işlenmek üzere programlanmasından önceki ve sistemde somutlaştırılan gün sayısı. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress) { get; set; } | Fatura adresiyle tanımlanan alacaklılara yapılan ödemeleri destekleyip desteklemediğini alır veya ayarlar.[`Payee`](../../aspose.finance.ofx/payee) . |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid) { get; set; } | Sunucu tarafından sağlanan bir alacaklı kimliği tarafından tanımlanan alacaklılara yapılan ödemeleri destekleyip desteklemediğini alır veya ayarlar. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer) { get; set; } | Hedef hesap tarafından tanımlanan alacaklılara yapılacak ödemeleri alır veya ayarlar |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow) { get; set; } | Bir işlem işlendikten sonra durum sorgulamaları için erişilebilir olduğu gün sayısını alır veya ayarlar. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs) { get; set; } | İşlem yapılmayan haftanın günlerini alır veya ayarlar. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime) { get; set; } | İşlemin bittiği günün saatini alır veya ayarlar. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods) { get; set; } | Doğruysa, sunucu, sunucu tarafından başlatılan ödeme durumu değişikliklerinin aşağıdakiler aracılığıyla iletişimini destekler:!:PaymentModResponse mesaj. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw) { get; set; } | Transfer yoluyla ödeme için paranın çekildiği işlem tarihinden önceki gün sayısını alır veya ayarlar. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay) { get; set; } | Aktarımla ödenecek varsayılan gün sayısını alır veya ayarlar. |

### Ayrıca bakınız

* class [AbstractMessageSetVersion](../abstractmessagesetversion)
* ad alanı [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile)
* toplantı [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
