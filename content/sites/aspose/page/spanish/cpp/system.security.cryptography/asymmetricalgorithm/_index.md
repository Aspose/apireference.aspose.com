---
title: "Clase System::Security::Cryptography::AsymmetricAlgorithm"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Page para C++"
description: "Clase System::Security::Cryptography::AsymmetricAlgorithm. Clase base abstracta para algoritmos de cifrado asimétrico. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 200
url: /es/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


Clase base abstracta para algoritmos de cifrado asimétrico. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clear](./clear/)() | Libera todos los recursos. |
| static [Create](./create/)() | Crea un algoritmo predeterminado. No implementado. |
| static [Create](./create/)(const String\&) | Crea un algoritmo por nombre. No implementado. |
| [Dispose](./dispose/)() override | Libera los recursos que posee el objeto actual. |
| virtual [FromXmlString](./fromxmlstring/)(String) | Lee los parámetros del algoritmo desde una cadena XML. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | Obtiene el algoritmo de intercambio de claves a usar. |
| virtual [get_KeySize](./get_keysize/)() | Información RTTI. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | Obtiene la matriz de tamaños de clave permitidos. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | Obtiene el algoritmo de firma a usar. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | Establece el tamaño de la clave. |
| virtual [ToXmlString](./toxmlstring/)(bool) | Escribe los parámetros del algoritmo en una cadena XML. |
## Ver también

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
