---
title: "kelas System::OperatingSystem"
linktitle: "OperatingSystem"
second_title: "Aspose.Page untuk C++"
description: "kelas System::OperatingSystem. Mewakili sistem operasi tertentu dan menyediakan informasi tentangnya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen di C++."
type: docs
weight: 5100
url: /id/cpp/system/operatingsystem/
---
## OperatingSystem class


Mewakili sistem operasi tertentu dan menyediakan informasi tentangnya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class OperatingSystem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Platform](./get_platform/)() const | Mengembalikan pengidentifikasi platform dari sistem operasi yang direpresentasikan oleh objek saat ini. |
| [get_ServicePack](./get_servicepack/)() const | Mengembalikan nama service pack dari sistem operasi yang direpresentasikan oleh objek saat ini. |
| [get_Version](./get_version/)() const | Mengembalikan referensi konstan ke objek [Version](../version/) yang mewakili versi sistem operasi yang direpresentasikan oleh objek saat ini. |
| [get_VersionString](./get_versionstring/)() const | Mengembalikan representasi string dari versi sistem operasi yang direpresentasikan oleh objek saat ini. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | Membuat sebuah instance yang mewakili sistem operasi yang ditentukan sebagai ID platform tertentu dan versi. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | Membuat sebuah instance yang mewakili sistem operasi yang ditentukan sebagai ID platform tertentu, versi, dan service pack. |
| [ToString](./tostring/)() const | Mengembalikan representasi string dari versi sistem operasi yang direpresentasikan oleh objek saat ini. |
## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
