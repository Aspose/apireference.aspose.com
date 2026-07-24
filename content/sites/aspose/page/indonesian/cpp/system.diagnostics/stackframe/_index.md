---
title: "System::Diagnostics::StackFrame kelas"
linktitle: "StackFrame"
second_title: "Aspose.Page untuk C++"
description: "System::Diagnostics::StackFrame kelas. Mendapatkan informasi tentang satu frame stack. hanya MSVS. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 500
url: /id/cpp/system.diagnostics/stackframe/
---
## StackFrame class


Mendapatkan informasi tentang satu frame stack. hanya MSVS. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class StackFrame : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | Mendapatkan nomor colnum. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | Mendapatkan nomor baris. |
| virtual [GetFileName](./getfilename/)() | Mendapatkan nama file. |
| [GetMethod](./getmethod/)() | Mendapatkan informasi metode. |
| [operator=](./operator=/)(const StackFrame\&) const | Tidak dapat diubah. |
| [StackFrame](./stackframe/)(int) | Membuat frame stack pada offset stack saat ini. |
| [StackFrame](./stackframe/)(const StackFrame\&) | Tidak ada penyalinan. |
| virtual [~StackFrame](./~stackframe/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
