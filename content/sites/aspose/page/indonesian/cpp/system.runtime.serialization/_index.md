---
title: "ruang nama System::Runtime::Serialization"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan ruang nama System::Runtime::Serialization dalam C++."
type: docs
weight: 5300
url: /id/cpp/system.runtime.serialization/
---



## Kelas

| Kelas | Deskripsi |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | Mewakili implementasi dasar dari antarmuka [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/). |
| [IFormatterConverter](./iformatterconverter/) | Menyediakan koneksi antara sebuah instance dari [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) dan kelas yang disediakan oleh formatter yang paling cocok untuk mengurai data di dalam [System::Runtime::Serialization::SerializationInfo](./serializationinfo/). |
| [ISerializable](./iserializable/) | Antarmuka objek yang dapat diserialisasi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen. |
| [SerializationInfo](./serializationinfo/) | Menyimpan sekumpulan bidang bernama yang mewakili objek yang diserialisasi. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen. |
| [StreamingContext](./streamingcontext/) | Kelas tiruan untuk membuat kelas terjemahan yang menggunakan StreamingContext dapat dikompilasi. Jangan mengelola instance kelas ini dengan [SmartPtr](../system/smartptr/), mereka harus dialokasikan hanya di stack. |
