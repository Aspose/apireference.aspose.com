---
title: "metode System::Equals< float, float >"
linktitle: "SamaDengan< float, float >"
second_title: "Aspose.Page untuk C++"
description: "metode System::Equals< float, float >. Spesialisasi untuk nilai floating point presisi tunggal. Meskipun dua NaN floating point didefinisikan oleh IEC 60559:1989 untuk selalu dibandingkan tidak sama, kontrak untuk System.Object.Equals mengharuskan bahwa override harus memenuhi persyaratan operator ekivalensi. Oleh karena itu, System.Double.Equals dan System.Single.Equals mengembalikan True saat membandingkan dua NaN, sementara operator kesetaraan mengembalikan False dalam kasus tersebut, sebagaimana diwajibkan oleh standar dalam C++."
type: docs
weight: 18400
url: /id/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Spesialisasi untuk nilai floating point presisi tunggal. Meskipun dua NaN floating point didefinisikan oleh IEC 60559:1989 untuk selalu dibandingkan tidak sama, kontrak untuk [System.Object.Equals](../object/equals/) mengharuskan bahwa override harus memenuhi persyaratan operator ekivalensi. Oleh karena itu, System.Double.Equals dan System.Single.Equals mengembalikan True saat membandingkan dua NaN, sementara operator kesetaraan mengembalikan False dalam kasus tersebut, sebagaimana diwajibkan oleh standar.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| a | const float\& | Pembanding pertama |
| b | const float\& | Pembanding kedua |

### ReturnValue

Benar jika kedua nilai NaN atau sama, jika tidak - salah

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
