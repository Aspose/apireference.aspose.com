---
title: "Aspose::Page::EPS::Util::ThreadLocal kelas"
linktitle: "ThreadLocal"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::EPS::Util::ThreadLocal kelas. Kelas yang digunakan untuk menyalin fungsionalitas yang disediakan oleh pembungkus System.Threading.ThreadLocal pada .NET Framework 4.0 dan 4.5''. Ini mengimplementasikan tipe instance dan statis yang bersifat thread local dan merujuk ke instance yang berbeda di antara thread, meskipun tipe instance sebenarnya yang merupakan agregat kelas ini mungkin sama dalam C++."
type: docs
weight: 100
url: /id/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


Kelas yang digunakan untuk menyalin fungsionalitas yang disediakan oleh tipe pembungkus System.Threading.ThreadLocal pada .NET Framework 4.0 dan 4.5. Ini mengimplementasikan tipe instance dan statis yang bersifat lokal pada thread dan merujuk ke instance yang berbeda di setiap thread, meskipun tipe instance sebenarnya yang menjadi agregat kelas ini mungkin sama.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe variabel untuk dibungkus dalam logika pemilihan thread |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Dispose](./dispose/)() override | Tidak melakukan apa-apa. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Atur argumen templat ke‑n menjadi pointer lemah (bukan berbagi). Memungkinkan penggantian pointer dalam kontainer ke mode lemah. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Factory](./factory/) |  |

## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
