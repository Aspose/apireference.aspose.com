---
title: "System::Text::UTF32Encoding clase"
linktitle: "UTF32Encoding"
second_title: "Aspose.Page para C++"
description: "System::Text::UTF32Encoding clase. Codificación UTF-32. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 2600
url: /es/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


Codificación UTF-32. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use este puntero para pasarlo a funciones como argumento.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() override | Clona el objeto de codificación. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Compara con el objeto. |
| [GetHashCode](./gethashcode/)() const override | Obtiene el código hash de la codificación. |
| [GetPreamble](./getpreamble/)() override | Obtenga el preámbulo de la página de códigos. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | Compara los parámetros de las codificaciones. |
| [UTF32Encoding](./utf32encoding/)() | Constructor. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | Constructor. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | Constructor. |
## Campos

| Campo | Descripción |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | Número mágico utilizado por [Windows](../../system.windows/) para el ID de página de códigos UTF-32 big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valor predeterminado de la página de códigos. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | Número mágico utilizado por [Windows](../../system.windows/) para el ID de página de códigos UTF-32 little endian. |
## Ver también

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
