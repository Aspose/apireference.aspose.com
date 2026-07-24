---
title: "System::Security::Cryptography::ICryptoTransform class"
linktitle: "ICryptoTransform"
second_title: "Aspose.Page para C++"
description: "System::Security::Cryptography::ICryptoTransform class. Clase base del transformador criptográfico. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() function. Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 2000
url: /es/cpp/system.security.cryptography/icryptotransform/
---
## ICryptoTransform class


Clase base del transformador criptográfico. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class ICryptoTransform : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Tamaño del bloque de entrada. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Tamaño del bloque de salida. |
| virtual [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Información RTTI. |
| virtual [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) | Procesa el último bloque de datos y calcula el valor de salida. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
