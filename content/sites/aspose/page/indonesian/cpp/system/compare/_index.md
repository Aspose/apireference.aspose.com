---
title: "System::Compare method"
linktitle: "Compare"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Compare. Membandingkan dua nilai dalam C++."
type: docs
weight: 15800
url: /id/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


Membandingkan dua nilai.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Deskripsi |
| --- | --- |
| TA | Tipe dari comparand pertama |
| TB | Tipe dari comparand kedua |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| a | const TA\& | Pembanding pertama |
| b | const TB\& | Pembanding kedua |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


Membandingkan dua nilai floating point.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Deskripsi |
| --- | --- |
| TA | Tipe dari comparand pertama |
| TB | Tipe dari comparand kedua |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| a | const TA\& | Pembanding pertama |
| b | const TB\& | Pembanding kedua |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
