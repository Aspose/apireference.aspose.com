---
title: "enum System::Reflection::FieldAttributes"
linktitle: "FieldAttributes"
second_title: "Aspose.Page untuk C++"
description: "enum System::Reflection::FieldAttributes. Atribut bidang yang direfleksikan dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


Atribut bidang yang direfleksikan.

```cpp
enum class FieldAttributes
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| FieldAccessMask | 7 | Mask akses anggota. Gunakan mask ini untuk mengambil informasi aksesibilitas. |
| PrivateScope | 0 | Anggota yang tidak dapat direferensikan. |
| Private | 1 | Anggota privat. |
| FamANDAssem | 2 | Anggota dengan ruang lingkup privat dan assembly. |
| Assembly | 3 | Anggota dengan ruang lingkup assembly. |
| Family | 4 | Anggota yang dapat diakses oleh tipe dan subtipe. |
| FamORAssem | 5 | Anggota yang dapat diakses oleh tipe, subtipe, dan assembly. |
| Public | 6 | Anggota yang dapat diakses oleh siapa saja. |
| Static | 16 | Anggota statis sebagai lawan dari anggota instance. |
| InitOnly | 32 | Anggota konstan yang hanya dapat diinisialisasi tetapi tidak dapat diubah. |
| Literal | 64 | Anggota konstan waktu kompilasi. |
| NotSerialized | 128 | Anggota yang tidak diserialkan. |
| SpecialName | 512 | Bidang khusus dari salah satu nama di bawah ini. |
| PinvokeImpl | 8192 | Implementasi interop yang diteruskan. |
| ReservedMask | 38144 | Bendera cadangan hanya untuk penggunaan runtime. |
| RTSpecialName | 1024 | Runtime harus memeriksa pengkodean nama. |
| HasFieldMarshal | 4096 | Informasi marshalling tersedia. |
| HasDefault | 32768 | Nilai default tersedia. |
| HasFieldRVA | 256 | RVA tersedia. |

## Lihat Juga

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
