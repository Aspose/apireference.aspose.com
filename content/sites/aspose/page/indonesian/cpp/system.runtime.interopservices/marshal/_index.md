---
title: "Kelas System::Runtime::InteropServices::Marshal"
linktitle: "Marshal"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Runtime::InteropServices::Marshal. Menyediakan implementasi marshalling. Hanya untuk kompatibilitas dengan kode yang diterjemahkan, karena tidak ada kode terkelola yang didukung di sisi C++. Ini adalah tipe statik tanpa layanan instansi. Anda tidak boleh pernah membuat instance darinya dengan cara apapun di C++."
type: docs
weight: 100
url: /id/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


Menyediakan implementasi marshalling. Hanya untuk kompatibilitas dengan kode yang diterjemahkan, karena tidak ada kode terkelola yang didukung di sisi C++. Ini adalah tipe statis tanpa layanan instansi. Anda tidak boleh pernah membuat instance darinya dengan cara apapun.

```cpp
class Marshal
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | Mengalokasikan memori yang tidak dikelola. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | Mengalokasikan memori yang tidak dikelola. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | Mengimplementasikan semantik public static void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const void *, container\&&, int, int) | Mengimplementasikan semantik public static void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const container\&, int, void *, int) | Mengimplementasikan public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | Mengimplementasikan public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | Membebaskan memori yang tidak dikelola. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | Mendapatkan HResult dari pengecualian. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | Membuat [String](../../system/string/) yang dikelola dari UTF8-string yang tidak dikelola berakhiran nol. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | Membuat [String](../../system/string/) yang dikelola dari UTF8-string yang tidak dikelola. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | Membuat [String](../../system/string/) yang dikelola dari string yang tidak dikelola berakhiran nol. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | Membuat [String](../../system/string/) yang dikelola dari string yang tidak dikelola. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | Membuat [String](../../system/string/) yang dikelola dari string unicode yang tidak dikelola berakhiran nol. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | Membuat [String](../../system/string/) yang dikelola dari string unicode yang tidak dikelola. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | Membuat [String](../../system/string/) yang dikelola dari UTF8-string yang tidak dikelola berakhiran nol. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | Membuat [String](../../system/string/) yang dikelola dari UTF8-string yang tidak dikelola. |
| static [ReadByte](./readbyte/)(IntPtr, int) | Membaca byte dari memori. |
| static [ReadInt16](./readint16/)(IntPtr, int) | Membaca short dari memori. |
| static [ReadInt32](./readint32/)(IntPtr, int) | Membaca int dari memori. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | Menyalin isi secure string yang ditentukan ke memori tidak terkelola, mengonversi ke format ANSI. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | Menyalin isi secure string yang ditentukan ke memori tidak terkelola. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | Menyalin isi string yang ditentukan ke memori tidak terkelola. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | Menyalin isi string yang ditentukan ke memori tidak terkelola, mengonversi ke format ANSI jika diperlukan. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | Menyalin isi string yang ditentukan ke memori tidak terkelola. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | Menulis byte ke memori. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | Menulis byte ke memori. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | Menulis short ke memori. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | Menulis int ke memori. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | Menulis long ke memori. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | Membebaskan pointer string tidak terkelola yang dialokasikan menggunakan metode SecureStringToGlobalAllocAnsi. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | Membebaskan pointer string tidak terkelola yang dialokasikan menggunakan metode SecureStringToGlobalAllocUnicode. |
## Lihat Juga

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Page for C++](../../)
