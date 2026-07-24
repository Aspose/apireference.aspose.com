---
title: "Metode System::Is"
linktitle: "Apakah"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Is. Fungsi pencocokan tingkat atas. Menerapkan pola pada nilai dalam C++."
type: docs
weight: 21900
url: /id/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Fungsi pencocokan tingkat atas. Menerapkan pola pada nilai.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Parameter | Deskripsi |
| --- | --- |
| A | Tipe pola (harus mewarisi dari Details::Pattern). |
| E | Tipe nilai yang akan dicocokkan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| e | const E\\& | Nilai untuk dicocokkan. |
| a | const A\\& | Pola yang akan diterapkan. |

### ReturnValue

true jika pola cocok dengan nilai.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


Mengimplementasikan terjemahan pola konstan 'is'.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Parameter | Deskripsi |
| --- | --- |
| ExpressionT | tipe ekspresi kiri. |
| ConstantT | tipe dari ekspresi konstan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kiri | const ExpressionT\& | ekspresi yang akan diperiksa. |
| konstan | const ConstantT\& | ekspresi yang akan dibandingkan dengan yang di sebelah kiri. |

### ReturnValue

true jika pemeriksaan tipe berhasil, false sebaliknya.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


Mengimplementasikan terjemahan pola deklarasi 'is'.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Parameter | Deskripsi |
| --- | --- |
| PatternT | tipe untuk diperiksa. |
| ExpressionT | tipe ekspresi kiri. |
| ResultT | tipe dari ekspresi hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kiri | const ExpressionT\& | ekspresi yang akan diperiksa. |
| hasil | ResultT\& | variabel yang akan diberikan ke tipe yang diperiksa. |

### ReturnValue

true jika pemeriksaan tipe berhasil, false sebaliknya.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
