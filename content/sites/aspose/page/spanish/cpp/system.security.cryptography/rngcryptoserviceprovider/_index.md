---
title: "Clase System::Security::Cryptography::RNGCryptoServiceProvider"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Page para C++"
description: "Clase System::Security::Cryptography::RNGCryptoServiceProvider. Generador de números aleatorios que sigue la noción CSP. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 3300
url: /es/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


Generador de números aleatorios que sigue la noción CSP. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## Métodos

| Método | Descripción |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | Llena los elementos existentes del arreglo con bytes aleatorios. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | Llena los elementos existentes de la vista del arreglo con bytes aleatorios. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | Llena los elementos existentes del arreglo con bytes aleatorios distintos de cero. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | Llena los elementos existentes de la vista del arreglo con bytes aleatorios distintos de cero. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | Constructor. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | Destructor. |
## Ver también

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
