---
title: "System::Text::DecoderReplacementFallback clase"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Page para C++"
description: "Clase System::Text::DecoderReplacementFallback. Proporciona una estrategia de reserva que reemplaza el símbolo erróneo con un sustituto. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 700
url: /es/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


Proporciona una estrategia de reserva que reemplaza el símbolo erróneo con un sustituto. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## Métodos

| Método | Descripción |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Crea un búfer de reserva. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | Constructor que usa la cadena de reemplazo predeterminada "?". |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | Constructor. |
| [get_DefaultString](./get_defaultstring/)() const | Obtiene la cadena de reemplazo. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Obtiene el recuento máximo de caracteres que la instancia puede devolver. |
## Ver también

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
