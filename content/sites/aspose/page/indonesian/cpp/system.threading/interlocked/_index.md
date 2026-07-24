---
title: "System::Threading::Interlocked kelas"
linktitle: "Interlocked"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Interlocked kelas. Menyediakan API untuk operasi yang aman terhadap thread. Ini adalah tipe statis tanpa layanan instance. Anda tidak pernah harus membuat instance darinya dengan cara apapun dalam C++."
type: docs
weight: 600
url: /id/cpp/system.threading/interlocked/
---
## Interlocked class


Menyediakan API untuk operasi yang aman terhadap thread. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun.

```cpp
class Interlocked
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | Meningkatkan nilai secara atomik. |
| static [Add](./add/)(int64_t\&, int64_t) | Meningkatkan nilai secara atomik. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Membandingkan dan menukar nilai pada variabel: memeriksa apakah variabel sama dengan nilai tertentu dan menyimpan nilai baru hanya jika nilai yang disimpan cocok dengan yang diharapkan. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Membandingkan dan menukar nilai pada variabel: memeriksa apakah variabel sama dengan nilai tertentu dan menyimpan nilai baru hanya jika nilai yang disimpan cocok dengan yang diharapkan. Tidak diimplementasikan. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | Membandingkan dan menukar nilai pada variabel: memeriksa apakah variabel sama dengan nilai tertentu dan menyimpan nilai baru hanya jika nilai yang disimpan cocok dengan yang diharapkan. |
| static [Decrement](./decrement/)(int32_t\&) | Mengurangi nilai secara atomik. |
| static [Decrement](./decrement/)(int64_t\&) | Mengurangi nilai secara atomik. |
| static [Exchange](./exchange/)(T\&, T) | Menukar nilai pada variabel: menyimpan nilai baru dan mengembalikan nilai yang dimiliki variabel tepat sebelum penyimpanan. |
| static [Exchange](./exchange/)(T\&, T) | Menukar nilai pada variabel: menyimpan nilai baru dan mengembalikan nilai yang dimiliki variabel tepat sebelum penyimpanan. Tidak diimplementasikan. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | Meningkatkan nilai secara atomik melalui prosedur exchange-add. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | Meningkatkan nilai secara atomik melalui prosedur exchange-add. |
| static [Increment](./increment/)(int32_t\&) | Meningkatkan nilai secara atomik. |
| static [Increment](./increment/)(int64_t\&) | Meningkatkan nilai secara atomik. |
| static [Read](./read/)(int64_t\&) | Mengembalikan nilai 64-bit, dimuat sebagai operasi atomik. |
## Lihat Juga

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
