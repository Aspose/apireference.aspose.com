---
title: "System::Uri::TryCreate metode"
linktitle: "TryCreate"
second_title: "Aspose.Page untuk C++"
description: "System::Uri::TryCreate method. Membuat sebuah objek Uri dari basis dan URI relatif yang ditentukan dalam C++."
type: docs
weight: 4400
url: /id/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Membuat sebuah [Uri](../) objek dari basis dan URI relatif yang ditentukan.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | URI dasar |
| relativeUri | const SharedPtr\<Uri\>\& | URI relatif yang ditambahkan ke URI dasar |
| result | SharedPtr\<Uri\>\& | Argumen output yang, jika konstruksi berhasil, menunjuk ke objek [Uri](../) yang baru dibuat pada pengembalian metode |

### ReturnValue

True jika konstruksi berhasil, jika tidak - false

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Membuat sebuah [Uri](../) objek dari objek [Uri](../) yang ditentukan yang mewakili URI dasar dan representasi string dari URI relatif.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | URI dasar |
| relativeUri | const String\& | URI relatif yang ditambahkan ke URI dasar |
| result | SharedPtr\<Uri\>\& | Argumen output yang, jika konstruksi berhasil, menunjuk ke objek [Uri](../) yang baru dibuat pada pengembalian metode |

### ReturnValue

True jika konstruksi berhasil, jika tidak - false

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Membuat sebuah objek [Uri](../) yang mewakili URI yang ditentukan; sebuah argumen menentukan jenis URI.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| uriString | const String\& | String URI yang akan diwakili oleh objek yang sedang dibuat |
| uriKind | UriKind | Menentukan jenis URI |
| result | SharedPtr\<Uri\>\& | Argumen output yang, jika konstruksi berhasil, menunjuk ke objek [Uri](../) yang baru dibuat pada pengembalian metode |

### ReturnValue

True jika konstruksi berhasil, jika tidak - false

## Lihat Juga

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
