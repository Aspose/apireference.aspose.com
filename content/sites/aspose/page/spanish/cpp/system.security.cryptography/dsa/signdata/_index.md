---
title: "Método System::Security::Cryptography::DSA::SignData"
linktitle: "SignData"
second_title: "Aspose.Page para C++"
description: "Método System::Security::Cryptography::DSA::SignData. Calcula el valor hash del arreglo de datos especificado usando el algoritmo hash especificado, y firma el resultado en C++."
type: docs
weight: 500
url: /es/cpp/system.security.cryptography/dsa/signdata/
---
## DSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Calcula el valor hash del arreglo de datos especificado usando el algoritmo hash especificado, y firma el resultado.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| datos | const ByteArrayPtr\& | Matriz de datos de entrada. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo hash. devuelve la firma [DSA](../) para los datos de entrada. |

## Ver también

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Calcula el valor hash del arreglo de datos especificado usando el algoritmo hash especificado, y firma el resultado.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| datos | const ByteArrayPtr\& | Matriz de datos de entrada. |
| desplazamiento | int32_t | Desplazamiento en **data**. |
| count | int32_t | Número de bytes a usar como datos de entrada. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo hash. devuelve la firma [DSA](../) para los datos de entrada. |

## Ver también

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Calcula el valor hash del flujo binario especificado usando el algoritmo hash especificado, y firma el resultado.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | const StreamPtr\& | Flujo binario. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo hash. devuelve la firma [DSA](../) para los datos de entrada. |

## Ver también

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
