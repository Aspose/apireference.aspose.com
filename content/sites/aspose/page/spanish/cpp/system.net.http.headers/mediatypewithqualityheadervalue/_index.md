---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue clase"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "Aspose.Page para C++"
description: "Clase System::Net::Http::Headers::MediaTypeWithQualityHeaderValue. Representa un tipo MIME con un factor de calidad adicional en el valor del encabezado ''Content-Type''. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1300
url: /es/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


Representa un tipo MIME con un factor de calidad adicional en el valor del encabezado 'Content-Type'. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Quality](./get_quality/)() | Información RTTI. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | Construye una nueva instancia. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | Construye una nueva instancia. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | Construye una nueva instancia. |
| static [Parse](./parse/)(String) | Convierte una cadena pasada a una instancia de la clase [MediaTypeWithQualityHeaderValue](./). |
| [set_Quality](./set_quality/)(Nullable\<double\>) | Establece un valor de calidad. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | Intenta convertir una cadena pasada a una instancia de la clase [MediaTypeWithQualityHeaderValue](./). |
## Ver también

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
