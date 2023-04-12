---
title: Class BillPayMessageSetV1
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Ofx.Profile.BillPayMessageSetV1 kelas. Kumpulan pesan pembayaran tagihan versi 1.
type: docs
weight: 4420
url: /id/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

Kumpulan pesan pembayaran tagihan versi 1.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1/)() | Menginisialisasi instance baru dari`BillPayMessageSetV1` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext/) { get; set; } | Mendapat atau menyetel apakah Penyedia pembayaran mendukung informasi konteks penyajian tagihan dalam operasi pembayaran. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee/) { get; set; } | Mendapat atau menyetel apakah pengguna dapat menambahkan penerima pembayaran. jika salah, pengguna dibatasi untuk penerima pembayaran yang ditambahkan ke daftar penerima pembayaran pengguna oleh sistem pembayaran. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels/) { get; set; } | Mendapat atau menyetel apakah mengizinkan modifikasi pada model. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments/) { get; set; } | Mendapatkan atau menetapkan apakah mengizinkan modifikasi pembayaran. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal/) { get; set; } | Mendapat atau menyetel offset ke tanggal penarikan. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay/) { get; set; } | Mendapatkan atau menyetel jumlah hari default untuk membayar dengan cek (kecuali melalui transfer). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment/) { get; set; } | Mendapat atau menetapkan apakah dukungan untuk menentukan jumlah yang berbeda untuk pembayaran pertama yang dihasilkan oleh model |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment/) { get; set; } | Mendapat atau menetapkan apakah dukungan untuk menentukan jumlah yang berbeda untuk pembayaran terakhir yang dihasilkan oleh model |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment/) { get; set; } | Mendapatkan atau menetapkan apakah mendukung pembayaran bisnis ExtendedPayment. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore/) { get; set; } | Mendapat atau menyetel[`MessageSetCore`](../abstractmessagesetversion/messagesetcore/) . |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow/) { get; set; } | Mendapat atau menyetel jendela model; jumlah hari sebelum transaksi berulang dijadwalkan untuk diproses yang dibuat pada sistem. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress/) { get; set; } | Mendapatkan atau menetapkan apakah mendukung pembayaran kepada penerima pembayaran yang diidentifikasi berdasarkan alamat penagihan, yaitu,[`Payee`](../../aspose.finance.ofx/payee/) . |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid/) { get; set; } | Mendapatkan atau menetapkan apakah mendukung pembayaran kepada penerima pembayaran yang diidentifikasi oleh server yang menyediakan ID penerima pembayaran. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer/) { get; set; } | Mendapat atau menetapkan apakah pembayaran kepada penerima pembayaran diidentifikasi oleh akun tujuan |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow/) { get; set; } | Mendapat atau mengatur jumlah hari setelah transaksi diproses yang dapat diakses untuk pertanyaan status. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs/) { get; set; } | Mendapat atau menetapkan hari dalam seminggu saat tidak ada pemrosesan. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime/) { get; set; } | Mendapat atau menyetel waktu hari pemrosesan hari itu berakhir. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods/) { get; set; } | Jika benar, server mendukung komunikasi perubahan status pembayaran yang dimulai oleh server melalui pesan PaymentModResponse. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw/) { get; set; } | Mendapatkan atau menetapkan jumlah hari sebelum tanggal pemrosesan dana ditarik untuk pembayaran melalui transfer. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay/) { get; set; } | Mendapatkan atau menyetel jumlah hari default untuk membayar melalui transfer. |

### Lihat juga

* class [AbstractMessageSetVersion](../abstractmessagesetversion/)
* ruang nama [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile/)
* perakitan [Aspose.Finance](../../)


