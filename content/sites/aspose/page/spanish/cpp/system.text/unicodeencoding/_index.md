---
title: "Clase System::Text::UnicodeEncoding"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Page para C++"
description: "Clase System::Text::UnicodeEncoding. Codificación Unicode. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 2500
url: /es/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Codificación Unicode. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() override | Clona el objeto de codificación. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Compara codificaciones. |
| [GetHashCode](./gethashcode/)() const override | Genera hash de la codificación. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Obtenga la cantidad máxima de bytes necesarios para codificar un número especificado de caracteres. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Obtenga la cantidad máxima de caracteres necesarios para decodificar un número especificado de bytes. |
| [GetPreamble](./getpreamble/)() override | Devuelve una secuencia de bytes que denota la codificación (p. ej. BOM). |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | Compara codificaciones por páginas de códigos y banderas. |
| [UnicodeEncoding](./unicodeencoding/)() | Constructor. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | Constructor. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | Constructor. |
## Campos

| Campo | Descripción |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | Número de página de códigos big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valor predeterminado de la página de códigos. |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | Número de página de códigos little endian. |
## Ver también

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
