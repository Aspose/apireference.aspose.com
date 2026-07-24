---
title: "System::Drawing::Text::PrivateFontCollection clase"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Page para C++"
description: "System::Drawing::Text::PrivateFontCollection clase. Representa una colección de familias de fuentes proporcionada por la aplicación cliente. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 300
url: /es/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


Representa una colección de familias de fuentes proporcionada por la aplicación cliente. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use este puntero para pasarlo a funciones como argumento.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## Métodos

| Método | Descripción |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | Añade la fuente especificada a la colección. |
| [AddFontFile](./addfontfile/)(const String\&) | Agrega una fuente del archivo especificado a la colección. |
| [get_Families](./get_families/)() override | Devuelve una matriz de [FontFamily](../../system.drawing/fontfamily/) objetos asociados con la colección de fuentes representada por el objeto actual. |
## Ver también

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
