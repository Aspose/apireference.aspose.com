---
title: "metode System::With"
linktitle: "With"
second_title: "Aspose.Page untuk C++"
description: "metode System::With. Mengkloning rekaman referensi dan menerapkan funktor inisialisasi padanya dalam C++."
type: docs
weight: 40100
url: /id/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Mengkloning rekaman referensi dan menerapkan funktor inisialisasi padanya.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe rekaman untuk diklon. |
| A | Tipe funktor inisialisasi. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rekaman | const SharedPtr\<T\>\& | Pointer bersama ke objek yang akan diklon dan diinisialisasi. |
| inisialisator | const A\\& | Funktor inisialisasi yang diterapkan pada klon rekaman. |

### ReturnValue

Shared pointer ke rekaman yang dikloning.

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


Menyalin struct record dan menerapkan funktor inisialisasi padanya.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe record untuk disalin. |
| A | Tipe funktor inisialisasi. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rekaman | const T\& | Record untuk disalin dan diinisialisasi. |
| inisialisator | const A\\& | Funktor inisialisasi sedang diterapkan pada salinan record. |

### ReturnValue

Record yang disalin.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
