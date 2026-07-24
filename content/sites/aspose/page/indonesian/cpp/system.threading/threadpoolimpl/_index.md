---
title: "System::Threading::ThreadPoolImpl kelas"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::ThreadPoolImpl kelas. Data internal thread pool. Ini adalah tipe singleton dengan manajemen memori yang dilakukan oleh fungsi akses. Anda tidak pernah harus membuat instance darinya secara langsung dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Mendapatkan jumlah thread yang tersedia. |
| static [GetInitialized](./getinitialized/)() | Mendapatkan singleton status inisialisasi. |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Mendapatkan jumlah maksimal thread bersamaan. |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | Mendapatkan jumlah minimal thread yang dibuat oleh pool. |
| [JoinAll](./joinall/)() | Menggabungkan semua thread yang dimiliki. Menunggu tanpa batas. |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Menambahkan item kerja ke antrean. |
| [SetMaxThreads](./setmaxthreads/)(int, int) | Mengatur jumlah thread yang dimiliki oleh pool. |
| [SetMinThreads](./setminthreads/)(int, int) | Mengatur jumlah minimal thread yang dimiliki oleh pool. |
| [ThreadPoolImpl](./threadpoolimpl/)() | Konstruktor. |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | Destructor. Menggabungkan semua thread jika belum dihentikan. |
## Lihat Juga

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
