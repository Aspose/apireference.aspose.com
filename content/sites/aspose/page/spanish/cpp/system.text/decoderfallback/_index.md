---
title: "System::Text::DecoderFallback clase"
linktitle: "DecoderFallback"
second_title: "Aspose.Page para C++"
description: "System::Text::DecoderFallback clase. Proporciona una API de reserva para manejar errores de decodificación. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 500
url: /es/cpp/system.text/decoderfallback/
---
## DecoderFallback class


Proporciona una API de reserva para manejar errores de decodificación. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class DecoderFallback : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Obtiene el búfer asociado con el algoritmo de reserva. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Obtiene la implementación predeterminada de fallback de excepción. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Obtiene el número máximo de caracteres que puede devolver el fallback. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Obtiene la implementación predeterminada de fallback de reemplazo. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Obtiene la implementación predeterminada estándar segura de fallback. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
