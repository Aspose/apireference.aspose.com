---
title: "Metode System::MakeScopeGuard"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Page untuk C++"
description: "Metode System::MakeScopeGuard. Sebuah fungsi pabrik yang membuat instance kelas ScopedGuard dalam C++."
type: docs
weight: 24700
url: /id/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


Sebuah fungsi pabrik yang membuat instance kelas ScopedGuard.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| Parameter | Deskripsi |
| --- | --- |
| The | tipe objek fungsi yang akan dipanggil oleh objek ScopedGuard yang dibangun |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| f | F | Objek fungsi untuk diteruskan ke konstruktor kelas ScopedGuard. |

### ReturnValue

Sebuah instance baru dari kelas ScopedGuard

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
