---
title: "Clase System::Security::Cryptography::ICspAsymmetricAlgorithm"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "Aspose.Page para C++"
description: "Clase System::Security::Cryptography::ICspAsymmetricAlgorithm. Clase base de algoritmo asimétrico. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() function. Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 2100
url: /es/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


Clase base de algoritmo asimétrico. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) function. Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | Exporta un blob con información de clave. |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | Información RTTI. |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | Importa información de clave desde un blob de datos. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
