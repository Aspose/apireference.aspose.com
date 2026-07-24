---
title: "Clase System::Text::Encoder"
linktitle: "Encoder"
second_title: "Aspose.Page para C++"
description: "Clase System::Text::Encoder. Encapsula la secuencia de caracteres de codificación en una secuencia de bytes. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 900
url: /es/cpp/system.text/encoder/
---
## Encoder class


Encapsula la secuencia de caracteres de codificación en una secuencia de bytes. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class Encoder : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Convierte caracteres a bytes. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Convierte caracteres a bytes. |
| [get_Fallback](./get_fallback/)() const | Obtiene la reserva de manejo de errores. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Obtiene el búfer de reserva. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Obtiene la cantidad de bytes necesarios para codificar un búfer. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Obtiene la cantidad de bytes necesarios para codificar un búfer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Obtenga los bytes que resultan de codificar un búfer. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Obtenga los bytes que resultan de codificar un búfer. |
| virtual [Reset](./reset/)() | Limpia el estado interno del codificador. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | Establece la reserva de manejo de errores. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
