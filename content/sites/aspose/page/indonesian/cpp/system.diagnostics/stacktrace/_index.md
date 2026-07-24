---
title: "Kelas System::Diagnostics::StackTrace"
linktitle: "StackTrace"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Diagnostics::StackTrace. Kumpulan frame stack. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


Kumpulan frame stack. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class StackTrace : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | Mendapatkan jumlah frame dalam jejak stack. |
| virtual [GetFrame](./getframe/)(uint32_t) | Mendapatkan frame stack. |
| [operator=](./operator=/)(const StackTrace\&) const | Tidak ada penugasan. |
| [StackTrace](./stacktrace/)() | Membuat jejak stack yang menggambarkan keadaan stack saat ini. |
| [StackTrace](./stacktrace/)(bool) | Membuat jejak stack yang menggambarkan keadaan stack saat ini. |
| [StackTrace](./stacktrace/)(const StackTrace\&) | Tidak ada penyalinan. |
| virtual [~StackTrace](./~stacktrace/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
