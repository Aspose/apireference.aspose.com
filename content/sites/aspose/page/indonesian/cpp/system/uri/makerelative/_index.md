---
title: "System::Uri::MakeRelative metode"
linktitle: "MakeRelative"
second_title: "Aspose.Page untuk C++"
description: "System::Uri::MakeRelative method. Menentukan perbedaan antara dua instance Uri dalam C++."
type: docs
weight: 3000
url: /id/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


Menentukan perbedaan antara dua instance [Uri](../).

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | URI yang akan dibandingkan dengan URI saat ini |

### ReturnValue

Jika hostname dan skema dari URI yang diwakili oleh objek saat ini dan **toUri** sama, maka metode ini mengembalikan sebuah [String](../../string/) yang mewakili sebuah [Uri](../) relatif, yang ketika ditambahkan ke instance URI saat ini, menghasilkan **toUri**. Jika hostname atau skema berbeda, maka metode ini mengembalikan sebuah [String](../../string/) yang mewakili parameter **uri**.

## Lihat Juga

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
