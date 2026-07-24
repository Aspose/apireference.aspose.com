---
title: "System::Nullable::NullableBoolHelper method"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Page untuk C++"
description: "System::Nullable::NullableBoolHelper method. Fungsi pembantu untuk memeriksa apakah this dan other keduanya tidak null dan memanggil lambda jika demikian. Digunakan dalam implementasi di C++."
type: docs
weight: 800
url: /id/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


Fungsi pembantu untuk memeriksa apakah this dan **other** keduanya tidak null dan memanggil lambda jika demikian. Digunakan dalam implementasi.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe nullable lainnya. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | const T1\& | Nilai nullable lainnya untuk dibandingkan. |
| f | const std::function\<bool()>\& | Lambda untuk dipanggil jika **this** dan **other** keduanya tidak null. |
| default_if_both_are_null | bool | Nilai yang dikembalikan jika kedua nilai null. |

### ReturnValue

false jika **this** atau **other** null; **default_if_both_are_null** jika keduanya null; hasil pemanggilan **f** jika keduanya tidak null.

## Lihat Juga

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
