---
title: "System::Diagnostics::Process class"
linktitle: "Process"
second_title: "Aspose.Page untuk C++"
description: "System::Diagnostics::Process class. Membungkus informasi dan manipulasi proses. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.diagnostics/process/
---
## Process class


Membungkus informasi dan manipulasi proses. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Process : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | Mendapatkan apakah peristiwa Exited harus dipicu ketika proses berakhir. |
| [get_ExitCode](./get_exitcode/)() const | Mendapatkan kode keluar proses. |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | Mendapatkan ukuran set memori pribadi proses. |
| [get_ProcessName](./get_processname/)() const | Mendapatkan nama proses. |
| [get_StandardError](./get_standarderror/)() const | Menyediakan pembaca untuk membaca output error proses. Tidak diimplementasikan. |
| [get_StandardOutput](./get_standardoutput/)() const | Menyediakan pembaca untuk membaca output standar proses. Tidak diimplementasikan. |
| [get_StartInfo](./get_startinfo/)() const | Mendapatkan informasi memulai proses. |
| [get_WorkingSet64](./get_workingset64/)() const | Mendapatkan ukuran working set memori proses. |
| static [GetCurrentProcess](./getcurrentprocess/)() | Mendapatkan informasi tentang proses saat ini. hanya [Windows](../../system.windows/). |
| [GetOutputText](./getoutputtext/)() const | Mendapatkan teks output proses. |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | Mengatur apakah acara Exited harus dipicu ketika proses berakhir. |
| [Start](./start/)() | Memulai proses dengan parameter yang telah ditentukan. |
| static [Start](./start/)(const String\&, const String\&) | Memulai proses dengan jalur dan argumen yang ditentukan. |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | Memulai proses dengan jalur dan argumen yang ditentukan. |
| [WaitForExit](./waitforexit/)(int) | Menunggu proses selesai. Tidak diimplementasikan. |
| [WaitForExit](./waitforexit/)() | Menunggu proses selesai, tidak kembali sampai selesai. |
| virtual [~Process](./~process/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
