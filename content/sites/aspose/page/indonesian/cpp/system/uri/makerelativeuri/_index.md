---
title: "System::Uri::MakeRelativeUri metode"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Page untuk C++"
description: "System::Uri::MakeRelativeUri metode. Menentukan perbedaan antara URI yang direpresentasikan oleh objek Uri saat ini dan objek Uri yang ditentukan dalam C++."
type: docs
weight: 3100
url: /id/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


Menentukan perbedaan antara URI yang direpresentasikan oleh objek [Uri](../) saat ini dan objek yang ditentukan.

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Komparan |

### ReturnValue

Jika nama host dan skema dari URI yang direpresentasikan oleh objek saat ini dan **toUri** sama, maka metode ini mengembalikan sebuah [Uri](../) relatif yang, ketika ditambahkan ke instance URI saat ini, menghasilkan **toUri**. Jika nama host atau skema berbeda, maka metode ini mengembalikan sebuah objek [Uri](../) yang mewakili parameter **uri**.

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
