---
title: "System::Diagnostics::TraceListener class"
linktitle: "TraceListener"
second_title: "Aspose.Page untuk C++"
description: "System::Diagnostics::TraceListener class. Antarmuka untuk merespons informasi debug dan jejak. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 800
url: /id/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


Antarmuka untuk merespons informasi debug dan jejak. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class TraceListener : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | Menulis pesan kegagalan ke debugger. |
| virtual [Fail](./fail/)(System::String, System::String) | Menulis pesan kegagalan ke debugger. |
| virtual [Write](./write/)(System::String) | Informasi RTTI. |
| virtual [WriteLine](./writeline/)(System::String) | Menulis baris ke debugger. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
