---
title: "Clase System::Security::Cryptography::TripleDESManaged"
linktitle: "TripleDESManaged"
second_title: "Aspose.Page para C++"
description: "Clase System::Security::Cryptography::TripleDESManaged. Implementación administrada de TripleDES. Solo admite los modos ECB y CFB con relleno None y el modo CBC con rellenos None, Zeros y PKCS7. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 5200
url: /es/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Implementación administrada de [TripleDES](../tripledes/). Solo admite los modos ECB y CFB con relleno None y el modo CBC con rellenos None, Zeros y PKCS7. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
```

## Métodos

| Método | Descripción |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Crea un objeto descifrador con parámetros explícitos. |
| virtual [CreateDecryptor](./createdecryptor/)() | Crea un objeto descifrador con parámetros definidos por el objeto algoritmo. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Crea un objeto cifrador con parámetros explícitos. |
| virtual [CreateEncryptor](./createencryptor/)() | Crea un objeto cifrador con parámetros definidos por el objeto algoritmo. |
| [GenerateIV](./generateiv/)() override | Crea un valor inicial aleatorio y lo almacena en los internos del algoritmo. |
| [GenerateKey](./generatekey/)() override | Crea una clave aleatoria y la almacena en los internos del algoritmo. |
## Ver también

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
