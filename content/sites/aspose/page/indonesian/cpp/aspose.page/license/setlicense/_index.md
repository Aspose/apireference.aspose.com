---
title: "Aspose::Page::License::SetLicense metode"
linktitle: "SetLicense"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::License::SetLicense metode. Mengaktifkan lisensi komponen dalam C++."
type: docs
weight: 400
url: /id/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Melisensikan komponen.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | System::SharedPtr\<System::IO::Stream\> | Sebuah aliran yang berisi lisensi. |
## Catatan



Gunakan metode ini untuk memuat lisensi dari aliran.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Melisensikan komponen.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Catatan


Mencoba menemukan lisensi di lokasi berikut:

1. Jalur eksplisit.

<ms>

2. Folder assembly komponen.

3. Folder assembly pemanggil klien.

4. Folder assembly entri.

5. Sumber daya tertanam di assembly pemanggil klien.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Jalur eksplisit.

2. Sumber daya tertanam di assembly pemanggil klien.

</ms>

<java>

2. Folder file jar komponen.

</java>
## Lihat Juga

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
