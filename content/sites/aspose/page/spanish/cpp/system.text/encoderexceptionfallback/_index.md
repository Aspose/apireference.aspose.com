---
title: "System::Text::EncoderExceptionFallback clase"
linktitle: "EncoderExceptionFallback"
second_title: "Aspose.Page para C++"
description: "System::Text::EncoderExceptionFallback clase. Proporciona una estrategia de reserva que lanza excepciones. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1000
url: /es/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


Proporciona una estrategia de reserva que lanza excepciones. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## Métodos

| Método | Descripción |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Crea un búfer de reserva. |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | Constructor. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Obtiene el recuento máximo de caracteres que la instancia puede devolver. |
## Ver también

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
