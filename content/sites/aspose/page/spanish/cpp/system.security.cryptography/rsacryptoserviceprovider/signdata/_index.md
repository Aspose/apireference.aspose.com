---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData método"
linktitle: "SignData"
second_title: "Aspose.Page para C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData método. Calcula la firma del valor de entrada especificado en C++."
type: docs
weight: 1600
url: /es/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


Calcula la firma del valor de entrada especificado.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) del cual leer los datos de entrada. |
| halg | const SharedPtr\<Object\>\& | Algoritmo de hash a usar. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Ver también

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


Calcula la firma del valor de entrada especificado.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) del cual leer los datos de entrada. |
| desplazamiento | int32_t | Índice inicial del segmento del búfer de entrada. |
| count | int32_t | Tamaño del segmento del búfer de entrada. |
| halg | const SharedPtr\<Object\>\& | Algoritmo de hash a usar. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Ver también

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


Calcula la firma del valor de entrada especificado.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | Secuencia desde la cual leer los datos que se están firmando. |
| halg | const SharedPtr\<Object\>\& | Algoritmo de hash a usar. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Ver también

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
