---
title: "kelas System::SmartPtrInfo"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Page untuk C++"
description: "System::SmartPtrInfo class. Kelas layanan untuk menguji dan mengubah konten SmartPtr''s tanpa mengetahui tipe akhir. Digunakan untuk pengumpulan sampah dan deteksi referensi siklus, dll. Anggap sebagai ''pointer to pointer''. Kami tidak dapat menggunakan basetype SmartPtr''s karena tidak memiliki apa pun; sebagai gantinya, kami menggunakan kelas ''info'' ini dalam C++."
type: docs
weight: 5600
url: /id/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Kelas layanan untuk menguji dan mengubah konten [SmartPtr](../smartptr/)'s tanpa mengetahui tipe akhir. Digunakan untuk pengumpulan sampah dan deteksi referensi siklus, dll. Anggap sebagai 'pointer to pointer'. Kami tidak dapat menggunakan basetype [SmartPtr](../smartptr/)'s karena tidak memiliki apa pun; sebagai gantinya, kami menggunakan kelas 'info' ini.

```cpp
class SmartPtrInfo
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | Mendapatkan objek mentah yang ditunjuk oleh pointer referensi. |
| [getObject](./getobject/)() const | Mendapatkan objek yang ditunjuk oleh pointer referensi. |
| [getOwned](./getowned/)() const | Mendapatkan pointer milik objek. |
| [operator bool](./operatorbool/)() const | Memeriksa apakah objek info menunjuk ke pointer yang tidak null. |
| [operator!](./operator!/)() const | Memeriksa apakah objek info tidak menunjuk ke pointer yang tidak null. |
| [operator->](./operator-_/)() const | Mengizinkan pemanggilan metode [Object](../object/) yang ditunjuk oleh pointer referensi. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Less-membandingkan nilai pointer yang direferensikan oleh dua objek info. |
| [SmartPtrInfo](./smartptrinfo/)() | Membuat objek [SmartPtrInfo](./) kosong. |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Membuat objek [SmartPtrInfo](./) dengan informasi tentang smart pointer tertentu. |
## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
