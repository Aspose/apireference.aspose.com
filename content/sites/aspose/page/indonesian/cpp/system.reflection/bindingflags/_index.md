---
title: "Enum System::Reflection::BindingFlags"
linktitle: "BindingFlags"
second_title: "Aspose.Page untuk C++"
description: "Enum System::Reflection::BindingFlags. Menentukan anggota dan mode pencarian tipe serta pengikatan dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


Mendefinisikan anggota dan mode pencarian tipe serta pengikatan.

```cpp
enum class BindingFlags
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Default | 0 | Tidak ada opsi khusus. |
| IgnoreCase | 1 | Abaikan huruf besar/kecil pada nama saat mencari item. |
| DeclaredOnly | 2 | Hanya mencari anggota yang dideklarasikan dalam tipe dan tidak di tipe dasar. |
| Instance | 4 | Lihat anggota instance. |
| Static | 8 | Lihat anggota statis. |
| Public | 16 | Lihat anggota publik. |
| NonPublic | 32 | Lihat anggota non-publik. |
| FlattenHierarchy | 64 | Lihat anggota statis publik dan terlindungi dari tipe dasar. |
| InvokeMethod | 256 | Memanggil metode. |
| CreateInstance | 512 | Membuat instance tipe yang dipantulkan. |
| GetField | 1024 | Mendapatkan nilai bidang. |
| SetField | 2048 | Mengatur nilai bidang. |
| GetProperty | 4096 | Mendapatkan nilai properti. |
| SetProperty | 8192 | Mengatur nilai properti. |
| PutDispProperty | 16384 | Menetapkan properti COM. |
| PutRefDispProperty | 32768 | Menetapkan properti referensi COM. |
| ExactBinding | 65536 | Pengikatan tipe harus tepat, tanpa perubahan tipe apapun. |
| SuppressChangeType | 131072 | Tidak didukung. |
| OptionalParamBinding | 262144 | Memilih overload berdasarkan jumlah argumen. |
| IgnoreReturn | 16777216 | Mengabaikan nilai kembali interop COM. |

## Lihat Juga

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
