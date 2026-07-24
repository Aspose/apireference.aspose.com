---
title: "Kelas System::ComponentModel::BackgroundWorker"
linktitle: "BackgroundWorker"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ComponentModel::BackgroundWorker. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | Informasi RTTI. |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | Mendapatkan nilai yang menunjukkan apakah [System::ComponentModel::BackgroundWorker](./) dapat melaporkan pembaruan progres. |
| [ReportProgress](./reportprogress/)(int) | Memicu peristiwa **System::ComponentModel::BackgroundWorker::ProgressChanged**. |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | Memicu peristiwa **System::ComponentModel::BackgroundWorker::ProgressChanged** dengan objek userState. |
| [RunWorkerAsync](./runworkerasync/)() | Memulai eksekusi operasi latar belakang. |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | Memulai eksekusi operasi latar belakang. |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | Mengatur nilai yang menunjukkan apakah [System::ComponentModel::BackgroundWorker](./) dapat melaporkan pembaruan kemajuan. |
| [~BackgroundWorker](./~backgroundworker/)() | Destruktor. |
## Lihat Juga

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
