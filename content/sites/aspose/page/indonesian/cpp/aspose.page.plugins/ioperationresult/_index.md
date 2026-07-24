---
title: "Aspose::Page::Plugins::IOperationResult kelas"
linktitle: "IOperationResult"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::Plugins::IOperationResult kelas. Antarmuka hasil operasi umum yang mendefinisikan metode umum yang harus diimplementasikan oleh hasil operasi plugin konkret di C++."
type: docs
weight: 700
url: /id/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


Antarmuka hasil operasi umum yang mendefinisikan metode umum yang harus diimplementasikan oleh hasil operasi plugin konkret.

```cpp
class IOperationResult : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_Data](./get_data/)() | Mendapatkan data mentah. |
| virtual [get_IsByteArray](./get_isbytearray/)() | Menunjukkan apakah hasilnya berupa array byte. |
| virtual [get_IsFile](./get_isfile/)() | Menunjukkan apakah hasilnya berupa path ke file output. |
| virtual [get_IsStream](./get_isstream/)() | Menunjukkan apakah hasilnya berupa stream output. |
| virtual [get_IsString](./get_isstring/)() | Menunjukkan apakah hasilnya berupa string teks. |
| virtual [ToFile](./tofile/)() | Mencoba mengonversi hasil menjadi file. |
| virtual [ToStream](./tostream/)() | Mencoba mengonversi hasil ke objek stream. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
