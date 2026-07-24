---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData metode"
linktitle: "SignData"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData metode. Menghitung tanda tangan nilai input yang ditentukan di C++."
type: docs
weight: 1600
url: /id/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


Menghitung tanda tangan dari nilai input yang ditentukan.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) untuk membaca data input dari. |
| halg | const SharedPtr\<Object\>\& | Algoritma hash yang akan digunakan. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


Menghitung tanda tangan dari nilai input yang ditentukan.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) untuk membaca data input dari. |
| offset | int32_t | Indeks awal irisan buffer input. |
| count | int32_t | Ukuran irisan buffer input. |
| halg | const SharedPtr\<Object\>\& | Algoritma hash yang akan digunakan. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


Menghitung tanda tangan dari nilai input yang ditentukan.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | Stream untuk membaca data yang ditandatangani dari. |
| halg | const SharedPtr\<Object\>\& | Algoritma hash yang akan digunakan. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
